package ch05.ex05.case07;

public class Main {
	public static void main(String[] args) {
		Farmmer farmmer = new Farmmer();
		Retailer retailer = new Retailer();
		//과제 사과가격 2000원을 출력하라.
		System.out.println(retailer.sell(farmmer.sell(1000)).getPrice());
	}
}