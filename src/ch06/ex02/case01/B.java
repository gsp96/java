package ch06.ex02.case01;

public class B {
	public void test() {
		A a = new A();
		
		int x = 0;
		//x = a.a;
		x = a.b;//default protected 같은패키지에 있으면 보이고 다른패키지면 안보임.
		x = a.c;//protected 다른 패키지에 있더라도 자식이면 보인다.
		x = a.d;
		
		
		//test.m1();
		a.m2();
		a.m3();
		a.m4();
	}
}