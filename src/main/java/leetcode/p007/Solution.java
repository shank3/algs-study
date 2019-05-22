package leetcode.p007;

public class Solution {
    /**
     * 有符号整数按字符反转
     * @param x
     * @return
     */
    public int reverse(int x) {
        if (x == 0) {
            return x;
        }
        String s = x + "";
        boolean negative = x < 0;
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        boolean skip = true;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '0' && skip) {
                continue;
            }
            skip = false;
            if (chars[i] == '-' || chars[i] == '+') {
                continue;
            }
            sb.append(chars[i]);
        }
        String reverse = (negative ? "-" : "") + sb.toString();
        long l = Long.parseLong(reverse);
        if (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) l;
    }
}
