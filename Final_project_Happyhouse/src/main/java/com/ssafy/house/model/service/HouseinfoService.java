package com.ssafy.house.model.service;

import java.util.List;
import java.util.Map;

import com.ssafy.house.model.HouseinfoDto;

public interface HouseinfoService {
	public List<HouseinfoDto> HouseinfoList(Map<String, String> map); 
	public List<HouseinfoDto> AllHouseinfoList(String code);

}
