package ch04.ex01;

public class C04Condition {
	public static void main(String[] args) {
		int a = 3;
		if(0 < a && a < 4) System.out.println("0 < a < 4");
		
		char b ='b';
		if('a' < b && b < 'c') System.out.println("'a' < b < 'c'");
		
		int x = 0;
		int y = 0;
		if( (x = 1 + 2) > 0 || (y = 1 - 2) > 0)
			System.out.printf("x: %d, y: %d\n", x,y);
		
		String s = "hE";
		if((s.equals("hE"))||(s.equals("he"))||(s.equals("HE"))||(s.equals("He"))) 
			System.out.println("he");
		s = "";
		if(s.equals("") || s == null) System.out.println("값이없다.");
		
		s = "hello";
		if(s.equals("") || s != null) System.out.println("값이 있다.");
		
		boolean power = false;
		if(!power) System.out.println("전원을 켠다.");
	}
}