package leetcode.page0.p020;

import java.util.Stack;

/**
 * 20.有效的括号
 */
public class Solution {

    public boolean isValid(String s) {
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < s.length(); i++) {
            String item = s.charAt(i) + "";
            if (stack.isEmpty()) {
                stack.push(item);
            } else {
                String peek = stack.peek();
                if (peek.equals("(") && item.equals(")")) {
                    stack.pop();
                } else if (peek.equals("[") && item.equals("]")) {
                    stack.pop();
                } else if (peek.equals("{") && item.equals("}")) {
                    stack.pop();
                } else {
                    stack.push(item);
                }
            }

        }
        return stack.isEmpty();
    }
}
