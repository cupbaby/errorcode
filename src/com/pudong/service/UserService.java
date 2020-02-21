/**
 * 
 */
package com.pudong.service;


import java.util.List;

import com.pudong.pojo.User;


public interface UserService {

	List<User> show();
	
	int insertUser(List<User> user);
	
	int updateById(User user);
	
	int deleteById(int id);
}
