package leetcode.page4.p438;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 438.找到字符串中的所有字母异位词
 */
public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.equals("") || p.equals("") || s.length() < p.length()) {
            return list;
        }
        int len = p.length();
        int[] pattern = new int[26];
        for (char c : p.toCharArray()) {
            //词频统计，丢掉位置信息
            pattern[c - 'a']++;
        }
        int[] str = new int[26];
        for (int i = 0; i < len; i++) {
            str[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(pattern, str)) {
            list.add(0);
        }
        for (int i = 1; i < s.length() - len + 1; i++) {
            str[s.charAt(i - 1) - 'a']--;
            str[s.charAt(i + len - 1) - 'a']++;
            if (Arrays.equals(pattern, str)) {
                list.add(i);
            }
        }
        return list;
    }
}
