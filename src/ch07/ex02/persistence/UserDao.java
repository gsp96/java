package ch07.ex02.persistence;

import ch07.ex02.domain.User;

public interface UserDao {
	public User selectUser();
	//쓰기 insert,update,delete  select 읽기
	
}
