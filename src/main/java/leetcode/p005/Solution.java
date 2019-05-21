package leetcode.p005;

public class Solution {

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int begin = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int odd = expandCenter(s, i, i);
            int even = expandCenter(s, i, i + 1);
            int max = Math.max(odd, even);
            if (max > end- begin) {
                begin = i - (max - 1) / 2;
                end = i + max / 2;
            }
        }
        return s.substring(begin, end + 1);
    }

    private int expandCenter(String s, int left, int right) {
        int a = left, b = right;
        while (a >= 0 && b < s.length() && s.charAt(a) == s.charAt(b)) {
            a--;
            b++;
        }
        return b - a - 1;
    }


}
