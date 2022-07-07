package ch07.ex07.case06;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= 3; i++) list.add(i);
		
		list.forEach(x -> System.out.print(x + " "));
	}

}
