package ch02.ex01;

public class C02Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 100;
		System.out.println(100);
		System.out.println(score);
		System.out.println(100+1);
		System.out.println(Math.random());
		
		System.out.print(200);
		System.out.print(300);
		System.out.print("\n");
		System.out.print(400);
		System.out.println();
		
		System.out.printf("%b %c %d %f %s\n",true,'a', 10, 1.15,"hello");
		System.out.printf("%b/%c/%d/%f/%s\n",true,'a', 10, 1.15,"hello");
		System.out.printf("%b|%5c|%-5d|%5.2f|%s\n",true,'a', 10, 1.15,"hello");//앞에오는수가 양수면 오른쪽정렬 음수면 왼쪽정렬
		
		String name = "고승표";
		int age =26 ;
		System.out.printf("%s %d\n", name,age);
		System.out.printf("%s은 %d살 입니다.", name,age);
		

	}

}
