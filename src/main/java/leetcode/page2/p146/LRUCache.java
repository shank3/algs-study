package leetcode.page2.p146;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 146.LRU缓存
 */
public class LRUCache {

    private final int MAX_CACHE_SIZE;
    private float DEFAULT_LOAD_FACTOR = 0.75f;
    private LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
        MAX_CACHE_SIZE = capacity;
        int initCapacity = (int) (Math.ceil(MAX_CACHE_SIZE / DEFAULT_LOAD_FACTOR) + 1);
        cache = new LinkedHashMap<Integer, Integer>(initCapacity, DEFAULT_LOAD_FACTOR, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > MAX_CACHE_SIZE;
            }
        };
    }

    public int get(int key) {
        return cache.containsKey(key) ? cache.get(key) : -1;
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }


}
