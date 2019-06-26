package leetcode.page0.p003;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * 无重复字符的最长子串
     */
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character,Integer> m = new HashMap<Character, Integer>();
        for (int i = 0,j = 0; j < n; j++) {
            if (m.containsKey(s.charAt(j))) {
                i = Math.max(m.get(s.charAt(j)), i);
            }
            ans = Math.max(j-i+1, ans);
            m.put(s.charAt(j), j+1);
        }
        return ans;
    }
}