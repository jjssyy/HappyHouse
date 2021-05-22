package com.ssafy.house.model.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.house.model.UserDto;
import com.ssafy.house.model.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public UserDto login(Map<String, String> map) {
		if(map.get("userid") == null || map.get("userpwd") == null)
			return null;
		return userMapper.login(map);
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
