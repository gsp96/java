package ch02.ex03;

public class C01IntDouble {
	public static void main(String[] args) {
		int i = 1;
		double d = 0.0;
		
		d = i;//알아서 변형이 되면 promotion
		System.out.printf("%f, %d\n", d, i);
		
		d = (double)i;//casting연산자를 이용하면 casting
		System.out.printf("%f, %d\n", d, i);
		//i = d;
		i = (int)d; //큰수를 작은수로 변환할때는 casting연산자를 이용해야 한다.
		System.out.printf("%f, %d", d, i);
	}

}
