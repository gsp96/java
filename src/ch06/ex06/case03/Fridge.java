package ch06.ex06.case03;

public class Fridge implements Appliance{

	@Override
	public void on() {
		System.out.println("냉장고를 켜다.");
		
	}

	@Override
	public void off() {
		System.out.println("냉장고를 끄다.");
		
	}

}
