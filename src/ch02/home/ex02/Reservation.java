package ch02.home.ex02;

import java.time.LocalDate;
import java.util.Scanner;

public class Reservation {
	public static void main(String[] args) {
		int year = 0,month = 0,date = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("공연 일자를 입력하세요.");
		
		System.out.printf("년:"); year = sc.nextInt();
		System.out.printf("월:"); month = sc.nextInt();
		System.out.printf("일:"); date = sc.nextInt();
		
		LocalDate showdate = LocalDate.of(year, month, date);
		
		System.out.println(showdate + " 공연을 예매했습니다.");
		//date2 = date2.minusDays(3);
		System.out.println(showdate.minusDays(3) + " 까지 환불이 가능 합니다.");	
	}
}
