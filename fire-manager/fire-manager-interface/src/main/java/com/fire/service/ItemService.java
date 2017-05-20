package com.fire.service;

import com.fire.common.pojo.EeayUIDataGridResult;
import com.fire.pojo.TbItem;

/**
 * 商品管理Service
 * <p>Title: ItemService</p>
 * <p>Description: </p>
 * <p>Company: www.fire.com</p> 
 * @author fire
 * @date	2017年5月20日下午9:16:46
 * @version 1.0
 */
public interface ItemService {

	/**
	 * 根据商品ID查询商品信息
	 * <p>Title: getItemById</p>
	 * <p>Description: </p>
	 * @param itemId 商品ID
	 * @return 商品对象
	 */
	TbItem getItemById(long itemId);
	
	/**
	 * 查询分页列表
	 * <p>Title: getItemList</p>
	 * <p>Description: </p>
	 * @param page
	 * @param rows
	 * @return
	 */
	EeayUIDataGridResult getItemList(Integer page,Integer rows);
	
}
