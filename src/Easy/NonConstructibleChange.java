package Easy;

import java.util.Arrays;

public class NonConstructibleChange {
    public static void main(String[] args) {

//        Non-Constructible Change
//
//        Given an array of positive integers representing the values of coins in your possession,
//        write a function that returns the minimum amount of change (the minimum sum of money) that you cannot create.
//        The given coins can have any positive integer value and aren't necessarily unique
//        (i.e., you can have multiple coins of the same value).
//        For example, if you’re given coins = [1, 2, 5], the minimum amount of change that you can’t create is 4.
//        If you’re given no coins, the minimum amount of change that you can’t create is 1.



        // Test case 1
        //int [] array = {1, 2, 3, 5, 6, 8, 9};

        // Test case 2
        int [] array = {5, 7, 1, 1, 2, 3, 22};

        int change = Change(array);
        System.out.println(change);
    }

    // O(nlogn) time - > using a sorting algorithm, O(1) space - not creating a new array ... O(n) if you need to create
    // a new array
    public static int Change(int[] coins) {

        Arrays.sort(coins);
        int currentChangeCreated = 0;

        for(int coin : coins){
            if(coin > currentChangeCreated +1){
                return currentChangeCreated + 1;
            }
            currentChangeCreated += coin;
        }
        return currentChangeCreated + 1;

    }
}

