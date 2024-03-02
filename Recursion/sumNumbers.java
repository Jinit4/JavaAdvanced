package Recursion;

import java.util.Scanner;

public class sumNumbers {
    public static void sumNum(int i, int x, int sum) {
        if (i == x) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        sumNum(i + 1, x, sum);

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a value : ");
        int x = sc.nextInt();
        sumNum(1, x, 0);
        sc.close();
    }
}