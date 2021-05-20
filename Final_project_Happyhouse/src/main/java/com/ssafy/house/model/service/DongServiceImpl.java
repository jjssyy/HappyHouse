package com.ssafy.house.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.house.model.DongDto;
import com.ssafy.house.model.mapper.DongMapper;

@Service
public class DongServiceImpl implements DongService {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<DongDto> getListDong(String gungu) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(DongMapper.class).getListDong(gungu);
	}

	@Override
	public DongDto getDong(int no) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(DongMapper.class).getDong(no);
	}
}
