package ch08.ex03.case01;

public class C06Throws {
	public void first() {
		try {
		this.second();
		}catch(ArithmeticException e) {
			System.err.println("예외: first().");
		}catch(Exception e) {
			
		}
	}
	/*
	public void second() {
		try {
			this.third();
			}catch(ArithmeticException e) {
				System.err.println("예외: second().");
			}
	}*/
	public void second() throws Exception{
		this.third();
	}
	
	public void third() {
		int i = 3 / 0;
	}
	
	public static  void main(String[] args) {
		new C06Throws().first();
		System.out.println("끝.");
	}

}
