package ch06.ex02.case02;

public class Parent {
	private String regName;
	private String name;
	private int money;
	
	private String getRegName() {
		return regName;
	}
	
	public String getName() {
		return name;
	}
	
	protected int getMoney() {
		return money;
	}
	
	void addMoney(int money) {
		this.money += money;
	}

}