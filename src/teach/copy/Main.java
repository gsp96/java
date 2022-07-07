package teach.copy;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student st = new Student();
		int[] jumsu = new int[4];
		System.out.print("이름 입력:");
		Scanner sc = new Scanner(System.in);
		st.setName(sc.next()); 
		System.out.print("점수 데이터:");
		for(int i = 0; i < 4; i++) {
			jumsu[i] = sc.nextInt();
		}
		st.setJumsu(jumsu);
		System.out.printf("이름은? %s \n", st.getName());
		System.out.printf("총점은? %d \n", st.getSum());
		System.out.printf("평균은? %d \n", st.getAvg());
	}
}