package ch07.home.hr.presentation;

import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	static int inNum(String msg) {
		System.out.print(msg + "\n> ");
		int num = sc.nextInt();sc.nextLine();
		return num;
	}
	
	static String inStr(String msg) {
		System.out.print(msg + "\n> ");
		String str = sc.nextLine().trim();
		return str;
	}

}
