package Strings.Easy;

public class CaesarCipherEncryptor {

    /* Given a non-empty string of lowercase letters and a non-negative integer representive a key, write a function that
    * returns a new string obtained by shifting every letter in the input string by k positions in the alphabet, where k is
    * the key.
    * Note that letters should "warp" around the alphabet; in other words, the letter z shifted by one returns the
    * letter a */

    public static void main(String[] args) {


//        String result = caesarCypherEncryptor("xyz", 2);
//        System.out.println(result.equals("zab"));

        //String result = caesarCypherEncryptor("abc", 2);
        //System.out.println(result);
        //System.out.println(result.equals("cde"));

        String result = caesarCypherEncryptorUnicode("xyz", 2);
        System.out.println(result.equals("zab"));

        System.out.println(result);


    }

    // O(n) time | o(n) space
    private static String caesarCypherEncryptor(String str, int key) {

        char [] codedString = new char[str.length()];
        int newKey = key % 26;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";


        for(int i = 0 ; i<str.length(); i++){

            char letter = str.charAt(i);
            int index = alphabet.indexOf(letter);

            codedString[i] = alphabet.charAt((index + newKey) % 26);

        }

        return new String(codedString);
    }

    private static String caesarCypherEncryptorUnicode(String str, int key){
        char [] codedString = new char[str.length()];
        int newKey = key % 26;

        for(int i = 0 ; i<str.length(); i++){

            char letter = str.charAt(i);
            int index = letter + newKey;
            if(index > 122){
                codedString[i] = (char) (96 + (index % 122));
            } else
                codedString[i] = (char) index;

        }

        return new String(codedString);
    }
}
