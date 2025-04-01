import java.util.*;
public class Practice{
    public static boolean isSubstring(String s, String t){
        if(s.length() > t.length()){
            return false;
        }
        if(s.length() == 0){
            return true;
        }
        int i=0,j=0;
        while(i<s.length()&& j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
                if(i == s.length()) return true;
            }
        }
            

        return i == s.length();
    }
    []
    
public static void main(String args[]){
    String s = "abc";
    String t = "ahbgdc";
    System.out.print(isSubstring(s , t));
}
}