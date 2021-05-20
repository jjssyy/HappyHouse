package com.ssafy.house.model.mapper;

import java.util.List;
import java.util.Map;

import com.ssafy.house.model.DealDto;

public interface DealMapper {
	
	public List<DealDto> getListDeal(Map<String, String> map);
	public DealDto getDeal(int no);
}
