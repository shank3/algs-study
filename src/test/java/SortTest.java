import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    Integer[] a ;
    @Before
    public void setUp() {
        a = new Integer[]{2, 8, 7, 1, 9, 3, 5, 4};
//        System.out.println("Before: ");
//        for (Integer i : a) {
//            System.out.print(i + ",\t");
//        }
        System.out.println();
    }

    @After
    public void tearDown() {
//        System.out.println("After: ");
//        for (Integer i : a) {
//            System.out.print(i + ",\t");
//        }
        Integer[] s = {1,2,3,4,5,7,8,9};
        assertArrayEquals(s, a);
    }


    @Test
    public void selection() throws Exception {
        Sort.selection(a);
    }

    @Test
    public void insertion() throws Exception {
        Sort.insertion(a);
    }

    @Test
    public void shell() throws Exception {
        Sort.shell(a);
    }

    @Test
    public void merge() throws Exception {
        Sort.merge(a);
    }

    @Test
    public void mergeSwim() throws Exception {
        Sort.mergeSwim(a);
    }

    @Test
    public void heap() throws Exception {
        Sort.heap(a);
    }

    @Test
    public void quick() {
        Sort.quick(a);
    }





}