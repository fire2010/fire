package com.fire.content.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fire.common.pojo.FireResult;
import com.fire.content.service.ContentService;
import com.fire.dao.TbContentDao;
import com.fire.pojo.TbContent;
import com.fire.pojo.TbContentQuery;
import com.fire.pojo.TbContentQuery.Criteria;

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
		TbContentQuery tbContentQuery = new TbContentQuery();
		Criteria criteria = tbContentQuery.createCriteria();
		//设置查询条件
		criteria.andCategoryIdEqualTo(cid);
		//执行查询
		List<TbContent> list = tbContentDao.selectByExample(tbContentQuery);
		return list;
	}
}
