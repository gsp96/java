package ch06.home.ex04.case05;

public class Singer extends Performer{
	public void sing() {}
	
	@Override
	public void perform() {
		this.sing();
	}
}