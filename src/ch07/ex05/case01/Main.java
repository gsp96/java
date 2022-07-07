package ch07.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Basket<Apple> basket = new Basket<Apple>();
		basket.setE(new Apple());
		System.out.println(basket.getE());
		
		//basket.setE(new Grape());
		
		Basket<Grape> basket2 = new Basket<Grape>();
		basket2.setE(new Grape());
		System.out.println(basket2.getE());
	}

}
