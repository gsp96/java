package ch07.ex04.case01;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		int sum = 0;
		double avg = 0.0;
		int[] scores = {100, 37, 75, 90};
		
		for(int score: scores) sum += score;
		
		//과제] 아래 코드를 softcoding 으로 변경하라.
		
		avg = 1.0 * sum / scores.length;
		
		System.out.printf("%d %.1f", sum, avg);
	}

}
