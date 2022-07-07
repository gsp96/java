package ch07.ex01.case10;

public class TeslaCar implements SelfCar{
	private SelfCar os;
	
	@Override
	public void start() {
		os.start();
	}
	
	public void setOs(SelfCar selfCar) {
		this.os = selfCar;
	}

}
