package ch07.ex03.dao;

import ch07.ex03.domain.User;

public class UserDaoImpl implements UserDao {
	private User user;//user를dependency한게 아닌 database가없어서 그냥 저장용으로 선언

	@Override
	public User selectUser() {
		return this.user;
	}

	@Override
	public void insertUser(User user) {
		this.user = user;		
	}
	

}
