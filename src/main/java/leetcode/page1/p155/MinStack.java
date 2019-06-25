package leetcode.page1.p155;

import java.util.Stack;

/**
 * 155.最小栈
 */
public class MinStack {
    /** initialize your data structure here. */
    private Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<Integer>();
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            stack.push(x);
        } else {
            int min = stack.peek();
            stack.push(x);
            stack.push(min < x ? min : x);
        }
    }

    public void pop() {
        stack.pop();
        stack.pop();
    }

    public int top() {
        return stack.get(stack.size() - 2);
    }

    public int getMin() {
        return stack.peek();
    }
}
