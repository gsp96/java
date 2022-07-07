package ch07.home.ex04.case02;

public class Card {
	private int idx;
	
	public Card(int idx) {
		this.idx = idx;
	}
	
	@Override
	public String toString() {
		return this.idx + " ";
	}
}