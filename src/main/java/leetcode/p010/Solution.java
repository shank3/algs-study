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
        System.out.println("text:" + s + ", pattern:" + p);
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

    public boolean isMatch2(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[s.length()][p.length()] = true;
        for (int i = s.length(); i >= 0; i--) {
            for (int j = p.length() - 1; j >= 0; j--) {
                boolean firstMatch = i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');
                if (j + 1 < p.length() && p.charAt(j+1) == '*') {
                    dp[i][j] = dp[i][j+2] || (firstMatch && dp[i+1][j]);
                } else {
                    dp[i][j] = firstMatch && dp[i+1][j+1];
                }

            }
        }
//        display(s, p, dp);
        return dp[0][0];
    }

    private void display(String s, String p, boolean[][] dp) {
        System.out.println("text:" + s + ", pattern:" + p);
        for (int i = 0; i < dp.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < dp[i].length; j++) {
                System.out.printf(" [%s],", dp[i][j]);
            }
            System.out.println(" ]");
        }
        System.out.println();
    }


}
