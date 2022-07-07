package ch05.home.ex05.case06;

public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		Phone phone = new Phone();
		
		phone.setMakerName("samsung");
		phone.setPrice(1_000_000);
		
		person.setName("최한석");
		
		person.setPhone(phone);
		
		person.sendMsg();
		person.call();
		person.playGame();
	}

}
/*최한석은 , 삼성폰은 1백만원 주고 샀습니다.
 * 손에든 폰을 보니 흐뭇합니다.
 * 메세지를 보내 봅니다.
 * 답장이없어 전화를 걸어보니 연결이 안되네요.
 * 잠시 뒤에 다시 연락해 보렵니다.
 * 기다리는 동안 폰으로 게임을 합니다.
 */