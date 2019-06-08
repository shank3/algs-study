package leetcode.page1.p049;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 49.字母异位词分组
 */
public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m = new HashMap<String, List<String>>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String k = new String(chars);
            if (m.containsKey(k)) {
                m.get(k).add(s);
            } else {
                ArrayList<String> list = new ArrayList<String>();
                list.add(s);
                m.put(k, list);
            }
        }
        return new ArrayList<List<String>>(m.values());
    }

}
