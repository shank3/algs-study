package leetcode.page5.p560;

import java.util.HashMap;
import java.util.Map;

/**
 * 560.和为K的子数组
 */
public class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;
        map.put(0, 1);
        for (int n : nums) {
            sum += n;
            int sub = sum - k;
            if (map.containsKey(sub)) {
                ans += map.get(sub);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
