//Time complexity  O(n^2) 
package Sorting;

public class selection {
    public static void printArr(int arr[]) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String args[]) {
        // initialising an array
        int arr[] = { 8, 7, 3, 2, 1 };

        // Initialising for loop to run from 0 to arr.length-1
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i; // Assuming the index value of i as the smallest value
            for (int j = i + 1; j < arr.length; j++) {
                // if the value at j index is greater than value at smallest we store the index
                // value of j as smallest
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            // Swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        // While the j loop is finished execution once the smallest value is reset to
        // the i th index and then again the comparisions are made
        printArr(arr);
    }
}