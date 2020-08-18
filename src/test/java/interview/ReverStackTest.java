package interview;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class ReverStackTest {

    @Test
    public void reverse() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(6);
        stack.push(5);
        System.out.println(stack);

        Stack<Integer> r = new Stack<>();
        while (!stack.isEmpty()) {
            r.push(stack.pop());
        }
        System.out.println(r);

        ReverStack.reverse(r);
        System.out.println(r);

    }
}