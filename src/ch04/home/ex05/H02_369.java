package ch04.home.ex05;

public class H02_369 {
	/*public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i <= 9; i++) {
			for(int j = 0; j <= 9 ; j++) {
				sum = i * 10 + j +1;
				if(i <= 0) {
					System.out.printf(" %d",j + 1);
					if(((j + 1) % 3 == 0) && (j != 0))System.out.print("짝 ");
				}else if (sum < 100){
					System.out.printf(" %d", sum);
					if(((sum / 10) % 3 == 0) && (i != 0))System.out.print("짝");
					if( (j + 1) % 3 == 0)System.out.print("짝 ");
				}
			}
			System.out.println();
		}
	}*/
	public static void main(String[] args) {
		int tens = 0;
		int ones = 0;
		for(int i=1; i <= 99; i++) {
			tens = i / 10;
			ones = i % 10;
			
			System.out.print(" " + i);
			if(tens != 0 && tens % 3 ==0)System.out.print("짝");
			if(ones != 0 && ones % 3 ==0)System.out.print("짝");
			
			if(i % 10 == 0)System.out.println();
		}
	}
}
/*
 과제] 369 게임을 하라.
숫자 범위는 1이상 99이하.
10 단위로 새로운 줄에 출력한다.
--
1 2 3짝 4 5 6짝
11 12 13짝 
 */
