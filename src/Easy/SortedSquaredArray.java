package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedSquaredArray {
    public static void main(String[] args) {


        // Test case 1
        //int [] array = {1, 2, 3, 5, 6, 8, 9};

        // Test case 2
        int [] array = {-2, -1};

        int [] result = SortedSquared(array);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(result));
    }

    public static int [] SortedSquared(int [] array){


        int number;
        int [] squared = new int[array.length];

        for(int i = 0; i< array.length; i++){
            number = array[i] * array[i];
            squared[i] = number;

        }

        Arrays.sort(squared);


        return squared;
    }
}
