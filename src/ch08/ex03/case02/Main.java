package ch08.ex03.case02;

public class Main {
	public static void main(String[] args) {
		String userId = "hello";
		
		try {
			if(userId.length() > 3)
				throw new LengthException("userId 길이가 초과도이었습니다.");
		}catch(LengthException e) {
			e.printStackTrace();
		}
		
		throw new NumberException("숫자가 아닙니다.");//RunTimeException을 상속받았으면 try블럭으로 묶지않아도 된다.
	}

}
