//Time complexity  O(n^2)
package Sorting;

public class bubble {
    public static void printArr(int arr[]) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String args[]) {
        int arr[] = { 8, 7, 3, 2, 1 };
        for (int i = 0; i < arr.length - 1; i++) {
            // This loop will run in the entire array as we initialise by 0 in Java
            // arr.length-1 so that we do not encounter index out of bounds error
            for (int j = 0; j < arr.length - i - 1; j++) {
                // This loop will run from 0 to arr.length - i -1 because we dont want to
                // compare the elements in the end which are already sorted
                // Here important is we usually compare i and j but in this case we will compare
                // j and j +1
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                /*
                 * if (arr[j] < arr[i]) {
                 * //Swap
                 * int temp = arr[i];
                 * arr[i] = arr[j];
                 * arr[j] = temp;
                 * }
                 */
            }
        }
        printArr(arr);
    }
}
