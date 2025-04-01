import java.util.*;
    public class JavaBasics{
        static class Node{
        int data;
        Node left;
        Node right;


        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        }
        public static void merge(int nums1[] , int m , int nums2[] , int n){
            int temp[] = new int[m+n];
            int k = 0;
            int i = 0 , j = 0;
            
            while(i<nums1.length&& j<nums2.length ){
                if(nums1[i] < nums2[j]){
                    temp[k] = nums1[i];
                    i++;
                }else{
                    temp[k] = nums2[j];
                    j++;
                }
                k++;
            }
        while(i < nums1.length){
            temp[k++] = nums1[i++];
        }
        while(j < nums2.length){
            temp[k++] = nums2[j++];
        }
        for( int p=0; p<temp.length; p++){
            System.out.print(temp[p]+" ");
        }
        }
        public static boolean happy(int n){
            
            HashSet<Integer> set = new HashSet<>();
            if(!set.contains(n)){
                set.add(n);
                n = happyint(n);
                if(n == 1){
                    return true;
                }
            }
            return false;
        }
        private static int happyint(int n){
            int out = 0;
            while(n > 0){
                int digit = n % 10;
                out += Math.pow(digit , 2);
                n = n /10;
            }
            return out;
        }
        public static boolean pow2(int n){
            if(n == 0 || n == 1){
                return true;
            }
            
            while(n > 1){
                double po = Math.sqrt(n);
                double p = Math.pow(2 , po);
                if(p == n){
                    return true;
                }
                break;
            }
            return false;
        }
     public static void single(int arr[]){
    int result = 0;
    for(int i=0; i<arr.length; i++){
        result = result^arr[i];
    }
    System.out.print(result);
}
public static boolean containsDublicate(int arr[]){
    Arrays.sort(arr);
    int i = 0;
    for(int j=i+1; j<arr.length; j++){
        if(arr[i] == arr[j]){
            i++;
            return true;
            
        }
    }
    return false;
}
public static boolean validAnagaram(String s , String t){
    char arr1[] = s.toCharArray();
    char arr2[] = t.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    if(arr1.length != arr2.length){
        return false;
    }
    String a = new String(arr1);
    String b = new String(arr2);

    if(a.equals(b)){
        return true;
    }
return false;
}
// public static int hppy(int n){
            
//             HashSet<Integer> set = new HashSet<>();
//             if(!set.contains(n)){
//                 set.add(n);
//                 n = twodigit(n);
//                 if(n == 1 || n == 2){
//                     return n;
//                 }
//             }
//             return -1;
//         }
        
        public static int twodigit(int n){
            if(n < 10){
                return n;
            }
            int out = 0;
            while(n > 0){
                int digit = n % 10;
                out = digit + out;
                n = n /10;
                
            }
            
            return twodigit(out);
        }
        public static int mis(int arr[]){
            // if(arr.length-1 == 1){
            //     return arr.length-1;
            // }
            Arrays.sort(arr);
            int k=1;
            for(int i=0; i<arr.length-1; i++){
                if(arr[i] == arr[i+1]-1){
                    k++;
                }
            }
            return k;
        }
        public static void main(String args[]){
        int arr[] = {0,1};
        System.out.print(mis(arr));
        }
        }
