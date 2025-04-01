public class Classroom{
    public static String Permutations(String str, String ans) {
    if (str.length() == 0) {
        return ans + "\n";
    }
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
        char curr = str.charAt(i);
        String newString = str.substring(0, i) + str.substring(i + 1);
        result.append(Permutations(newString, ans + curr));
    }
    return result.toString();
}
    public static void main(String args[]){
        
        Permutations(str , "");

    }
}