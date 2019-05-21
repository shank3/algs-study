/**
 * 各种排序算法
 */
public class Sort<E extends Comparable> {


    /**
     * 交换数组中两个元素
     * @param a 数组
     * @param k 第一个元素的索引
     * @param j 第二个元素的索引
     */
    private static void exch(Comparable[] a, int k, int j) {
        Comparable c = a[k];
        a[k] = a[j];
        a[j] = c;
    }


    /**
     * 比较数组中两个元素，第j个元素是否小于第i个元素
     */
    private static boolean less(Comparable[] a, int j, int i) {
        return a[j].compareTo(a[i]) < 0;
    }
    private static boolean less(Comparable i, Comparable j) {
        return i.compareTo(j) < 0;
    }




    /**
     * 插入排序
     * 时间复杂度O(n*n),最坏情况运行(n*(n-1))
     * 稳定，适用于小型近似有序
     */
    public static void insertion(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && less(arr[j], arr[j-1]); j--) {
              exch(arr, j, j-1);
            }
        }
    }






    /**
     * 选择排序
     * 时间复杂度O(n*n)
     */
    public static void selection(Comparable[] arr) {
        int  i,j,min;
        int N = arr.length;
        for (i = 0;  i < N - 1; i++) {
            min = i;
            for (j = i + 1; j < N;  j++) {
                if (!less(arr[min], arr[j])) {
                    min = j;
                }
            }
            exch(arr, min, i);
        }
    }







    /*
     * shell排序
     */
    public static void shell(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N/3) {
            h = 3*h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h) {
                    exch(a, j, j-h);
                }
            }
            h = h/3;
        }


    }






    /**
     * 归并排序
     */
    public static void merge(Comparable[] arr) {
        Comparable[] aux = (Comparable[]) new Comparable[arr.length];
        mergeSink(arr, aux, 0, arr.length - 1);
    }

    /**
     * 自顶向下归并
     */
    private static void mergeSink(Comparable[] arr, Comparable[] temp, int left, int right) {
        if (left < right) {
            int mid = left + (right - left)/2;
            mergeSink(arr, temp, left, mid);
            mergeSink(arr, temp, mid + 1, right);
            merge(arr, temp, left, mid, right);
        }
    }

    /**
     * 自底向上归并
     */
    public static void mergeSwim(Comparable[] a) {
        int N = a.length;
        Comparable[] aux = new Comparable[N];
        for (int sz = 1; sz < N; sz = sz+sz) {
            for (int lo = 0; lo < N-sz; lo += sz+sz) {
                merge(a, aux, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));
            }
        }
    }

    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        //将a[lo..mid] 和 a[mid+1..hi] 归并
        int i = lo,j = mid+1;
        for (int k = lo; k <= hi; k++) {
            //将a[lo..hi]复制到辅助数组aux[lo..hi]
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }





    public static void quick(Comparable[] a) {
//        quickSort(a, 0, a.length-1);
        quick3way(a, 0, a.length-1);
    }

    private static void quickSort(Comparable[] a, int lo, int hi) {
        if (lo < hi) {
            int j = partition(a, lo, hi);
            quickSort(a, lo, j);
            quickSort(a, j+1, hi);
        }
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        //将数组切分为a[lo..i-1], a[i], a[i+1..hi]
        int i = lo,j = hi+1;
        Comparable v = a[lo];
        while (true) {
            //扫描左右，检查扫描是否结束并交换元素
            while (less(a[++i], v)) {
                if (i == hi) break;
            }
            while (less(v, a[--j])) {
                if (j == lo) break;
            }
            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        //将v = a[j]放入正确的位置
        exch(a, lo, j);
        //a[lo..j-1] <= a[j] <= a[j+1..hi] 达成
        return j;
    }


    private static void quick3way(Comparable[] a, int lo, int hi) {
        if (hi  <= lo) return;
        int lt = lo, i = lo+1, gt = hi;
        Comparable v = a[lo];
        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) {
                exch(a, lt++, i++);
            } else if (cmp > 0) {
                exch(a, i, gt--);
            } else {
                i++;
            }
        }
        //现在 a[lo..lt-1] < v = a[lt..gt] < a[gt+1..hi]
        quick3way(a, lo, lt -1);
        quick3way(a, gt+1, hi);

    }











    /**
     * 堆排序
     */
    public static void heap(Comparable[] a) {
       int N = a.length;
       for (int k = N/2 - 1; k >= 0; k--) {
           sink(a, k, N);
       }
       for (int i = N-1; i > 0; i--) {
           exch(a, i, 0);
           sink(a, 0, i);
       }
    }

    private static void sink(Comparable[] a, int parent, int length) {
        Comparable temp = a[parent];
        //完全二叉树节点i从编号1开始的左子节点位置在2i,此处数组下标从0开始，即左子节点所在数组索引为:2i+1
        int childIndex = 2 * parent + 1;
        while (childIndex < length) {
            if (childIndex + 1 < length && less(a[childIndex], a[childIndex+1])) {
                //节点有右子节点且右子节点大于左子节点，则选取右子节点
                childIndex++;
            }
            if (less(a[childIndex], temp)) {
                //如果选中节点大于其子节点，直接返回
                break;
            }
            a[parent] = a[childIndex];
            parent = childIndex;
            //继续向下调整
            childIndex = 2 * parent + 1;
        }
        a[parent] = temp;
    }






}
