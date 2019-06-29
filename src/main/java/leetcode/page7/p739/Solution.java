package leetcode.page7.p739;

/**
 * 739.每日温度
 */
public class Solution {
    public int[] dailyTemperatures(int[] T) {
        int len = T.length;
        int[] res = new int[len];
        res[len - 1] = 0;
        for (int i = len - 2; i >= 0; i--) {
            for (int j = i + 1; j < len; j +=  res[j]) {
                if (T[i] < T[j]) {
                    res[i] = j - i;
                    break;
                } else if (res[j] == 0) {
                    res[i] = 0;
                    break;
                }
            }
        }
        return res;
    }
}
