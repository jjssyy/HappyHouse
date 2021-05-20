package com.ssafy.house.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.house.model.InfoDto;
import com.ssafy.house.model.mapper.InfoMapper;
@Service
public class InfoServiceImpl implements InfoService {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<InfoDto> getListInfo(String dong) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(InfoMapper.class).getListInfo(dong);
	}

	@Override
	public InfoDto getInfo(int no) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(InfoMapper.class).getInfo(no);
	}
}
