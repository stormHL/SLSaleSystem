package com.sl.service.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sl.dao.user.UserMapper;
import com.sl.pojo.user.User;

@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userMapper;

	@Override
	public User getLoginUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getLoginUser(user);
	}

	@Override
	public int saveUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.saveUser(user);
	}

	@Override
	public int loginCodeIsExit(User user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.loginCodeIsExit(user);
	}

	@Override
	public int updateUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.updateUser(user);
	}

}
