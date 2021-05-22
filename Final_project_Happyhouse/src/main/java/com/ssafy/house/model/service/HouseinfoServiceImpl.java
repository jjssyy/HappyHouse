package com.ssafy.house.model.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.house.model.HouseinfoDto;
import com.ssafy.house.model.mapper.HouseinfoMapper;
@Service
public class HouseinfoServiceImpl implements HouseinfoService {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<HouseinfoDto> HouseinfoList(Map<String, String> map) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(HouseinfoMapper.class).HouseinfoList(map);
	}

}
