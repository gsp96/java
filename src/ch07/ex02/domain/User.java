package ch07.ex02.domain;

public class User {
	private String name;
	
	public User(String name) {
		this.name = name;
	}
	
	@Override//도메인을 사용할때는 toString을 override해서 쓰는게 나중에 사용할때 구분하기 편하다.
	public String toString() {
		return this.name;
	}
}
