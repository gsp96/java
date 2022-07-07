package ch05.home.ex05.case08.re;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Ball ball = new Ball();
		
		person1.setName("최한석");
		person2.setName("한아름");
		person3.setName("양승일");
		
		person3.shoot(person2.pass(person1.pass(ball)));
	}
}