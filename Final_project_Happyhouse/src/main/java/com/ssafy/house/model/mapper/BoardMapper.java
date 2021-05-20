package com.ssafy.house.model.mapper;

import java.util.List;

import com.ssafy.house.model.BoardDto;

public interface BoardMapper {
	public List<BoardDto> postList();
	public BoardDto getPost(int no);
	public int writePost(BoardDto boardDto);
	public int modifyPost(BoardDto boardDto);
	public int deletePost(int no);
}
