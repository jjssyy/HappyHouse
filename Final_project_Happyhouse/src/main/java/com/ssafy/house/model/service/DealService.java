package com.ssafy.house.model.service;

import java.util.List;
import java.util.Map;

import com.ssafy.house.model.DealDto;

public interface DealService {
	
	public List<DealDto> getListDeal(Map<String, String> map);
	public DealDto getDeal(int no);
}
