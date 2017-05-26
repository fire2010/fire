package com.fire.content.jedis;

/**
 * redis接口
 * <p>Title: JedisClient</p>
 * <p>Description: </p>
 * <p>Company: www.fire.com</p> 
 * @author fire
 * @date	2017年5月26日下午10:25:22
 * @version 1.0
 */
public interface JedisClient {

	String set(String key, String value);
	String get(String key);
	Boolean exists(String key);
	Long expire(String key, int seconds);
	Long ttl(String key);
	Long incr(String key);
	Long hset(String key, String field, String value);
	String hget(String key, String field);
	Long hdel(String key, String... field);
}
