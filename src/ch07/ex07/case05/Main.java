package ch07.ex07.case05;

public class Main {
	public static void main(String[] args) {
		Janitor<Building> janitor1 = a -> System.out.println(a + ", 청소합니다.");
		Janitor<Car> janitor2 = a -> System.out.println(a + ",청소합니당.");
		
		janitor1.clean(new Building());
		janitor2.clean(new Car());
		
		//janitor1.clean(new Car());
	}

}
