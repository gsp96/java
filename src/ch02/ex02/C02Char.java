package ch02.ex02;

public class C02Char {
	public static void main(String []args) {
		char c = 'A';
		System.out.printf("%c, %s\n",c,Integer.toBinaryString(c));
		
		c=65;
		System.out.printf("%c, %s\n",c,Integer.toBinaryString(c));
		
		c=0x0041;
		System.out.printf("%c, %s\n",c,Integer.toBinaryString(c));
		
		c='\u0041';// u는 유니코드를 뜻한다.
		System.out.printf("%c, %s\n",c,Integer.toBinaryString(c));
	}
}
// unicode표 참고  0041은  A를뜻함