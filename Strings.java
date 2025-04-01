import java.util.*;
public class Strings{
   public static void main(String args[]){
    String sentence = "or lodu bhai kya hal";
    int vowelcount = 0;
    for(int i=0; i<sentence.length(); i++){
        char ch = sentence.charAt(i);
        if(ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u'){
            vowelcount++;
        }
    }
    System.out.print(vowelcount);
   }
}