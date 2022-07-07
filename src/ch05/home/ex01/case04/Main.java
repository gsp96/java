package ch05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		
		System.out.print("이름: ");
		user.setName(sc.nextLine());
		
		System.out.print("나이: ");
		user.setAge(sc.nextInt());
		user.setMememberSince(LocalDate.now());
		
		System.out.printf("\n이름: %s\n나이: %d \n", user.getName(), user.getAge());
		System.out.printf("가입일: " + user.getMemberSince());
		
	}

}
