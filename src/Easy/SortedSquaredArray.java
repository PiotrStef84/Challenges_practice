package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedSquaredArray {
    public static void main(String[] args) {


        // Test case 1
        int [] array = {1, 2, 3, 5, 6, 8, 9};

        // Test case 2
        //int [] array = {-2, -1};

        int [] result = SortedSquared2(array);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(result));
    }

    // O(nlogn) time - > using a sorting algorithm, O(n) space -> creating a brand-new array
    public static int [] SortedSquared(int [] array){


        int number;
        int [] squared = new int[array.length];

        for(int i = 0; i< array.length; i++){
            number = array[i] * array[i];
            squared[i] = number;

        }

        // sorting takes time, it runs in O(nlog *n) time
        Arrays.sort(squared);


        return squared;
    }


    // O(n) time -> no added sorting, single pass, O(n) space -> creating a brand-new array
    public static int [] SortedSquared2(int [] array){

        int [] squared = new int[array.length];

        int smallIdx = 0;
        int largeIdx = array.length - 1;


        // important reverse array
        for(int i = array.length -1; i >= 0; i--){
            int smallValue = array[smallIdx];
            int largeValue = array[largeIdx];


            if(Math.abs(smallValue) > Math.abs(largeValue)){
                squared[i] = smallValue * smallValue;
                smallIdx += 1;
            }else {

                squared[i] = largeValue * largeValue;
                largeIdx -= 1;

            }
        }

        return squared;

    }
}
