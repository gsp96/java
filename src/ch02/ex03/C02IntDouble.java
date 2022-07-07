package ch02.ex03;

public class C02IntDouble {
	public static void main(String[] args) {
		double d = 1.92;
		int i = (int)d;//i변수에 저장되는 값은 casting연산자가 return한 값이다.
		System.out.printf("%d, %f\n", i,d);
		
		double f = Math.floor(d);//내림
		double r = Math.round(d);//반올림
		
		System.out.printf("%f, %f", f, r);
	}

}
