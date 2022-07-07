package ch07.ex05.case02;

public class AutoBoxing {
	public static void main(String[] args) {
		int a1 = 1;
		Integer a2 = new Integer(1);
		int a3 = new Integer(1);
		Integer a4 = 1; //autoboxing
		
		boolean b1 = true;
		Boolean b2 = new Boolean(true);
		boolean b3 = new Boolean(true);//autounboxing
		Boolean b4 = true;//autoboxing
	}
}