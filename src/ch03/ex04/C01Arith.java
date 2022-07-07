package ch03.ex04;

public class C01Arith {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		byte c = (byte)(a+b);
		System.out.println(c);
		
		//c = c+1; error
		c = (byte)(c + 1);
		System.out.println(c);
		
		double d = a / b;//a와b가 이미 int로 promotion되서 나누는 과정에서 1.5가 정수인 1로 promotion되고 double인 d에 들어가기위해 정수인 1이 다시 double로 promotion된다.
		System.out.println(d);
		
		//good
		d = (double)a / (double)b;//과제 d값이 1.5가 나오게 하라
		System.out.println(d);
		d = (double)a / b;
		System.out.println(d);
		d = 1.0 * a / b;
		System.out.println(d);
		//bad
		d = (double)(a / b);
		System.out.println(d);//1.0
		d = a / b * 1.0;
		System.out.println(d);//1.0
	}
}
