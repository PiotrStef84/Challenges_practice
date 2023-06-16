package Arrays.Medium;

public class MonotonicArray {
    /* Write a function that takes in an array of integers and returns a boolean representing whether
    * the array is monotonic.
    * An array is said to be monotonic if its elements, from left to right, are entirely non-increasing
    * or entirely non-decreasing.
    * Non-increasing elements aren't necessarily exclusively decreasing: They simply don't increase.
    * Similarly, non-decreasing elements aren't necessarily exclusively increasing: They simply
    * don't decrease.
    *
    * Note that empty arrays and arrays of one element are monotonic. */


    public static void main(String[] args) {

        int [] array = {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};

        boolean result = isMonotonic(array);
        System.out.println(result);

    }
    // O(n) time | O(1) space - where n is the length of the array
    private static boolean isMonotonic(int[] array) {

        boolean isMono = true;
        boolean notDecreasing = true;
        boolean notIncreasing = true;


        for(int i=0; i<array.length - 1; i++){
            if(array[i] > array[i+1]){
                notIncreasing = false;
            }
            if(array[i] < array[i+1]){
                notDecreasing = false;
            }
            if(!notDecreasing && !notIncreasing){
                return false;
            }
        }
        return isMono;
    }
}
