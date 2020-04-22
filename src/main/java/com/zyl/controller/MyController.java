package com.zyl.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zyl.beans.Camp;
import com.zyl.beans.Heros;
import com.zyl.service.HerosService;

@Controller
public class MyController {

	@Autowired
	private HerosService hService;
	
	//全查,分页,条件
	@RequestMapping("list")
	public String list(Model model , @RequestParam(defaultValue="1")Integer pageNum,
			Integer cid , Double beginPrice , Double endPrice , Integer status) {
		//分页
		int pageSize = 3;
		PageHelper.startPage(pageNum, pageSize);
		
		Map<String, Object> map = new HashMap<String , Object>();
		map.put("cid", cid);
		map.put("beginPrice", beginPrice);
		map.put("endPrice", endPrice);
		map.put("status", status);
		List<Heros> list = hService.queryAll(map );
		
		//开始分页
		PageInfo<Heros> plist = new PageInfo<Heros>(list);
		
		//存储到作用域
		model.addAttribute("plist", plist);
		return "list";
	}
	
	//查询所有的阵营
	@RequestMapping("queryCamp")
	@ResponseBody
	public List<Camp> camp() {
		List<Camp> list = hService.queryCamp();
		
		return list;
	}
	
	//添加
	@RequestMapping("add")
	public String add(Heros he){
		int i = hService.addHeros(he);
		
		if(i>0) {
			return "forward:list";
		} else {
			return "add";
		}
	}
	
	//根据id查询一条回显数据
	@RequestMapping("queryOne")
	@ResponseBody
	public Heros sayOne(Integer hid) {
		Heros one = hService.queryOne(hid);
		
		return one;
	}
	
	//购买
	@RequestMapping("update")
	public String update(Heros he) {
		int i = hService.changeHeros(he);
		
		if(i > 0) {
			return "forward:list";
		} else {
			return "update";
		}
	}
	
	//详情
	@RequestMapping("one")
	
	public String one(Integer hid , Model model) {
		Heros one = hService.queryHerosOne(hid);
		model.addAttribute("one", one);
		return "show";
	}
}
