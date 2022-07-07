package ch05.ex08.case02;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		User user = new User("최한석", 25, LocalDate.now());
		
		User user2 = new User();
		user2.setName("최한일");
		user2.setAge(25);
		user2.setRegDate(LocalDate.now());
	}

}
