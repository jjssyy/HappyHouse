package com.ssafy.house.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ssafy.house.model.UserDto;
import com.ssafy.house.model.service.UserService;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/user")
public class UserController {
	public static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody Map<String, String> map) {
		System.out.println("로그인");
		UserDto user = userService.login(map);
		if(user != null) {
			return new ResponseEntity<String>("success",HttpStatus.OK);
		}
		return new ResponseEntity<String>("Fail",HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/info/{userid}")
	public UserDto userInfo(@PathVariable("userid") String userid) {
		System.out.println("여기로왔따유저용");
		return userService.userInfo(userid);
	}
	                                                                                                                              
	@PostMapping("/register")
	public ResponseEntity<String> userRegister(@RequestBody UserDto userDto){
		if(userService.userRegister(userDto)==1) {
			return new ResponseEntity<String>("success",HttpStatus.OK);
		}
		return new ResponseEntity<String>("Fail",HttpStatus.NO_CONTENT);
	}
	
	@PutMapping("info/{userid}")
	public ResponseEntity<String> userModify(@RequestBody UserDto userDto){
		if(userService.userModify(userDto)==1) {
			return new ResponseEntity<String>("success",HttpStatus.OK);
		}
		return new ResponseEntity<String>("Fail",HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("info/{userid}")
	public ResponseEntity<String> userDelete(@PathVariable String userid){
		if(userService.userDelete(userid)==1) {
			return new ResponseEntity<String>("success",HttpStatus.OK);
		}
		return new ResponseEntity<String>("Fail",HttpStatus.NO_CONTENT);
	}
}
