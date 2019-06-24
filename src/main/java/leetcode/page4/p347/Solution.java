package leetcode.page4.p347;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 347.前k个高频元素
 */
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        ArrayList<Integer>[] arr = new ArrayList[nums.length + 1];
        for (Integer key : map.keySet()) {
            Integer fre = map.get(key);
            if (arr[fre] == null) {
                arr[fre] = new ArrayList<>();
            }
            arr[fre].add(key);
        }
        for (int i = arr.length - 1; i > 0 & list.size() < k; i--) {
            if (arr[i] != null) {
                list.addAll(arr[i]);
            }
        }
        return list;
    }
}
