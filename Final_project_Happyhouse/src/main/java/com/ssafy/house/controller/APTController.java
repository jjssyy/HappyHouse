package com.ssafy.house.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.house.model.DealDto;
import com.ssafy.house.model.GugunDto;
import com.ssafy.house.model.SidoDto;
import com.ssafy.house.model.service.DealService;
import com.ssafy.house.model.service.GugunService;
import com.ssafy.house.model.service.SidoService;

@RestController
public class APTController {
	
	@Autowired
	public DealService deal;
	
	@Autowired
	public SidoService sido;
	
	@Autowired
	public GugunService gugun;
	
	@RequestMapping(value = "/list", method = RequestMethod.POST, headers = { "Content-type=application/json" })
	public List<DealDto> DealList(@RequestBody Map<String,String> map) {
		return deal.getListDeal(map);
	}
	
	@RequestMapping(value = "/sido", method = RequestMethod.POST, headers = { "Content-type=application/json" })
	public List<SidoDto> SidoList() {
		return sido.get_sidocode();
	}
	@RequestMapping(value = "/gugun", method = RequestMethod.POST, headers = { "Content-type=application/json" })
	public List<GugunDto> GugunList(@RequestBody Map<String,String> map) {
		String sido=map.get("sido_code");
		
		return gugun.getListGugun(sido);
	}
	
}