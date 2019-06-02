package leetcode.contest.p5076;

/**
 * 字符串的最大公因子
 */
public class Solution {

    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) {
            String t = str1;
            str1 = str2;
            str2 = t;
        }
        String s = str1.replaceAll(str2, "");
        if (s.equals("")) {
            return str2;
        } else if (str1.equals(s)) {
            return "";
        } else {
            if (s.length() < str2.length()) {
                str1 = str2;
                str2 = s;
            } else {
                str1 = s;
            }
            return gcdOfStrings(str1, str2);
        }
    }


}
