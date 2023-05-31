package Arrays.Medium;

import java.util.Arrays;

public class SmallestDifference {

    /* Write a function that takes in two non-empty arrays of integers, finds the pair of numbers )one from each array)
    * whose absolute difference is closest to zero, and returns an array containing these two numbers, with the
    * number from the first array in the first position.
    *
    * Note that the absolute difference of -5 and 5 is 10, and the absolute difference of -5 and -4 is 1.
    *
    * You can assume that there will only be one pair of numbers with the smallest difference.*/

    public static void main(String[] args) {

        int [] arrayOne = {-1, 5, 10, 20, 28, 3, 170};
        int [] arrayTwo = {26, 134, 135, 15, 17, 21};

        int[] result = smallestDifference(arrayOne, arrayTwo);
        System.out.println(Arrays.toString(result));
    }

    private static int [] smallestDifference(int[] arrayOne, int[] arrayTwo) {

        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int firstPointer = 0;
        int secondPointer = 0;

        int smallest = Integer.MAX_VALUE;
        int current = Integer.MAX_VALUE;
        int [] smallestPair = new int[2];

        while(firstPointer < arrayOne.length && secondPointer < arrayTwo.length){
            int firstNum = arrayOne[firstPointer];
            int secondNum = arrayTwo[secondPointer];

            if(firstNum == secondNum){
                return new int [] {firstNum, secondNum};
            } else if (firstNum < secondNum) {
                current = secondNum - firstNum;
                firstPointer++;

            }else if (secondNum < firstNum){
                current = firstNum - secondNum;
                secondPointer++;
            }

            if(current < smallest){
                smallest = current;
                smallestPair = new int[] {firstNum, secondNum};
            }
        }

        return smallestPair;
    }
}
