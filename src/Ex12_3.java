import java.util.ArrayList;

class Fruit2{public String toString(){return "Fruit2";}}
class Apple2{public String toString(){return "Apple2";}}
class Grape2{public String toString(){return "Grape2";}}

class Juice{
    String name;
    Juice(String name){
        this.name=name+"Juice";
    }
    public String toString(){return name;}

}

 Class JuiceMaker{
    static Juice makeJuice(FruitBox2<? extends Fruit2> box){
        String tmp="";
        for(Fruit2 f:box.getList()){
            tmp+=f+" ";
            return new Juice(tmp);
        }

    }
}

class FruitBox2<T extends Fruit2> extends Box2<T>{  }

class Box2<T>{
    ArrayList<T> list=new ArrayList<>();

    void add(T item){list.add(item);}
    ArrayList<T> getList1(){return list;}
    T getItem(int i){return list.get(i);}
    public String toString(){return list.toString();}
    int size(){return list.size();}


}

public class Ex12_3 {
    public static void main(String[] args) {
        FruitBox2<Fruit2> fruitBox2=new FruitBox2<>();
        JuiceMaker.makeJuice(fruitBox2);

    }

}
