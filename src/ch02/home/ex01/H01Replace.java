package ch02.home.ex01;

public class H01Replace {
	public static void main(String[] args) {
		int a =1 ,b=2,c=0,d=0;
		System.out.printf("a의값은 %d b의 값은 %d입니다.\n",a,b);
		c=a;
		d=b;
		a=d;
		b=c;
		System.out.printf("a의값은 %d b의 값은 %d입니다.\n",a,b);
	}
}
