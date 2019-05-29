package leetcode.p056;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

/**
 * 56.合并区间
 */
public class Solution {

    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<int[]>();
        for (int i = 0; i < intervals.length; i++) {
            list.add(intervals[i]);
        }
        Collections.sort(list, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        Stack<int[]> stack = new Stack<int[]>();
        for (int i = 0; i < list.size(); i++) {
            if (stack.isEmpty()) {
                stack.push(list.get(i));
            } else {
                int second_lo = list.get(i)[0];
                int second_hi = list.get(i)[1];
                int first_lo = stack.peek()[0];
                int first_hi = stack.peek()[1];
                if (first_hi >= second_lo && first_lo <= second_lo) {
                    int min = first_lo < second_lo ? first_lo : second_lo;
                    int max = first_hi < second_hi ? second_hi : first_hi;
                    int[] merge = new int[]{min, max};
                    stack.pop();
                    stack.push(merge);
                } else {
                    stack.push(list.get(i));
                }
            }
        }
        int x = stack.size();
        int[][] arr = new int[x][];
        for (int i = x-1; i >= 0; i--) {
            arr[i] = stack.pop();
        }
        return arr;
    }
}
