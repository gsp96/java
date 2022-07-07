package ch02.ex02;

public class C03Str {
	public static void main(String [] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.printf("Sum: %d\n",sum);
		
		String sumStr = "" + sum;//숫자를 문자로 바꾸는 법
		System.out.println(sumStr);
		
		String s= ""+ a + b;
		System.out.println(s);
		
		s = a + b + "";  //큰따옴표가2개 붙어있는모양 ""을 emptystring이라고 한다
		System.out.println(s);
		
		String dialog= "John said, \"hello.\""; //특수 문자를 일반 문자로 만드는 방법.
		System.out.println(dialog);
	}
}
