package com.fire.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fire.common.pojo.EasyUITreeNode;
import com.fire.common.pojo.FireResult;
import com.fire.content.service.ContentCategoryService;

/**
 * 内容分类管理Controller
 * <p>Title: ContentCategoryController</p>
 * <p>Description: </p>
 * <p>Company: www.fire.com</p> 
 * @author fire
 * @date	2017年5月21日下午4:19:53
 * @version 1.0
 */
@Controller 
public class ContentCategoryController {
	 
	@Resource
	private ContentCategoryService contentCategoryService;
	
	/**
	 * 获取商品分类列表信息
	 * <p>Title: getContentCategoryList</p>
	 * <p>Description: </p>
	 * @param parentId
	 * @return
	 */
	@RequestMapping("content/category/list")
	@ResponseBody
	public List<EasyUITreeNode> getContentCategoryList(@RequestParam(value = "id",defaultValue = "0")Long parentId){
		List<EasyUITreeNode> categoryList = contentCategoryService.getContentCategoryList(parentId);
		return categoryList;
	}
	
	@RequestMapping("content/category/create")
	@ResponseBody
	public FireResult addContentCategory(Long parentId,String name){
		FireResult fireResult = contentCategoryService.addContentCategory(parentId, name);
		return fireResult;
	}
}
