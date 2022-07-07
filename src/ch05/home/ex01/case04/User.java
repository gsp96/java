package ch05.home.ex01.case04;

import java.time.LocalDate;

public class User {
	private String name;
	private int age;
	private LocalDate memberSince;
	
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMememberSince(LocalDate memberSince) {
		this.memberSince = memberSince;
	}
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	public LocalDate getMemberSince() {
		return this.memberSince;
	}
}