package ch03.home.ex06;

import java.util.Scanner;

public class Adjust {
	public static void main(String[] args) {
		double x = 0, y = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("x: ");
		x = sc.nextDouble();
		
		y = x % 1;
		System.out.printf("%.1f", x - y);
	}
}