package com.sl.service.user;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sl.dao.user.UserMapper;
import com.sl.pojo.User;

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

	@Override
	public int totalCount(User user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.totalCount(user);
	}

	@Override
	public List<User> listUserByPage(User user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.listUserByPage(user);
	}

	@Override
	public User getUserById(User user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getUserById(user);
	}

	@Override
	public int removeUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.removeUser(user);
	}

	@Override
	public List<User> listUserBySearch(User user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.listUserBySearch(user);
	}

	@Override
	public int updateUserRole(User user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.updateUserRole(user);
	}

	@Override
	public int delUserPic(User user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.delUserPic(user);
	}

}
