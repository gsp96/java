package ch03.ex04;

public class C02Decimalpoint {
	public static void main(String[] args) {
		double pi = 3.141592;
		
		double shortPi = (int)(pi * 10) / 10.0;
		System.out.println(shortPi);
		
		//pi값을 소수점 이하 3자리로 조정하세요
		shortPi = (int)(pi * 1000) / 1000.0;
		System.out.println(shortPi);
		//pi값을 반올림해서, 소수점 이하 세자리로 조정하라.
		shortPi =Math.round((pi*1000)) / 1000.0;
		System.out.println(shortPi);
	}

}
