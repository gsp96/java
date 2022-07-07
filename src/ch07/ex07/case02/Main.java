package ch07.ex07.case02;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("Human say.");
		human.say();
		Human.walk();
		//human.walk();
		human.sleep();
		
		human = new Student();
		human.say();//Student say.
		//human.walk();
		human.sleep();
	}

}
