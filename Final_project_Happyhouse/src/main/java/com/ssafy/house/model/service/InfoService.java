package com.ssafy.house.model.service;

import java.util.List;

import com.ssafy.house.model.InfoDto;

public interface InfoService {
	
	List<InfoDto> getListInfo(String dong);
	InfoDto getInfo(int no);
	
}
