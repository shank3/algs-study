package leetcode.page3.p394;

/**
 * 394.字符串解码
 */
public class Solution {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        int left = 0,right = 0,index = 0;
        int repeat = 1;
        while (left < s.length() && right < s.length()) {
            //FIXME 字符串编码 未完成
            while (s.charAt(left) != '[') {
                left++;
            }
            right = left + 1;
            while (s.charAt(right) != ']') {
                right++;
            }
            repeat = Integer.parseInt(s.substring(index, left));
            while (repeat != 0) {
                sb.append(s.substring(left + 1, right));
                repeat--;
            }
            index = left = right + 1;
        }
        return sb.toString();
    }
}
