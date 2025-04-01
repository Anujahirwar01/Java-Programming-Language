//while loop
import java.util.*;
    public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;
        while(range>=counter){
            System.out.println(counter);
            counter++;
        }
        
        
        } 
    }
// pattens part 1 codes
import java.util.*;// code for stars
public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for(int line=1; line<=15; line++) {
            for(int star = 1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
       
        } 
    }

    //inverted star code
    import java.util.*;
    public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        for(int line=1; line<=4; line++){
            for(int star=1; star<=n-line+1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

       
        } 
    }
    //code for half pyramid
    import java.util.*;
public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        for(int line=1; line<=n; line++){
            for(int number=1; number<=line; number++){
                System.out.print(number);
            }
            System.out.println();
        }
        
        } 
    }
    //code for half pyramid chars
    import java.util.*;
public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        char ch = 'A';
        for(int line=1; line<=n; line++){
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        
        } 
    }
    //chapter functions 
    //code for recall
    import java.util.*;
public class JavaBasics {
  public static void printhellowworld(){
    System.out.println("hellow world");
    System.out.println("hellow world");
    System.out.println("hellow world");
    System.out.println("hellow world");
  }
    public static void main(String args[]) {
      printhellowworld();
        
       
      } 
    }
    //swap vale 
     import java.util.*;// code for stars
public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 5;
        
        //swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println(" a is = " + a);
        System.out.println(" b is = " + b);
       
        } 
    }
    //multiply code
    import java.util.*;
public class JavaBasics {
public static int multiply(int a, int b){
  int multiply = a * b;
        return multiply;
}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = multiply(a, b);
         System.out.println(prod);
        } 
    }
    //code for factorial
    import java.util.*;
public class JavaBasics {
public static int factorial(int n){
  int f = 1;
  for(int i=1; i<=n; i++){
    f = f * i;
  }
        return f;
}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int prod = factorial(9);
         System.out.println(factorial(9));
        } 
    }
    //code for binomial coeffciant
    import java .util.*;
 public class JavaBasics {
  public static int factorial(int n){
    int f = 1;
    for(int i=1; i<=n; i++){
      f = f * i;
    }
    return f;
  }
  public static int binCoeff(int n, int r){
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nmr = factorial(n-r);
    int binCoeff = fact_n / (fact_r * fact_nmr);
    return binCoeff;
  }
  public static void main(String args[]){

    System.out.println(binCoeff(5, 2));
  }
 }
 //funtion overloading method
 import java.util.*;
    public class JavaBasics {
      public static int sum(int a,int b){
        return a + b;   
      }
      public static int sum(int a,int b,int c){
        return a + b + c;
      }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(2,3));
        System.out.println(sum(2,3,4));
        } 
    }
    //code for function overloading using data types
    import java.util.*;
    public class JavaBasics {
        public static int sum(int a, int b){
            return a + b;
        }
        public static float sum(float a, float b){
            return a + b;
        }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(3 , 4));
        System.out.println(sum(3.14f , 2.89f));
        
        } 
    }
    //check number is prime or not code 
     import java.util.*;
    public class JavaBasics {
        public static boolean isPrime(int n){
            boolean isPrime = true;
            for(int i=2; i<=n-1; i++){
                if(n%i==0) {
                    isPrime = false;
                break;
                }
            }
            return isPrime;
        }
       
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPrime(num));
        
        } 
    }
   //check prime ina range code
   import java.util.*;
    public class JavaBasics {
        public static boolean isPrime(int n){
            boolean isPrime = true;
            for(int i=2; i<=n-1; i++){
                if(n%i==0) {
                    isPrime = false;
                break;
                }
            }
            return isPrime;
        }
        public static void primeinrange(int n){
            for(int i=2; i<=n; i++){
                if(isPrime(i)){
                     System.out.print(i+" ");
                }
            }
            System.out.println();
        }
       
    public static void main(String args[]) {
        primeinrange(20);
        
        } 
    }
    //code for binary to decimal
    import java.util.*;
    public class JavaBasics {
        public static void bintodec(int binNum){
            int mynum = binNum;
            int pow = 0;
            int decNum = 0;
            while( binNum > 0){
                int LastDigit = binNum % 10;
                decNum = decNum + ( LastDigit * (int) Math.pow(2, pow));
                pow++;
                binNum = binNum / 10;
            }
            System.out.println(" decimal of " + mynum + " = " + decNum);
        }
    public static void main(String args[]) {
        bintodec(101);
        
        } 
    }
    // code for decimal to binomial
    import java.util.*;
    public class JavaBasics {
        public static void dectobin(int n){
            int mynum = n;
            int pow = 0;
            int binum = 0;
            while(n > 0 ){
                int rem = n % 2;
                binum = binum + (rem * (int)Math.pow(10, pow));
                pow++;
                n = n / 2;
            }
            System.out.println("binomeal form of" + mynum +" = "+ binum);
        }
       
    public static void main(String args[]) {
        dectobin(7);
       
        } 
    }
   //code for average of 3 value in java method
   import java.util.*;
public class JavaBasics {
    public static Double average(Double x,Double y,Double z){
        Double average = (x + y + z)/3;
        return average;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Double x = sc.nextDouble();
        Double y = sc.nextDouble();
        Double z = sc.nextDouble();
        System.out.print(average(x , y , z));


    }
}
//code for even odd in java method
import java.util.*;
public class JavaBasics {
    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        System.out.print(isEven(numb));

    }
}
// patterns advanced chapter 
//code for hollow rectangle
import java.util.*;
public class JavaBasics{
    public static void Hollowreztangle(int totrows, int totcols){
        for(int i=1; i<=totrows; i++){
        
            for(int j=1; j<=totcols; j++){
        
                if(i == 1 || i == totrows || j == 1 || j == totcols){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        Hollowreztangle(8 , 9);

    }
}
//code for inverted rotated half pyramid
import java.util.*;
public class JavaBasics{
  public static void halfpyramid(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
  }
   
  

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        halfpyramid(4);

    }
}
//code for half pyramid of number
import java.util.*;
public class JavaBasics{
    public static void halfpyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        halfpyramid(5);

    }
}
// floyeds triangle codes
import java.util.*;
public class JavaBasics{
    public static void floyeds(int n){
        int counter = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                 System.out.print(counter+" ");
            counter++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        floyeds(9
    );

    }
}
//code for zero one triangle
import java.util.*;
public class JavaBasics{
    public static void zeroonetriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
            }
        
        }
    
    public static void main(String args[]){
        zeroonetriangle(9);

    }
}
//code for butterfly
import java.util.*;
public class JavaBasics{
    public static void zeroonetriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
               
            }
            for(int i=n; i>=1; i--){
                 for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
               

            }
        
        }
    
    public static void main(String args[]){
        zeroonetriangle(5);

    }
}
//code for solid rohmbus
import java.util.*;
public class JavaBasics{
    public static void zeroonetriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();

            
            }
    }         
    
    
    public static void main(String args[]){
        zeroonetriangle(9);

    }
}
//code for hollow rohmbus
import java.util.*;
public class JavaBasics{
    public static void zeroonetriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
            
            }
    }         
    
    
    public static void main(String args[]){
        zeroonetriangle(9);

    }
}
//code for diamond
import java.util.*;
public class JavaBasics{
    public static void zeroonetriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
           
            }
            for(int i=n; i>=1; i--){
                for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
           
            }
    }         
    
    
    public static void main(String args[]){
        zeroonetriangle(56);

    }
}
//new chapter ARRAYS ( imp )
//code for marks
import java.util.*;
public class ArraysCC {
   
    public static void main(String args[]){
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        int  percentage = (marks[0] + marks[1] + marks[2])/3;


        System.out.println("your math = "+ marks[0]);
        System.out.println("your eng = " + marks[1]);
        System.out.println("your tt = " + marks[2]);
        System.out.println("percentage = " + percentage);
       

        
            System.out.println();
       
}
}
//passing arrays an argument
import java.util.*;
public class ArraysCC {
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){
       int marks[] = {99 , 88 , 45};
       update(marks);

        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
}
}
//largest and smallest number code
import java.util.*;
public class matrices{
    public static int largestsmallest(int num[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++){
            if(largest < num[i]){
                largest = num[i];
            }
            if(smallest > num[i]){
                smallest = num[i];
            }
           
        }
    
         System.out.println("smallest one is : "+smallest);
         System.out.print("largest one is : ");
            return largest;
    }
    public static void main(String args[]){
        int num[] = { 1, 2, 3, 4, 5, 56, 33, 44 ,9};
        System.out.print(largestsmallest(num));

    }
}
//code for binary search
import java.util.*;
public class ArraysCC {
    public static int binarySearch(int numbers[] , int key){
        int start = 0, end = numbers.length-1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;



    }
       
   public static void main(String args[]){
    int numbers[] = {2, 4, 6, 8, 10, 12 ,14, 16};
    int key = 10;
    System.out.println( binarySearch  ( numbers, key ));


    
   }
}
//code for reverse an array
import java.util.*;
public class ArraysCC {
    public static void reverseanarray(int numbers[]){
        int first = 0, last = numbers.length-1;
        while(first < last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
              first ++;
              last --;

        }
       
    }
       
   public static void main(String args[]){
    int numbers[] = {2, 4, 6, 8, 10, 12 ,14, 16};
    reverseanarray(numbers);
    for (int i=0; i<numbers.length; i++){
        System.out.print(numbers[i]+" ");
    }
    System.out.println();
    


    
   }
}
//code for pairs of an array
import java.util.*;
public class ArraysCC {
    public static void pairsanarray(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "." + numbers[j] + ")" );
            }
            System.out.println();
        }

    }
       
   public static void main(String args[]){
    int numbers[] = {2 , 4 , 6 , 8 , 10 , 12};
    pairsanarray(numbers);
    
    
   }
}
//code for subbarayys
import java.util.*;
public class ArraysCC {
    public static void pairsanarray(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int  k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();

            }
            System.out.println();
        }
       
    }
       
   public static void main(String args[]){
    int numbers[] = {2 , 4 , 6 , 8 , 10 , 12};
    pairsanarray(numbers);
   
    
    
   }
}
//code for maxsum in subarrays
import java.util.*;
public class ArraysCC {
    public static void pairsanarray(int numbers[]){
        int currasum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currasum = 0;
                for(int  k=start; k<=end; k++){
                    currasum += numbers[k];
                
                }
                System.out.println(currasum);
                if(maxsum < currasum){
                    maxsum = currasum;
                }
                

            }
            
        }
        System.out.println("maxsum = " + maxsum);
       
    }
       
   public static void main(String args[]){
    int numbers[] = {2 , 4 , 6 , 8 , 10 , 12};
    pairsanarray(numbers);
   
    
    
   }
}
//code for maxsum in subarrays prefix method
import java.util.*;
public class ArraysCC {
    public static void pairsanarray(int numbers[]){
        int currasum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];

        }
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currasum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                
                
                if(maxsum < currasum){
                    maxsum = currasum;
                }
                

            }
            
        }
        System.out.print("maxsum = " + maxsum);
       
    }
       
   public static void main(String args[]){
    int numbers[] = {2 , 4 , 6 , 8 , 10 , 12};
    pairsanarray(numbers);
   
    
    
   }
}
//kadans method for subarray
import java.util.*;
public class ArraysCC {
public static void kadans(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println(ms);
    }
       
   public static void main(String args[]){
    int numbers[] = { 5, 6 ,4 ,3 , 8, 3 ,9};
    kadans(numbers);
   
    
    
   }
}
//code for stock buy and sell max profit


public static int stock(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0; i<prices.length; i++){
            if(buyprice < prices[i]){
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit , profit);
            }else{
                buyprice = prices[i];
            }
           
        }
        return maxprofit;
    }
       
   public static void main(String args[]){
    int prices[] = {7 , 1 , 5 , 3 , 6 , 4};
    System.out.print(stock(prices));
   
    
    
   }
//code for trapped rainwater (imppppppppppp very impp)
import java.util.*;
public class Classroom{
    public static int tr(int height[]){
        int n = height.length;
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(leftmax[i-1] , height[i]);
        }

        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(rightmax[i+1] , height[i]);
        }

        int trwater = 0;
        for(int i=0; i<n; i++){
            int width = Math.min(leftmax[i] , rightmax[i]);
            trwater += width - height[i];
        }
        return trwater;
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.print(tr(height));
    }
}

//asignment question for arrays
import java.util.*;
public class ArraysCC{
    public static boolean twice(int number[]){
        for(int i=0; i<number.length; i++){
           for(int j=i+1; j<number.length; j++){
            if(number[i] == number[j]){
                return true;
            }
           }
            }
        
        return false;

    }
    public static void main(String args[]){
        int number[] = { 1 , 2 ,3 , 1};
        System.out.print(twice(number));

    }
}
//new chapter
//basicsorting
//bubble sort
//selection sort
//insertion sort
//inbuilt sort
//counting sort
//all in one code//
import java.util.*;

public class BasicSorting{
    public static void sorting(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void selection(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minpos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    } 
    public static void insertion(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;

        }
    }
    public static void counting(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest , arr[i]);
        }

        int count[] = new int[largest + 1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j]=i;
                count[i]--;
                j++;
            }
        }
    }
    public static void main(String args[]){
        int arr[]= {1,4,1,3,2,4,3,7};
        
        //insertion(arr);
        //Arrays.sort(arr , Collections.reverseOrder());
        counting(arr);
        
        printarr(arr);

    }
}
// new chapter 2d arrays
//creation of 2d arrays wit maximum sum number
import java.util.*;
public class Matrices{
    public static void search(int matrix[] []){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                largest = Math.max(largest , matrix[i][j]);
                

    }
        }
        System.out.print(largest);
        
        
    }
    public static void main(String args[]){
        int matrix[][]= new int[3][3];
        int n = matrix.length , m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
         for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]=sc.nextInt();

            }
         }
         for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
         }
         
         search(matrix);
         
    }
    }
    //spiralcode (imp)
    import java.util.*;
