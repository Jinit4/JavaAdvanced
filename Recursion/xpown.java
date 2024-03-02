//Stack height = logn
package Recursion;

import java.util.Scanner;

public class xpown {
    public static int pow(int x, int n) {
        // Base case
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        // if n is even
        if (n % 2 == 0) {
            return pow(x, n / 2) * pow(x, n / 2);
        } else {
            return pow(x, n / 2) * pow(x, n / 2) * x;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter value of X: ");
        int x = sc.nextInt();
        System.out.println("Please enter value of n");
        int n = sc.nextInt();
        pow(x, n);
        System.out.println(pow(x, n));
        sc.close();
    }
}