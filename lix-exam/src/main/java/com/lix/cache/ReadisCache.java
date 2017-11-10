package com.lix.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class ReadisCache {
    public static final String CACHENAME = "redis_cache";
    public static final Integer CACEHTIME = 60;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate

    public void putIntoCache(String key, Object obj) {
        byte[] keyByte = key.getBytes();
        byte[] objByte =
    }
}
