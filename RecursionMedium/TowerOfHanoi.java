package RecursionMedium;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void toh (int n, String Source, String Helper, String Destination){
        if (n == 1){
            System.out.println("Move disk" + n + "from " + Source +" to " + Destination);
            return;
        }
        //n is more than 1
        toh(n-1, Source, Destination, Helper);
        System.out.println("Move disk" + n + "from " + Source +"to" + Destination);
        toh(n-1, Helper, Source, Destination);
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toh(n, "S", "H", "D");
        sc.close();
    }


    



























    // public static void toh(int n, String src, String helper, String dest) {
    //     // base case
    //     if (n == 1) {
    //         System.out.println("Tranfer disk" + n + " from " + src + " to " + dest);
    //         return;
    //     }
    //     // more than 1 disk
    //     toh(n - 1, src, dest, helper);
    //     // First step is to tranfer n-1 discs from source to helper where helper tower
    //     // will become destination and vice-versa
    //     System.out.println("Tranfer disk" + n + " from " + src + " to " + dest);
    //     // This is one step to transfer 1 disc from source to destination
    //     toh(n - 1, helper, src, dest);
    //     // This will be the last step to transfer all the remaining n-1 disc from helper
    //     // as a source and vice-versa to destination
    // }

    // public static void main(String args[]) {
    //     int n = 5; // Number of discs
    //     toh(n, "S", "H", "D");
    // }
}
