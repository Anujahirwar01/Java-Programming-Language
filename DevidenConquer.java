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