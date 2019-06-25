package leetcode.page4.p406;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reconstructQueue() {
        Solution s = new Solution();
        int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        int[][] queue = s.reconstructQueue(people);

        int[][] exp = {{5,0}, {7,0}, {5,2}, {6,1}, {4,4}, {7,1}};
        assertArrayEquals(exp, queue);
    }
}