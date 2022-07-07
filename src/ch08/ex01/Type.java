package ch08.ex01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//java파일 하나에 클래스를 2개이상 정의하려면 자바 파일명과 클래스 이름이 하나는 같아야하고 하나만 public이어야 한다.
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface Type {
	String name();
	int value();
}

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
@interface Field{
	int value();//기본 속성명
}

@Retention(RetentionPolicy.RUNTIME)//객체
@Target(ElementType.CONSTRUCTOR)//생성자에만 붙이기 가능
@interface Constructor{
	int value() default 0;//기본값을 0으로 준다.
}

@Target(ElementType.METHOD)//method에 쓰기가능
@interface Method{
	
}

@Target(ElementType.PARAMETER)
@interface Param{
	
}

@Target(ElementType.LOCAL_VARIABLE)
@interface Local{
	
}

@Target(ElementType.ANNOTATION_TYPE)
@interface Annotation{
	
}

@Target({ElementType.TYPE, ElementType.FIELD})
@interface Universal{
	
}