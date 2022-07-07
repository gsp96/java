package ch02.home.ex03;

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {
		int a = 0;
		String str = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("문자: ");
		
		str = sc.next();
		a = (int)str.charAt(0);
		
		System.out.printf("%s의 unicode는 %d 입니다.",str ,a);
	}
}
