package Arrays.Easy;

import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {

    public static void main(String[] args) {


        // Test case 1.
        List<Integer> array = Arrays.asList(5,1,22,25,6,-1,8,10);
        List<Integer> sequence = Arrays.asList(1,6,-1,10);


        boolean result = isValidSubsequence(array, sequence);

        // second way using a for loop
        boolean result2 = isValidSubsequence2(array, sequence);

        System.out.println(result);

        System.out.println(result2);

    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        // initializing pointers
        int arrIdx = 0;
        int seqIdx = 0;

        while (arrIdx < array.size() && seqIdx < sequence.size()){
            if(sequence.get(seqIdx) == array.get(arrIdx)){

                System.out.println("Found " + sequence.get(seqIdx) + " at index " + arrIdx);
                seqIdx++;

            }
            arrIdx++;

            if(seqIdx == sequence.size()){
                return true;
            }

        }

        return false;
    }

    public static boolean isValidSubsequence2(List<Integer> array, List<Integer> sequence) {

        //pointer for currently checked element of the sequence
        int seqIdx = 0;

        for(int i =0; i<array.size(); i++){

            // condition to prevent going out of bounds
            if(seqIdx == sequence.size()){
                return true;
            }
            // if the element is found move the pointer to another location
            if(sequence.get(seqIdx) == array.get(i)){
                System.out.println("Found " + sequence.get(seqIdx) + " at index " + i);
                seqIdx++;
            }
        }

        // check if condition is true -> after leaving a loop is the pointer at the last spot
        return seqIdx == sequence.size();
    }
}
