package ch04.ex05;

public class C01For {
	public static void main(String[] args) {
		/*int i = 0;
		
		while(i < 10) {
			System.out.print(i + " ");
			i++;
		}*/

		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i - 1 + " ");
		}
	}
}