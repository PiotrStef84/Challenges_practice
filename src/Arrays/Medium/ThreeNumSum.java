package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumSum {


    /* Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum. The
    function should find all triplets in the array that sum up to the target sum and return a two-dimensional array of
    all these triplets. The numbers in each triplet should be ordered in ascending order, and the triplets themselves
    should be ordered in ascending order with respect to the numbers they hold.

    If no three numbers sum to the target sum, the function should return an empty array */

    public static void main(String[] args) {

        List<Integer[]> output = threeNumberSum(new int[] {12, 3, 1, 2, -6, 5, -8, 6}, 0);

        for(Integer [] array : output){
            System.out.println(Arrays.toString(array));
        }
    }
    // Time O(n^2) -> one for loop iteration, but pointers need to iterate for every number
    // Space 0(n) -> we are storing triplets of numbers, but it's possible to be storing every number in array
    private static List<Integer[]> threeNumberSum(int[] array, int targetSum) {

        Arrays.sort(array);

        ArrayList<Integer[]> triplets = new ArrayList<Integer[]>();

        for(int i =0; i<array.length; i++){

            // important to initialize the pointer from index higher than i
            int left = i + 1;
            int right = array.length - 1;

            while (left < right){
                int currentSum = array[i] + array[left] + array[right];
                if(currentSum == targetSum){
                    triplets.add(new Integer[] {array[i], array[left], array[right]});
                    left++;
                    right--;
                } else if (currentSum < targetSum) {
                    left++;
                }else {
                    right--;
                }
            }
        }
        return triplets;

    }
}
