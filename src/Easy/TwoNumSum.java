package Easy;

import java.util.Arrays;

public class TwoNumSum {
    public static void main(String[] args) {

        //        "array": [3, 5, -4, 8, 11, 1, -1, 6],
        //        "targetSum": 10

        int[] testArray = {3,5,-4,8,11,1,-1,6};
        int targetSum = 10;
        int [] result = twoNumberSum(testArray, targetSum);

        System.out.println(Arrays.toString(result));
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
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
}
