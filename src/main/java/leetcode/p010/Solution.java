package leetcode.p010;

public class Solution {

    //参考 https://cloud.tencent.com/developer/article/1398861

    

    /**
     * 字符串匹配
     * @param s 字符串
     * @param p pattern 含.和*
     * @return
     */
    public boolean isMatch(String s, String p) {
//        System.out.println("text:" + s + ", pattern:" + p);
        if (p.isEmpty()) return s.isEmpty();
        //第一个字符是否匹配
        boolean firstMatch = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        if (p.length() >= 2 && p.charAt(1) == '*') {
            return (isMatch(s, p.substring(2)) || firstMatch && isMatch(s.substring(1), p));
        } else {
            //递归的时候不断消位，
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }
}
