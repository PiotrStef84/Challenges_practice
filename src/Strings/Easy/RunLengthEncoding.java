package Strings.Easy;

public class RunLengthEncoding {

    /* Write a function that takes in a non-empty string and returns its run-length encoding */

    public static void main(String[] args) {

        String input = "AAAAAAAAAAAAABBCCCCDD";
        String expected = "9A4A2B4C2D";
        String actual = runLengthEncoding(input);

        System.out.println(actual);
        System.out.println(actual.equals(expected));

    }

    private static String runLengthEncoding(String input) {

        StringBuilder sb = new StringBuilder();
        char currentCharracter = input.charAt(0);
        int length = 0;

        for(char c : input.toCharArray()){
            if(c != currentCharracter || length == 9){
                sb.append(length);
                sb.append(currentCharracter);

                currentCharracter = c;
                length = 0;
            }

            length++;
        }

        sb.append(length);
        sb.append(currentCharracter);

        return sb.toString();
    }
}
