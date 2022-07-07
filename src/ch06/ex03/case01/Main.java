package ch06.ex03.case01;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat("야코미", 3);
		
		//과제] 이름과 나이 없이 고양이를 생성하라.
		
		cat = new Cat(null, 0);
		
		System.out.println(cat.getName() + ", " + cat.getAge());
	}
}