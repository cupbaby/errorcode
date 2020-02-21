/**
 * 
 */
package com.pudong.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pudong.pojo.User;
import com.pudong.service.UserService;

@Controller
public class UserController {

	@Resource
	private UserService userServiceImpl;
	@RequestMapping("show")
	public ModelAndView demo() {
		System.out.println("展示所有的内容");
		List<User> list = userServiceImpl.show();
		ModelAndView mav =  null;
		for (User user : list) {
			System.out.println(user);
			mav = new ModelAndView("index.jsp").addObject("model",user);
		}
		return mav;
		
	}
	@RequestMapping("insert")
	public String demo2(Model model) {
		System.out.println("添加用户内容");
		User user = new User();
		user.setPassword("123");
		user.setUsername("段五");
		User user2 = new User();
		user2.setPassword("123");
		user2.setUsername("dynic");
		List<User> list = new ArrayList<>();
		list.add(user);
		list.add(user2);
		model.addAttribute("modelInsert", userServiceImpl.insertUser(list));
		
		return "index.jsp";
	}
	
	@RequestMapping("update")
	public String demo3(Map<String,Object> map) {
		System.out.println("更新用户信息");
		User user = new User();
		user.setId(1006);
		user.setUsername("jake yun");
		map.put("map", userServiceImpl.updateById(user));
		return "index.jsp";
	}
	
	@RequestMapping("delete")
	public String demo4(Map<String,Object> map) {
		System.out.println("执行delete方法");
		map.put("mapObject", userServiceImpl.deleteById(1003));
		return "index.jsp";
	}
}
