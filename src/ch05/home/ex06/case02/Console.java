package ch05.home.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;

	static {
		sc = new Scanner(System.in);
	}
	
	public static String inStr(String msg) {
		boolean isGood = false;
		String msg2;
		
		do{
			Console.inMsg(msg);
			msg2 = sc.nextLine().trim();
			if(msg2.length() > 1) isGood = true;
			else Console.err("한글자 이상 입력하세요.");
		}while(!isGood);
		
		return msg2;
	}
	
	public static int inNum(String msg) {
		boolean isGood = false;
		String numStr;
		int num;
		
		do {
			Console.inMsg(msg);
			numStr = sc.nextLine().trim();
			if(numStr.length() == 1 && '0' < numStr.charAt(0) && numStr.charAt(0) <= '9') isGood = true;
			else Console.err("한자리 자연수를 입력하세요.");
		}while(!isGood);
		
		num = Integer.parseInt(numStr);
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