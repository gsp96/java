package ch03.home.ex09;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		int kor = 0, eng = 0, math = 0, tot = 0;	
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("국어: ");
		kor = sc.nextInt();
		System.out.printf("영어: ");
		eng = sc.nextInt();
		System.out.printf("수학: ");
		math = sc.nextInt();
		System.out.println();
		
		tot = kor + eng + math;
		double avg = tot / 3.0;
		char grade = avg >= 90 ? 'A' : (avg >= 80 ? 'B' : 'C');
		
		System.out.printf("총점: %d\n평균: %.1f\n 학점: %c",tot , avg, grade);
	}
}