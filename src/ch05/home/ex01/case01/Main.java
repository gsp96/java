package ch05.home.ex01.case01;

public class Main {
	public static void main(String[] args) {
		Flower flower = new Flower();
		Flower flower2 = new Flower();
		
		flower.name = "창포꽃";
		flower.petalLength = 7;
		flower.sepalLength = 2;
		
		System.out.printf("%s은 꽃잎 길이가 %dcm, 꽃받침 길이가 %dcm 입니다.\n", flower.name, flower.petalLength, flower.sepalLength);
		
		flower2.name = "코스모스";
		flower2.petalLength = 4;
		flower2.sepalLength = 1;
		
		System.out.printf("%s은 꽃잎 길이가 %dcm, 꽃받침 길이가 %dcm 입니다.\n", flower2.name, flower2.petalLength, flower2.sepalLength);
	}

}
/*
창포꽃은 꽃잎 길이가 7cm, 꽃받침 길이가 2cm입니다.
코스모스는 꽃잎 길이가 4cm, 꽃받침 길이가 1cm 입니다.
*/
