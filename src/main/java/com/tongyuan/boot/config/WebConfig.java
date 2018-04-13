package com.tongyuan.boot.config;

import javax.annotation.Resource;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author tongyuan
 * @date 18/4/4
 */


@Configuration
@EnableWebMvc // @see https://www.cnblogs.com/duanxz/p/4875153.html
@EnableScheduling //开启定时任务支持
@EnableCaching //开启缓存
@EnableAsync //开启异步任务执行，即TaskExecutor异步任务执行,通过@Async使用
@EnableRedisHttpSession(redisNamespace="appName", maxInactiveIntervalInSeconds = 90000) //使用redis共享session
@ComponentScan({"","",""})
public class WebConfig {

    @Resource
    private RedisConnectionFactory redisConnectionFactory;
    
    @Bean
    public RedisCacheManager cacheManager() {
        return RedisCacheManager.create(redisConnectionFactory);
    }

}
