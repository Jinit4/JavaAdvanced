package Recursion;

import java.util.Scanner;

public class fibonacci {
    
    public static void fibo(int a, int b, int n){ // we get n = 3
        if (n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        fibo(b, c, n-1); //here we will make it n-1 so that n is eventually going towards 0
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt(); //Lets say we enter n = 5
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        fibo(a, b, n-2); //We send n = n-2 which is n = 3 to the fibo function
        sc.close();

    }
}
