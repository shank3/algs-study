package leetcode.page1.p007;

public class Solution {

    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            //Integer.MAX_VALUE=2147483647   Integer.MIN_VALUE=-2147483648
            if (rev > Integer.MAX_VALUE / 10 || rev == Integer.MAX_VALUE / 10 && pop >= 7) {
                return 0;
            } else if (rev < Integer.MIN_VALUE / 10 ||rev == Integer.MIN_VALUE / 10 && pop < -8) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }

    /**
     * 有符号整数按字符反转
     * @param x
     * @return
     */
    public int reverse2(int x) {
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
