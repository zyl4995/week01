package com.zyl.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyl.beans.Camp;
import com.zyl.beans.Heros;
import com.zyl.mapper.HerosMapper;
@Service
public class HerosServiceImpl implements HerosService{

	@Autowired
	private HerosMapper hMapper;
	
	
	public List<Heros> queryAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return hMapper.selectAll(map);
	}


	public List<Camp> queryCamp() {
		// TODO Auto-generated method stub
		return hMapper.selectCamp();
	}


	public int addHeros(Heros he) {
		// TODO Auto-generated method stub
		return hMapper.insertHeros(he);
	}


	public Heros queryOne(int hid) {
		// TODO Auto-generated method stub
		return hMapper.selectOne(hid);
	}


	public int changeHeros(Heros he) {
		// TODO Auto-generated method stub
		return hMapper.updateHeros(he);
	}


	public Heros queryHerosOne(Integer hid) {
		// TODO Auto-generated method stub
		return hMapper.selectHerosOne(hid);
	}

}
