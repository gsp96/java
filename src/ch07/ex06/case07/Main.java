package ch07.ex06.case07;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Pocket pocket = new Pocket();
		List<Number> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Double> list3 = new ArrayList<>();
		List<String> list4 = new ArrayList<>();
		
		list1.add(1);list1.add(2);
		list2.add(1);list2.add(2);
		list3.add(1.0);list3.add(2.0);
		list4.add("a");list4.add("b");
		
		pocket.printList(list1);//[1, 2]
		pocket.printList(list2);//[1, 2]
		pocket.printList(list3);//[1.0, 2.0]
		pocket.printList(list4);//[a, b]
		
		System.out.printf("%.1f\n%.1f\n%.1f", 
			pocket.add(list1),//3.0
			pocket.add(list2),//3.0
			pocket.add(list3));//3.0
		//pocket.add(list4);list4는 String이라 Number이하가 아니라 컴파일 에러가 뜬다.
		
		pocket.add2(list1);
		pocket.add2(list2);
		//pocket.add2(list3);double은 Integer이상이 아니라 컴파일 에러
		//pocket.add2(list4);String 은 Integer 이상이 아니라 컴파일 에러
	}

}
