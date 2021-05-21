package com.ssafy.house.model.service;

import com.ssafy.house.model.UserDto;

public interface UserService {
	public UserDto login(UserDto userDto);
	public UserDto userInfo(String userid);
	
	public int userRegister(UserDto userDto);
	public int userModify(UserDto userDto);
	public int userDelete(String userid);
}
