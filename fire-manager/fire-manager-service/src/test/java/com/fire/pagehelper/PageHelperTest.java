package com.fire.pagehelper;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fire.dao.TbItemDao;
import com.fire.pojo.TbItem;
import com.fire.pojo.TbItemQuery;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 分页测试
 * <p>Title: TestPageHelper</p>
 * <p>Description: </p>
 * <p>Company: www.fire.com</p> 
 * @author	fire
 * @date	2017年5月20日上午10:23:26
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext-dao.xml"})
public class PageHelperTest {
	
	@Resource
	private TbItemDao tbItemDao;
	
	
	@Test
	public void testPageHelper(){
		//1.在mybatis配置文件中配置分页插件
		//2.在执行查询之前配置分页条件,使用pagehelper的静态方法
		PageHelper.startPage(1, 10);
		//3.执行查询
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		//4.获取mapper
		TbItemDao itemDao = applicationContext.getBean(TbItemDao.class);
		//5.创建example对象
		TbItemQuery itemQuery = new TbItemQuery();
		List<TbItem> list = itemDao.selectByExample(itemQuery);
		//6.获取分页信息,使用pageinfo对象
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		System.out.println("总记录数:" + pageInfo.getTotal());
		System.out.println("总记页数:" + pageInfo.getPages());
		System.out.println("返回的记录数:" + list.size());
	}
	
	@Test
	public void test(){
		TbItemQuery tbItemQuery = new TbItemQuery();
		//当前 页 
		tbItemQuery.setPageNo(1);
		//页次数
		tbItemQuery.setPageSize(10);
		//动态SQL查询
		tbItemQuery.setFields("id,title");
		List<TbItem> list = tbItemDao.selectByExample(tbItemQuery);
		
		System.out.println(list);
	}
}
