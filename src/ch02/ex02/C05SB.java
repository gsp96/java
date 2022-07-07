package ch02.ex02;

public class C05SB {

	public static void main(String[] args) {
		StringBuffer src = new StringBuffer("우리 개는 ");//StringBuffer를 썼을경우에 따로 메모리에 저장되지 않는다.
		int len = src.length();
		System.out.println("length: "+len);
		
		src.append("짖는다.");
		src.replace(3, 4, "고양이");
		
		System.out.println(src);
		
		String str = src.toString();
	}
}
