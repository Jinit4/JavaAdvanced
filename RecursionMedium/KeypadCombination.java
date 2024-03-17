package RecursionMedium;

public class KeypadCombination {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
    // We have created an array of String type where we are mapping the keypad

    public static void printComb(String str, int idx, String Combination) {
        if (idx == str.length()){
            System.out.println(Combination);
            return;
        }
        char currentChar = str.charAt(idx);
        String mapping = keypad[currentChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, idx+1, Combination+mapping.charAt(i));
        }

    }

    public static void main(String args[]) {
        String str = "23";
        printComb(str, 0, "");
    }
}
