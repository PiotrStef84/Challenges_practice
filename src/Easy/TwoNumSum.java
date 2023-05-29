package Easy;

import java.util.Arrays;

public class TwoNumSum {
    public static void main(String[] args) {


    /* Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum. if
    any two numbers in the input array sum up to the target sum, the function should return them in an array, in any
    order.

    If no two numbers sum to the target sum, the function should return an empty array */


        //        "array": [3, 5, -4, 8, 11, 1, -1, 6],
        //        "targetSum": 10

        int[] testArray = {3,5,-4,8,11,1,-1,6};
        int targetSum = 10;
        int [] result = twoNumberSum(testArray, targetSum);

        int [] result2 = twoNumberSumPointers(testArray, targetSum);

        //System.out.println(Arrays.toString(result));

        System.out.println(Arrays.toString(result));
    }


    //  Brute force solution
    // O(n^2) time -> looping twice through the array | O(1) space
    public static int[] twoNumberSum(int[] array, int targetSum) {

        int[] target = new int[2];
        for (int i = 0; i < array.length; i++){
            for(int j =0; j < array.length; j++){
                if(array[j] + array[i] == targetSum && j != i){
                    target[0] = array[i];
                    target[1] = array[j];
                    return target;
                }
            }
        }
        return new int[0];
    }
    // Second solution - > using pointers instead of two loops, better time complexity.
    // O(nlog(n)) time | O(1) space
    public static int[] twoNumberSumPointers(int[] array, int targetSum){

        Arrays.sort(array);

        int left = 0;
        int right = array.length - 1;

        // if left reaches right, the pointers met and the array is traversed
        while(left < right){
            if(array[left] + array[right] == targetSum){
                return new int[] {array[left], array[right]};
            } else if (array[left] + array[right] < targetSum){
                left += 1;
            } else if (array[left] + array[right] > targetSum) {
                right -=  1;
            }
        }
        return new int[0];
    }
}
