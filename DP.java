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