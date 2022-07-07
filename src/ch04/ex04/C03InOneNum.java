package ch04.ex04;

import java.util.Scanner;

public class C03InOneNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		String errMsg = "ERROR] 한자리 자연수를 입력하세요.";
		boolean isGood = false;
		/*do {
			System.out.print("입력: ");
			input =sc.next();
			if(!(49 <= (int)input.charAt(0) && (int)input.charAt(0)<= 57))
				System.out.println(errMsg);
			else if(input.length() >= 2)
				System.out.println(errMsg);
		}while(!(input.length() < 2) || !(49 <= (int)input.charAt(0) && (int)input.charAt(0)<= 57));
		System.out.println("끝.");*/
		  do {
			System.out.print("입력: ");
			input =sc.nextLine();
			if((input.length() < 2) && ('0' < input.charAt(0) && input.charAt(0) <= '9'))
				isGood = true;
			else System.out.println(errMsg);
		}while(!isGood);
		System.out.println("끝.");
		
	}

}
//과제1] 10 이상의 자연수, 또는 문자가 입력 되는 경우를 예외 처리하라.
//과제2] 10 이상의 자연수를 참으로 인지하는 bug 를 해결하라.