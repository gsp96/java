package ch06.ex06.case09;

public interface UI {
	static void in() {//static method는 상속이 안된다.
		System.out.println("키보드로 입력한다.");
	}
	public void out();
	

}
