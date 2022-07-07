package ch07.ex06.case04;

public class Bowl<T> {//generic class
	private T val;
	
	public void setVal(T val) {
		this.val =val;
	}
	
	public T getVal() {
		return this.val;
	}

}
