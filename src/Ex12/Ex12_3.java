package Ex12;

import java.util.ArrayList;

class Fruit2{public String toString(){return "Fruit2";}}
class Apple2 extends Fruit2{public String toString(){return "Apple2";}}
class Grape2 extends Fruit2{public String toString(){return "Grape2";}}

class Box2<T>{
    ArrayList<T> list=new ArrayList<>();

    void add(T item){list.add(item);}
    ArrayList<T> getList(){return list;}
    public String toString(){return list.toString();}

}

class FruitBox2<T> extends Box2<T>{ }

class Juice{
    String name="";
    Juice(String name){
        this.name=name+" Juice";
    }
    public String toString(){return name;}
}

class JuiceMaker{

    static Juice makeJuice(FruitBox2<? extends Fruit2> box){
        String tmp="";
        for(Fruit2 f:box.getList()) {
            tmp+=""+f;

        }
        return new Juice(tmp);
    }
}

public class Ex12_3 {
    public static void main(String[] args) {

        FruitBox2<Fruit> fruitBox2=new FruitBox2<>();
        fruitBox2.add(new Fruit2());
       // JuiceMaker.makeJuice(fruitBox2);
        System.out.println(fruitBox2);
    }
}
