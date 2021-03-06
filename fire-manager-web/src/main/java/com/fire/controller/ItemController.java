package com.fire.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fire.common.pojo.EeayUIDataGridResult;
import com.fire.common.pojo.FireResult;
import com.fire.pojo.TbItem;
import com.fire.service.ItemService;

/**
 * 商品管理Controller
 * <p>Title: ItemController</p>
 * <p>Description: </p>
 * <p>Company: www.fire.com</p> 
 * @author	fire
 * @date	2017年5月20日上午12:34:28
 * @version 1.0
 */
@Controller
public class ItemController {

	@Resource
	private ItemService itemService;
	
	/**
	 * 根据商品ID查询商品信息
	 * <p>Title: getItemById</p>
	 * <p>Description: </p>
	 * @param itemId
	 * @return
	 */
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable Long itemId){
		TbItem tbItem = itemService.getItemById(itemId);
		return tbItem;
	}
	
	/**
	 * 查询商品列表
	 * <p>Title: getItemList</p>
	 * <p>Description: </p>
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/item/list")
	@ResponseBody
	public EeayUIDataGridResult getItemList(Integer page,Integer rows){
		EeayUIDataGridResult result = itemService.getItemList(page, rows);
		return result;
	}
	
	/**
	 * 添加商品
	 * <p>Title: addItem</p>
	 * <p>Description: </p>
	 * @param item
	 * @param desc
	 * @return
	 */
	@RequestMapping(value = "/item/save",method=RequestMethod.POST)
	@ResponseBody
	public FireResult addItem(TbItem item,String desc){
		FireResult result = itemService.addItem(item, desc);
		return result;	
	}
}
