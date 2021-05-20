package com.ssafy.house.model.mapper;

import java.util.List;

import com.ssafy.house.model.NoticeBoardDto;

public interface NoticeBoardMapper {
	public List<NoticeBoardDto> noticeList();
	public NoticeBoardDto getNotice(int no);
	public int writeNotice(NoticeBoardDto noticeBoardDto);
	public int modifyNotice(NoticeBoardDto noticeBoardDto);
	public int deleteNotice(int no);
}