public class Matrices{
    public static void printspiral(int matrix[][]){
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;
        while(startrow <= endrow && startcol <= endcol){

            for(int j=startcol; j<=endcol; j++){
                System.out.print(matrix[startrow][j]+" ");
            }

            for(int i=startrow+1; i<=endrow; i++){
                System.out.print(matrix[i][endcol]+" ");
            }

            for(int j=endcol-1; j>=startcol; j--){
                System.out.print(matrix[endrow][j]+" ");
            }
            
            for(int i=endrow-1; i>=startrow+1; i--){
                System.out.print(matrix[i][startcol]+" ");

            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;

        }
        System.out.println();
    }
    public static void main(String args[]){
        int matrix[][] = {{1 , 2 , 3 , 4},
                         {5 , 6 , 7 , 8},
                         {9 , 10 , 11 , 12},
                         {13 , 14 , 15 , 16}};
        printspiral(matrix);
    }
}
//code for diagonalsum
import java.util.*;
public class Matrices{
    public static int diagonalsum(int matrix[][]){
        int sum = 0;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(i == j ){
        //             sum+= matrix[i][j];

        //         }
        //         else if(i + j == matrix.length-1){
        //             sum+= matrix[i][j];
        //         }
        //     }
            
        // }
        for(int i=0; i<matrix.length; i++){

            sum+= matrix[i][i];

            if( i != matrix.length-1-1);

            sum+= matrix[i][matrix.length-1-i];
        }
        return sum;
    }
    
    public static void main(String args[]){
        int matrix[][] = {{1 , 2 , 3 , 4 },
                         {5 , 6 , 7 , 8 },
                         {9 , 10, 11 ,12 },
                         {13 , 14 , 15 , 16 }};

        System.out.print(diagonalsum(matrix));
    }
}
//code for search in sorted matrix
import java.util.*;
public class Matrices{
    public static boolean sortedsearch(int matrix[][] , int key){
        int row=0, col=matrix[0].length-1;
        while(row < matrix.length && col>=0 ){
            if(matrix[row][col] == key){
                System.out.print("key fount at ("+row+","+col+")");
                return true;
            }
            else if(matrix[row][col]>key){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.print("key not found");
        return false;
        
    }
    public static void main(String args[]){
        int matrix[][] = {{10 , 20 , 30 , 40 },
                          {15, 25 , 35 , 45},
                          {27 , 29 , 37 , 48},
                          {32 , 33, 39 ,50}};
        int key = 29;
        sortedsearch(matrix,key);
    }
}
//new chapter strings
//imp palindrome
import java.util.*;

public class Strings{
    public static void printkletter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
  }
  public static boolean ispalindrome(String str){
    for(int i=0; i<str.length()/2; i++){
        int n = str.length();
        if(str.charAt(i) != str.charAt(n-i-1)){
            return false;
        }
        
    }
    return true;
  }
    public static void main(String args[]){
        String firstname = "anuj";
        String lastname = "ahirwar";
        String fullname = firstname+" "+lastname;
        String str = "fghjkllpkjhgf";
        System.out.print(ispalindrome(str));
    }
}
//another imp for shortest distace 
import java.util.*;
public class Strings{
    public static float shortestpath(String path){
        int x = 0, y = 0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            if(dir == 's'){
                y--;
            }
            else if(dir == 'w'){
                x--;
            }
            else if(dir == 'n'){
                y++;
            }
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
   
    public static void main(String args[]){
        String path = "wneenesennnwsseennnneessssswwnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn";
        System.out.print(shortestpath(path));

    }
}
//code for sub string
import java.util.*;
public class Strings{
    public static String substring(String str , int si , int ei){
        String substr = "";
        for( int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = "hello world";
        int si = sc.nextInt();
        int ei = sc.nextInt();
        System.out.print(substring(str , si, ei));
       

    }
}
//code for largest string
import java.util.*;
public class Strings{
    public static void main(String args[]){
        String fruits[] = {"apple" , "mango" , "xela pav"};
        String largest = fruits[0];
        for( int i=0; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])< 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);

    }
}
//code for uppercase imp
import java.util.*;
public class Strings{
    public static String uppercase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(char i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str = "hi , i am anuj";
        System.out.println(uppercase(str)); 
    }
}
// code for string compression
import java.util.*;
public class JavaBasics{
    public static String Convert(String str){
      String newstr = "";
      for(int i=0; i<str.length(); i++){
        Integer count = 1;
        while(i<str.length()-1 && str.charAt(i)  == str.charAt(i+1)){
            count++;
            i++;
        }
        newstr += str.charAt(i);
        if(count > 1){
            newstr += count.toString();
        }
      }
      return newstr;
    }
    public static void main(String args[]){
        String str = "aaabbbccc";
        System.out.print(Convert(str));
    }
}
//code for vowelcount
import java.util.*;
public class Strings{
    public static void main(String args[]){
        String str = "i am lodu bro from gandhinagar";
        int vowelcount = 0;
    for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        if(ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e'|| ch == 'u'){
        vowelcount++;
        }
    }
    System.out.print(vowelcount);
        
    }
}
//new chapter bit manupulation
//code for odd and even
import java.util.*;
public class Strings{
    public static void oddoreven(int n){
        int bitmask = 1;
        if((n & bitmask)==0){
            System.out.print("even number");
        }else{
            System.out.print("odd number");
        }
    }
    public static void main(String args[]){
        oddoreven(8);
    }
}
//code for get ith bit
import java.util.*;
public class Strings{
    public static int getithbit(int n , int i){
        int bitmask = 1<<i;
        if((n & bitmask)==0){
           return 0;
        }else{
           return 1;
        }
    }
    public static void main(String args[]){
        System.out.println(getithbit(10 , 2));
    }
}
//code for set ith bit
import java.util.*;
public class Strings{
    public static int setithbit(int n , int i){
        int bitmask = 1<<i;
        
           return n | bitmask;
    }
    public static void main(String args[]){
        System.out.println(setithbit(10 , 2));
    }
}
//code for clear ith bit
import java.util.*;
public class Strings{
    public static int clearithbit(int n , int i){
        int bitmask = ~(1<<i);
        
           return n & bitmask;
    }
    public static void main(String args[]){
        System.out.println(clearithbit(10 , 1));
    }
}
//code for update bit
import java.util.*;
public class Strings{
    public static int clearithbit(int n , int i){
        int bitmask = ~(1<<i);
        
           return n & bitmask;
    }
   
     public static int setithbit(int n , int i){
        int bitmask = 1<<i;
        
           return n | bitmask;
    }
   
    
    public static int getithbit(int n , int i){
        int bitmask = 1<<i;
        if((n & bitmask)==0){
           return 0;
        }else{
           return 1;
        }
    }
    public static int updatebit(int n,int i,int newbit){
        // if(newbit == 0){
        //     return clearithbit(n,i);
        // }else{
        //     return setithbit(n,i);
        // }
        n = clearithbit(n,i);
        int bitmask = newbit<<i;
        return n | bitmask;
    }
    public static void main(String args[]){
        System.out.println(updatebit(10 , 2 ,1));
    }
}
//code for clear range of bits
import java.util.*;
public class Strings{
    public static int clearlastithbitinrange(int n, int i,int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a|b;
        

        return n & bitmask;
    }
    public static void main(String args[]){
        System.out.println(clearlastithbitinrange(10,2,4));

    }
}
//code for power of two
import java.util.*;
public class Strings{
    public static boolean poweroftwo(int n){
        return (n&(n-1)) == 0;
       
    }
    public static void main(String args[]){
        System.out.println(poweroftwo(16));

    }
}
//code foe set of bit
import java.util.*;
public class Strings{
    public static int countsetbit(int n){
        int count = 0;
        while(n > 0){
            if((n & 1 )!= 0){
                count++;
            }
            n = n>>1;
        }
        return count;
       
    }
    public static void main(String args[]){
        System.out.println(countsetbit(16));

    }
}
//newchapter OOPS
//code for pen ex or setters getters
public class OOPS{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setcolour("blue");
        System.out.println(p1.getcolour());
        p1.setTip(7);
        System.out.println(p1.getTip());
        p1.setcolour("blueish");
        System.out.println(p1.getcolour());
    }
}
class Pen{
    private String colour;
    private int tip;
    String getcolour(){
        return this.colour;
    }
    int getTip(){
        return this.tip;
    }
    void setcolour(String newcolour){
        this.colour = newcolour;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}
//code for how a constructor is made and how it works
public class OOPS{
    public static void main(String args[]){
        Student s1 = new Student("Anuj Ahirwar");
        System.out.println(s1.name);
    }
}

class Student{
    String name;
    int rollnumber;

    Student(String name){
        this.name = name;
    }
}
//code for copy constructor
public class OOPS{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "anuj ahirwar";
        s1.rollnumber = 35;
        s1.password = "akbhai7890";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;


        Student s2 = new Student(s1);
        s2.password = "78907890";
        s1.marks[2] = 100;
        for(int i=0; i<3; i++){
        System.out.println(s2.marks[i]);
        }
        
    }
}
class Student{
    String name;
    int rollnumber;
    String password;
    int marks[];

    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollnumber = s1.rollnumber;
        this.marks = s1.marks;
    }
    Student(){
        marks = new int[3];
        System.out.println("constructer is called...");
    }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    Student(int rollnumber){
        marks = new int[3];
        this.rollnumber = rollnumber;
    }
}
//code for shallow and deep copy
public class OOPS{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "anuj ahirwar";
        s1.rollnumber = 35;
        s1.password = "akbhai7890";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;


        Student s2 = new Student(s1);
        s2.password = "78907890";
        s1.marks[2] = 100;
        for(int i=0; i<3; i++){
        System.out.println(s2.marks[i]);
        }
        
    }
}
class Student{
    String name;
    int rollnumber;
    String password;
    int marks[];
//shallow cop
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollnumber = s1.rollnumber;
    //     this.marks = s1.marks;
    // }
    Student (Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollnumber = s1.rollnumber;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }

    }
    Student(){
        marks = new int[3];
        System.out.println("constructer is called...");
    }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    Student(int rollnumber){
        marks = new int[3];
        this.rollnumber = rollnumber;
    }
}
// inheritance
class OOPS{
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();

    }
}

//basic class 
class Animal{
    String colour;

    void breathe(){
        System.out.println("breathes");
    }

    void eat(){
        System.out.println("eats");
    }
}
// derived class

class Fish extends Animal{
    int fish;

    void swim(){
        System.out.println("swims");
    }
}
// multilevel inheritance
class OOPS{
    public static void main(String args[]){
        Dog german = new Dog();
        german.eat();
    }
}

//basic class 
class Animal{
    String colour;

    void breathe(){
        System.out.println("breathes");
    }

    void eat(){
        System.out.println("eats");
    }
}
// derived class
class Mammals extends Animal{
    int legs;
}

class Dog extends Mammals{
    int bread;
}

// class Fish extends Animal{
//     int fish;

//     void swim(){
//         System.out.println("swims");
//     }
// }


// hierarchial
class OOPS{
    public static void main(String args[]){
        Bird sp = new Bird();
        sp.breathe();
        sp.colour = blue;
    }
}

//basic class 
class Animal{
    String colour;

    void breathe(){
        System.out.println("breathes");
    }

    void eat(){
        System.out.println("eats");
    }
}
// derived class
class Mammals extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("flys");
    }
}
//example of method overloading
class OOPS{
    public static void main(String args[]){
        Calculator cal = new Calculator();
        System.out.println(cal.Sum(2 , 3));
        System.out.println(cal.Sum((float)2.1 ,(float) 3));
        System.out.println(cal.Sum(2 , 3 , 4));
    }
}
class Calculator {
    int Sum(int a , int b){
        return a + b;
    }
    float Sum(float a , float b){
        return a + b;
    }
    int Sum(int a , int b , int c){
        return a + b + c;
    }
}
//example of method overriding
public class OOPS{
    public static void main(String args[]){
        Deer d = new Deer();
        d.eat();

    }
}

class Animals {
    void eat(){
        System.out.println("eats everything");
    }
}
class Deer extends Animals{
    void eat(){
        System.out.println("eat grass");
    }
}
//abstraction and imp in this is contructor
public class OOPS{
    public static void main(String args[]){
        horse h = new horse();
        h.eat();
        h.walk();
        System.out.println(h.colour);

    }
}

abstract class Animal{
    String colour;
    Animal(){
        colour = "brown";
    }
    void eat(){
        System.out.println("animals eats");

        
    }

    abstract void walk();
}

