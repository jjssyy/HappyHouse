package com.ssafy.house.model.mapper;

import com.ssafy.house.model.UserDto;

public interface UserMapper {
	public UserDto login(UserDto userDto);
	public UserDto userInfo(String userid);
	
	public int userRegister(UserDto userDto);
	public int userModify(UserDto userDto);
	public int userDelete(String userid);
}
