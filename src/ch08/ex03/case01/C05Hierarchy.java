package ch08.ex03.case01;

public class C05Hierarchy {
	public void first() {
		try {
			int i = 3 / 0;
		}catch(ArithmeticException e) {
			System.err.println("ArithmeticException 발생");
		}
		catch(Exception e) {
			System.err.println("Exception 발생.");
		}//catch(ArithmeticException e) catch블럭을 두개 이상 쓸때 자식부터쓰고 부모 블럭을 쓴다.
		
	}
	
	public static void main(String[] args) {
		C05Hierarchy h = new C05Hierarchy();
		h.first();
	}

}
