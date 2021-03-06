package com.fire.content.service;

import java.util.List;

import com.fire.common.pojo.FireResult;
import com.fire.pojo.TbContent;

/**
 * 内容管理Service
 * <p>Title: ContentService</p>
 * <p>Description: </p>
 * <p>Company: www.fire.com</p> 
 * @author fire
 * @date	2017年5月21日下午10:08:18
 * @version 1.0
 */
public interface ContentService {

	/**
	 * 添加分类
	 * <p>Title: addContent</p>
	 * <p>Description: </p>
	 * @param content
	 * @return
	 */
	FireResult addContent(TbContent content);
	
	/**
	 * 根据内容分类cid获取内容信息
	 * <p>Title: getContentByCid</p>
	 * <p>Description: </p>
	 * @param cid
	 * @return
	 */
	List<TbContent> getContentByCid(long cid);
}
