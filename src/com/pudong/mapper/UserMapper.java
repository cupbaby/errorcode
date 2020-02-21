/**
 * 
 */
package com.pudong.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.pudong.pojo.User;

public interface UserMapper {
	
	List<User> selectUser();
	
	int insertAllUser(List<User> user);
	
	int updateByUserId(User user);
	
	int deleteById(int id);
}
