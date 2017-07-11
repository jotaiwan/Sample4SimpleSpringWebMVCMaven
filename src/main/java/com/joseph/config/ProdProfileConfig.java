package com.joseph.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by jotaiwan on 11/07/2017.
 */
@Configuration
@Profile("prod")
public class ProdProfileConfig {
    private static final Logger log = LoggerFactory.getLogger(ProdProfileConfig.class);

    @Bean
    public CacheManager concurrentMapCacheManager() {
        log.debug("Cache manager is concurrentMapCacheManager");
        return new ConcurrentMapCacheManager("prodCache");
    }
}
