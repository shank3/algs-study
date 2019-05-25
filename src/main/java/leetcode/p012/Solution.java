package leetcode.p012;

/**
 * 整数转罗马数字
 */
public class Solution {

    /**
     * 字符          数值
     * I             1
     * IV            4
     * V             5
     * IX            9
     * X             10
     * XL            40
     * L             50
     * XC            90
     * C             100
     * CD            400
     * D             500
     * CM            900
     * M             1000
     * @param num
     * @return
     */
    public String intToRoman(int num) {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] reps = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String s = "";
        for (int i = 0; i < nums.length; i++) {
            while (num >= nums[i]) {
                num -= nums[i];
                s += reps[i];
            }
        }
        return s;
    }
}
