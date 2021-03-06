package com.fire.content.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fire.common.pojo.EasyUITreeNode;
import com.fire.common.pojo.FireResult;
import com.fire.content.service.ContentCategoryService;
import com.fire.dao.TbContentCategoryDao;
import com.fire.pojo.TbContentCategory;
import com.fire.pojo.TbContentCategoryQuery;
import com.fire.pojo.TbContentCategoryQuery.Criteria;
import com.fire.pojo.TbItemCat;

/**
 * 内容分类管理Service
 * <p>Title: ContentCategoryServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: www.fire.com</p> 
 * @author fire
 * @date	2017年5月21日下午3:56:39
 * @version 1.0
 */
@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {

	@Resource
	private TbContentCategoryDao contentCategoryDao;
	
	
	/**
	 * 获取内容分类列表信息
	 * <p>Title: getContentCategoryList</p>
	 * <p>Description: </p>
	 * @param parentId
	 * @return
	 * @see com.fire.content.service.ContentCategoryService#getContentCategoryList(long)
	 */
	@Override
	public List<EasyUITreeNode> getContentCategoryList(long parentId) {
		//根据parentId查询子节点列表
		TbContentCategoryQuery categoryQuery = new TbContentCategoryQuery();
		//设置查询条件
		Criteria criteria = categoryQuery.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		//执行查询
		List<TbContentCategory> list= contentCategoryDao.selectByExample(categoryQuery);
		List<EasyUITreeNode> resultList = new ArrayList<>();
		for (TbContentCategory tbItemCat : list) {
			EasyUITreeNode node = new EasyUITreeNode();
			node.setId(tbItemCat.getId());
			node.setText(tbItemCat.getName());
			node.setState(tbItemCat.getIsParent()?"closed":"open");
			//添加到结果列表
			resultList.add(node);
		}
		return resultList;
	}


	/**
	 * 添加分类
	 * <p>Title: addContentCategory</p>
	 * <p>Description: </p>
	 * @param parentId
	 * @param name
	 * @return
	 * @see com.fire.content.service.ContentCategoryService#addContentCategory(java.lang.Long, java.lang.String)
	 */
	@Override
	public FireResult addContentCategory(Long parentId, String name) {
		//创建一个pojo
		TbContentCategory tbContentCategory = new TbContentCategory();
		//补全对象的属性
		tbContentCategory.setParentId(parentId);
		tbContentCategory.setName(name);
		//状态.可选值:1(正常) 2(删除)
		tbContentCategory.setStatus(1);
		//排序,默认为1
		tbContentCategory.setSortOrder(1);
		tbContentCategory.setIsParent(false);
		tbContentCategory.setCreated(new Date());
		tbContentCategory.setUpdated(new Date());
		//插入到数据库
		contentCategoryDao.insert(tbContentCategory);
		//判断父节点的状态
		TbContentCategory parent = contentCategoryDao.selectByPrimaryKey(parentId);
		if (!parent.getIsParent()) {
			//如果父节点为叶子节点,应该改为父节点
			parent.setIsParent(true);
			//更新父节点
			contentCategoryDao.updateByPrimaryKey(parent);
		}
		return FireResult.ok(tbContentCategory);
	}

}
