//IMPORTANT QUESTION
/*
 * Subsequence is when a original string is used to create new strings 
 * the condition is that the new string formed  should have the characters in the same order 
 * As they were in the original String
 * time complexity 2^n log n
 */
//"abc"
package RecursionMedium;

public class PrintSubsequence {
    public static void subsequence (String str, int idx, String NewString){
        if (idx == str.length()){
            System.out.println(NewString);
            return;
        }
        char currentChar = str.charAt(idx);
        //to be printed
        subsequence(str, idx+1, NewString+currentChar);
        //not to be printed
        subsequence(str, idx+1, NewString);
    }
    public static void main(String args[]){
        String str  = "abc";
        subsequence(str, 0 ," ");
    }
}
