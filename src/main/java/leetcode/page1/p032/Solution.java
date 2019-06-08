package leetcode.page1.p032;

/**
 * 32.最长有效括号
 */
public class Solution {

    /**
     * 我们用 dp[i] 表示以 i 结尾的最长有效括号；
     * 当s[i] 为(,dp[i] 必然等于0,因为不可能组成有效的括号;
     * 那么s[i] 为 )
     *  2.1 当 s[i-1] 为 (，那么 dp[i] = dp[i-2] + 2；
     *  2.2 当 s[i-1] 为 ) 并且 s[i-dp[i-1] - 1] 为 (，那么 dp[i] = dp[i-1] + 2 + dp[i-dp[i-1]-2]；
     * 时间复杂度：O(n)O(n)
     */
    public int longestValidParentheses(String s) {
        if (s == null || s.length() == 0) return 0;
        int max = 0;
        int[] dp = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == ')') {
                if (s.charAt(i-1) == '(') {
                    dp[i] = i - 2 > 0 ? (dp[i-2] + 2) : 2;
                } else if (s.charAt(i-1) == ')' && i-dp[i-1]-1 >= 0 && s.charAt(i-dp[i-1]-1) == '(') {
                    dp[i] = dp[i-1] + 2 + (i-dp[i-1]-1 > 0 ? dp[i-dp[i-1]-2] : 0);
                }
                max = max > dp[i] ? max : dp[i];
            }
        }
        return max;
    }
}
