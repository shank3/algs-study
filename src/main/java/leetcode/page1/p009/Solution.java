package leetcode.page1.p009;

public class Solution {
    /**
     * 是否回文数
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int m = x;
        int rev = 0;
        while (m != 0) {
            int p = m % 10;
            m = m / 10;
            rev = rev * 10 + p;
        }
        return x == rev;
    }
}
