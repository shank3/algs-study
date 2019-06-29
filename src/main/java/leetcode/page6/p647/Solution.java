package leetcode.page6.p647;

/**
 * 647.回文子串
 */
public class Solution {
    private int sum = 0;
    public int countSubstrings(String s) {
        sum = 0;
        for (int i = 0; i < s.length(); i++) {
            count(s, i, i);
            count(s, i, i + 1);
        }
        return sum;
    }

    private void count(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            sum++;
            start--;
            end++;
        }
    }
}
