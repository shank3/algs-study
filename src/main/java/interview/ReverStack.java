package interview;

import java.util.Stack;

public class ReverStack {


    /**
     * 递归反转栈
     * @param s
     */
    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        Integer pop = s.pop();
        reverse(s);
        insertBottom(s, pop);
    }

    private static void insertBottom(Stack<Integer> s, Integer pop) {
        if (s.isEmpty()) {
            s.push(pop);
            return;
        }
        Integer tmp = s.pop();
        insertBottom(s, pop);
        s.push(tmp);
    }


}
