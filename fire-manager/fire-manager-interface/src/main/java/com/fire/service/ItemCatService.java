package com.fire.service;

import java.util.List;

import com.fire.common.pojo.EasyUITreeNode;

/**
 * 商品分类Service
 * <p>Title: ItemCatService</p>
 * <p>Description: </p>
 * <p>Company: www.fire.com</p> 
 * @author fire
 * @date	2017年5月20日下午10:38:50
 * @version 1.0
 */
public interface ItemCatService {

	List<EasyUITreeNode> getItemCatList(long parentId);
}
