package com.ssafy.house.model.service;

import java.util.Map;

import com.ssafy.house.model.UserDto;

public interface UserService {
	public UserDto login(Map<String, String> map);
	public UserDto userInfo(String userid);
	
	public int userRegister(UserDto userDto);
	public int userModify(UserDto userDto);
	public int userDelete(String userid);
}
