package com.ssafy.house.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.house.model.DealDto;
import com.ssafy.house.model.DongDto;
import com.ssafy.house.model.GugunDto;
import com.ssafy.house.model.HouseinfoDto;
import com.ssafy.house.model.SidoDto;
import com.ssafy.house.model.service.DealService;
import com.ssafy.house.model.service.DongService;
import com.ssafy.house.model.service.GugunService;
import com.ssafy.house.model.service.HouseinfoService;
import com.ssafy.house.model.service.SidoService;

@RestController
@CrossOrigin("*")
public class APTController {
	
	@Autowired
	public DealService deal;
	
	@Autowired
	public SidoService sido;
	
	@Autowired
	public GugunService gugun;
	
	@Autowired
	public DongService dong;
	
	@Autowired
	public HouseinfoService house;
	
	@RequestMapping(value = "/list", method = RequestMethod.POST, headers = { "Content-type=application/json" })
	public List<DealDto> DealList(@RequestBody Map<String,String> map) {
		System.out.println(map.get("value"));
		return deal.getListDeal(map);
	}
	
//	@PostMapping(value="/donginfo", headers = { "Content-type=application/json" })
//	public DongDto donginfo(@RequestBody Map<String,String> map) {
//		System.out.println("=================시작==================");
//		String code=map.get("code");
//		System.out.println(code);
//		return dong.getDong(code);
//	}
	
	@PostMapping(value="/houseinfo", headers = { "Content-type=application/json" })
	public List<HouseinfoDto> houseinfolist(@RequestBody Map<String,String> map){
		String dongname=map.get("dongname");
		return house.HouseinfoList(map);
	}
	
	@RequestMapping(value = "/sido", method = RequestMethod.POST, headers = { "Content-type=application/json" })
	public List<SidoDto> SidoList() {
		return sido.get_sidocode();
	}
	@RequestMapping(value = "/gugun", method = RequestMethod.POST, headers = { "Content-type=application/json" })
	public List<GugunDto> GugunList(@RequestBody Map<String,String> map) {
		String sido=map.get("sido_code");
		System.out.println(sido);
		sido=sido.substring(0,2);
		return gugun.getListGugun(sido);
	}
	
	//test
//	@RequestMapping(value = "/gugun", method = RequestMethod.POST, headers = { "Content-type=application/json" })
//	public List<GugunDto> GugunList(@RequestBody String sido_code) {
//		String sido=sido_code;
//		System.out.println(sido);
//		sido=sido.substring(0,2);
//		return gugun.getListGugun(sido);
//	}
//	
	
	
	
	
	@RequestMapping(value = "/dong", method = RequestMethod.POST, headers = { "Content-type=application/json" })
	public List<DongDto> dongList(@RequestBody Map<String,String> map) {
		String gugun=map.get("gugun_code");
		gugun=gugun.substring(0,5);
		System.out.println(gugun);
		return dong.getListDong(gugun);
	}
	
	
}