package ch07.ex06.case02;

public class Main {
	public static void main(String[] args) {
		Life alien1 = new Alien();
		Alien alien2 = new Alien();
		
		alien1.eat();//먹다.
		alien2.eat();//alien 먹다.
		
		alien1.shout();//Alien 먹다.
		alien2.shout();//Alien 먹다.
		
		Life.eat();//먹다.
		Alien.eat();//Alien 먹다.
	}
}