package com.ssafy.house.model.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.house.model.DealDto;
import com.ssafy.house.model.mapper.DealMapper;

@Service
public class DealServiceImpl implements DealService {
	
	@Autowired
	private SqlSession sqlsession;

	@Override
	public List<DealDto> getListDeal(Map<String, String> map) {
		return sqlsession.getMapper(DealMapper.class).getListDeal(map);
	}

	@Override
	public DealDto getDeal(int no) {
		// TODO Auto-generated method stub
		return sqlsession.getMapper(DealMapper.class).getDeal(no);
	}
}
