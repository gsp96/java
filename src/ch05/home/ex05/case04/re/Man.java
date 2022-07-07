package ch05.home.ex05.case04.re;

import java.time.LocalDate;

public class Man {
	private String name;
	private int age;
	private LocalDate birthDay;
	
	public void eat() {}
	public void sing() {}
	public void run() {}
		
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}
}