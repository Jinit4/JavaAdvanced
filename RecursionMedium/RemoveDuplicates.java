package RecursionMedium;

public class RemoveDuplicates{
    public static boolean map [] = new boolean[26]; //We are creating an array of type Boolean to store 26 characters
    public static void duplicates (String str,int idx, String NewString){
        //Base case
        if (idx == str.length()){
            System.out.println(NewString);
            return; 
        }
        char currentChar = str.charAt(idx);
        if (map[currentChar - 'a'] == true){
            //This means we have already mapped that character and it should not be added again
            duplicates(str, idx+1, NewString);
        } else {
            NewString += currentChar;
            map[currentChar - 'a'] = true;
            duplicates(str, idx+1, NewString);
        }
    }
    public static void main (String args[]){
        String str = "abbcdaacdx";
        duplicates(str, 0, " ");
    }
} 