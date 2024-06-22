package Ex14;
//메서드 참조:람다식을 더 간단히 하는 방법

import java.util.function.Function;
import java.util.function.Supplier;

//기본 생성자와 매개변수가 있는 생성자를 생셩하는 방법인데 이 차이로 쓰이는 function의 종류가 달라진다.
//기본 생성자는 입력없이 생성만 하므로 Supplier, 매개변수 생성자는 Function으로 처리

public class Ex14_FunctionTest1 {
    public static void main(String[] args) {
//        Supplier<MyClass1> mc=()->new MyClass1();
        Supplier<MyClass1> mc=MyClass1::new;  //위의 것을 이렇게 가능  클래스이름::메서드이름   형식

        System.out.println(mc.get());   //get()눈 Supplier 메서드

//        Function<Integer , MyClass2 > f=(i)->new MyClass2(i);
        Function<Integer , MyClass2 > f=MyClass2::new;  //위의 것을 이렇게 가능

        MyClass2 mc2=f.apply(100);  //apply()는 Function 메서드
        System.out.println(mc2.iv);

        //배열이 메서드 참조 이용하는 방법
//        Function<Integer, int []> a=(i)->new int[i];
        Function<Integer, int []> a=int[]::new;

        int[] arr=a.apply(200);
        System.out.println("arr.length="+arr.length);
    }

}

class MyClass1{}

class MyClass2{
    int iv;

    MyClass2(int iv){
        this.iv=iv;
    }
}
