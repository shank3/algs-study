package leetcode.page2.p146;

import org.junit.Test;

import static org.junit.Assert.*;

public class LRUCacheTest {

    @Test
    public void get() {
        LRUCache cache = new LRUCache( 2 /* 缓存容量 */ );

        cache.put(1, 1);
        cache.put(2, 2);
        int i = cache.get(1);// 返回  1
        assertEquals(1, i);
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        int v = cache.get(2);// 返回 -1 (未找到)
        assertEquals(-1, v);
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        v = cache.get(1);       // 返回 -1 (未找到)
        assertEquals(-1, v);
        assertEquals(3, cache.get(3));       // 返回  3
        assertEquals(4, cache.get(4));       // 返回  4

    }
}