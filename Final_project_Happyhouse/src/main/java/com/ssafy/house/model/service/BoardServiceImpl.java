package com.ssafy.house.model.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssafy.house.model.BoardDto;
import com.ssafy.house.model.mapper.BoardMapper;

public class BoardServiceImpl implements BoardService {
	private static final Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public List<BoardDto> postList() {
		return boardMapper.postList();
	}

	@Override
	public BoardDto getPost(int no) {
		return boardMapper.getPost(no);
	}

	@Override
	public int writePost(BoardDto boardDto) {
		return boardMapper.writePost(boardDto);
	}

	@Override
	public int modifyPost(BoardDto boardDto) {
		return boardMapper.modifyPost(boardDto);
	}

	@Override
	public int deletePost(int no) {
		return boardMapper.deletePost(no);
	}

}
