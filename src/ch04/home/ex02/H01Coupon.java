package ch04.home.ex02;

public class H01Coupon {
	public static void main(String[] args) {
		String grade = "silver";
		String coupon = "";

		if (grade.equals("gold")) coupon += "10,000원";
		else if(grade.equals("silver")) coupon += "5,000원";
		else if(grade.equals("couper")) coupon = "1,000원";
		
		System.out.println(coupon);
		
	}
}