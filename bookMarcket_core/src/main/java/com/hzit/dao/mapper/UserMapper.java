package com.hzit.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.hzit.dao.entity.User;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface UserMapper {

	int insertUser(User user);

	int deleteUserByUserId(Integer userId);

	int updateUser(User user);

	Page<User> searchUserByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<User> searchUserByParams(@Param("map") Map<String, String> map);

} 
