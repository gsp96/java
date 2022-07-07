package ch04.home.ex02;

import java.util.Scanner;

public class H03Kawibawibo {
	public static void main(String[] args) {
		int youSelect = 0, meSelect = 0,  result = 0 ;
		String You ="";
		String Me = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1.가위 ,2.바위 3.보\n> ");
		youSelect = sc.nextInt();
		meSelect = (int)(Math.random() * 3) + 1;
		
		switch(youSelect) {
		case 1: You = "가위"; break;
		case 2: You = "바위"; break;
		case 3: You = "보"; break;
	}
	switch(meSelect) {
		case 1: Me = "가위"; break;
		case 2: Me = "바위"; break;
		case 3: Me = "보"; break;
	}
	
		
		System.out.println("You: "+You);
		System.out.println("Me: "+Me);
		
		if( (youSelect == 1 && meSelect == 3)||	(youSelect == 2 && meSelect == 1)||	(youSelect == 3 && meSelect == 2))
			System.out.println("You win.");
		else if( (youSelect == 1 && meSelect == 2)|| (youSelect == 2 && meSelect == 3)|| (youSelect == 3 && meSelect == 1)) 
				System.out.println("You lose.");
		else System.out.println("Fair.");
		}	
}

/* 
 * 앱과 가위 바위보를 한다.
 * 나올 수 있는 결과 You win. You lose. Fair.
 * 1.가위  ,2.바위, 3.보
 * > 1
 * You: 가위
 * Me: 보
 * You win.
 * */
 