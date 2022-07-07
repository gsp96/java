package ch05.home.ex05.case06;

public class Person {
	private Phone phone;
	private String name;
	
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
	
	public void playGame(){
		phone.playGame();
	}
}