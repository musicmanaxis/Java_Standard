package Ex12;

import java.util.ArrayList;

interface Eateble{}
class Fruit1 implements Eateble{ public String toString(){ return "Fruit1";     }}
class Apple1 extends Fruit1{    public String toString(){ return "Apple1";    }}
class Grape1 extends Fruit1{    public String toString() {return "Grape1";    }}
class Toy1 implements Eateble{public String toString(){return "Toy1";}}  //여기를 이렇게 구현한다면...

class FruitBox<T extends Fruit1 & Eateble> extends Box1<T>{}  //인터페이스와 클래스를 타입상속할 때 위와 같이 표현
class Box1<T>{

    ArrayList<T> list =new ArrayList<>();
    void add(T item){  list.add(item);     }
    T  getItem(int i){  return list.get(i);  }
    public String toString(){return list.toString();}

}

public class Ex12_2 {
    public static void main(String[] args) {
        FruitBox<Fruit1> fruitBox=new FruitBox<Fruit1>();
        FruitBox<Apple1> appleBox=new FruitBox<>();
        FruitBox<Grape1> grapeBox=new FruitBox<Grape1>();
        Box1<Toy1> toy1Box=new Box1<>();

        fruitBox.add(new Fruit1());
        fruitBox.add(new Apple1());
        appleBox.add(new Apple1());
        // appleBox.add(new Grape1());
        grapeBox.add(new Grape1());
        toy1Box.add(new Toy1());


        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(fruitBox.getItem(0));
        System.out.println(toy1Box);

    }
}


