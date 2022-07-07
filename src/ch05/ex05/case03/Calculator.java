package ch05.ex05.case03;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public Paper add(Paper paper) {
		//과제] paper 의 두 개 숫자를 더한 결과값을 종이에 적어라
		paper.setResult(add(paper.getA(),paper.getB()));
		return paper;
	}
}