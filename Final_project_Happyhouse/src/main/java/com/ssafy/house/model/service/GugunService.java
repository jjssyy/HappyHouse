package com.ssafy.house.model.service;

import java.util.List;

import com.ssafy.house.model.GugunDto;

public interface GugunService {

	public List<GugunDto> getListGugun(String sido);
	public GugunDto getGugun(int no);
	
}
