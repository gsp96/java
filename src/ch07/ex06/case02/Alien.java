package ch07.ex06.case02;

public class Alien extends Life{
	//@Override
	public static void eat() {//static method는 override되지 않는다.
		System.out.println("Alien 먹다.");
	}
	@Override
	public void shout() {
		System.out.println("Alien 먹다.");
	}

}
