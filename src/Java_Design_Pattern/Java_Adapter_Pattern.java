package Java_Design_Pattern;

/*아무상관이 없는 클래스(Tiger Class)를 수정하지 않고 그 자체로 쓰고 싶을 때
마치 어댑터를 끼워 넣는 것처럼 중간에 AdapterClass를 만들어서 Animal추상클래스를 상속받고
TigerClass를 AdapterClass안에 필드로 넣어 사용하면 TigerClass를 수정없이 사용할 수 있다.*/

import java.util.ArrayList;
import java.util.List;

public class Java_Adapter_Pattern {
    public static void main(String[] args) {
        List<Animal> list=new ArrayList<>();
        list.add(new Dog("Black "));
        list.add(new Cat("Red "));
        list.add(new AdapterTiger("White "));

        list.forEach(a->{a.sound();});
    }
}

 abstract class Animal{   //추상클래스는 생성자와 필드를 가질수 있다.
    protected  String name;
    public Animal(String name){
        this.name=name;
    }
    public abstract void sound();
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void sound(){
        System.out.println(name+"Dog Barks");
    }
}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    @Override
    public void sound(){
        System.out.println(name+"Cat Screams");
    }
}

class AdapterTiger extends Animal{
    Tiger tiger;  // **이 부분 주목

    AdapterTiger(String name) {
        super(name);         //AdapterTiger객체 생성과 동시에 Tiger객체 생성
        tiger = new Tiger(name); //super(name)뒤에 생성
          tiger.setName(name);

    }
    @Override
    public void sound(){
        System.out.print(tiger.getName());
        tiger.roar();
    }
}

class Tiger{
    private String name;
    Tiger(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void roar(){
        System.out.println("Tiger Roar");
    }
}