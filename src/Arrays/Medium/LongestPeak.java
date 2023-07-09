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
            if(!isPeak){
                i += 1;
                continue;
            }

            int leftIdx = i - 2;
            while(leftIdx >= 0 && array[leftIdx] < array[leftIdx + 1]){
                leftIdx -= 1;
            }

            int rightIdx = i + 2;
            while(rightIdx >= 0 && array[rightIdx] < array[rightIdx + 1]){
                rightIdx += 1;
            }

            int currentPeakLength = rightIdx - leftIdx -1;
            if(currentPeakLength > longestPeakLength){
                longestPeakLength = currentPeakLength;
            }
            i = rightIdx;


        }
        return longestPeakLength;
    }

    private static int longestPeak2(int[] array) {
        int count = 0;
        int maxPeak = 0;
        boolean peak = false;

        for(int i = 1; i<array.length; i++){
            if(array[i-1] < array[i] && !peak){
                count = (count == 0) ? 2 : count + 1;
            } else if (count > 0 && array[i - 1] > array[i]) {
                count = (count == 0) ? 2 : count + 1;
                maxPeak = Math.max(maxPeak, count);
                peak = true;
            }
        }


        return -1;
    }
}
