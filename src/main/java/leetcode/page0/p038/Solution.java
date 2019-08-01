package leetcode.page0.p038;

/**
 * 38.报数
 * @date 2019/8/1
 */
public class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            char pre = s.charAt(0);
            for (int j = 1; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == pre) {
                    count++;
                } else {
                    sb.append(count).append(pre);
                    pre = c;
                    count = 1;
                }
            }
            sb.append(count).append(pre);
            s = sb.toString();
        }
        return s;
    }
}
