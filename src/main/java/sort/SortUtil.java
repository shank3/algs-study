package sort;

public class SortUtil {

    /**
     * 二分查找，若找到则返回下标
     * @param arr
     * @param target
     * @return
     */
    public static int binarySearch(int[] arr, int target) {
        int index = -1;
        int lo = 0, hi = arr.length - 1;
        int mid;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return index;
    }


    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int iv = arr[i];
            int index = i - 1;
            while (index >= 0 && iv < arr[index]) {
                arr[index+1] = arr[index];
                index--;
            }
            arr[index+1] = iv;
        }
    }




}
