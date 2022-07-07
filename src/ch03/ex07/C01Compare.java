package ch03.ex07;

public class C01Compare {
	public static void main(String[] args) {
		boolean b = 'A' < 'B';
		b = '0' == 0; //false
		b = 'A' != 65; //false
		
		b = 10.0 == 10.0f;//true 1이상의 숫자에서는 double과 float을 비교해도 문제가 없다
		b = 0.1 == 0.1f; //false 1미만의 숫자에서는 float의 소수점이하 숫자가 늘어나서 자리수가 달라 다른숫자가 된다.
		b = (float)0.1 == 0.1f;//true casting을해서 float으로 바꿔주었기 때문에 true가 된다
		
		
		System.out.println(b);
	}

}
