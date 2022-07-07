package ch05.ex09.case01;

public class Init {
	private static int s;
	private int i;
	
	static {//bytecode가 실행된 직후에 생성된다.
		Init.s = 1;
		// this.i =1;
		System.out.println("static()");
	}
	
	{ //모든객체에 동일하게 초기화할때 인스턴스 초기화 블럭,객체가 생성된 직후에 실행된다.
		Init.s = 1;
		this.i = 1;
		System.out.println("{}");		
	}
	public Init() {//생성자별로 초기화 하고싶으면 생성자 
		Init.s = 1;
		this.i = 1;
		System.out.println("Init()");
	}
	public Init(int i) {
		Init.s = i;
		this.i = i;
		System.out.println("Init(int)");
	}

}
