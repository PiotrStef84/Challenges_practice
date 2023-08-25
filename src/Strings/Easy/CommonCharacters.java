package Strings.Easy;

import java.util.*;

public class CommonCharacters {
    public static void main(String[] args) {

     /* Write a function that takes in a non-empty list of non-empty strings and returns a list of characters that are
     * common to all strings in the list, ignoring multiplicity.
     *
     * Note that the strings are not guaranteed to only contain alphanumeric characters. The list you return
     * can be in any order.*/

      String[] input = new String[] {"abc", "bcd", "cbad"};
      String[] expected = new String[] {"b", "c"};

      String[] result = commonCharactersA(input);

      System.out.println(Arrays.toString(result));

    // -------------------- SECOND METHOD --------------------------------

      String[] input2 = new String[] {"abxc", "bxdcd", "cxbad", "loboa"};

      String[] result2 = commonCharactersB(input2);

      System.out.println(Arrays.toString(result2));
    }

    // O(n * m) time | O(c) space - where n is the number of strings, m is the
    // length of the longest string, and c is the number of unique characters across
    // all strings
    private static String[] commonCharactersA(String[] strings) {
        HashMap<Character, Integer> characterCounts = new HashMap<Character, Integer>();

        for(String string : strings) {
            HashSet<Character> uniqueCharacters = new HashSet<Character>();
            for (int i = 0; i < string.length(); i++) {
                if (!uniqueCharacters.contains(string.charAt(i))) {
                    uniqueCharacters.add(string.charAt(i));
                }
            }
                for (char character : uniqueCharacters) {
                    if (!characterCounts.containsKey(character)) {
                        characterCounts.put(character, 0);
                    }
                    characterCounts.put(character, characterCounts.get(character) + 1);
                }
            }

            // checking how many times each character appear in characterCounts i.e. what are common
            // characters
            ArrayList<Character> finalCharacters = new ArrayList<Character>();
            for(Map.Entry<Character, Integer> characterCount : characterCounts.entrySet()){
                Character character = characterCount.getKey();
                Integer count = characterCount.getValue();
                if(count == strings.length){
                    finalCharacters.add(character);
                }
            }

            // Transforming ArrayList of characters into an array of strings
            String[] finalCharactersArr = new String[finalCharacters.size()];
            int count = 0;
            for(Character cha : finalCharacters){
                finalCharactersArr[count] = cha.toString();
                count++;
            }
        return finalCharactersArr;
        }

    // Second - bit more optimal solution -> taking the shortest string and comparing it to others, as the maximum number of
    // common characters is the length of the shortest string in the array
    // O(n * m) time | O(m) space - where n is the number of strings, and m is the
    // length of the longest string
    private static String[] commonCharactersB(String[] strings) {

        // Function that will compare the length of each string and return the smallest
        String smallestString = getSmallestString(strings);

        HashSet<Character> potentialCommonCharacters = new HashSet<Character>();
        for (int i = 0; i<smallestString.length(); i++){
            potentialCommonCharacters.add(smallestString.charAt(i));
        }

        for(String string : strings){
            removeNonexistentCharacters(string, potentialCommonCharacters);
        }

        String[] output = new String[potentialCommonCharacters.size()];
        int i = 0;
        for(Character character : potentialCommonCharacters){
            output[i] = character.toString();
            i++;
        }
        return output;
    }



    private static String getSmallestString(String[] strings) {
        String smallestString = strings[0];
        for(String string : strings){
            if(smallestString.length() > string.length()){
                smallestString = string;
            }
        }
        return smallestString;
    }

    private static void removeNonexistentCharacters(String string, HashSet<Character> potentialCommonCharacters) {
        HashSet<Character> uniqueStringCharacters = new HashSet<Character>();
        for(int i = 0; i< string.length(); i++){
            uniqueStringCharacters.add(string.charAt(i));
        }

        HashSet<Character> charactersToRemove = new HashSet<Character>();
        for(char character : potentialCommonCharacters){
            if(!uniqueStringCharacters.contains(character)){
                charactersToRemove.add(character);
            }
        }
        for(char character : charactersToRemove){
            potentialCommonCharacters.remove(character);
        }
    }
}

