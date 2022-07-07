package ch07.ex05.case03;

import java.util.ArrayList;

public class MyList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		
		for(int i:list)System.out.print(i + " ");
		System.out.println();
		
		System.out.println(list.get(0));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
		//과제]list의 모든 원소를 remove하라.
		do {
			list.remove(0);
		}while(list.size() != 0);
		
		/*for(int i = 0; i < list.size(); i++)
			System.out.println(list.remove(i) + " ");
		System.out.println();
		System.out.println(list);*/
		
		for(int i = list.size()-1; i >= 0 ; i--)
			list.remove(i);
	}
}