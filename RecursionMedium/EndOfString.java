package RecursionMedium;

public class EndOfString {
    public static void movetoend(String str, int idx, int countNoOfX, String NewString) {
        if (idx == str.length()) {
            for (int i = 0; i < countNoOfX; i++) {
                NewString += 'x';
            }
            System.out.println(NewString);
            return;
        }
        char currentChar = str.charAt(idx);
        if (currentChar == 'x') {
            countNoOfX = countNoOfX + 1;
            movetoend(str, idx + 1, countNoOfX, NewString);
        } else {
            NewString += currentChar; // NewString = NewString + currentChar
            movetoend(str, idx + 1, countNoOfX, NewString);
        }

    }

    public static void main(String args[]) {
        String str = "axbcxxdxx";
        movetoend(str, 0, 0, "");
    }
}
