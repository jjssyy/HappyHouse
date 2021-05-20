package com.ssafy.house.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.house.model.SidoDto;
import com.ssafy.house.model.mapper.SidoMapper;
@Service
public class SidoServiceImpl implements SidoService {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<SidoDto> get_sidocode() {
		return sqlSession.getMapper(SidoMapper.class).get_sidocode();
	}

}
