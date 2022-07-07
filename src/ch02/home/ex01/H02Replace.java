package ch02.home.ex01;

import java.util.Scanner;

public class H02Replace {
	public static void main(String [] args) {
		int a=0,b=0,temp=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("a의 값을 입력해 주십시오");
		a=sc.nextInt();
		System.out.println("b의값을 입력해 주십시오");
		b=sc.nextInt();

		temp=a;
		a=b;
		b=temp;
		
		System.out.printf("a의 값은 %d b의 값은 %d 입니다",a,b);
	}
}