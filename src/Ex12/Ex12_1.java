package Ex12;

import java.util.ArrayList;

class Fruit{  	public String toString(){return "Fruit입니다.";}}
class Apple extends Fruit{	public String toString(){return "Apple입니다";}}
class Grape extends Fruit{	public String toString(){return "Grape입니다";}}
class Toy{	public String toString(){return "Toy입니다";}}

class Box<T>{   //제네릭은 타입을 지정하여 들어올수 있는 객체를 필터링하여 집어넣을수 있게 한다.  설계도
	ArrayList<T> list=new ArrayList<T>();

	void add(T item){list.add(item);}
	T getList(int i){return list.get(i);}
	int size(){return list.size();}
	public String toString(){return list.toString();}
	//list.toString() ->리트트의 내용을 문자열로 보여줌
}

public class Ex12_1{
	public static void main(String[] args) {
		Box<Fruit> fruitBox=new Box<Fruit>();  //괴일만 들어올수 있게 객체를 만듬
		Box<Apple1> appleBox=new Box<>();  //사과만 들어올수 있게..
		Box<Grape> grapeBox=new Box<>();

		fruitBox.add(new Apple());
		fruitBox.add(new Grape());

		appleBox.add(new Apple1());
		appleBox.add(new Apple1());

		System.out.println("과일박스:"+fruitBox);
		System.out.println("사과박스:"+appleBox);
		System.out.println("과일박스의 첫번재 아이템:"+fruitBox.getList(0));
	}
}
