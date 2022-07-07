package ch05.ex07.case02;

public class Stack {
	public static void first() {
		System.out.println("Stack.first() 시작.");
		int a = 0;
		Stack.second();
		System.out.println("Stack.first() 시작.");
	}
	
	public static void second() {
		System.out.println("Stack.second() 시작.");
		int a = 0;
		System.out.println("Stack.second() 끝.");
	}

}
