package com.fire.search.service.impl;

import org.springframework.stereotype.Service;

import com.fire.common.pojo.FireResult;
import com.fire.search.service.SearchItemService;

/**
 * 商品数据导入索引库
 * <p>Title: SearchItemServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: www.fire.com</p> 
 * @author fire
 * @date	2017年5月30日下午12:12:36
 * @version 1.0
 */
@Service
public class SearchItemServiceImpl implements SearchItemService {

	@Override
	public FireResult importItemsToIndex() {
		//先查询所有商品数据
		//遍历商品数据添加到索引库 
		return null;
	}

}