class horse extends Animal{
    void changeColour(){
        colour = "darks brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class chicken extends Animal{
    void walk (){
        System.out.println("walks on 2 legs");
    }
}
//interfaces 
public class OOPS{
    public static void main(String args[]){
        queen q = new queen();
        q.moves();

    }
}

interface chessplayer{
    void moves();
}
class queen implements chessplayer{
    public void moves(){
        System.out.println("up,down,right,left,diagonal");
    }
}
class rook implements chessplayer{
    public void moves(){
        System.out.println("up,down,right,left");
    }
}
class pawn implements chessplayer{
    public void moves(){
        System.out.println("up,down");
    }
}
//recursion basics //
//code for decreasing and increasing number by recursion method
public class RecursionBasics{
    public static void DN(int n){
        if(n == 1){
            System.out.println(n);
            return ;
        }
        System.out.print(n+" ");
        DN(n-1);
    }
    public static void IN(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        IN(n-1);
        System.out.print(n+" ");
    
    }
    public static void main(String args[]){
        int n = 10; 
        IN(n);
    }
}
//code for factorial in recursion
public class RecursionBasics{
    public static int Factorial(int n){
        if(n == 0){
            return 1;
        }
        int fnm1= Factorial(n-1);
        int fn= n*Factorial(n-1);
        return fn;
    }
    public static void main(String args[]){
        int n = 5; 
        System.out.print(Factorial(n));
    }
}
//code for sum of n natural number
public class RecursionBasics{
    public static int Sumofnno(int n){
        if(n == 1){
            return 1;
        }
        int snm1= Sumofnno(n-1);
        int sn= n+Sumofnno(n-1);
        return sn;
    }
    public static void main(String args[]){
        int n = 20; 
        System.out.print(Sumofnno(n));
    }
}
//code for fabbonacci by recursion method 
public class RecursionBasics{
   public static int fibbonaci(int n){
    if(n == 0 || n == 1){
        return n;
    }
    int fnm1 = fibbonaci(n-1);
    int fnm2 = fibbonaci(n-2);
    int fn = fnm1 + fnm2;
    return fn;
   }
    public static void main(String args[]){
        int n = 30; 
        System.out.print(fibbonaci(n));
    }
}
//code for sorted array by recursion method 
public class RecursionBasics{
    public static boolean isSorted(int arr[] , int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr , i+1);
    }
    public static void main(String args[]){
        int arr[] = {1 , 2 , 3 , 4 , 5 , 7 , 6};
        System.out.println(isSorted(arr , 0));

    }
}
//code first occurance in array by recursion method
public class RecursionBasics{
    public static int firstoccurance(int arr[] , int key , int i){
        if( i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i; 
        }
        return firstoccurance(arr , key , i+1);
    }
    public static void main(String args[]){
        int arr[] = {1 , 2 , 3 , 4 , 5 , 7 , 6 , 5};
        System.out.println(firstoccurance(arr ,5 , 0));

    }
}
//code for last occurance in array by recursion method
public class RecursionBasics{
    public static int lastoccurance(int arr[] , int key , int i){
        if(i == arr.length){
            return -1;
        }
        int isfound = lastoccurance(arr , key , i+1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }
        return isfound;
    }
    public static void main(String args[]){
        int arr[] = {5,5,5,5};
        System.out.println(lastoccurance(arr ,5 , 0));

    }
}
//code for power by recursion 
public class RecursionBasics{
    public static int power(int x , int n){
       if(n == 0){
        return 1;
       }
       return x * power(x , n-1);
    }
    public static void main(String args[]){
        
    System.out.println(power(2 , 10));

    }
}
//tilling problem code by recursion method
public class RecursionBasics{
  public static int tillingproblem(int n){
    if( n == 0 || n == 1){
      return 1;
    }
    int fnm1 = tillingproblem(n-1);
    int fnm2 = tillingproblem(n-2);
    int totalways = fnm1 + fnm2;
    return totalways;
  }
  public static void main(String args[]){
    System.out.print(tillingproblem(4));

  }
}
//code for remove duplicates by recursion method
public class RecursionBasics{
  public static void removeduplicates(String str , int idx , StringBuilder newStr , boolean map []){
    if(idx == str.length()){
      System.out.println(newStr);
      return;
    }
    char currChar = str.charAt(idx);
    if(map[currChar-'a'] == true ){
      removeduplicates(str,idx+1,newStr,map);
    }else{
      map[currChar-'a'] = true;
      removeduplicates(str,idx + 1,newStr.append(currChar),map);
    }
  }
  public static void main(String args[]){
    String str = "appnnacollege";
    removeduplicates(str , 0 , new StringBuilder(""),new boolean[26]);

  }
}
//code for friends pairing by recursion method
public class RecursionBasics{
  public static int FP(int n){
    if(n == 1 || n == 2){
      return n;
    }
    // int fnm1 = FP(n-1);
    // int fnm2 = FP(n-2);
    // int totalpair = (n-1) * fnm2;
    // int totalways = fnm1 + totalpair;
    return FP(n-1) + (n-1)*FP(n-2);
  }
  public static void main(String args[]){
    System.out.println(FP(3));
  }
}
//code for binary string by recursion method
public class RecursionBasics{
  public static void binarystring(int n , int lastplace , String str){
    if(n == 0){
      System.out.println(str);
      return;
    }
    binarystring(n-1 , 0 , str+"0");
    if(lastplace == 0){
    binarystring(n-1 , 1 , str+"1");
    }
  }
  public static void main(String args[]){
    binarystring(3 , 0 , "");

  }
}
//code forr alloccurance by recursive method
class RecursionBasics{
  public static void allocc(int n[] ,int key,int i){
    if(i == n.length){
      return ;
    }
    if(n[i] == key){
      System.out.print(i+" ");
    }
    allocc(n , key , i+1);

  }
  public static void main(String args[]){
    int n[] = {3 , 2,4,5,6,2,7,2,2};
    int key = 2;
    allocc(n , key , 0);

  }
}
//code for merge sort by recursion method
import java.util.*;
public class JavaBasics{
    public static void merge(int arr[] , int si , int mid , int ei){
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= ei){
            temp[k++] = arr[j++];
        }
        for(k=0 , i=si; k<temp.length; k++ , i++){
            arr[i] = temp[k];
        }
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void sort(int arr[] ,int si ,int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        mergesort(arr , si , mid );
        mergesort(arr , mid+1 , ei);
        merge(arr , si , mid , ei);
    }
    public static void main(String args[]){
        int arr[] = {6 , 3 , 9 , 5 , 2 , 8};
        mergesort(arr , 0 , arr.length-1);
        printarr(arr);
    }
}
//code for quick cort 
public class DevidenConquer{
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pIdx = Partition(arr ,si ,ei);
        quickSort(arr ,si , pIdx-1);
        quickSort(arr ,pIdx+1 , ei);
    }
    public static int Partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp  = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String args[]){
        int arr[] = {6 , 3 , 9 , 8 , 2 , 5};
        quickSort(arr, 0,arr.length-1);
        printArr(arr);

    }
}
//code for rotated sorted search
public class DevidenConquer{
    public static int rotatedsearch(int arr[] , int tar , int si , int ei){
        if(si > ei){
            return -1;
        }
        int mid = si + (ei - si)/2;
        if(arr[mid] == tar){
            return mid;
        }

        if(arr[si] <= arr[mid]){
            if(arr[si] <= tar && tar <= arr[mid]){
                return rotatedsearch(arr , tar , si , mid-1);
            }else{
                return rotatedsearch(arr , tar , mid+1 , ei);
            }
            
        }
        else{
            if(arr[mid]<=tar && tar <= arr[ei]){
                return rotatedsearch(arr , tar , mid+1 , ei);
            }else{
                return rotatedsearch(arr , tar ,si , mid-1 );
            }
        }

        }
    public static void main(String args[]){
        int arr[] = {4 , 5 , 6 , 7 , 0 , 1 , 2 , 3};
        int target = 2;  
        int tarIdx = rotatedsearch(arr , target , 0 , arr.length-1);
        System.out.print(tarIdx);

        }
}
//new chapter Backtracking
//code for backtracking in arrays
public class Classroom{
    public static void changearr(int arr[] , int i , int val){
        if(i == arr.length){
            printarr(arr);
            return;
        }
        arr[i] = val;
        changearr(arr , i+1 , val+1);
        arr[i] = arr[i] - 2;
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = new int[5];
        changearr(arr , 0 , 1);
        printarr(arr);
    }
}
//code for findsubsets
public class Classroom{
    public static void findSubsets(String str , String ans , int i){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        findSubsets(str , ans+str.charAt(i) , i+1);
        findSubsets(str , ans , i+1);
    }
    public static void main(String args[]){
        String str = "abc";
        findSubsets(str , "" , 0);
    }
}
//code for find permutations
public class Classroom{
    public static void Permutations(String str ,String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newstring = str.substring(0 , i) + str.substring(i+1);
            Permutations(newstring , ans+curr);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        Permutations(str , "");

    }
}
// code for nQueens in n*n chessboard
public class Classroom{
    public static boolean isSafe(char board[][] , int row , int col){
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        for(int i=row-1;, j=col-1;  && i>=0  j>=0; i-- , j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i=row-1, j=col+1; &&  i>=0  j<board.length; i-- , j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void Nqueens(char board[][] , int row){
        if(row == board.length){
            printboard(board);
            return;
        }
        for(int j=0; j<board.length; j++){
            if(isSafe(board , row , j)){
            board[row][j] = 'Q';
            Nqueens(board , row+1);
            board[row][j] = 'x';
            }
        }
    }
    public static void printboard(char board[][]){
        System.out.println("-----------chessboard----------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
    int n = 5;
    char board [][] = new char[n][n];
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            board[i][j] = 'x';
        }
    } 
    Nqueens(board , 0);
}
}
// code for optimize soloution and for one solution and also for count of solution
public class Classroom{
    public static boolean isSafe(char board[][] , int row , int col){
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        for(int i=row-1, j=col-1; i>=0 && j>=0; i-- , j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i-- , j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean Nqueens(char board[][] , int row){
        if(row == board.length){
            // printboard(board);
            count++;
            return true;
        }
        for(int j=0; j<board.length; j++){
            if(isSafe(board , row , j)){
            board[row][j] = 'Q';
            if(Nqueens(board , row+1)){
                return true;
            }
            board[row][j] = 'x';
            }
        }
        return false;
    }
    public static void printboard(char board[][]){
        System.out.println("-----------chessboard----------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count = 0;
    public static void main(String args[]){
    int n = 4;
    char board [][] = new char[n][n];
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            board[i][j] = 'x';
        }
    } 
    if(Nqueens(board , 0)){
        System.out.println("solution is possible");
        printboard(board);
    }else{
        System.out.print("Solution is not possible");
    }
    // System.out.print(count);
}
}
//code for soduko solver
public class Classroom{
    public static boolean issafe(int soduko[][] , int row , int col , int digit){
        for(int i=0; i<=8; i++){
            if(soduko[i][col] == digit){
            return false;
            }
        }
        for(int j=0; j<=8; j++){
            if(soduko[row][j] == digit){
            return false;
        }
        }
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(soduko[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sodukosolver(int soduko[][] , int row , int col){
        
        if(row == 9){
            return true;
        }
        int nextrow = row ,  nextcol = col+1;
        if(col+1 == 9){
            nextrow = row+1;
            nextcol = 0;
        }
        if(soduko[row][col] != 0){
            return sodukosolver(soduko , nextrow , nextcol);
        }
        for(int digit=1; digit<=9; digit++){
            if(issafe(soduko , row , col , digit)){
                soduko[row][col] = digit;
                if(sodukosolver(soduko , nextrow , nextcol)){
                    return true;
                }
                soduko[row][col] = 0;
            }
        }
        return false;
    }
    public static void printSoduko(int soduko[][]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
            System.out.print(soduko[i][j]+" ");
        }
        System.out.println();
    }
    }
    public static void main(String args[]){
        int soduko[][] = {{0,0,8,0,0,0,0,0,0},
                          {4,9,0,1,5,7,0,0,2},
                          {0,0,3,0,0,4,1,9,0},
                          {1,8,5,0,6,0,0,2,0},
                          {0,0,0,0,2,0,0,6,0},
                          {9,6,0,4,0,5,3,0,0},
                          {0,3,0,0,7,2,0,0,4},
                          {0,4,9,0,3,0,0,5,7},
                          {8,2,7,0,0,9,0,1,3}};

        if(sodukosolver(soduko , 0 , 0)){
            System.out.println("solution exist");
            printSoduko(soduko);
        }else {
            System.out.println("solution does not exist");
        }
    }
}
//new chapter ArrayList
//code for list in a list
import java.util.ArrayList;
public class Classroom{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1); list1.add(2);
        MainList.add(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        MainList.add(list2);
        for(int i=0; i<MainList.size(); i++){
            ArrayList<Integer> currlist = MainList.get(i);
            for(int j=0; j<currlist.size(); j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }
        System.out.print(MainList);
    }
}
import java.util.ArrayList;
public class Classroom{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();
        ArrayList<Integer> List1 = new ArrayList<>();
        ArrayList<Integer> List2 = new ArrayList<>();
        ArrayList<Integer> List3 = new ArrayList<>();

        for(int i=0; i<=5; i++){
            List1.add(i*1);
            List2.add(i*2);
            List3.add(i*3);
        }
        MainList.add(List1);
        MainList.add(List2);
        MainList.add(List3);
        System.out.println(MainList);

        for(int i=0; i<MainList.size(); i++){
            ArrayList<Integer> currlist = MainList.get(i);
            for(int j=0; j<currlist.size(); j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }
        
    }
}
//code for most water in container
import java.util.*;
public class Classroom{
    public static int Storerainwater(ArrayList<Integer> Height){
        int Maxwater = 0;
        for(int i=0; i<Height.size(); i++){
            for(int j=i+1; j<Height.size(); j++){
                int ht = Math.min(Height.get(i) , Height.get(j));
                int width = j-i;
                int currwater = ht * width;
                Maxwater = Math.max(Maxwater , currwater);
            }
        }
        return Maxwater;
    }
    public static void main(String args[]){
        ArrayList<Integer> Height = new ArrayList<>();
        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);

        System.out.print(Storerainwater(Height));
    }
}
//optimize code for container water
import java.util.*;
public class Classroom{
    public static int Storerainwater(ArrayList<Integer> Height){
       int maxwater = 0;
       int lp = 0;
       int rp = Height.size()-1;
       while(lp < rp){
        int ht = Math.min(Height.get(lp) , Height.get(rp));
        int width = rp-lp;
        int curr = ht * width;
        maxwater = Math.max(maxwater , curr);

        if(Height.get(lp) < Height.get(rp)){
            lp++;
        }else{
            rp--;
        }
       }
       return maxwater;
    }
    public static void main(String args[]){
        ArrayList<Integer> Height = new ArrayList<>();
        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);

        System.out.print(Storerainwater(Height));
    }
}
//code for pair sum
import java.util.*;
public class Classroom{
    public static boolean pairsum(ArrayList<Integer> list , int target){
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 5;
        System.out.print(pairsum(list , target));
    }
}
//code for pair sum two pointer approach
import java.util.*;
public class Classroom{
    public static boolean pairsum(ArrayList<Integer> list , int target){
        int lp = 0;
        int rp = list.size()-1;
        while(lp != rp){
            if( list.get(lp) + list.get(rp) == target){
                return true;
            }
            if(list.get(lp) + list.get(rp) < target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.print(pairsum(list , target));
    }
}
//code for pair sum by another method
import java.util.*;
public class Classroom{
    public static boolean pairsum(ArrayList<Integer> list , int target){
        int n = list.size();
       int bp = -1;
       for(int i=0; i<list.size(); i++){
        if(list.get(i) > list.get(i+1)){
            bp = i;
            break;
        }
       }
       int lp = bp+1;
       int rp = bp;
       while(lp != rp){
        if(list.get(lp) + list.get(rp) == target){
            return true;
        }
        if(list.get(lp) + list.get(rp) < target){
            lp = (lp + 1) % n;
        }else{
            rp = (n+rp-1) % n;
        }
       }
       return false;

    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 129;
        System.out.print(pairsum(list , target));
    }
}
//new chapter linked list
//print linked list
public class LinkedList{
    public static class Node {
        int data ;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void Firstadd(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public static void Addlast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
    public void print(){
        if(head == null){
            System.out.println("ll is empt");
            return;
    }
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
    System.out.println("null");

    }
    public void add(int idx ,int data){
        Node newnode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.Firstadd(1);
        ll.Firstadd(2);
        ll.Addlast(3);
        ll.Addlast(4);
             
        ll.print();
       
    }
}
//code for add node in middle of linked list
public class LinkedList{
    public static class Node {
        int data ;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void Firstadd(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public static void Addlast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
    public void print(){
        if(head == null){
            System.out.println("ll is empt");
            return;
    }
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
    System.out.println("null");

    }
    public void add(int idx ,int data){
        Node newnode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.Firstadd(1);
        ll.Firstadd(2);
        ll.Addlast(3);
        ll.Addlast(4);
        ll.add(2 , 9);
        ll.print();
    }
}
// code for removr first node 
public class LinkedList{
    public static class Node {
        int data ;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void Firstadd(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public static void Addlast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
    public void print(){
        if(head == null){
            System.out.println("ll is empt");
            return;
    }
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
    System.out.println("null");

    }
    public void add(int idx ,int data){
        Node newnode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }
    public int removefirst(){
        int val = head.data;
        head = head.next;
        return val;
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.Firstadd(2);
        ll.Firstadd(1);
        ll.Addlast(3);
        ll.Addlast(4);
        ll.add(2 , 9);
        ll.print();
        ll.removefirst();
        ll.print();
    }
}
// code for remove last in ll
public class LinkedList{
    public static class Node {
        int data ;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void Firstadd(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public static void Addlast(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
    public void print(){
        if(head == null){
            System.out.println("ll is empt");
            return;
    }
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
    System.out.println("null");

    }
    public void add(int idx ,int data){
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }
    public int removefirst(){
        int val = head.data;
        head = head.next;
        return val;
    }
    public int Removelast(){
        if(size == 0){
            System.out.println(" ll is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.Firstadd(2);
        ll.Firstadd(1);
        ll.Addlast(3);
        ll.Addlast(4);
        ll.add(2 , 9);
        ll.print();
        ll.removefirst();
        ll.print();
        ll.Removelast();
        ll.print();
        System.out.println(ll.size);
    }
}
//alll about ll
public class LinkedList{
    public static class Node {
        int data ;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void Firstadd(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public static void Addlast(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
    public void print(){
        if(head == null){
            System.out.println("ll is empt");
            return;
    }
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
    System.out.println("null");

    }
    public void add(int idx ,int data){
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }
    public int removefirst(){
        int val = head.data;
        head = head.next;
        return val;
    }
    public int Removelast(){
        if(size == 0){
            System.out.println(" ll is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int itrsearch(int key){
        Node temp = head;
        int i= 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head , int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next , key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head , key);
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while( curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void deletefromend(int n){
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if( n ==sz){
            head = head.next;
            return;
        }
        int i = 1;
        int ifound = sz-n;
        Node prev = head;
        while(i < ifound){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public Node findmid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head == null && head.next == null){
            return true;
        }
        Node mid = findmid(head);
        Node curr = mid;
        Node prev = null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.Firstadd(2);
        ll.Firstadd(1);
        ll.Addlast(2);
        ll.Addlast(1);
        // ll.add(2 , 9);
        ll.print();
        System.out.println(ll.checkPalindrome());
        ll.print();
    }
}
//code for detecting and delete cycle
public class LinkedList{
    public static class Node {
        int data ;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }
    public static void main(String args[]){
        head = new Node(1);
        // head.next = new Node(2);
        Node temp = new Node(2);
        head.next = temp;

        head.next.next = new Node(3);
        head.next.next.next = temp;
        // head.next.next.next = head;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
// zig zag
import java.util.*;
public class LinkedList{
    public static class Node {
        int data ;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void print(){
        if(head == null){
            System.out.println("ll is empt");
            return;
    }
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
    System.out.println("null");
    }
    public void Zigzag(){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL , nextR;
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.Zigzag();
        ll.print();
    }
}
// new chapter STACKS
// code implementation of STACK in arraylist
import java.util.*;
public class StackB{
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
// code implementation of STACK in linkedlist
import java.util.*;
public class StackB{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head = null;

        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            Node newNode = new Node(data);

            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
// implementation of STACK though java collection framework
import java.util.*;
public class StackB{
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
//push at the bottom of the stack
import java.util.*;
public class StackB{
    public static void pushatbottom(Stack<Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatbottom(s , data);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushatbottom(s , 4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
//code for reverse a string by stack
import java.util.*;
public class StackB{
   
    public static String reversestring(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String args[]){
        String str = "helloworld";
        String result = reversestring(str);
        System.out.println(result);
    }
}
// reverse a stack
import java.util.*;
public class StackB{
    public static void pushatbottom(Stack<Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatbottom(s , data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushatbottom(s , top);
    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        printStack(s);

    }
}
// code for stock span problem
import java.util.*;
public class StackB{
    public static void stockspan(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i=1; i<stocks.length; i++){
            int curr = stocks[i];
            while(!s.isEmpty() && curr > stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevhigh = s.peek();
                span[i] = i - prevhigh;
            }
            s.push(i);
        }
    }
    public static void main(String args[]){
        int stocks[] = {100 , 80 , 60 , 70 , 60 , 85 , 100};
        int span[] = new int[stocks.length];

        stockspan(stocks , span);
        for(int i=0; i<span.length; i++){
            System.out.println(span[i]+" ");
        }
    }\
}
// code for next greater element in right
import java.util.*;
public class StackB{
    public static void main(String args[]){
        int arr[]  ={6, 8 , 0 , 1 , 3};
        Stack<Integer> s = new Stack<>();
        int nxtgen[] = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtgen[i] = -1;
            }else{
                nxtgen[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0; i<nxtgen.length; i++){
            System.out.print(nxtgen[i]+" ");
        }
        System.out.println();
    }
}
//code for valid parenthesis an duplicate parenthesis
import java.util.*;
public class StackB{
    public static boolean isvalid(String str){
        Stack <Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() == '(' && ch == ')')
            || (s.peek() == '{' && ch == '}')
            || (s.peek() == '[' && ch ==']')){
                s.pop();
            }else{
                return false;
            }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isDuplicate(String str){
        Stack <Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
}
    public static void main(String args[]){
        String str1 = "((a+b))";
        String str = "(a+b)";
        System.out.println(isDuplicate(str));
    }
}
// max area in histogram
import java.util.*;
public class StackB{
    public static void maxarea(int arr[]){
        int maxarea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

       s = new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currarea = height * width;
            maxarea = Math.max(currarea , maxarea);
        }
        System.out.println(maxarea);
    }
    public static void main(String args[]){
        int arr[] = {2 ,1 , 5, 6 , 2 ,3};
        maxarea(arr);

    }
}
// neww chapter
// code implementation of queue in array
import java.util.*;
public class QueueB{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void add(int data){
            if(rear == size-1){
                System.out.println("queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear = rear - 1;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            } 
            return arr[0];
        }
    }
    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
// implementation of queue in array in circular queue
import java.util.*;
public class QueueB{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isfull(){
            return (rear+1)%size == front;
        }

        public static void add(int data){
            if(isfull()){
                System.out.println("queue is full");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1)%size;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int result = arr[front];
            
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front + 1)%size;
            }
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            } 
            return arr[front];
        }
    }
    public static void main(String args[]){
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
// code for implementation of queue in linkedlist
import java.util.*;
public class QueueB{
    static class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;
        public static boolean isEmpty(){
            return head == null && tail == null;
        }
        public static void add(int data){
           Node newnode = new Node(data);
           if(head == null){
            head = tail = newnode;
            return;
           }
           tail.next = newnode;
           tail = newnode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            if(tail ==head){
                tail = head = null;
            }else{
                head = head.next;
            }
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            } 
            return head.data;
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
//code implementation of queue from JCF\import java.util.*;
public class QueueB{
    public static void main(String args[]){
        // Queue q = new Queue();
        // Queue <Integer> q = new LinkedList<>();
        Queue <Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
// queue using two Stacks
import java.util.*;
public class QueueB{
    static class Queue{
        static Stack <Integer> s1 = new Stack<>();
        static Stack <Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }

            return s1.pop();
        }
        public static int peek(){
             if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }

            return s1.peek();
        }

    }
    public static void main(String args[]){
       Queue q = new Queue();
       q.add(1);
       q.add(2);
       q.add(3);
       while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
       }
    }
}
// stack using two queues
import java.util.*;
public class QueueB{
    static class Stack{
       static Queue<Integer> q1 = new LinkedList<>();
       static Queue<Integer> q2 = new LinkedList<>();

       public static boolean isEmpty(){
        return q1.isEmpty() && q2.isEmpty();
       }

       public static void push(int data){
        if(!q1.isEmpty()){
            q1.add(data);
        }else{
            q2.add(data);
        }
       }
       public static int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        int top = -1;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top = q1.remove();
                if(q1.isEmpty()){
                    break;
                }
                q2.add(top);
            }
        }else{
            while(!q2.isEmpty()){
                top = q2.remove();
                if(q2.isEmpty()){
                    break;
                }
                q1.add(top);
            }
        }
        return top;
       }
       public static int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        int top = -1;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top = q1.remove();
                
                q2.add(top);
            }
        }else{
            while(!q2.isEmpty()){
                top = q2.remove();
                
                q1.add(top);
            }
        }
        return top;
       }
    }
    public static void main(String args[]){
     Stack s = new Stack();
      s.push(1);
      s.push(2);
      s.push(3);
       while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
       }
    }
}
// code for non repeating latter
import java.util.*;
public class QueueB{
    public static void nonrepeating(String str){
        int freq[] = new int[26];
        Queue <Character> q = new LinkedList<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a'] > 1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        String str = "aabccxb";
        nonrepeating(str);
    }
}
// code for interleave two halfs
import java.util.*;
public class QueueB{
    public static void Interleave(Queue<Integer> q){
        Queue <Integer> firstQueue = new LinkedList<>();
        int size = q.size();

        for(int i=0; i<size/2; i++){
            firstQueue.add(q.remove());
        }

        while(!firstQueue.isEmpty()){
            q.add(firstQueue.remove());
            q.add(q.remove());
        }
    }
    public static void main(String args[]){
        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        Interleave(q);
        while(!q.isEmpty()){
        System.out.print(q.remove()+" ");
    }
    System.out.println();
    }
}
//reverse a queue
import java.util.*;
public class QueueB{
    public static void reverse(Queue<Integer> q){
        Stack <Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String args[]){
        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverse(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        System.out.println();
       
    }
}
// stack using deque
import java.util.*;
public class QueueB{
  static class Stack{
    Deque<Integer> deque = new LinkedList<>();

    public void push(int data){
        deque.addLast(data);
    }

    public int pop(){
        return deque.removeLast();
    }

    public int peek(){
        return deque.getLast();
    }
  }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
       System.out.println("peek = "+s.peek());
       System.out.println(s.pop());
       System.out.println(s.pop());
       System.out.println(s.pop());
    }
}
// queue using deque
import java.util.*;
public class QueueB{
  static class Queue{
    Deque<Integer> deque = new LinkedList<>();

    public void add(int data){
        deque.addLast(data);
        
    }

    public int remove(){
        return deque.removeFirst();
    }

    public int peek(){
        return deque.getFirst();
    }
  }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
       System.out.println("peek = "+q.peek());
       System.out.println(q.remove());
       System.out.println(q.remove());
       System.out.println(q.remove());
    }
}
// code for fractional knapsack
import java.util.*;
public class Classroom{
    public static void main(String args[]){
        int value[] = {60,100,120};
        int wieght[] = {10,20,30};
        int w = 50;

        double ratio[][] = new double[value.length][2];
        for(int i=0; i<value.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)wieght[i];
        }
        Arrays.sort(ratio , Comparator.comparingDouble(o -> o[1]));
        int capacity = w;
        int finalvalue = 0;
        for(int i=ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= wieght[idx]){
                finalvalue += value[idx];
                capacity -= wieght[idx];
            }else{
                finalvalue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println(finalvalue);

    }
}
// code for minimum absolute difference
import java.util.*;
public class Classroom{
    public static void main(String args[]){
       int A[] = {4,1,8,7};
       int B[] = {2,3,6,5};

       Arrays.sort(A);
       Arrays.sort(B);

       int minimum = 0;
       for(int i=0; i<A.length; i++){
        minimum += Math.abs(A[i] - B[i]);
       }
       System.out.println(minimum);
    }
}
// code for maximum length chain of pair
import java.util.*;
public class Classroom{
    public static void main(String args[]){
      int pairs[][] ={ {5,24}, {39,60}, {5,28}, {27,40}, {50,90}};

      Arrays.sort(pairs , Comparator.comparingDouble(o -> o[1]));

      int chainlen = 1;
      int pairend = pairs[0][1];
      for(int i=1; i<pairs.length; i++){
        if(pairs[i][0] > pairend){
            chainlen++;
            pairend = pairs[i][1];
        }
      }
      System.out.println(chainlen);
    }
}
// code for indian coins
import java.util.*;
public class Classroom{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Integer coins[] = {1,5,10,20,50,100,500,2000};

        Arrays.sort(coins , Comparator.reverseOrder());

        int count = 0;
        int amount = sc.nextInt();
        ArrayList <Integer> ans = new ArrayList<>();
        for(int i=0; i<coins.length; i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    count++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println(count);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();

    }
}
// code job sequencing
import java.util.*;
public class Classroom{
    static class job{
        int deadline;
        int profit;
        int id;

        public job(int i, int d , int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String args[]){
        int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};
        ArrayList<job> jobs = new ArrayList<>();

        for(int i=0; i<jobsInfo.length; i++){
            jobs.add(new job(i , jobsInfo[i][0] , jobsInfo[i][1]));
        }
        Collections.sort(jobs , (obj1 , obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i=0; i<jobs.size(); i++){
            job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println(seq.size());
        for(int i=0; i<seq.size(); i++){
            System.out.print("on index "+seq.get(i)+" ");
        }
        System.out.println();
    }
}
// code for chocola problem
import java.util.*;
public class Classroom{
    public static void main(String args[]){
        int n = 4 , m = 6;
        Integer costVer[] = {2,1,3,1,4};
        Integer costHori[] = {4,1,2};

        Arrays.sort(costVer , Collections.reverseOrder());
        Arrays.sort(costHori , Collections.reverseOrder());

        int h = 0 , v = 0;
        int hp = 1, vp = 1;
        int cost = 0;
        while(h < costHori.length && v < costVer.length){
            if(costVer[v] <= costHori[h]){
                cost += (costHori[h] * vp);
                hp++;
                h++;
            }else{
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        while(h < costHori.length){
            cost += (costHori[h] * vp);
            hp++;
            h++; 
        }

        while(v < costVer.length){
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }
        System.out.print(cost);
    }
}
// binary tress

//kunal style to build tree
import java.util.Scanner;

class BinaryTree {

  public BinaryTree() {

  }

  private static class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
      this.value = value;
    }
  }

  private Node root;

  // insert elements
  public void populate(Scanner scanner) {
    System.out.println("Enter the root Node: ");
    int value = scanner.nextInt();
    root = new Node(value);
    populate(scanner, root);
  }

  private void populate(Scanner scanner, Node node) {
    System.out.println("Do you want to enter left of " + node.value);
    boolean left = scanner.nextBoolean();
    if (left) {
      System.out.println("Enter the value of the left of " + node.value);
      int value = scanner.nextInt();
      node.left = new Node(value);
      populate(scanner, node.left);
    }

    System.out.println("Do you want to enter right of " + node.value);
    boolean right = scanner.nextBoolean();
    if (right) {
      System.out.println("Enter the value of the right of " + node.value);
      int value = scanner.nextInt();
      node.right = new Node(value);
      populate(scanner, node.right);
    }

  }

  public void display() {
    display(this.root, "");
  }

  private void display(Node node, String indent) {
    if (node == null) {
      return;
    }
    System.out.println(indent + node.value);
    display(node.left, indent + "\t");
    display(node.right, indent + "\t");
  }

  public void prettyDisplay() {
    prettyDisplay(root, 0);
  }

  private void prettyDisplay(Node node, int level) {
    if (node == null) {
      return;
    }

    prettyDisplay(node.right, level + 1);

    if (level != 0) {
      for (int i = 0; i < level - 1; i++) {
        System.out.print("|\t\t");
      }
      System.out.println("|------->" + node.value);
    } else {
      System.out.println(node.value);
    }
    prettyDisplay(node.left, level + 1);
  }

  public void preOrder() {
    preOrder(root);
  }

  private void preOrder(Node node) {
    if (node == null) {
      return;
    }
    System.out.print(node.value + " ");
    preOrder(node.left);
    preOrder(node.right);
  }

  public void inOrder() {
    preOrder(root);
  }

  private void inOrder(Node node) {
    if (node == null) {
      return;
    }
    preOrder(node.left);
    System.out.print(node.value + " ");
    preOrder(node.right);
  }

  public void postOrder() {
    preOrder(root);
  }

  private void postOrder(Node node) {
    if (node == null) {
      return;
    }
    preOrder(node.left);
    preOrder(node.right);
    System.out.print(node.value + " ");
  }

}
// build a binary trees with all traversal order
import java.util.*;
public class BinaryTrees{
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
        static class BinaryTree{
            static int idx = -1;
            public static Node buildtree(int nodes[]){
                idx++;
                if(nodes[idx] == -1){
                    return null;
                }
                Node newnode = new Node(nodes[idx]);
                newnode.left = buildtree(nodes);
                newnode.right = buildtree(nodes);

                return newnode;
            }
             public static void preorder(Node root){
                    if(root == null){
                        return ;
                    }
                    System.out.print(root.data+" ");
                    preorder(root.left);
                    preorder(root.right);
         }
         public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
         }
         public static void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
         }
         public static void levelOrder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
         }
        }
    
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        tree.levelOrder(root);
    }
}
// code for calculate height of tree and sum of nodes and count of nodes
import java.util.*;
public class BinaryTrees{
    static class Node{
        int data;
        Node left , right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
     public static int height(Node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh , rh) + 1;
        }
        public static int count(Node root){
            if(root == null){
                return 0;
            }
            int LC = count(root.left);
            int RC = count(root.right);
            return  (LC + RC + 1);
        }
        public static int sum(Node root){
            if(root == null){
                return 0;
            }
            int LS = sum(root.left);
            int RS = sum(root.right);
            return (LS + RS + root.data);
        }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.print(sum(root));
    }
}
// code for diameter from both approach and subtree of another tree also
import java.util.*;
public class BinaryTrees{
    static class Node{
        int data;
        Node left , right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
     public static int height(Node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh , rh) + 1;
     }
     public static int Diameter(Node root){
        if(root == null){
            return 0;
        }

        int LD = Diameter(root.left);
        int LH = height(root.left);
        int RD = Diameter(root.right);
        int RH = height(root.right);
        int selfdia = (LH + RH + 1);

        return Math.max(selfdia , Math.max(LD , RD));
     }
     static class Info{
        int dia;
        int hi;

        public Info(int dia , int hi){
            this.dia = dia;
            this.hi = hi;
        }
     }
     public static Info diam(Node root){
        if(root == null){
            return new Info(0 , 0);
        }
        Info leftInfo = diam(root.left);
        Info rightInfo= diam(root.right);

        int dia = Math.max(Math.max(leftInfo.dia , rightInfo.dia) , leftInfo.hi + rightInfo.hi + 1 );
        int hi = Math.max(leftInfo.hi , rightInfo.hi)+1;
        return new Info(dia , hi);
     }
     public static boolean isIdentical(Node node , Node subroot){
        if(node == null && subroot == null){
            return true;
        }else if(node == null || subroot == null || node.data != subroot.data){
            return false;
        }
        if(!isIdentical(node.left , subroot.left)){
            return false;
        }
        if(!isIdentical(node.right , subroot.right)){
            return false;
        }
        return true;
     }
     public static boolean isSubtree(Node root , Node subroot){
        if(root == null){
            return false;
        }
        if(root.data == subroot.data){
            if(isIdentical(root , subroot)){
                return true;
            }
        }
        return isSubtree(root.left , subroot) || isSubtree(root.right , subroot);
     }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        //subroot.right = new Node(5);
        System.out.print(isSubtree(root , subroot));
    }
}
// code for top view of a binary tree
import java.util.*;
public class BinaryTrees{
    static class Node{
        int data;
        Node left , right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Info{
        Node node;
        int hd;

        public Info(Node node , int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topview(Node root){
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();

        int min = 0,max = 0;
        q.add(new Info(root , 0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.hd)){
                map.put(curr.hd , curr.node);
            }
            if(curr.node.left != null){
                q.add(new Info(curr.node.left , curr.hd-1));
                min = Math.min(min , curr.hd-1);
            }
            if(curr.node.right != null){
                q.add(new Info(curr.node.right , curr.hd+1));
                max = Math.max(max , curr.hd+1);
            }
            }
           
        }
        for(int i=min; i<=max; i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        topview(root);
    }
// code for print kth level
import java.util.*;
public class BinaryTrees{
    static class Node{
        int data;
        Node left , right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
   public static void Klevel(Node root , int level , int k){
    if(root == null){
        return ;
    }
    if(level == k){
        System.out.print(root.data+" ");
        return;
    }
    Klevel(root.left,level+1,k);
    Klevel(root.right,level+1,k);
   }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int k = 3;
        Klevel(root , 1 , k);
    }
}
// code for find common ancestor with both two approach
import java.util.*;
public class BinaryTrees{
    static class Node{
        int data;
        Node left , right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean getPath(Node root , int n , ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean foundleft = getPath(root.left , n , path);
        boolean foundright = getPath(root.right , n , path);

        if(foundleft || foundright){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root , n1 , path1);
        getPath(root , n2 , path2);

        int i= 0;
        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        Node lca = path1.get(i-1);
        return lca;
    }
    public static Node lca2(Node root , int n1 ,int n2){
        if(root == null ||root.data == n1 || root.data == n2){
            return root;
        }
        Node leftlca = lca2(root.left , n1, n2);
        Node rightlca = lca2(root.right , n1 , n2);

        if(leftlca == null){
            return rightlca;
        }
        if(rightlca == null){
            return leftlca;
        }
        return root;
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4 , n2 = 6;
        System.out.println(lca2(root , n1 , n2).data);
}
}
// minimum distance between two nodes
import java.util.*;
public class BinaryTrees{
    static class Node{
        int data;
        Node left , right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean getPath(Node root , int n , ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean foundleft = getPath(root.left , n , path);
        boolean foundright = getPath(root.right , n , path);

        if(foundleft || foundright){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root , n1 , path1);
        getPath(root , n2 , path2);

        int i= 0;
        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        Node lca = path1.get(i-1);
        return lca;
    }
    public static Node lca2(Node root , int n1 ,int n2){
        if(root == null ||root.data == n1 || root.data == n2){
            return root;
        }
        Node leftlca = lca2(root.left , n1, n2);
        Node rightlca = lca2(root.right , n1 , n2);

        if(leftlca == null){
            return rightlca;
        }
        if(rightlca == null){
            return leftlca;
        }
        return root;
    }
    public static int lcadist(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftdist = lcadist(root.left , n);
        int rightdist = lcadist(root.right,n);
        if(leftdist == -1 && rightdist == -1){
            return -1;
        }else if(leftdist == -1){
            return rightdist+1;
        }else{
            return leftdist+1;
        }
    }
    public static int mindist(Node root , int n1 , int n2){
        Node lca = lca2(root , n1 , n2);
        int dist1 = lcadist(lca , n1);
        int dist2 = lcadist(lca , n2);

        return 
        dist1 + dist2;
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4 , n2 = 5;
        System.out.println(mindist(root , n1 , n2));
}
}
// code for transform a sum tree
import java.util.*;
public class BinaryTrees{
    static class Node{
        int data;
        Node left , right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
   public static int Transform(Node root){
    if(root == null){
        return 0;
    }
    int leftsum = Transform(root.left);
    int rightsum = Transform(root.right);

    int data = root.data;
    int newleft = root.left == null ? 0 : root.left.data;
    int newright = root.right == null ? 0 : root.right.data;
    root.data = newleft + leftsum + newright + rightsum;

    return data;
   }
   public static void preorder(Node root){
    if(root == null){
        return;
    }
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
     }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
       Transform(root);
       preorder(root);
}
}
// new chapter 
// code for build bst & search in bst & alse for delete a node & and for print in range & print path root to leaf alll paths & is valid
import java.util.*;
public class BST{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
    public static Node builtbst(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = builtbst(root.left , val);
        }else{
            root.right = builtbst(root.right , val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return search(root.left , key);
        }
        else{
            return search(root.right , key);
        }
    }
    public static Node delete(Node root , int val){
        if(root.data < val){
            root.right = delete(root.right , val);
        }else if(root.data > val){
            root.left = delete(root.left , val);
        }else{
            if(root.left == null & root.right == null){
                return null;
            }

            if(root.right == null){
                return root.left;
            }else if(root.left == null){
                return root.right;
            }
            Node IS = InorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right , IS.data);
        }
        return root;
    }
    public static Node InorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void PrintInRange(Node root , int k1 , int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            PrintInRange(root.left , k1 , k2);
            System.out.print(root.data+" ");
            PrintInRange(root.right , k1 , k2);
        }
        else if(root.data < k1){
            PrintInRange(root.left , k1 , k2);
        }
        else{
            PrintInRange(root.right , k1 , k2);
        }
    }
    public static void printpath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println("Null");
    }
    public static void printroot2leaf(Node root , ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printpath(path);
        }
        printroot2leaf(root.left , path);
        printroot2leaf(root.right , path);
        path.remove(path.size() - 1);
    }
    public static boolean isValid(Node root ,Node min ,Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }
        return isValid(root.left , min , root)
        && isValid(root.right , root , max);
    }
    public static void main(String args[]){
        int values[] = {8,5,3,1,4,6,6,11,14};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = builtbst(root , values[i]);
        }
        inorder(root);
        System.out.println();
        if(isValid(root , null , null)){
            System.out.print("valid");
        }else{
            System.out.print("not valid");
        }
    }
}
// code for mirror of bst
import java.util.*;
public class BST{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static Node createMirror(Node root){
        if(root == null){
            return null;
        }

        Node leftMir = createMirror(root.left);
        Node rightMir = createMirror(root.right);

        root.left = rightMir;
        root.right = leftMir;
        return root;
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        root = createMirror(root);
        preorder(root);
    }
}
// code for balanced bst
import java.util.*;
public class BST{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node createBst(int arr[] , int st , int end){
        if(st > end){
            return null;
        }
        int mid = (st + end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBst(arr , st , mid-1);
        root.right = createBst(arr , mid+1 , end);

        return root;
    }
    public static void main(String args[]){
       int arr[] = {3 , 5 , 6 , 8 , 10 , 11 , 12};
       Node root = createBst(arr , 0 , arr.length-1);
       preorder(root);
    }
}
// code for convert bst into balance bst
import java.util.*;
public class BST{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void getinorder(Node root , ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getinorder(root.left,inorder);
        inorder.add(root.data);
        getinorder(root.right,inorder);
    }
    public static Node createBst(ArrayList<Integer> inorder, int st , int end){
        if(st > end){
            return null;
        }
        int mid = (st + end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBst(inorder , st , mid-1);
        root.right = createBst(inorder , mid+1 , end);

        return root;
    }
    public static Node balanceBST(Node root){
        ArrayList<Integer> inorder = new ArrayList<>();
        getinorder(root , inorder);

        root = createBst(inorder , 0 , inorder.size()-1);
        return root;
    }
    public static void main(String args[]){
       Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root = balanceBST(root);
        preorder(root);

    }
}
// code for largest bst in a binary tree
import java.util.*;
public class BST{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST , int size , int min , int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
   public static int maxBST = 0;
    public static Info largestBST(Node root){
        if(root == null){
            return new Info(true , 0 , Integer.MAX_VALUE , Integer.MIN_VALUE );
        }
        
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data , Math.min(leftInfo.min , rightInfo.min));
        int max = Math.max(root.data , Math.max(leftInfo.max , rightInfo.max));

        if(root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false , size , min , max);
        }

        if(leftInfo.isBST && rightInfo.isBST){
            maxBST = Math.max(maxBST , size);
            return new Info(true , size , min , max);
        }
        return new Info(false , size , min , max);
    }
    public static void main(String args[]){
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
        Info info = largestBST(root);
        System.out.println("largest bst size = "+maxBST);
    }
}
// code for merge two bst
import java.util.*;
public class BST{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void getinorder(Node root , ArrayList<Integer> arr){
        if(root == null){
            return;
        }

        getinorder(root.left,arr);
        arr.add(root.data);
        getinorder(root.right,arr);
    }
    public static Node createBst(ArrayList<Integer> arr , int st , int end){
        if(st > end){
            return null;
        }
        int mid = (st + end)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBst(arr , st , mid-1);
        root.right = createBst(arr , mid+1 , end);

        return root;
    }
    public static Node mergeBST(Node root1 , Node root2){
        ArrayList<Integer> arr1 = new ArrayList<>();
        getinorder(root1 , arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        getinorder(root2 , arr2);

        int i=0 , j=0;
        ArrayList<Integer> finallist = new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                finallist.add(arr1.get(i));
                i++;
            }else{
                finallist.add(arr2.get(j));
                j++;
            }
        }

        while(i<arr1.size()){
            finallist.add(arr1.get(i));
            i++;
        }

        while(j<arr2.size()){
            finallist.add(arr2.get(j));
            j++;
        }
        return createBst(finallist , 0 , finallist.size()-1);
    }
     public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBST(root1 , root2);
        preorder(root);
    }
}
//code for AVL trees
import java.util.*;
public class Classroom{
    static class Node{
        int data , height;
        Node left , right;

        Node(int data){
            this.data = data;
            height = 1;
        }
    }

    public static Node root;
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return root.height;
    }
    static int max(int a , int b){
        return (a>b) ? a : b;
    }
    public static Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = max(height(root.left) , height(root.right)) + 1;
        y.height = max(height(root.left) , height(root.right)) + 1;

        return y;
    }
    public static Node rightRotate(Node y){
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = max(height(root.left) , height(root.right)) + 1;
        x.height = max(height(root.left) , height(root.right)) + 1;

        return x;
    }
    public static int getBalance(Node root){
        if(root == null){
            return 0;
        }
        return height(root.left) - height(root.right);
    }
    public static Node insert(Node root , int key){
        if(root == null)
            return new Node(key);
        if(key < root.data){
            root.left = insert(root.left , key);
        }else if(key > root.data){
            root.right = insert(root.right , key);
        }else{
            return root;
        }
        root.height = 1 + Math.max(height(root.left) , height(root.right));
        int bf = getBalance(root);

        if(bf > 1 && key < root.left.data){
            return rightRotate(root);
        }
        if(bf < -1 && key > root.right.data){
            return leftRotate(root);
        }
        if(bf > 1 && key > root.left.data){
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if(bf < -1 && key < root.right.data){
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }    

        return root;
    }
    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){
        root = insert(root , 10);
        root = insert(root , 20);
        root = insert(root , 30);
        root = insert(root , 40);
        root = insert(root , 50);
        root = insert(root , 25);

        preorder(root);
    }
}
// new chapter Heaps
// code for priority queues
import java.util.*;
public class Classroom{
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(20);
        pq.add(38);
        pq.add(1);
        pq.add(10);

        while(!pq.isEmpty()){
            System.out.println(pq.peek()+" ");
            pq.remove();
        }
    }
}
// code pq for object
import java.util.*;
public class Classroom{
    static class student implements Comparable<student>{
        String name;
        int rank;

        public student(String name , int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String args[]){
        PriorityQueue<student> pq = new PriorityQueue<>();
        pq.add(new student("A" , 4));
        pq.add(new student("C" , 3));
        pq.add(new student("D" , 23));
        pq.add(new student("B" , 14));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+" -> " + pq.peek().rank);
            pq.remove();
        }
    }
}
// insert in heap , peek from heap & remove from heap
import java.util.*;
public class Classroom{
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){
            arr.add(data);

            int x = arr.size() - 1;
            int par = (x-1)/2;

            while(arr.get(x) < arr.get(par)){
                int temp = arr.get(x);
                arr.set(x , arr.get(par));
                arr.set(par , temp);

                x = par;
                par = (x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left = 2*i + 1;
            int right = 2*i + 2;
            int minindx = i;

            if(left < arr.size() && arr.get(minindx) > arr.get(left)){
                minindx = left;
            }

            if(right < arr.size() && arr.get(minindx) > arr.get(right)){
                minindx = right;
            }
            if(minindx != i){
                int temp = arr.get(i);
                arr.set(i , arr.get(minindx));
                arr.set(minindx , temp);

                heapify(minindx);
            }
        }

        public int remove(){
            int data = arr.get(0);
            int temp = arr.get(0);
            arr.set(0 , arr.get(arr.size()-1));
            arr.set(arr.size()-1 , temp);

            arr.remove(arr.size() - 1);

            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }
    public static void main(String args[]){
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
// heap sort code
import java.util.*;
public class Classroom{
    public static void heapify(int arr[] , int i , int size){
            int left = 2*i + 1;
            int right = 2*i + 2;
            int maxidx = i;

            if(left < size && arr[left] > arr[maxidx]){
                maxidx = left;
            }

            if(right < size && arr[right] > arr[maxidx]){
                maxidx = right;
            }
            if(maxidx != i){
                int temp = arr[i];
                arr[i] = arr[maxidx];
                arr[maxidx] = temp;

                heapify(arr , maxidx , size);
            }
        }
    public static void heapsort(int arr[]){
        int n = arr.length;
        for(int i=n/2; i>=0; i--){
            heapify(arr,i,n);
        }
        for(int i=n-1; i>0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr ,0 , i);
        }
    }
    public static void main(String args[]){
        int arr[] = {1 , 2 , 4 , 5 , 3};
        heapsort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
// code for nearby cars
import java.util.*;
public class Classroom{
    static class point implements Comparable<point>{
        int x;
        int y;
        int dist;
        int idx;

        public point(int x, int y, int dist , int idx){
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.idx = idx;
        }
        @Override
        public int compareTo(point p2){
            return this.dist - p2.dist;
        }
    }
    public static void main(String args[]){
        int pts[][]= {{3,3} , {5 , -1} , {-2,4}};
        int k =2;
        PriorityQueue<point> pq = new PriorityQueue<>();
        for(int i=0; i<pts.length; i++){
            int dist = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new point(pts[i][0] , pts[i][1] , dist , i));
        }
        for(int i=0; i<k; i++){
            System.out.println("C"+pq.remove().idx);
        }
    }
}
// code for connecting rode
import java.util.*;
public class Classroom{
    public static void main(String args[]){
        int ropes[] = {2 , 3 , 3 ,  4 , 6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<ropes.length; i++){
            pq.add(ropes[i]);
     
        }
        int cost = 0;
        while(pq.size() > 1){
            int min = pq.remove();
            int min2 = pq.remove();
            cost += min + min2;
            pq.add(min+min2);
        }
        System.out.println(cost);
    }
}
// code soldires
import java.util.*;
public class Classroom{
    static class row implements Comparable<row> {
        int soldiers;
        int idx;

        public row(int soldiers , int idx){
            this.soldiers = soldiers;
            this.idx = idx;
        }

        @Override
        public int compareTo(row r2){
            if(this.soldiers == r2.soldiers){
                return this.idx - r2.idx;
            }else{
                return this.soldiers - r2.soldiers;
            }
        }
    }
    public static void main(String args[]){
        int army[][]= {{1,0,0,0},
                      {1,1,1,1},
                      {1,0,0,0},
                      {1,0,0,0}};
        int k=2;

        PriorityQueue<row> pq = new PriorityQueue<>();
        for(int i=0; i<army.length; i++){
            int count =0;
            for(int j=0; j<army[0].length; j++){
                count += army[i][j] == 1 ? 1 : 0;
            }
            pq.add(new row(count , i));
        }
        for(int i=0; i<k; i++){
            System.out.println(pq.remove().idx);
        }
    }
}
//window
import java.util.*;
public class Classroom{
    public class pair implements Comparable<pair>{
        int val;
        int idx;

        public pair(int val , int idx){
            this.val = val;
            this.idx = idx;
        }
        @Override
        public int compareTo(pair p2){
            return p2.val - this.val;
        }
    }
    public static void main(String args[]){
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int res[] = new int[arr.length-k+1];

        PriorityQueue<pair> pq = new PriorityQueue<>();
        for(int i=0; i<k; i++){
            pq.add(new pair(arr[i] , i));
        }
        res[0] = pq.peek().val;

        for(int i=k; i<arr.length; i++){
            while(pq.size() > 0 && pq.peek().idx <= (i-k)){
                pq.remove();
            }
            pq.add(new pair(arr[i] , i));
            res[i-k+1] = pq.peek().val;
        }
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
}
// Hashing implementation
import java.util.*;
public class Classroom{
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;

            public Node(K key , V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashfunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }
        private int SearchinLL(K key , int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for(int i=0; i<ll.size(); i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldbuck[] = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;
            for(int i=0; i<buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }
            for(int i=0; i<oldbuck.length; i++){
                LinkedList<Node> ll = oldbuck[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.remove();
                    put(node.key , node.value);
                }
            }
        }
        public void put(K key , V value){
                int bi = hashfunction(key);
                int di = SearchinLL(key , bi);

                if(di != -1){
                    Node node = buckets[bi].get(di);
                    node.value = value;
                }else{
                    buckets[bi].add(new Node(key , value));
                    n++;
                }
                double lamda = (double)n/N;
                if(lamda > 2.0){
                    rehash();
                }
            }
            public boolean containskey(K key){
                int bi = hashfunction(key);
                int di = SearchinLL(key , bi);

                if(di != -1){
                    return true;
                }else{
                    return false;
                }
            }
            public V remove(K key){
                int bi = hashfunction(key);
                int di = SearchinLL(key , bi);

                if(di != -1){
                    Node node = buckets[bi].remove(di);
                    n--;
                    return node.value;
                }else{
                   return null;
                }
            }
            public V get(K key){
                int bi = hashfunction( key);
                int di = SearchinLL(key , bi);

                if(di != -1){
                    Node node = buckets[bi].get(di);
                    return node.value;
                }else{
                    return null;
                }
            }
            public ArrayList<K> keySet(){
                ArrayList<K> keys = new ArrayList<>();
                for(int i=0; i<buckets.length; i++){
                    LinkedList<Node> ll = buckets[i];
                    for(Node node : ll){
                        keys.add(node.key);
                    }
                }
                return keys;
            } 
            public boolean isEmpty(){
                return n == 0;
            }
    }
    public static void main(String args[]){
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("india" , 100);
        hm.put("china" , 150);
        hm.put("us" , 50);
        hm.put("nepal" , 5);

        ArrayList<String> keys = hm.keySet();
        for(String key : keys){
            System.out.println(key);
        }
        System.out.println(hm.get("india"));
    }
}
// majority element
import java.util.*;
public class Classroom{
public static void main(String args[]){
    int arr[] = {1 , 3 ,  2 , 5 , 1 , 1 , 3 , 1 , 5 , 1};
    HashMap<Integer , Integer> map = new HashMap<>();

    for(int i=0; i<arr.length; i++){
       map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);
    }
    for(Integer key :  map.keySet()){
        if(map.get(key)> arr.length/3){
            System.out.println(key);
        }
    }
}
}
// code for check anagram
import java.util.*;
public class Classroom{
    public static boolean anagram(String s , String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character , Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(map.get(ch) != null){
                if(map.get(ch) == 1){
                    map.remove(ch);
                }else{
                    map.put(ch , map.get(ch) - 1);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String args[]){
        String s = "keen";
        String t = "knnee";
        System.out.println(anagram(s , t));
    }
}
// distict count elements
import java.util.*;
public class Classroom{
    public static void main(String args[]){
        int num[] = {2 ,3 , 9 , 3 , 8 , 5 , 2 , 5 , 9};
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<num.length; i++){
            hs.add(num[i]);
        }

        System.out.print(hs.size());
 }
}
// code for union and instersection
import java.util.*;
public class Classroom{
    public static void main(String args[]){
        int arr1[] = {7 , 3 , 9};
        int arr2[] = {6 , 3 , 9 , 2 , 9 , 4};

        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            hs.add(arr2[i]);
        }
        System.out.println(hs.size());
       
        hs.clear();
        int count = 0;
        for(int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            if(hs.contains(arr2[i])){
                count++;
                hs.remove(arr2[i]);
            }
        }
        System.out.println(count);
 }

}
// code for largest subarraay with sum 0
import java.util.*;
public class Classroom{
    public static void main(String args[]){
        int arr[] = {15 , -2 , 2 , -8 , 1 , 7, 10 , 23};
        HashMap<Integer , Integer> map = new HashMap<>();
        int sum = 0;
        int len = 0;

        for(int j=0; j<arr.length; j++){
            sum += arr[j];
            if(map.containsKey(sum)){
                len = Math.max(len , j-map.get(sum));
            }else{
                map.put(sum , j);
            }
        }
        System.out.println(len);
    }
}
// chapter trie
// code for insertion with search
import java.util.*;
public class Classroom{
    static class Node{
        Node children[] = new Node[26];
        boolean eow=false;

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static boolean search(String key){
        Node curr = root;
        for(int level=0; level<key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }
    public static void main(String args[]){
        String word[] = {"the" , "a" , "there" , "their" , "any" , "thee"};
        for(int i=0; i<word.length; i++){
            insert(word[i]);
        }
        System.out.println(search("thee"));
        System.out.println(search("thor"));
    }
}
// code for word break problem
import java.util.*;
public class Classroom{
    static class Node{
        Node children[] = new Node[26];
        boolean eow=false;

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static boolean search(String key){
        Node curr = root;
        for(int level=0; level<key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }
    public static boolean wordbreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i=0; i<=key.length(); i++){
            if(search(key.substring(0,i)) && wordbreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
      String arr[] = {"i" , "like" , "sam" , "samsung" , "mobile" , "ice"};
      for(int i=0; i<arr.length; i++){
        insert(arr[i]);
      }
      String key = "ilikesamsungo";
      System.out.println(wordbreak(key));
    }
}
// start with code
import java.util.*;
public class Classroom{
    static class Node{
        Node children[] = new Node[26];
        boolean eow=false;

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static boolean search(String key){
        Node curr = root;
        for(int level=0; level<key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }
   public static boolean startwith(String prefix){
    Node curr = root;
    for(int i=0; i<prefix.length(); i++){
        int idx = prefix.charAt(i)-'a';
        if(curr.children[idx] == null){
            return false;
        }
        curr = curr.children[idx];
    }
    return true;
   }
    public static void main(String args[]){
      String word[] = {"apple" , "app" , "mango" , "man" , "woman"};
      String prefix1 = "app";
      String prefix2 = "moon";
      for(int i=0; i<word.length; i++){
        insert(word[i]);
      }
      System.out.println(startwith(prefix1));
      System.out.println(startwith(prefix2));
        }
}
// code for count unique substring
import java.util.*;
public class Classroom{
    static class Node{
        Node children[] = new Node[26];
        boolean eow=false;
        int freq;

        public Node(){
            for(int i=0; i<children.length; i++){
                children[i] = null;
            }
            freq = 1;
        }
 }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }else{
                curr.children[idx].freq++;
            }   
            curr = curr.children[idx];
        }
        curr.eow = true; 
    }
    public static boolean search(String key){
        Node curr = root;
        for(int level=0; level<key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }
    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i=0; i<26; i++){
            if(root.children[i] != null){
                count += countNode(root.children[i]);
            }
        }
        return count+1;
    }
    public static void main(String args[]){
     String str = "ababa";
     for(int i=0; i<str.length(); i++){
        String suffix = str.substring(i);
        insert(suffix);
     }
     System.out.println(countNode(root));
        }
}
// new chapter Graphs
// code for creating a graph
import java.util.*;
public class Classroom{
     static class edge{
            int source;
            int destination;
            int wieght;

            public edge(int s , int d , int w){
                this.source = s;
                this.destination = d;
                this.wieght = w;
            }
        }
    public static void main(String args[]){
       int v = 5;
       ArrayList<edge>[] graph = new ArrayList[v];
       for(int i=0; i<v; i++){
        graph[i] = new ArrayList<>();
       }

       graph[0].add(new edge(0,1,5));

       graph[1].add(new edge(1,0,5));
       graph[1].add(new edge(1,2,1));
       graph[1].add(new edge(1,3,3));

       graph[2].add(new edge(2,1,1));
       graph[2].add(new edge(2,3,1));
       graph[2].add(new edge(2,4,2));

       graph[3].add(new edge(3,1,3));
       graph[3].add(new edge(3,2,1));

       graph[4].add(new edge(4,2,2));

       for(int i=0; i<graph[2].size(); i++){
        edge e = graph[2].get(i);
        System.out.println(e.destination);
       }
    }
}
// code for bfs or dfs and haspath
import java.util.*;
public class Classroom{
     static class edge{
            int source;
            int destination;
            int wieght;

            public edge(int s , int d , int w){
                this.source = s;
                this.destination = d;
                this.wieght = w;
            }
        }
       static void creategraph(ArrayList<edge> graph[]){
       for(int i=0; i<graph.length; i++){
        graph[i] = new ArrayList<>();
       }

       graph[0].add(new edge(0,1,1));
       graph[0].add(new edge(0,2,1));

       graph[1].add(new edge(1,0,1));
       graph[1].add(new edge(1,3,1));

       graph[2].add(new edge(2,0,1));
       graph[2].add(new edge(2,4,1));

       graph[3].add(new edge(3,1,1));
       graph[3].add(new edge(3,4,1));
       graph[3].add(new edge(3,5,1));

       graph[4].add(new edge(4,2,1));
       graph[4].add(new edge(4,3,1));
       graph[4].add(new edge(4,5,1));

       graph[5].add(new edge(5,3,1));
       graph[5].add(new edge(5,4,1));
       graph[5].add(new edge(5,6,1));
       graph[5].add(new edge(6,5,1));
    }
    public static void bfs(ArrayList<edge> graph[]){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr] = true;
                for(int i=0; i<graph[curr].size(); i++){
                    edge e = graph[curr].get(i);
                    q.add(e.destin
                    ation);
                }
            }
        }
    }
    public static void dfs(ArrayList<edge>[] graph , int curr , boolean vis[]){
        System.out.print(curr+" ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            edge e = graph[curr].get(i);
            if(!vis[e.destination]){
                dfs(graph , e.destination , vis);
            }
        }
    }
    public static boolean haspath(ArrayList<edge> [] graph , int source , int destination , boolean vis[]){
        if(source == destination){
            return true;
        }
        vis[source] = true;
        for(int i=0; i<graph[source].size(); i++){
            edge e = graph[source].get(i);
            if(!vis[e.destination] && haspath(graph , e.destination , destination , vis)){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int v = 7;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph);
        System.out.print(haspath(graph , 0 , 5 , new boolean[v]));
    }
}
// detect cycle code
import java.util.*;
public class Classroom{
     static class edge{
            int source;
            int destination;
           

            public edge(int s , int d ){
                this.source = s;
                this.destination = d;
                
            }
        }
       static void creategraph(ArrayList<edge> graph[]){
       for(int i=0; i<graph.length; i++){
        graph[i] = new ArrayList<>();
       }

       graph[0].add(new edge(0,1));
       //graph[0].add(new edge(0,2));
       graph[0].add(new edge(0,3));

       graph[1].add(new edge(1,0));
       graph[1].add(new edge(1,2));

       //graph[2].add(new edge(2,0));
       graph[2].add(new edge(2,1));

       graph[3].add(new edge(3,0));
       graph[3].add(new edge(3,4));
       
       graph[4].add(new edge(4,3));

    }
   
    public static boolean detectcycle(ArrayList<edge> [] graph){
         boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(detectcycleutil(graph,vis,i,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectcycleutil(ArrayList<edge> [] graph , boolean vis[] , int curr , int par){
        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            edge e = graph[curr].get(i);
            if(!vis[e.destination] ){
                if(detectcycleutil(graph , vis , e.destination , curr)){
                return true;
                }
            }else if(vis[e.destination] && e.destination != par){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int v = 5;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph);
        System.out.print(detectcycle(graph));
       
    }
}
// code for detct cyle in(directed graph)
import java.util.*;
public class Classroom{
     static class edge{
            int source;
            int destination;
           

            public edge(int s , int d ){
                this.source = s;
                this.destination = d;
                
            }
        }
       static void creategraph(ArrayList<edge> graph[]){
       for(int i=0; i<graph.length; i++){
        graph[i] = new ArrayList<>();
       }
       graph[0].add(new edge(0,2));
      
       graph[1].add(new edge(1,0));

       graph[2].add(new edge(2,3));
    
       graph[3].add(new edge(3,0));

    }
    public static boolean isCycle(ArrayList<edge> [] graph){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(isCycleutil(graph , i , vis , stack)){
                return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycleutil(ArrayList<edge> [] graph, int curr, boolean vis[] , boolean stack[] ){
        vis[curr] = true;
        stack[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            edge e = graph[curr].get(i);
            if(stack[e.destination]){
                return true;
            }
            else if(!vis[e.destination] && isCycleutil(graph , e.destination , vis , stack)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }
    public static void main(String args[]){
        int v = 4;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph);
        System.out.print(isCycle(graph));
       
    }
}
// code for bipartide
import java.util.*;
public class Classroom{
     static class edge{
            int source;
            int destination;
           

            public edge(int s , int d ){
                this.source = s;
                this.destination = d;
                
            }
        }
       static void creategraph(ArrayList<edge> graph[]){
       for(int i=0; i<graph.length; i++){
        graph[i] = new ArrayList<>();
       }

       graph[0].add(new edge(0,1));
       graph[0].add(new edge(0,2));

       graph[1].add(new edge(1,0));
       graph[1].add(new edge(1,3));

       graph[2].add(new edge(2,0));
       graph[2].add(new edge(2,4));

       graph[3].add(new edge(3,1));
      // graph[3].add(new edge(3,4));
       
       graph[4].add(new edge(4,2));
       //graph[4].add(new edge(4,3));

    }
    public static boolean isBipartite(ArrayList<edge> [] graph){
        int col[] = new int[graph.length];
        for(int i=0; i<col.length; i++){
            col[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<graph.length; i++){
            if(col[i] == -1){
                q.add(i);
                col[i] = 0;
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j=0; j<graph[curr].size(); j++){
                        edge e = graph[curr].get(j);
                        if(col[e.destination] == -1){
                            int nextcol = col[curr] == 0 ? 1 : 0;
                            col[e.destination] = nextcol;
                            q.add(e.destination);
                        }else if(col[e.destination] == col[curr]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        int v = 5;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph);
        System.out.print(isBipartite(graph));
       
    }
}
// topological sorting
import java.util.*;
public class Classroom{
     static class edge{
            int source;
            int destination;
           

            public edge(int s , int d ){
                this.source = s;
                this.destination = d;
                
            }
        }
        
       static void creategraph(ArrayList<edge> graph[]){
       for(int i=0; i<graph.length; i++){
        graph[i] = new ArrayList<>();
       }
       graph[2].add(new edge(2,3));
      
       graph[3].add(new edge(3,1));

       graph[4].add(new edge(4,0));
       graph[4].add(new edge(4,1));

       graph[5].add(new edge(5,0));
       graph[5].add(new edge(5,2));
    }
    public static void tops(ArrayList<edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                topsutil(graph , i , vis , s);
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    public static void topsutil(ArrayList<edge>[] graph ,int curr , boolean vis[] , Stack<Integer> s ){
        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            edge e = graph[curr].get(i);
            if(!vis[e.destination]){
                topsutil(graph , e.destination , vis , s);
            }
        }
        s.push(curr);
    }
    public static void main(String args[]){
        int v = 6;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph);
        tops(graph);
       
    }
}
// top sort by bfs
import java.util.*;
public class Classroom{
     static class edge{
            int source;
            int destination;
           

            public edge(int s , int d ){
                this.source = s;
                this.destination = d;
                
            }
        }
       static void creategraph(ArrayList<edge> graph[]){
       for(int i=0; i<graph.length; i++){
        graph[i] = new ArrayList<>();
       }
       graph[2].add(new edge(2,3));
      
       graph[3].add(new edge(3,1));

       graph[4].add(new edge(4,0));
       graph[4].add(new edge(4,1));

       graph[5].add(new edge(5,0));
       graph[5].add(new edge(5,2));
    }
    public static void calIndeg(ArrayList<edge> graph [] , int indeg[]){
        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[i].size(); j++){
                edge e = graph[i].get(j);
                indeg[e.destination]++;
            }
        }
    }
    public static void topsort(ArrayList<edge> [] graph){
        int indeg[] = new int[graph.length];
        calIndeg(graph,indeg);
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<indeg.length; i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr+" ");


            for(int i=0; i<graph[curr].size(); i++){
                edge e = graph[curr].get(i);
                indeg[e.destination]--;
                if(indeg[e.destination]==0){
                    q.add(e.destination);
                }
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        int v = 6;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph);
        topsort(graph);
       
    }
}
// print path code
import java.util.*;
public class Classroom{
     static class edge{
            int source;
            int destination;
            int wieght;
           

            public edge(int s , int d , int w){
                this.source = s;
                this.destination = d;
                this.weight = w;
                
            }
        }
       static void creategraph(ArrayList<edge> graph[]){
       for(int i=0; i<graph.length; i++){
        graph[i] = new ArrayList<>();
       }
       graph[0].add(new edge(0,3));
       graph[2].add(new edge(2,3));
      
       graph[3].add(new edge(3,1));

       graph[4].add(new edge(4,0));
       graph[4].add(new edge(4,1));

       graph[5].add(new edge(5,0));
       graph[5].add(new edge(5,2));
    }
    public static void printpath(ArrayList<edge> graph[] , int src , int dest , String path){
        if(src == dest){
            System.out.println(path+dest);
            return;
        }

        for(int i=0; i<graph[src].size(); i++){
            edge e = graph[src].get(i);
            printpath(graph , e.destination , dest , path+src);
        }
    }
    public static void main(String args[]){
        int v = 6;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph);
        int src = 5 , dest = 1;
        printpath(graph , src , dest , " ");
       
    }
}
// Dijkstras code 
import java.util.*;
public class Classroom{
     static class edge{
            int src;
            int dest;
            int wt;
           

            public edge(int s , int d , int w){
                this.src = s;
                this.dest = d;
                this.wt = w;
                
            }
        }
       static void creategraph(ArrayList<edge> graph[]){
       for(int i=0; i<graph.length; i++){
        graph[i] = new ArrayList<>();
       }
       graph[0].add(new edge(0,1,2));
       graph[0].add(new edge(0,2,4));

       graph[1].add(new edge(1,3,7));
       graph[1].add(new edge(1,2,1));

       graph[2].add(new edge(2,4,3));

       graph[3].add(new edge(3,5,1));

       graph[4].add(new edge(4,3,2));
       graph[4].add(new edge(4,5,5));
    }
    static class Pair implements Comparable<Pair>{
        int n;
        int path;

        public Pair(int n , int path){
            this.n = n;
            this.path = path;
        }
        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;
        }
    }
    public static void dijkstra(ArrayList<edge> graph [],int src){
        int dist[] = new int[graph.length];
        for(int i=0; i<graph.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src ,0));
        
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.n]){
                vis[curr.n] = true;
                for(int i=0; i<graph[curr.n].size(); i++){
                    edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if(dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v , dist[v]));
                    }
                }
            }

        }
        for(int i=0; i<dist.length; i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int v = 6;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph);
        int src = 0;
        dijkstra(graph,src);

    }
}
// code for bellmanford
import java.util.*;
public class Classroom{
     static class edge{
            int src;
            int dest;
            int wt;
           

            public edge(int s , int d , int w){
                this.src = s;
                this.dest = d;
                this.wt = w;
                
            }
        }
       static void creategraph(ArrayList<edge> graph[]){
       for(int i=0; i<graph.length; i++){
        graph[i] = new ArrayList<>();
       }
       graph[0].add(new edge(0,1,2));
       graph[0].add(new edge(0,2,4));

       graph[1].add(new edge(1,2,-4));

       graph[2].add(new edge(2,3,2));

       graph[3].add(new edge(3,4,4));

       graph[4].add(new edge(4,1,-1));

    }
    public static void bellmanford(ArrayList<edge> graph[] , int src){
        int dist[] = new int[graph.length];
        for(int i=0; i<dist.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        int V = graph.length;
        for(int i=0; i<V-1; i++){
            for(int j=0; j<graph.length; j++){
                for(int k=0; k<graph[j].size(); k++){
                    edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }
        for(int i=0; i<dist.length; i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int V = 5;
        ArrayList<edge> graph[] = new ArrayList[V];
        creategraph(graph);
        bellmanford(graph , 0);
    }
}
// code for MST by prims algorithm
import java.util.*;
public class Classroom{
     static class edge{
            int src;
            int dest;
            int wt;
           

            public edge(int s , int d , int w){
                this.src = s;
                this.dest = d;
                this.wt = w;
                
            }
        }
       static void creategraph(ArrayList<edge> graph[]){
       for(int i=0; i<graph.length; i++){
        graph[i] = new ArrayList<>();
       }
       graph[0].add(new edge(0,1,10));
       graph[0].add(new edge(0,2,15));
       graph[0].add(new edge(0,3,30));


       graph[1].add(new edge(1,0,10));
       graph[1].add(new edge(1,3,40));

       graph[2].add(new edge(2,0,15));
       graph[2].add(new edge(2,3,50));

       graph[3].add(new edge(3,1,40));
       graph[3].add(new edge(3,2,50));
    }
    static class Pair implements Comparable<Pair>{
        int v;
        int cost;

        public Pair(int v , int c){
            this.v = v;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }
    public static void prims(ArrayList<edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0,0));
        int finalcost = 0;

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.v]){
                vis[curr.v] = true;
                finalcost += curr.cost;

                for(int i=0; i<graph[curr.v].size(); i++){
                    edge e = graph[curr.v].get(i);
                    pq.add(new Pair(e.dest , e.wt));
                }
            }
        }
        System.out.println("min cost = "+ finalcost);
    }
    public static void main(String args[]){
        int V = 5;
        ArrayList<edge> graph[] = new ArrayList[V];
        creategraph(graph);
        prims(graph);
       
    }
}
// cheapest flight code 
import java.util.*;
public class Classroom{
     static class edge{
            int src;
            int dest;
            int wt;
           

            public edge(int s , int d , int wt){
                this.src = s;
                this.dest = d;
                this.wt = wt;
                
            }
        }
       static void creategraph(int flights[][] , ArrayList<edge> graph[]){
       for(int i=0; i<graph.length; i++){
        graph[i] = new ArrayList<>();
       }
       for(int i=0; i<flights.length; i++){
        int src = flights[i][0];
        int dest = flights[i][1];
        int wt = flights[i][2];

        edge e = new edge(src , dest , wt);
        graph[src].add(e);
       }
    }
    static class info{
        int v;
        int cost;
        int stops;

        public info(int v , int c , int s){
            this.v = v;
            this.cost = c;
            this.stops = s;
        }
    }
    public static int cheapflight(int n , int flights[][] , int src , int dest , int k){
        ArrayList<edge> graph[] = new ArrayList[n];
        creategraph(flights , graph);

        int dist[] = new int[n];
        for(int i=0; i<n; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        Queue<info> q = new LinkedList<>();
        q.add(new info(src , 0 , 0));

        while(!q.isEmpty()){
            info curr = q.remove();
            if(curr.stops > k){
                break;
            }
            for(int i=0; i<graph[curr.v].size(); i++){
                edge e = graph[curr.v].get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                if(curr.cost + wt< dist[v] && curr.stops <= k){
                    dist[v] = curr.cost + wt;
                    q.add(new info(v , dist[v] , curr.stops+1));
                }
            }
        }
        if(dist[dest] == Integer.MAX_VALUE){
            return -1;
        }else{
            return dist[dest];
        }
    }
    public static void main(String args[]){
        int n = 4;
        int flights[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src = 0, dst = 3, k = 1;
       System.out.print(cheapflight(4 , flights , 0 , 3 , 1));
       
    }
}
// code connect cities
import java.util.*;
public class Classroom{
    static class Edge implements Comparable<Edge>{
        int dest;
        int cost;

        public Edge(int d , int c){
            this.dest = d;
            this.cost = c;
        }
        @Override
        public int compareTo(Edge e2){
            return this.cost - e2.cost;
        }
    }
        public static int connectCities(int cities[][]){
            PriorityQueue<Edge> pq = new PriorityQueue<>();
            boolean vis[] = new boolean[cities.length];

            pq.add(new Edge(0 , 0));
            int finalcost = 0;

            while(!pq.isEmpty()){
                Edge curr = pq.remove();
                if(!vis[curr.dest]){
                    vis[curr.dest] = true;
                    finalcost += curr.cost;

                    for(int i=0; i<cities[curr.dest].length; i++){
                        if(cities[curr.dest][i] != 0){
                            pq.add(new Edge(i , cities[curr.dest][i]));
                        }
                    }
                }
            }
            return finalcost;
        }
        public static void main(String args[]){
            int cities[][] = {{0,1,2,3,4},
                              {1,0,5,0,7},
                              {2,5,0,6,0},
                              {3,0,6,0,0},
                              {4,7,0,0,0}};
                              System.out.print(connectCities(cities));
        }
    
}
// union find code
import java.util.*;
public class Classroom{
    static int n=7;
    static int par[] = new int [n];
    static int rank[] = new int[n];
    public static void init(){
        for(int i=0; i<n; i++){
            par[i] = i;
        }
    }
    public static int find(int x){
        if(x == par[x]){
            return x;
        }
        return find(par[x]);
    }
    public static void union(int a , int b){
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }else if(rank[parA] < rank[parB]){
            par[parA] = parB;
        }else{
            par[parB] = parA;
        }
    }
        public static void main(String args[]){
         init();
         System.out.println(find(3));
         union(1,3);
         System.out.println(find(3));
         union(2,4);
         union(3,6);
         union(1,4);
         System.out.println(find(3));
         System.out.println(find(4));
         union(1,5);
        }
    
}
// code for kruskalMST
import java.util.*;
public class Classroom{
     static class edge implements Comparable<edge>{
            int src;
            int dest;
            int wt;
           

            public edge(int s , int d , int w){
                this.src = s;
                this.dest = d;
                this.wt = w;
                
            }
            @Override
            public int compareTo(edge e2){
                return this.wt - e2.wt;
            }
        }
       static void creategraph(ArrayList<edge> edges){
      
       edges.add(new edge(0,1,10));
       edges.add(new edge(0,2,15));
       edges.add(new edge(0,3,30));
       edges.add(new edge(1,3,40));
       edges.add(new edge(2,3,50));

    }
     static int n=4;
    static int par[] = new int [n];
    static int rank[] = new int[n];
    public static void init(){
        for(int i=0; i<n; i++){
            par[i] = i;
        }
    }
    public static int find(int x){
        if(x == par[x]){
            return x;
        }
        return par[x] = find(par[x]);
    }
    public static void union(int a , int b){
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }else if(rank[parA] < rank[parB]){
            par[parA] = parB;
        }else{
            par[parB] = parA;
        }
    }
    public static void kruskalsMST(ArrayList<edge> edges , int V){
        init();
        Collections.sort(edges);
        int mstcode = 0;
        int count = 0;

        for(int i=0; count<V-1; i++){
            edge e = edges.get(i);

            int parA = find(e.src);
            int parB = find(e.dest);
            if(parA != parB){
                union(e.src , e.dest);
                mstcode += e.wt;
                count++;
            }
        }
        System.out.println(mstcode);
    }
    public static void main(String args[]){
        int V = 4;
        ArrayList<edge> edges = new ArrayList<>();
        creategraph(edges);
        kruskalsMST(edges , V);
    }
}
// code for kosarajus algorithm
import java.util.*;
public class Classroom{
     static class edge{
            int src;
            int dest;

            public edge(int s , int d){
                this.src = s;
                this.dest = d;
            }
        }
       static void creategraph(ArrayList<edge> graph[]){
       for(int i=0; i<graph.length; i++){
        graph[i] = new ArrayList<>();
       }
       graph[0].add(new edge(0,2));
       graph[0].add(new edge(0,3));

       graph[1].add(new edge(1,0));
       graph[2].add(new edge(2,1));

       graph[3].add(new edge(3,4));
    }
    public static void topsort(ArrayList<edge> graph[] , int curr , boolean vis[] , Stack<Integer> s){
        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topsort(graph , e.dest , vis , s);
            }
        }
        s.push(curr);
    } 
    public static void dfs(ArrayList<edge> graph[] , int curr , boolean vis[]){
        vis[curr] = true;
        System.out.print(curr+" ");
        for(int i=0; i<graph[curr].size(); i++){
            edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph , e.dest , vis);
            }
        }
    }
    public static void kosaraju(ArrayList<edge> graph[] , int v){
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[v];
        for(int i=0; i<v; i++){
            if(!vis[i]){
                topsort(graph , i , vis , s);
            }
        }
        ArrayList<edge> transpose[] = new ArrayList[v];
        for(int i=0; i<graph.length; i++){
            vis[i] = false;
        transpose[i] = new ArrayList<edge>();
        }
        for(int i=0; i<v; i++){
            for(int j=0; j<graph[i].size(); j++){
                edge e = graph[i].get(j);
                transpose[e.dest].add(new edge(e.dest , e.src));
            }
        }
        while(!s.isEmpty()){
            int curr = s.pop();
            if(!vis[curr]){
                System.out.print("SCC -> ");
                dfs(transpose , curr , vis);
                System.out.println();
            }
        }

    }
    public static void main(String args[]){
        int v = 5;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph);
        kosaraju(graph , v);
    }
}
// code for tarjanss algorithm for bridge finding
import java.util.*;
public class Classroom{
     static class edge{
            int src;
            int dest;

