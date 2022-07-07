package ch04.ex03;

public class C01While {
	public static void main(String[] args) {
		int weight = 88;
		int jumpCnt = 0;
		while(weight > 60) {
			jumpCnt++;
			weight--;
		}
		System.out.printf("줄넘기 %d번으로, 몸무게 %dkg이 되었습니다.",jumpCnt, weight);
	}

}
