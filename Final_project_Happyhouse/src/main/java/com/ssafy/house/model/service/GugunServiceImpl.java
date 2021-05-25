package com.ssafy.house.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.house.model.GugunDto;
import com.ssafy.house.model.mapper.GugunMapper;
@Service
public class GugunServiceImpl implements GugunService {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<GugunDto> getListGugun(String sido) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(GugunMapper.class).getListGugun(sido);
	}

	@Override
	public GugunDto getGugun(String gu) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(GugunMapper.class).getGugun(gu);
	}
}
