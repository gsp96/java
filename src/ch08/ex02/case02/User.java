package ch08.ex02.case02;

public class User {
	private String name;
	private Level level;
	//domain이 가지고있는 data만으로 처리가능, service에서 하기엔 너무 간단한 알고리즘이면 그냥 domain에 구현한다.
	public User(String name, Level level) {
		this.name = name;
		this.level = level;
	}
	
	public void upgradeLevel() {
		Level nextLevel = level.next();
		
		if(nextLevel == null) {
			throw new IllegalStateException("이미 최고 등급 " + this.level + "입니다.");//거짓데이터가 발생해서 문제가 생겼다는 객체.
		}
		else this.level = nextLevel;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", name, level);
	}

}
