package com.ssafy.house.model.mapper;

import java.util.List;

import com.ssafy.house.model.BoardCommentDto;

public interface BoardCommentMapper {
	//댓글 작성, 수정, 삭제, 리스트
	public List<BoardCommentDto> CommentList(int post_no);
	public int writeComment(BoardCommentDto boardCommentDto);
	public int modifyComment(BoardCommentDto boardCommentDto);
	public int deleteComment(int no);
	//댓글 개수
	public int CommentCount(int post_no);
}
