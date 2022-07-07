package ch07.ex01.case07;

public class Human {
	//과제] 인간이 라면 외에, 김치와 사과를 먹도록 디자인 하라.
	//public void eat(Ramen ramen) {}
	// void eat(Kimchi kimchi) {}
	// void eat(Apple apple) {}
	
	public void eat(Food food) {
		System.out.println(food + "를 먹다.");
	}

}