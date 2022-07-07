package ch04.ex02;

public class C03Switch {
	public static void main(String[] args) {
		String grade = "silver";
		String coupon = "";
		
		switch(grade) {
		case "gold":coupon += "10,000원"; break;
		case "silver":coupon += "5,000원"; break;
		case "couper": coupon += "1,000원";
		}
		
		System.out.println(coupon);
	}
}