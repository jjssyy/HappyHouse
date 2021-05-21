package com.ssafy.house.model.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssafy.house.model.UserDto;
import com.ssafy.house.model.mapper.UserMapper;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public UserDto login(UserDto userDto) {
		if(userDto.getUserid()== null || userDto.getUserpwd()==null)
			return null;
		return userMapper.login(userDto);
	}

	@Override
	public UserDto userInfo(String userid) {
		return userMapper.userInfo(userid);
	}

	@Override
	public int userRegister(UserDto userDto) {
		return userMapper.userRegister(userDto);
	}

	@Override
	public int userModify(UserDto userDto) {
		return userMapper.userModify(userDto);
	}

	@Override
	public int userDelete(String userid) {
		return userMapper.userDelete(userid);
	}

}
