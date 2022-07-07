package ch07.ex02.presentation;

import ch07.ex02.service.UserService;

public class UserIo implements Console{
	private UserService userService;
	
	public UserIo(UserService userService) {
		this.userService = userService;
	}
	
	public void play() {
		Console.info(userService.getUser());
	}

}
