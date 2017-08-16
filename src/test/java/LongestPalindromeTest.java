/**
 * Created by 28076 on 2017/8/16.
 */
public class LongestPalindromeTest {
    public static void main(String[] args) {
        LongestPalindromic lpd = new LongestPalindromic();
        String s = "abcbabcbcb";
        System.out.println(lpd.longestPalindrome1(s));
        System.out.println(lpd.longestPalindrome2(s));
    }
}