            public edge(int s , int d){
                this.src = s;
                this.dest = d;
            }
        }
       static void creategraph(ArrayList<edge> graph[]){
       for(int i=0; i<graph.length; i++){
        graph[i] = new ArrayList<>();
       }
       graph[0].add(new edge(0,1));
       graph[0].add(new edge(0,2));
       graph[0].add(new edge(0,3));

       graph[1].add(new edge(1,0));
       graph[1].add(new edge(1,2));

       graph[2].add(new edge(2,0));
       graph[2].add(new edge(2,1));

       graph[3].add(new edge(3,0));
       graph[3].add(new edge(3,4));
       graph[3].add(new edge(3,5));

       graph[4].add(new edge(4,3));
       graph[4].add(new edge(4,5));

       graph[5].add(new edge(5,3));
       graph[5].add(new edge(5,4));
    }
    
    public static void dfs(ArrayList<edge> graph[] , int curr , int par , int dt[] , int low[] , boolean vis[] , int time){
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        for(int i=0; i<graph[curr].size(); i++){
            edge e = graph[curr].get(i);
            int neigh = e.dest;
            if(neigh == par){
                continue;
            }else if(!vis[neigh]){
                dfs(graph , neigh , curr , dt , low , vis , time);
                low[curr] = Math.min(low[curr] , low[neigh]);
                if(dt[curr] < low[neigh]){
                    System.out.println("bridge : " + curr + " ----- " + neigh);
                }
            }else{
                low[curr] = Math.min(low[curr] , dt[neigh]);
            }
        }
    }
   public static void tarjanbridge(ArrayList<edge> graph[] , int v){
    int dt[] = new int[v];
    int low[] = new int[v];
    int time = 0;
    boolean vis[] = new boolean[v];

    for(int i=0; i<v; i++){
        if(!vis[i]){
            dfs(graph , i , -1 , dt , low , vis , time);
        }
    }
   }
    public static void main(String args[]){
        int v = 6;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph);
        tarjanbridge(graph , v);
    }
}
// code for articulation point
import java.util.*;
public class Classroom{
     static class edge{
            int src;
            int dest;

