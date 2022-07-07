package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		
		b = true && true;//true
		b = (2 > 1) && (2 > 1);//true
		b = 2 < 1 && 2 > 1;//false
		b = 2 < 1 || 2 > 1;//true
		b = 2 < 1 || 2 < 1;//false
		System.out.println(b);
		
		int x = 0;
		int y = 0;
		b = ++x < 0 && ++y < 0;//false   &&의 좌항을 계산해서 false가 나와서 계산이멈춰서 우항은 계산을 안한다.
		
		x = 0;
		y = 0;
		b = ++x > 0 & ++y > 0;//x: 1 y: 1 b: false
		
		x = 0;
		y = 0;
		b = ++x > 0 || ++y > 0;//x: 1 y: 0 b: true
		
		x = 0;
		y = 0;
		b = ++x > 0 | ++y > 0;//x: 1 y: 1 b: true
		System.out.printf("x: %d y: %d b: %b",x,y,b);
	}

}
