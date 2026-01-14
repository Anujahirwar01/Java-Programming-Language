public class DevidenConquer{
    public static int Sumofnno(int n){
        if(n == 1){
            return 1;
        }
        
        
        return n + Sumofnno(n-1);
    }
    public static void main(String args[]){
        int n = 20; 
        System.out.print(Sumofnno(n));
    }
}

//devide and conquer problems
// 1. Binary Search
public static int binarySearch(int[] arr, int target, int left, int right) {
    if (left > right) return -1;
    
    int mid = left + (right - left) / 2;
    if (arr[mid] == target) return mid;
    else if (arr[mid] > target) return binarySearch(arr, target, left, mid - 1);
    else return binarySearch(arr, target, mid + 1, right);
}

// 2. Merge Sort
public static void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
}

public static void merge(int[] arr, int left, int mid, int right) {
    int[] temp = new int[right - left + 1];
    int i = left, j = mid + 1, k = 0;
    
    while (i <= mid && j <= right) {
        if (arr[i] <= arr[j]) temp[k++] = arr[i++];
        else temp[k++] = arr[j++];
    }
    
    while (i <= mid) temp[k++] = arr[i++];
    while (j <= right) temp[k++] = arr[j++];
    
    for (i = left; i <= right; i++) arr[i] = temp[i - left];
}

// 3. Quick Sort
public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
        int pivot = partition(arr, low, high);
        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);
    }
}

public static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    
    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i + 1;
}

// 4. Maximum Subarray (Kadane's Algorithm using D&C)
public static int maxSubarraySum(int[] arr, int left, int right) {
    if (left == right) return arr[left];
    
    int mid = left + (right - left) / 2;
    int leftSum = maxSubarraySum(arr, left, mid);
    int rightSum = maxSubarraySum(arr, mid + 1, right);
    int crossSum = maxCrossingSum(arr, left, mid, right);
    
    return Math.max(Math.max(leftSum, rightSum), crossSum);
}

public static int maxCrossingSum(int[] arr, int left, int mid, int right) {
    int leftSum = Integer.MIN_VALUE, sum = 0;
    for (int i = mid; i >= left; i--) {
        sum += arr[i];
        if (sum > leftSum) leftSum = sum;
    }
    
    int rightSum = Integer.MIN_VALUE;
    sum = 0;
    for (int i = mid + 1; i <= right; i++) {
        sum += arr[i];
        if (sum > rightSum) rightSum = sum;
    }
    
    return leftSum + rightSum;
}

// 5. Power Calculation (Fast Exponentiation)
public static long power(long base, long exp) {
    if (exp == 0) return 1;
    if (exp == 1) return base;
    
    if (exp % 2 == 0) {
        long half = power(base, exp / 2);
        return half * half;
    } else {
        return base * power(base, exp - 1);
    }
}
// 6. Fibonacci Sequence
public static int fibonacci(int n) {
    if (n <= 1) return n;
    return fibonacci(n - 1) + fibonacci(n - 2);
}
// 7. Tower of Hanoi
public static void towerOfHanoi(int n, char source, char target, char auxiliary)
{
    if (n == 1) {
        System.out.println("Move disk 1 from rod " + source + " to rod " + target);
        return;
    }
    towerOfHanoi(n - 1, source, auxiliary, target);
    System.out.println("Move disk " + n + " from rod " + source + " to rod " + target);
    towerOfHanoi(n - 1, auxiliary, target, source);
}
// 8. Count Inversions in an Array
public static int countInversions(int[] arr, int left, int right) {
    int count = 0;
    if (left < right) {
        int mid = left + (right - left) / 2;
        count += countInversions(arr, left, mid);
        count += countInversions(arr, mid + 1, right);
        count += mergeAndCount(arr, left, mid, right);
    }
    return count;
}
public static int mergeAndCount(int[] arr, int left, int mid, int right) {
    int[] leftArr = java.util.Arrays.copyOfRange(arr, left, mid + 1);
    int[] rightArr = java.util.Arrays.copyOfRange(arr, mid + 1, right + 1);
    
    int i = 0, j = 0, k = left, swaps = 0;
    while (i < leftArr.length && j < rightArr.length) {
        if (leftArr[i] <= rightArr[j]) {
            arr[k++] = leftArr[i++];
        } else {
            arr[k++] = rightArr[j++];
            swaps += (mid + 1) - (left + i);
        }
    }
    
    while (i < leftArr.length) arr[k++] = leftArr[i++];
    while (j < rightArr.length) arr[k++] = rightArr[j++];
    
    return swaps;
}
// 9. Find Majority Element
public static int majorityElement(int[] nums, int left, int right) {
    if (left == right) return nums[left];
    
    int mid = left + (right - left) / 2;
    int leftMajor = majorityElement(nums, left, mid);
    int rightMajor = majorityElement(nums, mid + 1, right);
    
    if (leftMajor == rightMajor) return leftMajor;
    
    int leftCount = countInRange(nums, leftMajor, left, right);
    int rightCount = countInRange(nums, rightMajor, left, right);
    
    return leftCount > rightCount ? leftMajor : rightMajor;
}
public static int countInRange(int[] nums, int num, int left, int right) {
    int count = 0;
    for (int i = left; i <= right; i++) {
        if (nums[i] == num) count++;
    }
    return count;
}
// 10. Find Kth Smallest Element
public static int kthSmallest(int[] arr, int left, int right, int k)
{
    if (k > 0 && k <= right - left + 1) {
        int pos = partition(arr, left, right);
        
        if (pos - left == k - 1) return arr[pos];
        if (pos - left > k - 1) return kthSmallest(arr, left, pos - 1, k);
        
        return kthSmallest(arr, pos + 1, right, k - pos + left - 1);
    }
    return Integer.MAX_VALUE;
}