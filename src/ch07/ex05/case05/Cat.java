package ch07.ex05.case05;

public class Cat {
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println(this.name + ", 먹다.");
	}
	
	@Override
	public String toString() {
		return this.name;
	}

}
