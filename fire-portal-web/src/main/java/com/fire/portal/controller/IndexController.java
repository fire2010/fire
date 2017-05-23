package com.fire.portal.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fire.content.service.ContentService;
import com.fire.pojo.TbContent;
import com.fire.portal.pojo.AD1Node;
import com.fire.utils.JsonUtils;

/**
 * 首页展示Controller
 * <p>Title: IndexController</p>
 * <p>Description: </p>
 * <p>Company: www.fire.com</p> 
 * @author fire
 * @date	2017年5月21日下午3:19:01
 * @version 1.0
 */
@Controller
public class IndexController {

	@Resource
	private ContentService contentService;
	
	@Value("${AD1_CATEGORY_ID}")
	private Long AD1_CATEGORY_ID;
	@Value("${AD1_WIDTH}")
	private Integer AD1_WIDTH;
	@Value("${AD1_WIDTH_B}")
	private Integer AD1_WIDTH_B;
	@Value("${AD1_HEIGHT}")
	private Integer AD1_HEIGHT;
	@Value("${AD1_HEIGHT_B}")
	private Integer AD1_HEIGHT_B;
	
	@RequestMapping("/index")
	public String showIndex(Model mode){
		//根据cid查询轮播图内容列表
		List<TbContent> contentList = contentService.getContentByCid(AD1_CATEGORY_ID);
		//把列表转换成AD1Node列表
		List<AD1Node> ad1Nodes = new ArrayList<>();
		for (TbContent tbContent : contentList) {
			AD1Node node = new AD1Node();
			node.setAlt(tbContent.getTitle());
			node.setHeight(AD1_HEIGHT);
			node.setHeightB(AD1_HEIGHT_B);
			node.setHref(tbContent.getUrl());
			node.setSrc(tbContent.getPic());
			node.setSrcB(tbContent.getPic2());
			node.setWidth(AD1_WIDTH);
			node.setWidthB(AD1_WIDTH_B);
			//添加到节点列表
			ad1Nodes.add(node);
		}
		//把列表转换成json数据
		String ad1Json = JsonUtils.objectToJson(ad1Nodes);
		//把json数据传递给页面
		mode.addAttribute("ad1",ad1Json);
		return "index";
	}
}
