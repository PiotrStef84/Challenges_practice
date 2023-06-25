package Famous_Algorithms;

public class KadaneAlgorithm {

    public static void main(String[] args) {
        /* Write a function that takes in a non-empty array of integers and returns the maximum
        * sum that can be obtained by summing up all of the integers in a non-empty sub-array of
        * the input array. A sub-array must only contain adjacent numbers (numbers next to each
        * other in the input array).
        *
        * Sample input
        * array = [3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4]
        *
        * Sample output
        * 19 // [1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1]*/

        int [] array = {3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4};

        int result = kadanesAlgorithm(array);

        System.out.println(result);
    }

    private static int kadanesAlgorithm(int[] array) {

        return -1;
    }
}
