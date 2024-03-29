package RecursionAdvanced;

public class InviteN {
    public static int guest(int n ){
        if (n <=1){
            return 1;
        }
        //Single
        int ways1 = guest(n-1);

        //pair
        int ways2 = (n-1) * guest(n-2);

        return ways1 + ways2;
    }
    public static void main (String args[]){
        int n = 4;
        System.out.println(guest(n));
    }
}
