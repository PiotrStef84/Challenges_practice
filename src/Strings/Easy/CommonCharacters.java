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

    }

