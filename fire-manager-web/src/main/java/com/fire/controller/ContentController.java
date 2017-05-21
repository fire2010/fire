package com.fire.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fire.common.pojo.FireResult;
import com.fire.content.service.ContentService;
import com.fire.pojo.TbContent;

/**
 * 内容管理Controller
 * <p>Title: ContentController</p>
 * <p>Description: </p>
 * <p>Company: www.fire.com</p> 
 * @author fire
 * @date	2017年5月21日下午10:20:01
 * @version 1.0
 */
@Controller
public class ContentController {

	@Resource
	private ContentService contentService;
	
	@RequestMapping("/content/save")
	@ResponseBody
	public FireResult addContent(TbContent tbContent){
		FireResult fireResult = contentService.addContent(tbContent);
		return fireResult;
	}
}
