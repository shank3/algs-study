package leetcode.page3.p301;

import java.util.*;

/**
 * 301.删除无效的括号
 */
public class Solution {

    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<>();
        int left = 0, right = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else if (s.charAt(i) == ')') {
                if (left > 0) {
                    left--;
                } else {
                    right++;
                }
            }
        }
        bfs(s, 0, left, right, res);
        return res;
    }

    private void bfs(String s, int index, int left, int right, List<String> res) {
        if (left == 0 && right == 0) {
            if (isValid(s)) {
//                System.out.println(s);
                res.add(s);
            }
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (i - 1 >= index && s.charAt(i - 1) == s.charAt(i)) {
                continue;
            }
            if (left > 0 && s.charAt(i) == '(') {
                bfs(s.substring(0, i) + s.substring(i + 1), i, left-1, right, res);
            }
            if (right > 0 && s.charAt(i) == ')') {
                bfs(s.substring(0, i) + s.substring(i + 1), i, left, right-1, res);
            }
        }
    }

    private boolean isValid(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else if (s.charAt(i) == ')') {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }
}
