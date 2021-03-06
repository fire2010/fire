package com.fire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台页面展示
 * <p>Title: PageController</p>
 * <p>Description: </p>
 * <p>Company: www.fire.com</p> 
 * @author	fire
 * @date	2017年5月20日上午9:30:33
 * @version 1.0
 */
@Controller
public class PageController {

	/**
	 * 后台首页展示
	 * <p>Title: showIndex</p>
	 * <p>Description: </p>
	 * @return
	 */
	@RequestMapping("/")
	public String showIndex(){
		return "index";
	}
	
	/**
	 * 后台页面跳转
	 * <p>Title: showPage</p>
	 * <p>Description: </p>
	 * @param page
	 * @return
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
}
