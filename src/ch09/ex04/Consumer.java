package ch09.ex04;

public class Consumer implements Runnable{
	private String name;
	private Buffer buffer;
	
	public Consumer(String name,Buffer buffer) {
		this.buffer = buffer;
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i = 0; i< 5; i++) {
			int val = buffer.remove();
			System.out.println(this.name + ": " + i);
		}
		try {
			Thread.sleep((int)(Math.random() * 100));
		}catch(InterruptedException e) {}
	}

}
