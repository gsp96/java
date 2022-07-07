package ch09.ex04;

public class Main {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		
		new Thread(new Producer("p1",buffer)).start();
		new Thread(new Consumer("c1",buffer)).start();
		new Thread(new Producer("p2",buffer)).start();
		new Thread(new Consumer("c2",buffer)).start();
	}

}
