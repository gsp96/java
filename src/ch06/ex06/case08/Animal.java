package ch06.ex06.case08;

public interface Animal {
	public default void eat() {
		System.out.println("입으로 먹다.");
	}
	
	void move();
}