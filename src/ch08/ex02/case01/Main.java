package ch08.ex02.case01;

public class Main {
	public static void main(String[] args) {
		Day day = Day.월요일;
		
		String dayName = "";
		switch(day) {
		case 월요일: dayName = "월요일"; break;
		case TUESDAY: dayName = "월요일"; break;
		}
		
		System.out.println(dayName);
	}

}
