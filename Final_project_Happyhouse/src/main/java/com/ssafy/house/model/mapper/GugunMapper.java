package com.ssafy.house.model.mapper;

import java.util.List;

import com.ssafy.house.model.GugunDto;

public interface GugunMapper {

	public List<GugunDto> getListGugun(String sido);
	public GugunDto getGugun(int no);
}
