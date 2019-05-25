package leetcode.p017;

import java.util.*;

/**
 * 17. 电话号码的字母组合
 */
public class Solution {

    public List<String> letterCombinations(String digits) {
        String[] button = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ret = new ArrayList<String>();
        if (digits.length() == 0) {
            return ret;
        }
        String[] str = button[digits.charAt(0) - '0'].split("");
        if (digits.length() == 1) {
            ret.addAll(Arrays.asList(str));
            return ret;
        }
        List<String> right = letterCombinations(digits.substring(1));
        for (String s : str) {
            for (String r : right) {
                ret.add(s + r);
            }
        }
        return ret;
    }


}
