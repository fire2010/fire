package com.fire.content.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fire.common.pojo.FireResult;
import com.fire.content.jedis.JedisClient;
import com.fire.content.service.ContentService;
import com.fire.dao.TbContentDao;
import com.fire.pojo.TbContent;
import com.fire.pojo.TbContentQuery;
import com.fire.pojo.TbContentQuery.Criteria;
import com.fire.utils.JsonUtils;

/**
 * 内容管理Service
 * <p>Title: ContentServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: www.fire.com</p> 
 * @author fire
 * @date	2017年5月21日下午10:14:25
 * @version 1.0
 */
@Service
public class ContentServiceImpl implements ContentService {

	@Resource
	private TbContentDao tbContentDao;
	
	@Resource
	private JedisClient jedisclient;
	
	@Value("${INDEX_CONTENT}")
	private String INDEX_CONTENT;
	
	/**
	 * 添加内容
	 * <p>Title: addContent</p>
	 * <p>Description: </p>
	 * @param content
	 * @return
	 * @see com.fire.content.service.ContentService#addContent(com.fire.pojo.TbContent)
	 */
	@Override
	public FireResult addContent(TbContent content) {
		//补全pojo属性
		content.setCreated(new Date());
		content.setUpdated(new Date());
		//插入到内容表
		tbContentDao.insert(content);
		//同步缓存
		//删除对应的缓存信息
		jedisclient.hdel(INDEX_CONTENT, content.getCategoryId().toString());
		return FireResult.ok();
	}

	/**
	 * 根据内容分类cid获取内容信息
	 * <p>Title: getContentByCid</p>
	 * <p>Description: </p>
	 * @param cid
	 * @return
	 * @see com.fire.content.service.ContentService#getContentByCid(long)
	 */
	@Override
	public List<TbContent> getContentByCid(long cid) {
		//先查询缓存
		//添加缓存不能影响正常的业务逻辑
		try {
			//查询缓存
			String json = jedisclient.hget(INDEX_CONTENT, cid + "");
			//查询到结果，把json转成List返回
			if (StringUtils.isBlank(json)) {
				List<TbContent> list = JsonUtils.jsonToList(json, TbContent.class);
				return list;	
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		TbContentQuery tbContentQuery = new TbContentQuery();
		Criteria criteria = tbContentQuery.createCriteria();
		//设置查询条件
		criteria.andCategoryIdEqualTo(cid);
		//执行查询
		List<TbContent> list = tbContentDao.selectByExample(tbContentQuery);
		//把结果添加到缓存
		try {
			jedisclient.hset(INDEX_CONTENT, cid + "", JsonUtils.objectToJson(list));
		} catch (Exception e) {
			// TODO: handle exception
		}
		//返回结果
		return list;
	}
}
