package ch05.home.ex06.case02.answer;

import java.util.Scanner;

public class Console {
	private static Scanner sc;

	static {
		sc = new Scanner(System.in);
	}
	
	public static String inStr(String msg) {
		boolean isGood = false;
		String val;
		
		do{
			Console.inMsg(msg);
			val = sc.nextLine().trim();
			if(val.length() > 1) isGood = true;
			else Console.err("한글자 이상 입력하세요.");
		}while(!isGood);
		
		return val;
	}
	
	public static int inNum(String msg) {
		boolean isGood = false;
		String valStr;
		int num;
		
		do {
			Console.inMsg(msg);
			valStr = sc.nextLine().trim();
			if(valStr.length() == 1 && '0' < valStr.charAt(0) && valStr.charAt(0) <= '9') isGood = true;
			else Console.err("한자리 자연수를 입력하세요.");
		}while(!isGood);
		
		num = Integer.parseInt(valStr);
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