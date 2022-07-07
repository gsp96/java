package ch05.ex01.case03;

public class Main {
	public static void main(String[] args) {
		/*User user = new User();
		user.name = "최한석";
		user.age = 12;
		
		User user2 = new User();
		user2.name = "고승표";
		user2.age = 26;*/
		
		User user = new User();
		user.setName("고승표");
		user.setAge(26);
		
		System.out.printf("%s %d\n", user.getName(), user.getAge());
		
	}

}
