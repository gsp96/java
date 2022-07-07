package ch05.ex04.case01;

public class Main {
	public static void main(String[] args) {
		Card.width = 10;
		Card.height = 20;
		//Card.kind 여기서는 static이 아닌 kind는 존재하지 않기때문에 오류가 난다.
		Card card1 = new Card();
		Card card2 = new Card();
		
		card1.kind = "heart";
		card1.number = 7;
		
		card2.kind = "spade";
		card2.number = 4;
		
		System.out.printf("%s, %s\n", card1.kind, card2.kind);
		
		System.out.printf("%d, %d\n", Card.width, Card.height);
		System.out.printf("%d, %d\n", card1.width, card1.height);
		System.out.printf("%d, %d\n", card2.width, card2.height);
		
		card1.width = 100;
		System.out.printf("%d, %d\n", card2.width, card2.height);
	}

}
