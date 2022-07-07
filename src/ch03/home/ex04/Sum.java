package ch03.home.ex04;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int a = 0,b = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("a: ");
		a = sc.nextInt();
		System.out.printf("b: ");
		b = sc.nextInt();
		
		System.out.printf("\n%d + %d = %d", a, b, a+b);
	}
}
