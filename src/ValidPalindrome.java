/**
 * Created by AKI on 2017-10-30.
 */

//Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.
public class ValidPalindrome {
    public static void main(String[] args) {

        System.out.println(validPalindrome("abc"));

    }

    public static boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j && s.charAt(i) == s.charAt(j)) {
            i++; j--;
        }

        if (i >= j) return true;

        if (isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1)) return true;
        return false;
    }

    public static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++; j--;
            }
            else return false;
        }
        return true;
    }




}
