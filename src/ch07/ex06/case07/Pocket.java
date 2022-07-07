package ch07.ex06.case07;

import java.util.List;

public class Pocket {
	{
		int i = 1 + 2;
		double d = 1.0 + 2.0;
		i = new Integer(1) + new Integer(2);
		d = new Double(1.0) + new Double(2.0);
		
		// new Number(1) + new Number(2);
	}
	//unbounded wildcard
	public void printList(List<?> list){
		System.out.println(list);
	}
	//upper bounded wildcard Number이하 
	//과제] 다양한 타입의 숫자값을 가진 list를 파라미터로 받는다.
	//list 안의 숫자값을 모두 더한 결과값을 return 한다.
	public double add(List<? extends Number> list) {
		double sum = 0;
		for(Number n: list) sum+= n.doubleValue();

		return sum;
	}
	
	//lower bounded wildcard Integer이상
	public List<? super Integer> add2(List<? super Integer> list){
			return list;
	}

}
