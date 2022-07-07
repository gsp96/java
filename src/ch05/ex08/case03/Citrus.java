package ch05.ex08.case03;

public class Citrus {
	private String name;
	
	public Citrus() {
		//과제] 천혜향 농장에서, new Citrus() 할때, name 이 천혜향이 되도록 하라.
		//아래 hard coding을 soft coding 으로 바꾼다.
		//this.name ="레드향"
		// new Citrus("천혜향");
		this("천혜향");
	}
	public Citrus(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
