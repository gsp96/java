package ch04.home.ex04;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int a = 0, b= 0;
		char op = 0;
		String go = "";
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("a: ");
			a = sc.nextInt();
			System.out.print("op: ");
			op = sc.next().charAt(0);
			System.out.print("b: ");
			b = sc.nextInt();
			
			switch(op){
			case '+':System.out.printf("%d %c %d= %d\n", a, op, b, a + b); break;
			case '-':System.out.printf("%d %c %d = %d\n", a, op, b, a - b); break;
			case '/':System.out.printf("%d %c %d = %d\n", a, op, b, a / b); break;
			case '*':System.out.printf("%d %c %d= %d\n", a, op, b, a * b); break;
			}
			
			System.out.print("계속할까요(y/n)? ");
			go = sc.next();
		}while(go.equals("y"));
		
		System.out.println("끝.");
	}
}
/*과제]계산기를 만들어라.
 * 연산자는 +,-,*,/이다.
 * 나누기 는 몫만을 얻는다.
 a: 1
 op: +
 b: 2
 1 + 2 = 3;
 계속할가요(y/n)? y
 a: 1
 op: +
 b: 2
 1 + 2 = 3;
 계속할가요(y/n)? n
 끝.
 */
 
