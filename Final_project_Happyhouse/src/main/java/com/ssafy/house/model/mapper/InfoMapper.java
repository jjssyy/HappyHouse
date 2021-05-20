package com.ssafy.house.model.mapper;

import java.util.List;

import com.ssafy.house.model.InfoDto;

public interface InfoMapper {
	
	List<InfoDto> getListInfo(String dong);
	InfoDto getInfo(int no);
	
}
