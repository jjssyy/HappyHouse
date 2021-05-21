package com.ssafy.house.model.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.house.model.BoardCommentDto;
import com.ssafy.house.model.mapper.BoardCommentMapper;

@Service
public class BoardCommentServiceImpl implements BoardCommentService {
	private static final Logger logger = LoggerFactory.getLogger(BoardCommentServiceImpl.class);
	
	@Autowired
	private BoardCommentMapper boardCommentMapper;
	
	@Override
	public List<BoardCommentDto> commentList(int post_no) {
		return boardCommentMapper.CommentList(post_no);
	}

	@Override
	public int writeComment(BoardCommentDto boardCommentDto) {
		return boardCommentMapper.writeComment(boardCommentDto);
	}

	@Override
	public int modifyComment(BoardCommentDto boardCommentDto) {
		return boardCommentMapper.modifyComment(boardCommentDto);
	}

	@Override
	public int deleteComment(int no) {
		return boardCommentMapper.deleteComment(no);
	}

	@Override
	public int CommentCount(int post_no) {
		return boardCommentMapper.CommentCount(post_no);
	}

}
