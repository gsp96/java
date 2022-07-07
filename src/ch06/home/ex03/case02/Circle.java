package ch06.home.ex03.case02;

public class Circle {
	private int r;
	private Point point;
	
	public Circle(Point point, int r) {
		this.point = point;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("(%d,%d), %d", this.point.getX(), this.point.getY(), r);
	}
}
