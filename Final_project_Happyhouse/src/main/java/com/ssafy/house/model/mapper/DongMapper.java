package com.ssafy.house.model.mapper;

import java.util.List;

import com.ssafy.house.model.DongDto;

public interface DongMapper {
	public List<DongDto> getListDong(String gugun);
	public DongDto getDong(String code);
	

}
