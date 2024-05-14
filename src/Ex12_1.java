//제네릭스 연습   

import java.util.ArrayList;

class Fruit{ public String toString() { return "Fruit";	} }
class Apple extends Fruit{	public String toString() { 	return "Apple";	}}
class Grape extends Fruit{	public String toString() {	return "Grape";	}}
class Toy{	public String toString() {	return "Toy";	}}

public class Ex12_1 {

	public static void main(String[] args) {
		
		Box<Fruit> FB =new Box<Fruit>();  //과일만 담을수 있는 과일상자 생성
		Box<Apple> AB=new Box<Apple>();   //사과만 담을수 있는 사과상자 생성
		Box<Grape> GB=new Box<Grape>();
		Box<Toy> TB=new Box<Toy>();
		
		FB.add(new Fruit());
		FB.add(new Apple());   //상속관계에 있는 사과를 과일 상자에 담았다. 
		FB.add(new Grape());
		
		System.out.println(FB);
		
		AB.add(new Apple());
		System.out.println(AB);
		
		GB.add(new Grape());
		System.out.println(GB);
		
				
		TB.add1("장난감을 넣자 ");
		System.out.println(TB.getItem1(0));
		
		
	}
}


class Box<T>{
	
	//이 클래스에서는 메소드나 자료변수 정의만 가능하다.
	//실제로 메소드를 list1.add();형태로 호출할 수가 없다. 왜냐하면 실행을 위한 메인메소드가 없으니깐. 
	
	ArrayList<T> list  = new ArrayList<T>();   //박스에 실제로 arraylist를 이용하여 내용물을 담는다.  리스트객체 생성
											   //이렇게 객체를 생성해서 이용한다는 것이 신기하다. 
												//박스객체를 만들면 이렇게 리스트 객체생성코드를 기술하면 생성이 된다
	
	void add(T item) { list.add(item);	}	
	T getItem(int i){ return list.get(i); }
	int getSize() {	return list.size();	}
	public String toString() {	return list.toString();	}
	
	//아래의 문장은 제네릭스 타입이 아닌 별도로 쓸 목적으로 만들었다.  
	ArrayList list1 = new ArrayList();
	void add1(Object o) {list1.add(o);}
	Object getItem1(int i){ return list1.get(i); }
			
}
