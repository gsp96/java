package ch06.home.ex04.case05;

public class Actor extends Performer{
	public void act() {}
	
	@Override
	public void perform() {
		this.act();
	}
}