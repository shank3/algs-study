package leetcode.page1.p139;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void wordBreak() {
        Solution s = new Solution();
        assertTrue(s.wordBreak("leetcode", Arrays.asList("leet", "code")));
        assertTrue(s.wordBreak("applepenapple", Arrays.asList("apple", "pen")));
        assertFalse(s.wordBreak("catsandog", Arrays.asList("cats", "sand", "dog", "and", "cat")));
    }
}