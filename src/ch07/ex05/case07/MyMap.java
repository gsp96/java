package ch07.ex05.case07;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	public static void main(String[] args) {
		Map<Integer, User> map = new HashMap<>();
		
		map.put(1, new User("최한석"));
		map.put(2, new User("한아름"));
		map.put(3, new User("양승일"));
		System.out.println(map);//{1=최한석, 2=한아름, 3=양승일}
		
		User user = map.get(1);
		System.out.println(user);//최한석
		System.out.println(map);//{1=최한석, 2=한아름, 3=양승일}
		
		user = map.remove(1);
		System.out.println(user);//최한석
		System.out.println(map);//{2=한아름, 3=양승일}
	}
}