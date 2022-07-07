package ch03.ex05;

public class Overflow {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 1_000_000;
		
		long c = a + b;
		System.out.println(c);//2000000
		
		c = a * b;
		System.out.println(c);//-727379968
		
		c = (long)a * b;
		System.out.println(c);//1000000000000, 1조
		
		int x = a * b / a;	  //-727
		x = a / b * a;		  //1000000
		System.out.println(x);
	}
}