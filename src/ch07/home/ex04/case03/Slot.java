package ch07.home.ex04.case03;

public class Slot {
	private Ball[] balls;
	
	public Slot() {
		balls = new Ball[45];
		
		for(int i = 0; i< balls.length; i++) {
			balls[i] = new Ball(i + 1);
		}
	}
	
	public Ball chunk() {
		int i = 0;
		Ball ball = null;
		//과제] 같은 숫자가 적힌 공이 2개 이상 나오는 버그를 해결하라.
		do {
			i = (int)(Math.random() * 45);
			ball = balls[i];
			//과제2] 없는 공을 return 하는 버그를 해결하라.
			balls[i] = null;
		} while(ball == null);
		
		return ball;
	}
}