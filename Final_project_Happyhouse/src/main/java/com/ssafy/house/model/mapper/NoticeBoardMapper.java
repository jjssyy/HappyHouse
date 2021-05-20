package com.ssafy.house.model.mapper;

import java.util.List;

import com.ssafy.house.model.NoticeBoardDto;

public interface NoticeMapper {
	public List<NoticeBoardDto> noticeList();
	public NoticeBoardDto getNotice(int no);
	public int writeNotice(NoticeBoardDto noticeBoardDto);
	public int modifyNotice(NoticeBoardDto noticeBoardDto);
	public int delete(int no);
}
