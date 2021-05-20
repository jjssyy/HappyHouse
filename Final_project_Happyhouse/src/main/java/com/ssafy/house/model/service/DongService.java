package com.ssafy.house.model.service;

import java.util.List;

import com.ssafy.house.model.DongDto;

public interface DongService {
	public List<DongDto> getListDong(String gungu);
	public DongDto getDong(int no);
	
}
