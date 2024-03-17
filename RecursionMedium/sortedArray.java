//Sorted Array Strictly Increasing
package RecursionMedium;

public class sortedArray {
    /*
     * Here we will use Boolean return type
     * If it is Increasing we willreturn True
     * If it is not we will return False
     */
    public static Boolean sorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }

        // if (arr[idx] < arr[idx + 1]) {
        //     // Array is sorted till now
        //     return sorted(arr, idx + 1);
        //     /*
        //      * Here why are we using return is because we have checked it at the current
        //      * level
        //      * but going forward is it sorted or unsorted that will only be known by the
        //      * calls ahead
        //      * So mioving forward whatever the calls return we are going to return it here
        //      */
        // } else {
        //     return false;
        // }
            //This would be an optimized approach
        if (arr[idx] >= arr[idx+1]){
            //Array is unsorted
            return false;
        } 
        else {
            return sorted(arr, idx+1);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(sorted(arr, 0));
    }
}
