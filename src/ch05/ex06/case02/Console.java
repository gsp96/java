package ch05.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	static {//static멤버변수 초기화 하는법 byte code가 로딩될때 초기화 된다.
		sc = new Scanner(System.in);
	}
	/*
	public static void setSc(Scanner sc) {
		Console.sc = sc;
	}
	*/
	public static String inStr(String msg) {
		Console.inMsg(msg);
		return sc.nextLine().trim();//trim() 입력데이터의 머리랑 꼬리부분의space를 삭제한다.
	}
	
	public static int inNum(String msg) {
		Console.inMsg(msg);
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	
	public static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}

}