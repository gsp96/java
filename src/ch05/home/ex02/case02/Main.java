package ch05.home.ex02.case02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Paper msg = new Paper();
		
		System.out.print("메세지:");
		msg.setMsg(sc.nextLine());
		System.out.print("작성자명:");
		msg.setWriterName(sc.nextLine());
		
		System.out.printf("%s from %s", msg.getMsg(), msg.getWriterName());
	}

}
/*종이에 메세지와 작성자명을 기록한다.
--
메세지:hello
작성자명:terry

hello from terry
*/