package ch07.ex02;

import ch05.ex06.case02.Console;
import ch07.ex02.persistence.UserDao;
import ch07.ex02.persistence.UserDaoImpl;
import ch07.ex02.presentation.UserIo;
import ch07.ex02.service.UserService;
import ch07.ex02.service.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao);
		UserIo userIo = new UserIo(userService);
		
		Console.info("앱을 시작합니다.");
		userIo.play();
		Console.info("앱을 종료합니다.");
	}
}