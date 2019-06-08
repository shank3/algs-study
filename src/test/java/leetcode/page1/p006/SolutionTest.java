package leetcode.page1.p006;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void convert() {
        Solution s = new Solution();
        String hello = s.convert("helloworld", 3);
//        System.out.println(hello);
        assertEquals("holelwrdlo", hello);
        String convert = s.convert("hello", 7);
//        System.out.println(convert);
        assertEquals("hello", convert);
    }
}