package com.ssafy.house.model.service;

import java.util.List;

import com.ssafy.house.model.BoardDto;

public interface BoardService {
	List<BoardDto> postList();
	BoardDto getPost(int no);
	int writePost(BoardDto boardDto);
	int modifyPost(BoardDto boardDto);
	int deletePost(int no);
}
