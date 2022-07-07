package ch04.ex02;

public class C02Switch {
	public static void main(String[] args) {
		String grade = "silver";
		String coupon = "";
		
		switch(grade) {
		case "gold":coupon += "10,000원";
		case "silver":coupon += "5,000원";
		case "couper": coupon += "1,000원";
		}
		System.out.println(coupon);
	}

}
