//매개변수 참조형인 경우 객체의 속성인 변수 값을 바꿀수 있다.
//메소드의 매개변수가 기본형인 경우는 읽기만 가능하며 바꿀수 없다. 


class Data2{int x=0;}

public class Ex6_7 {

	public static void main(String[] args) {
		Data2 d2=new Data2();
		d2.x=10;
		System.out.println("main() : x = "+ d2.x);
		
		change(d2);
		
		System.out.println("After change main() : x = "+ d2.x);
		
	}

	static void change(Data2 d) {  //매개변수 타입을 참조형으로 하였다. 
		d.x=1000;
		System.out.println("change() :x ="+d.x);
	}
}
