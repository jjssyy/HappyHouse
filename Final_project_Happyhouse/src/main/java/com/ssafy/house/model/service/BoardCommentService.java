package com.ssafy.house.model.service;

import java.util.List;

import com.ssafy.house.model.BoardCommentDto;

public interface BoardCommentService {
	List<BoardCommentDto> CommentList(int post_no);
	int writeComment(BoardCommentDto boardCommentDto);
	int modifyComment(BoardCommentDto boardCommentDto);
	int deleteComment(int no);
	
	int CommentCount(int post_no);
}
