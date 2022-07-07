package ch07.ex06.case06;

public class Cabinet<T extends A>//A 이하로 범위를 좁힌다. 이 경우에는 A와 B
{
	public T getLastVal(T[] arr) {
	return arr[arr.length - 1];
	}
	
	public <S extends C> S getFinalVal(S[] arr) {
		return arr[arr.length -1];
	}
}