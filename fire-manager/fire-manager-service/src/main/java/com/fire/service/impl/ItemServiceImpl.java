package com.fire.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fire.common.pojo.EeayUIDataGridResult;
import com.fire.common.pojo.FireResult;
import com.fire.dao.TbItemDao;
import com.fire.dao.TbItemDescDao;
import com.fire.pojo.TbItem;
import com.fire.pojo.TbItemDesc;
import com.fire.pojo.TbItemQuery;
import com.fire.service.ItemService;
import com.fire.utils.IDUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 商品管理Service
 * <p>Title: ItemServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: www.fire.com</p> 
 * @author fire
 * @date	2017年5月20日下午9:17:28
 * @version 1.0
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Resource
	private TbItemDao itemDao;
	
	@Resource
	private TbItemDescDao itemDescDao;

	/*
	 * 根据商品ID查询商品信息
	 */
	@Override
	public TbItem getItemById(long itemId) {
		TbItem item = itemDao.selectByPrimaryKey(itemId);
		return item;
	}

	/**
	 * 查询分页列表
	 * <p>Title: getItemList</p>
	 * <p>Description: </p>
	 * @param page
	 * @param rows
	 * @return
	 * @see com.fire.service.ItemService#getItemList(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public EeayUIDataGridResult getItemList(Integer page, Integer rows) {
		//设置分页的条件
		PageHelper.startPage(page, rows);
		//执行查询
		List<TbItem> list = itemDao.selectByExample(new TbItemQuery());
		//获取查询结果
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		EeayUIDataGridResult result = new EeayUIDataGridResult(); 
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}

	/**
	 * 添加商品
	 * <p>Title: addItem</p>
	 * <p>Description: </p>
	 * @param item
	 * @param desc
	 * @return
	 * @see com.fire.service.ItemService#addItem(com.fire.pojo.TbItem, java.lang.String)
	 */
	@Override
	public FireResult addItem(TbItem item, String desc) {
		//生成商品id
		long itemId = IDUtils.genItemId();
		//不全item的属性
		item.setId(itemId);
		//商品状态：1-正常， 2-下架， 3-删除
		item.setStatus((byte)1);
		item.setCreated(new Date());
		item.setUpdated(new Date());
		//向商品表插入数据
		itemDao.insert(item);
		//创建一个商品描述对应的pojo
		TbItemDesc itemDesc = new TbItemDesc();
		//补全pojo的属性
		itemDesc.setItemId(itemId);
		itemDesc.setItemDesc(desc);
		itemDesc.setCreated(new Date());
		itemDesc.setUpdated(new Date());
		//向商品描述插入数据
		itemDescDao.insert(itemDesc);
		//返回结果
		return FireResult.ok();
	}
}
