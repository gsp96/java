package ch07.ex01.case10;

public class Main {
	public static void main(String[] args) {
		AppleCar appleCar = new AppleCar();
		GoogleCar googleCar = new GoogleCar();
		TeslaCar teslaCar = new TeslaCar();
		
		teslaCar.setOs(googleCar);
		teslaCar.setOs(appleCar);
		
		teslaCar.start();
	}
}