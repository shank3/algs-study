package leetcode.page0.p028;

/**
 * 28.实现strStr()
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        int len = haystack.length();
        int n = needle.length();
        if (len < n) {
            return -1;
        } else if (n == 0) {
            return 0;
        }
        for (int i = 0; i < len - n + 1; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
