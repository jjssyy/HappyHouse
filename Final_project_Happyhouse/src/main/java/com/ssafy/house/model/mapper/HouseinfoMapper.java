package com.ssafy.house.model.mapper;

import java.util.List;

import com.ssafy.house.model.HouseinfoDto;

public interface HouseinfoMapper {
	public List<HouseinfoDto> HouseinfoList(String code); 
}
