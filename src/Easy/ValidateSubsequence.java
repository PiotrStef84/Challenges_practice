package Easy;

import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {

    public static void main(String[] args) {


        // Test case 1.
        List<Integer> array = Arrays.asList(5,1,22,25,6,-1,8,10);
        List<Integer> sequence = Arrays.asList(1,6,-1,10);


        boolean result = isValidSubsequence(array, sequence);

        System.out.println(result);

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
}
