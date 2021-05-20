package com.ssafy.house.model.service;

import java.util.List;

import com.ssafy.house.model.NoticeBoardDto;

public interface NoticeBoardService {
	List<NoticeBoardDto> noticeList();
	NoticeBoardDto getNotice(int no);
	int writeNotice(NoticeBoardDto noticeBoardDto);
	int modifyNotice(NoticeBoardDto noticeBoardDto);
	int delete(int no);
}
