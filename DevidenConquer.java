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