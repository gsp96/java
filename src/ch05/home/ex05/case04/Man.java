package ch05.home.ex05.case04;

import java.time.LocalDate;

/*public class Man {
	private String name;
	private int age;
	private String birthDay;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public void waitFood() {}
	public void sing() {}
	public void eat(String taste) {}
	public void run() {}
	public void pay(boolean a) {}
}*/
public class Man{
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