            public edge(int s , int d){
                this.src = s;
                this.dest = d;
            }
        }
       static void creategraph(ArrayList<edge> graph[]){
       for(int i=0; i<graph.length; i++){
        graph[i] = new ArrayList<>();
       }
       graph[0].add(new edge(0,1));
       graph[0].add(new edge(0,2));
       graph[0].add(new edge(0,3));

       graph[1].add(new edge(1,0));
       graph[1].add(new edge(1,2));

       graph[2].add(new edge(2,0));
       graph[2].add(new edge(2,1));

       graph[3].add(new edge(3,0));
       graph[3].add(new edge(3,4));
     
       graph[4].add(new edge(4,3));
    }
    
    public static void dfs(ArrayList<edge> graph[] , int curr , int par , int dt[] , int low[] , boolean vis[] , int time , boolean ap[]){
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;
        for(int i=0; i<graph[curr].size(); i++){
            edge e = graph[curr].get(i);
            int neigh = e.dest;
            if(neigh == par){
                continue;
            }else if(vis[neigh]){
                low[curr] = Math.min(low[curr] , dt[neigh]);
            }else{
                dfs(graph , neigh , curr , dt , low ,  vis , time , ap);
                low[curr] = Math.min(low[curr] , low[neigh]);
                if(par != -1 && dt[curr] <= low[neigh]){
                    ap[curr] = true;
                }
                children++;
            }
        }
        if(par == -1 && children > 1){
           ap[curr] = true;
        }
    }
   public static void getAP(ArrayList<edge> graph[] , int v){
    int dt[] = new int[v];
    int low[] = new int[v];
    int time = 0;
    boolean vis[] = new boolean[v];
    boolean ap[] = new boolean[v];

    for(int i=0; i<v; i++){
        if(!vis[i]){
            dfs(graph , i , -1 , dt , low , vis , time , ap);
        }
    }
    
    for(int i=0; i<v; i++){
        if(ap[i]){
           System.out.print("ap "+i);
        }
    }
   }
   
