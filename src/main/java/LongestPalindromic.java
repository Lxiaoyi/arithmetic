/**
 * Created by 小易 on 2017/8/16.
 * 获取字符中最长的回文串
 */
public class LongestPalindromic {
    /**
     * 算法思想：遍历字符串，获取每一个字符串是否回文，最后取最长的
     * Time O(n^2) Space O(n^2)
     * @param s
     * @return
     */
    public String longestPalindrome1(String s) {
        if(s==null || s.length()<=1)
            return s;

        int len = s.length();
        int maxLen = 1;
        boolean [][] dp = new boolean[len][len];

        String longest = null;
        for(int l=0; l<s.length(); l++){
            for(int i=0; i<len-l; i++){
                int j = i+l;
                //如果该字符串i位置和i+l位置的值相等且他们之间各自相邻的值也相等（即i+1位置和j-1位置的值相等）则确定i和j之间的字符串为回文串
                //这期间像aba、aa、a这样的也是回文也要算在内（j-i<=2）
                if(s.charAt(i)==s.charAt(j) && (j-i<=2||dp[i+1][j-1])){
                    dp[i][j]=true;

                    if(j-i+1>maxLen){
                        maxLen = j-i+1;
                        longest = s.substring(i, j+1);
                    }
                }
            }
        }

        return longest;
    }

    /**
     * Time O(n^2) Space O(1)
     * @param s
     * @return
     */
    public String longestPalindrome2(String s) {
        if (s.isEmpty()) {
            return null;
        }
        if (s.length() == 1) {
            return s;
        }
        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            // 以i为中心获取回文串
            String tmp = helper(s, i, i);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
            // 以i、i+1为中心获取回文串（中间有两个相同的情况）
            tmp = helper(s, i, i + 1);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
        }
        return longest;
    }

    //获取字符串的某一串是否回文，返回回文串
    public String helper(String s, int begin, int end) {
        while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
        return s.substring(begin + 1, end);
    }
}
