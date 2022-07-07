package ch07.ex06.case06;

public class Main {
	public static void main(String[] args) {
		Cabinet<A> cabinet1 = new Cabinet<>();
		Cabinet<B> cabinet2 = new Cabinet<>();
		//Cabinet<C> cabinet3 = new Cabinet<>(); A이하가 아니기 때문에 C클래스를 사용할수없다.
		
		A[] arr1 = {new A(), new A()};
		B[] arr2 = {new B(), new B()};
		C[] arr3 = {new C(), new C()};
		D[] arr4 = {new D(), new D()};
		
		cabinet1.getLastVal(arr1);
		cabinet2.getLastVal(arr2);
		//cabinet1.getLastVal(arr3);C타입의 배열을 parameter로 받을수는 없다.
		cabinet1.getLastVal(arr2);//A타입의 배열에 B타입 을 넣으면 promotion해서 A타입으로 들어가기 때문에 넣어진다.
		//cabinet2.getLastVal(arr1);B타입의 배열에 A타입을 넣으면 컴파일 에러가 일어난다.
		
		//cabinet1.getFinalVal(arr1);parameter값이 C타입 이하로 제한되어 있으므로 arr1은 들어갈수 없다.
		//cabinet1.getFinalVal(arr2);윗줄과 같다.
		cabinet1.getFinalVal(arr3);//generic method는 객체의 타입은 아무런연관이 없음을 알 수 있다.
		cabinet1.getFinalVal(arr4);//이것은 generic method type이 D로 결정 난것이고 promotion은 아니다.
		
	}
}