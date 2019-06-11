package leetcode.page2.p155;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinStackTest {

    @Test
    public void getMin() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(-3, minStack.getMin());
        minStack.pop();
        assertEquals(0, minStack.top());
        assertEquals(-2, minStack.getMin());
    }
}