    public static void main(String args[]){
        int v = 6;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph);
        getAP(graph , v);
    }
}
///\dynamic programming
// code for fibbonaci by DP
import java.util.*;
public class Classroom{
public static int fib(int n , int f[]){
    if(n == 0 || n == 1){
        return n;
    }
    if(f[n] != 0){
        return f[n];
    }
    f[n] = fib(n-1 , f) + fib(n-2 , f);
    return f[n];
}
public static void main(String args[]){
    int n = 5;
    int f[] = new int[n+1];
    System.out.print(fib(n,f));
}
}
// with tabulation
import java.util.*;
public class Classroom{
public static int fib(int n , int f[]){
    if(n == 0 || n == 1){
        return n;
    }
    if(f[n] != 0){
        return f[n];
    }
    f[n] = fib(n-1 , f) + fib(n-2 , f);
    return f[n];
}
public static int tabulation(int n){
    int dp[] = new int[n+1];
    dp[0] = 0;
    dp[1] = 1;
    for(int i=2; i<=n; i++){
        dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[n];
}
public static void main(String args[]){
    int n = 5;
    int f[] = new int[n+1];
    System.out.print(tabulation(n));
}
}
// code for climbinng stairs (recursion method)
import java.util.*;
public class Classroom{
public static int countways(int n){
    if(n == 0){
        return 1;
    }
    if(n < 0){
        return 0;
    }
   return countways(n-1) + countways(n-2);
}

public static void main(String args[]){
    int n = 5;
   System.out.print(countways(n));
}
}
// code for same climbing stair in memoization with variation
import java.util.*;
public class Classroom{
public static int countways(int n , int f[]){
    if(n == 0){
        return 1;
    }
    if(n<0){
        return 0;
    }
     if(f[n] != -1){
        return f[n];
    }
    f[n] = countways(n-1 , f) + countways(n-2 , f) + countways(n-3 , f);
    return f[n];
}

public static void main(String args[]){
    int n = 5;
    int f[] = new int[n+1];
    Arrays.fill(f , -1);
    System.out.print(countways(n , f));
}
}
// climbing stairs with tabulation
import java.util.*;
public class Classroom{
public static int countways(int n , int f[]){
    if(n == 0){
        return 1;
    }
    if(n<0){
        return 0;
    }
     if(f[n] != -1){
        return f[n];
    }
    f[n] = countways(n-1 , f) + countways(n-2 , f) + countways(n-3 , f);
    return f[n];
}
public static int tabulation(int n){
    int dp[] = new int[n+1];
    dp[0] = 1;
    for(int i=1; i<=n; i++){
        if(i == 1){
            dp[i] = dp[i-1] + 0;
        }else{
            dp[i] = dp[i-1] + dp[i-2];
        }
    }
    return dp[n];
}
public static void main(String args[]){
    int n = 5;
    int f[] = new int[n+1];
    Arrays.fill(f , -1);
    System.out.print(tabulation(n));
}
}
// code 0-1 knapsack
public class Classroom{
    public static int knapsack(int val[] , int wt[] , int w , int n){
        if(w == 0 || n == 0){
            return 0;
        }
        if(wt[n-1] <=  w){
            int ans1 = val[n-1] + knapsack(val , wt , w-wt[n-1] , n-1);

            int ans2 = knapsack(val , wt , w , n-1);
            return Math.max(ans1 , ans2);
    }else{
        return knapsack(val , wt , w , n-1);
    }
    }
    public static void main(String args[]){
        int val[] = {15 , 14 , 10 , 45 , 30};
        int wt[] = {2 , 5 , 1 , 3 , 4};
        int w = 7;
        System.out.println(knapsack(val , wt , w , val.length));
    }
}
// knapsack(memoization code) or (tabulation)
public class Classroom{
    public static int knapsack(int val[] , int wt[] , int w , int n, int dp[][]){
        if(w == 0 || n == 0){
            return 0;
        }
        if(dp[n][w] != -1){
            return dp[n][w];
        }
        if(wt[n-1] <=  w){
            int ans1 = val[n-1] + knapsack(val , wt , w-wt[n-1] , n-1,dp);

            int ans2 = knapsack(val , wt , w , n-1 , dp);
            dp[n][w] =  Math.max(ans1 , ans2);
            return dp[n][w];
    }else{
        dp[n][w] = knapsack(val , wt , w , n-1 , dp);
        return dp[n][w];
    }
    }
    public static void print(int dp[][]){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int tabulation(int val[] , int wt[] , int W){
        int n = val.length;
        int dp[][] = new int [n+1][W+1];
        for(int i=0; i<dp.length; i++){
            dp[i][0] = 0;
        }
        for(int j=0; j<dp[0].length; j++){
            dp[0][j] = 0;
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<W+1; j++){
                int v = val[i-1];
                int w = wt[i-1];
                if(w <= j){
                    int incprofit = v + dp[i-1][j-w];
                    int excprofit =  dp[i-1][j];
                    dp[i][j] = Math.max(incprofit , excprofit);
            }else{
                int excprofit =  dp[i-1][j];
                dp[i][j] =  excprofit;
            }
        }
    }
    print(dp);
    return dp[n][W];
    }
    public static void main(String args[]){
        int val[] = {15 , 14 , 10 , 45 , 30};
        int wt[] = {2 , 5 , 1 , 3 , 4};
        int W= 7;
        int dp[][] = new int[val.length+1][W+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(tabulation(val , wt , W ));
    }
}