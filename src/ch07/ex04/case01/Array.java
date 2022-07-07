package ch07.ex04.case01;

public class Array {
	public static void main(String[] args) {
		String[] strs = new String[3];
		System.out.println(strs);
		
		Integer[] integers = new Integer[3];
		System.out.println(integers);
		
		int[] ints = new int[3];//int 타입의 객체를 만든 것이다.
		System.out.println(ints);
		
		System.out.printf("%d %d %d\n", ints[0], ints[1], ints[2]);
		System.out.printf("%d %d %d\n", integers[0], integers[1], integers[2]);
		
		ints[1] = 1000;
		System.out.println(ints[1]);
		
		for(int i = 0; i < ints.length; i++) ints[i] = i;
		for(int i = 0; i <ints.length; i++)
			System.out.printf("%d ", ints[i]);
		
		for(int i: ints) System.out.printf("\n%d %d", ints[i], i);
	}

}
