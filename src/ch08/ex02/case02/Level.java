package ch08.ex02.case02;

public enum Level {
	GOLD(3, null), SILVER(2, GOLD), COPPER(1, SILVER);
	
	private final int value;
	private final Level next;
	
	private Level(int value, Level next) {
		this.value = value;
		this.next = next;
		
	}
	
	public int intValue() {
		return this.value;
	}
	
	public Level next() {
		return this.next;
	}
	
	public static Level valueOF(int value) {
		Level level = null;
		
		switch(value) {
		case 1: level = COPPER; break;
		case 2: level = SILVER; break;
		case 3: level = GOLD; break;
		}
		return level;
	}
}
