package Recursion;

import java.util.Scanner;

public class factorial {
    public static int fact(int x) {
        if (x == 1) {
            return 1;
        }
        x = x * fact(x - 1);
        return x;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(fact(x));
        sc.close();
    }
}
