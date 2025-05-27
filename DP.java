// FIBOONACCI 
class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
         return dp[n];
    }
}
//CLIMBING STAIR
class Solution {
    public int climbStairs(int n) {
        if (n <=1) {
            return 1;
        }
        int dp[] = new int[n+1];
        dp[0] =1;
        dp[1] =1; 
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
//coin change 
class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[n][amount+1];
        for(int a=0; a<amount+1; a++){
            if(a % coins[0] == 0){
                dp[0][a] = a / coins[0];
                // return dp[0][a];
            }else{
                dp[0][a] = (int)(1e9);
            }
        }
        for(int i=1; i<n; i++){
            for(int a=0; a<amount+1; a++){
                int pick = (int)(1e9);
        if(a >= coins[i]){
            pick = 1+dp[i][a-coins[i]];
        }
        int nopick =  dp[i-1][a];
        dp[i][a] = Math.min(pick,nopick);
            }
        }
        // int res = recur(coins,amount,n-1,dp);
        if(dp[n-1][amount] == (int)(1e9)){
            return -1;
        }
        return dp[n-1][amount];
    }
    // public int recur(int coins[] , int amount , int index , int[][] dp){
    //     if(index == 0){
    //         if(amount % coins[index] == 0){
    //             dp[index][amount] = amount / coins[index];
    //             return dp[index][amount];
    //         }
    //         return (int)(1e9);
    //     }
    //     if(dp[index][amount] != -1){
    //         return dp[index][amount];
    //     }
    //     int pick = (int)(1e9);
    //     if(amount >= coins[index]){
    //         pick = 1+recur(coins,amount-coins[index],index,dp);
    //     }
    //     int nopick =  recur(coins,amount,index-1,dp);
    //     dp[index][amount] = Math.min(pick,nopick);
    //     return dp[index][amount];
    // }
}
//
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int lis[] = new int[n];
        Arrays.fill(lis,1);
        int max = 1;
        for(int i=1; i<n; i++){
            for(int p=0; p<i; p++){
                if(nums[i] > nums[p]){
                lis[i] = Math.max(lis[i],lis[p]+1);
                }
            }
            if(lis[i] > max){
            max = lis[i];
        }
        }
        
        return max;
    }
}
class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        // Create DP table
        int[][] dp = new int[m + 1][n + 1];

        // Initialize base cases
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i; // delete all characters
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j; // insert all characters
        }

        // Build up the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // characters match
                } else {
                    dp[i][j] = 1 + Math.min(
                        dp[i - 1][j - 1], // replace
                        Math.min(dp[i - 1][j],   // delete
                                 dp[i][j - 1])  // insert
                    );
                }
            }
        }

        return dp[m][n];
    }
}
