package teach;

public class Student {
	private String name;
	private int[] jumsu;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getJumsu() {
		return jumsu;
	}
	public void setJumsu(int[] jumsu) {
		this.jumsu = jumsu;
	}
	
	public int getSum() {
		int sum = 0;
		for(int i=0; i < jumsu.length; i++) {
			sum = sum + jumsu[i];
		}
		return sum;
	}
	
	public int getAvg() {
		int sum = 0;
		for(int i=0; i < jumsu.length; i++) {
			sum = sum + jumsu[i];
		}
		int avg = sum/jumsu.length;
		
		return avg;
	}
}