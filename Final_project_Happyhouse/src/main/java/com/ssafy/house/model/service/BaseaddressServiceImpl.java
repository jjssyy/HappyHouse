package com.ssafy.house.model.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.house.model.BaseaddressDto;
import com.ssafy.house.model.mapper.BaseaddresssMapper;
@Service
public class BaseaddressServiceImpl implements BaseaddressService {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public BaseaddressDto getBaseaddress(String code) {
		return sqlSession.getMapper(BaseaddresssMapper.class).getBaseaddress(code);
	}

}
