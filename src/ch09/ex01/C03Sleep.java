package ch09.ex01;

public class C03Sleep {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++)
			System.out.print(i + " ");
		
		try {
			Thread.sleep(1000);//sleep 메서드가 throws를 가지고 있기 때문에 try catch안에 써야 한다.  sleep은 call한 thread를 잠재운다 여기서는  main
		}catch(Exception e) {}
	}
}