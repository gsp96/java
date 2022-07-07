package ch05.home.ex06.case02.re;

public class Main {
	public static void main(String[] args) {
		
		Console.inStr("문자를 입력하세요.");
		Console.inNum("숫자를 입력하세요.");

		Console.info("끝.");
	}
}
/*
과제]Console 을 고도화하라.
예외처리를 한다.
Console.inStr():한글자 이상 입력해야 한다.
Console.inNum(): 한자리 자연수를 입력해야 한다.
--

문자를 입력하세요.
>
ERROR] 한글자 이상 입력하세요.
문자를 입력하세요.
>hello
숫자를 입력하세요.
ERROR] 한자리 자연수를 입력하세요.
숫자를 입력하세요.
>1
끝.
*/