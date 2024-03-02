//stack height = n
package Recursion;

import java.util.Scanner;

public class xpowerofn {
    public static int power(int x, int n){
        //Base case
        if ( x == 0){
            return 0;
        }
        if ( n == 0){
            return 1;
        }
        //Recursion
        int i = power(x, n-1); 
        int k = x * i;
        return k;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the x: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int ans = power(x, n);
        System.out.println(ans);
        sc.close();

    }
    
}
