package com.zyl.mapper;

import java.util.List;
import java.util.Map;

import com.zyl.beans.Camp;
import com.zyl.beans.Heros;

public interface HerosMapper {

	//全查,分页,条件查询
	public List<Heros> selectAll(Map<String , Object>map);
	
	//查询所有的阵营
	public List<Camp> selectCamp();
	
	//添加
	public int insertHeros(Heros he);

	//根据id查询一条回显数据
	public Heros selectOne(int hid);
	
	//购买
	public int updateHeros(Heros he);
	
	//详情
	public Heros selectHerosOne(Integer hid);
}
