package Arrays.Medium;

public class LongestPeak {
    public static void main(String[] args) {

        /* Write a function that takes in an array and returns the length of the longest peak in the array.
        *
        * A peak is defined as adjacent integers in the array that are strictly increasing until they reach a tip
        * (the highest value in the peak), at which point they become strictly decreasing. At least three integers are
        * required to form a peak.
        *
        * For example, the integers 1, 4, 10, 2 form a peak, but integers 4, 0, 10 don;t and neither do the integers
        * 1, 2, 2, 0. Similarly, the integers 1, 2, 3 don't form a peak because there aren't any strictly decreasing
        * integers after the 3.  */

        int [] input = {1,2,3,3,4,0,10,6,5,-1,-3,2,3};
        int expected = 6;

        int result = longestPeak(input);

        System.out.println("Expected number: " + expected);
        System.out.println("Number received: " + result);

    }

    private static int longestPeak(int[] array) {
        int longestPeakLength = 0;
        int i = 1;
        while(i < array.length - 1){
            boolean isPeak = array[i-1] < array[i] && array[i] > array[i +1];
        }
        return -1;
    }
}
