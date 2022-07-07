package ch07.ex02.persistence;

import ch07.ex02.domain.User;

public class UserDaoImpl implements UserDao{
	
	@Override
	public User selectUser() {
		return new User("최한석");
	}
}