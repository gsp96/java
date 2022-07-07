package ch07.ex07.case03;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = (a, b) -> {
			int result = a + b;
			return result;
		};
		
		System.out.println(calculator.calc(1, 2));//3
		
		calculator = (a, b) -> {
			return a - b;
		};
		System.out.println(calculator.calc(1, 2));//-1
	}

}
