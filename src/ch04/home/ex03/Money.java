package ch04.home.ex03;

public class Money {
	public static void main(String[] args) {
		int money = 0;
		int totMoney = 0;
		
		while(totMoney < 30) {
			money = (int)(Math.random() * 10) + 1;
			System.out.println(money + ",000");
			totMoney += money;	
		}
		System.out.println(totMoney + ",000원을 꺼냈습니다.");
	}
}
/*
 * 과제] 3만원짜리 물건값을 치뤄라.
 * 
 * 지갑에서 지폐를 여러번 꺼낸다.
 * 지갑에 5만원권은 없다.
 * 거낸 돈의 권(종류)을 구분하지 않는다.
 * 꺼낸돈은 3만원 이하이다.
 * 콘솔엔, 지갑에서 꺼낸 금액을 매번 출력한다.
 */