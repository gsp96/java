package ch05.ex06.case01;

public class Main {
	public static void main(String[] args) {
		Man.say("I love java.");//static method는 절차지향 방식으로 표현되고, class.method로써서 객체를 안만들어도 된다.
		
		
		Man man = new Man();
		man.tell("I LOVE JAVA.");
		man.say("Hello.");
	}

}
