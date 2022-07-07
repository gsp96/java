package ch05.home.ex05.case06.re;

public class Person {
	private String name;
	private Phone phone;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	public void sendMsg() {
		phone.sendMsg();
	}
	
	public void call() {
		phone.call();
	}
	
	public void playGame() {
		phone.playGame();
	}
}