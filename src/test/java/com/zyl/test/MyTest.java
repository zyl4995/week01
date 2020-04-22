package com.zyl.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zyl.beans.Heros;
import com.zyl.service.HerosService;
import com.zyl.service.HerosServiceImpl;


public class MyTest {

//	(6)其中英雄添加要做单元测试（核心）(5分)
	@Test
	public void addTest() {
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		HerosService hes = (HerosService) app.getBean("herosServiceImpl");
		
		Heros he = new Heros();
		he.setCname("aaa");
		int i = hes.addHeros(he );
		
		if(i>0) {
			System.out.println("添加成功");
		} else {
			System.out.println("add no");
					
		}
	}
//	(7)其中英雄查看详情要做单元测试（核心）(5分)
	public void oneTest() {
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HerosService hes = (HerosService) app.getBean("herosServiceImpl");
		
		Integer hid = 1;
		Heros one = hes.queryHerosOne(hid );
		
		System.out.println(one);
	}
//	(8)其中英雄修改要做单元测试（核心）(5分)
	public void updateTest() {
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HerosService hes = (HerosService) app.getBean("herosServiceImpl");
		
		Heros he = new Heros();
		he.setCid(1);
		he.setHname("hhh");
		int i = hes.changeHeros(he );
		if(i>0) {
			System.out.println("修改成功");
		} else {
			System.out.println("修改 no");
					
		}
	}
}
