package com.zyl.service;

import java.util.List;
import java.util.Map;

import com.zyl.beans.Camp;
import com.zyl.beans.Heros;

public interface HerosService {

	//全查,分页,条件查询
	public List<Heros> queryAll(Map<String , Object>map);
	
	//查询所有的阵营
	public List<Camp> queryCamp();
	
	//添加
	public int addHeros(Heros he);
	
	//根据id查询一条回显数据
	public Heros queryOne(int hid);

	//购买
	public int changeHeros(Heros he);
	
	//详情
	public Heros queryHerosOne(Integer hid);
}
