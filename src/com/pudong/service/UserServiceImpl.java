/**
 * 
 */
package com.pudong.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pudong.mapper.UserMapper;
import com.pudong.pojo.User;
@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;
	@Override
	public List<User> show() {

		return userMapper.selectUser();
	}

	@Override
	public int insertUser(List<User> user) {

		return userMapper.insertAllUser(user);
	}

	@Override
	public int updateById(User user) {

		return userMapper.updateByUserId(user);
	}

	@Override
	public int deleteById(int id) {

		return userMapper.deleteById(id);
	}

}
