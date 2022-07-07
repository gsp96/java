package ch06.ex03.case01;

public class Cat extends Animal{
	private int age;
	
	//생성자는 멤버가 아니다.
	public Cat(String name, int age) {
		//this.name = name;
		super(name);
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
}