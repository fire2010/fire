package com.fire.jedis;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * jedis测试
 * <p>Title: JedisTest</p>
 * <p>Description: </p>
 * <p>Company: www.fire.com</p> 
 * @author fire
 * @date	2017年5月22日下午11:06:18
 * @version 1.0
 */
public class JedisTest {

	@Test
	public void testJedis(){
		//创建一个jedis对象，需要指定服务ip和端口号
		Jedis jedis = new Jedis("192.168.249.132", 6379);
		//直接操作数据库
		jedis.set("jedis-key", "123456");
		String value = jedis.get("jedis-key");
		System.out.println(value);
		//关闭jedis
		jedis.close();
	}
	
	@Test
	public void testJdeisPool(){
		//创建一个jedisPool连接池对象(单例)，需要指定服务ip和端口号
		JedisPool jedisPool = new JedisPool("192.168.249.132", 6379);
		//从连接池中获取连接
		Jedis jedis = jedisPool.getResource();
		//使用jedis操作数据库(方法级别使用)
		String value = jedis.get("jedis-key");
		System.out.println(value);
		//一定要关闭jedis连接
		jedis.close();
		//系统关闭前关闭连接池
		jedisPool.close();
	}
}