package RecursionAdvanced;

public class Permutations {
    public static void printpermutations(String str, String Permutations) {
        if (str.length() == 0) {
            System.out.println(Permutations);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // We saw what the current char is Lets say the current char is a
            // now we want to print b and c lets say
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printpermutations(newStr, Permutations + currentChar);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        printpermutations(str, "");
    } 
}
