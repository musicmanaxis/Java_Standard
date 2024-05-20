package Ex12;

import java.util.ArrayList;

class Fruit{
	public String toString(){return "Fruit입니다.";}
}
class Apple1 extends Fruit{
	public String toString(){return "Apple입니다";}
}
class Grape1 extends Fruit{
	public String toString(){return "Grape입니다";}
}
class Toy{
	public String toString(){return "Toy입니다";}
}


public class Ex12_1{
	public static void main(String[] args) {
		Box<Fruit> fruitBox=new Box<Fruit>();
		Box<Apple1> appleBox=new Box<>();
		Box<Grape1> grapeBox=new Box<>();

		fruitBox.add(new Apple1());
		fruitBox.add(new Grape1());

		appleBox.add(new Apple1());
		appleBox.add(new Apple1());

		System.out.println("과일박스:"+fruitBox);
		System.out.println("사과박스:"+appleBox);
		System.out.println("과일박스의 첫번재 아이템:"+fruitBox.getList(0));



	}
}

class Box<T>{
	ArrayList<T> list=new ArrayList<T>();

	void add(T item){list.add(item);}
	T getList(int i){return list.get(i);}
	int size(){return list.size();}
	public String toString(){return list.toString();}
	//list.toString() ->리트트의 내용을 문자열로 보여줌
}
