package ch07.ex06.case03;

public interface Cosmos {
	public static Animal getAnimal(String animalName) {//factory method 새 객체를 만드는 method
		Animal animal = null;
		
		switch(animalName) {
		case "호랑이": animal = new Tiger();break;
		case "매": animal = new Falcon();
		}
		
		return animal;
	}
	
}
