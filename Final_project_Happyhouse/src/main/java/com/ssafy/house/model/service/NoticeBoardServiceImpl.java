package com.ssafy.house.model.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.house.model.NoticeBoardDto;
import com.ssafy.house.model.mapper.NoticeBoardMapper;

@Service
public class NoticeBoardServiceImpl implements NoticeBoardService {
	private static final Logger logger = LoggerFactory.getLogger(NoticeBoardServiceImpl.class);
	
	@Autowired
	NoticeBoardMapper noticeBoardMapper;
	
	@Override
	public List<NoticeBoardDto> noticeList() {
		return noticeBoardMapper.noticeList();
	}

	@Override
	public NoticeBoardDto getNotice(int no) {
		return noticeBoardMapper.getNotice(no);
	}

	@Override
	public int writeNotice(NoticeBoardDto noticeBoardDto) {
		return noticeBoardMapper.writeNotice(noticeBoardDto);
	}

	@Override
	public int modifyNotice(NoticeBoardDto noticeBoardDto) {
		return noticeBoardMapper.modifyNotice(noticeBoardDto);
	}

	@Override
	public int deleteNotice(int no) {
		return noticeBoardMapper.deleteNotice(no);
	}

}
