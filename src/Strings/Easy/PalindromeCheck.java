package Strings.Easy;

public class PalindromeCheck {
    public static void main(String[] args) {

        System.out.println(isPalindrome("abcdcba"));
        System.out.println(isPalindrome("abcdefghihgfeddcba"));
        System.out.println(isPalindrome("zzaaoaazz"));
    }

    // Solution using pointers
    // O(n) time | O(1) space  --> just iterating once through the String [array of chars], no new data structure created
    public static boolean isPalindrome(String str) {
        int leftIdx = 0;
        int rightIdx = str.length() - 1;

        while(leftIdx < rightIdx){
            if(str.charAt(leftIdx) != str.charAt(rightIdx)){
                return false;
            }
            leftIdx++;
            rightIdx--;
        }
        return true;
    }
}
