package ch02.ex02;

public class C04Str {
	public static void main(String[] args) {
		String src= "우리 개는 ";
		String s1="";
		String s2="";
		String s3="";
		String s4="";
		char c = 0;
		
		int len =src.length();
		System.out.println("length :"+len);
		
		s1= src.concat("짖는다.");//뒤에다가 글자를 붙인다.
		s2=src.replace("개","고양이");//글자를 교체한다.
		s3=src.substring(0, 4);//(index,endindex)=(시작점,종료지점)
		c=src.charAt(3);// x번째 char를 추출한다.
		s4=src.substring(3,4);
		System.out.printf("%s\n%s \n%s \n%c \n%s",s1,s2,s3,c,s4);
		
		
	}
}
