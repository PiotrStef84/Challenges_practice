package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveElementToEnd {
    public static void main(String[] args) {

        /* You're given an array of integers and an integer. Write a function tha moves all instances
        * in the array tot the end of the array and returns the array.
        *
        * The function should perform this in place (i.e., it should mutate the input array) and
        * doesn't need to main order of the other integers
        *
        * Sample input:
        * array = [ 2,1,2,2,2,3,4,2]
        * toMove = 2
        *
        * Sample output:
        * [1,3,4,2,2,2,2,2] */



        List<Integer> array = new ArrayList<Integer>(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2));
        int toMove = 2;

        List<Integer> result = MoveElement(array, toMove);

        System.out.println(result);
    }
    // O(n) time -> as indexes are visited only once
    // O(1) space -> we are not using any auxiliary data structure, everything is done "in house"
    private static List<Integer> MoveElement(List<Integer> array, int toMove) {
        int left = 0;
        int right = array.toArray().length - 1;

        while(left<right){
            if(array.get(right) == toMove){
                right--;
            } else if (array.get(right) != toMove) {
                if(array.get(left) == toMove){
                    array.set(left, array.get(right));
                    array.set(right, toMove);
                } else {
                    left++;
                }
            }
        }
            return array;
        //return new ArrayList<Integer>();
    }
}
