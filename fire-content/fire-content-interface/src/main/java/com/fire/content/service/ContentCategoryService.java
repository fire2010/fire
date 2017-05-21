package com.fire.content.service;

import java.util.List;

import com.fire.common.pojo.EasyUITreeNode;
import com.fire.common.pojo.FireResult;

/**
 * 内容管理Service
 * <p>Title: ContentCategoryService</p>
 * <p>Description: </p>
 * <p>Company: www.fire.com</p> 
 * @author fire
 * @date	2017年5月21日下午3:51:56
 * @version 1.0
 */
public interface ContentCategoryService {

	/**
	 * 获取内容分类列表信息
	 * <p>Title: getContentCategoryList</p>
	 * <p>Description: </p>
	 * @param parentId
	 * @return
	 */
	List<EasyUITreeNode> getContentCategoryList(long parentId);
	
	/**
	 * 添加分类
	 * <p>Title: addContentCategory</p>
	 * <p>Description: </p>
	 * @param parentId
	 * @param name
	 * @return
	 */
	FireResult addContentCategory(Long parentId,String name);
}
