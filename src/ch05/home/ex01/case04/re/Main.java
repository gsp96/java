package ch05.home.ex01.case04.re;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		User user = new User();
		Scanner sc= new Scanner(System.in);
		String name;
		int age;
		LocalDate regDate;
		
		System.out.print("이름: ");
		name = sc.nextLine();
		System.out.print("나이: ");
		age = sc.nextInt();
		System.out.println();
		regDate = LocalDate.now();
		
		user.setAge(age);
		user.setName(name);
		user.setRegDate(regDate);
		
		System.out.printf("이름: %s\n나이: %d\n가입일:%s", user.getName(), user.getAge(), user.getRegDate());
	}
}