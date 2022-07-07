package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		int score = 0;
		String grade = "";
		//String plus = "+";
		//String minus = "-";
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("점수: ");
		score = sc.nextInt();
		
		/*if(score >= 90) grade = "A";
		else if(score >= 80) grade = "B";
		else grade = "C";
		
		if(((score % 10) >= 8) && ((score /10) > 6)) grade = grade + plus ;
		else if(((score % 10) >= 4) && ((score /10) > 6));
		else if(((score % 10) >= 0)&& ((score /10) > 6)) grade = grade + minus;*/

		if(score >= 90) {
			grade = "A";
			if(score >= 98) grade += "+";
			else if(score <94) grade += "-";
		}
		else if(score >= 80) {
			grade = "B";
			if(score >= 88) grade += "+";
			else if(score <84) grade += "-";
		}
		else grade = "C";
		
		
		System.out.println(grade);
		
		
	}
}