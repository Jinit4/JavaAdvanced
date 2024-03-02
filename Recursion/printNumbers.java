package Recursion;

//Q. Print numbers from 5 to 1
//We are creating a recursive function named printNum which will be recursively calling itself
public class printNumbers {
    public static void printNum(int x) {
        if (x == 0) {
            return;
        }
        System.out.println(x);
        printNum(x - 1);
    }

    // In the recursive function there is always a base case/ Termination case, and
    // the function itself
    // In this case the base case is the x == 0 statement from where the fuction
    // will return to main function
    // The printNum (x-1) is calling itself recusrsively.
    public static void main(String args[]) {
        int x = 5;
        printNum(x);
    }
}

// Lets say if we want to print numbers from 1 to 5

/*
 * We will make following changes above
 * if(x >5){
 * 
 * }
 * printNum(x + 1)
 * public static void main(String args[]){
 * 
 * int x = 1
 * }
 * 
 */