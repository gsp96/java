package ch07.ex02.service;

import ch07.ex02.domain.User;
import ch07.ex02.persistence.UserDao;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userdao) {
		this.userDao = userdao;
	}

	@Override
	public User getUser() {
		return userDao.selectUser();
	}

}
