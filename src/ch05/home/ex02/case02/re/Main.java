package ch05.home.ex02.case02.re;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Paper paper = new Paper();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메세지: ");
		paper.setMsg(sc.nextLine());
		System.out.printf("작성자명: ");
		paper.setWriterName(sc.nextLine());
		
		System.out.printf("\n%s from %s", paper.getMsg(), paper.getWriterName());
		
	}
}

/*
 * 종이에 메세지와 작성자명을 기록하라.
 */