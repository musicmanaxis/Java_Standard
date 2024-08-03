package Test;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RamdaTest {
    public static void main(String[] args) {
        String s="";
        Predicate<String> preTest= s1->s1.length()==0;
        //Predicate인터페이스의 boolean test(T t)를 오버라이딩 한것이다.

        Predicate<String> preTest1=new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()==0;
            }
        };   //위의 람다식을 이런식으로 오버라이딩한것이나 마찬가지이다..
        System.out.println(preTest1.test(s));


        Function<String, Integer> f=(a)->Integer.parseInt(a);
        System.out.println(f.apply("200")+100);

        //메서드 참조:람다식을 더 간단히 하는 방법  클래스이름::메서드 이름
        Function<String, Integer> f1=Integer::parseInt;
        System.out.println(f1.apply("200")+100);

        Supplier<MyClass> s1=()->new MyClass();
        System.out.println("람다식으로 "+ s1.get());

        Supplier<MyClass> s2=MyClass::new;
        System.out.println("메서드 참조로 "+ s2.get());

        //매개변수가 있는 객체생성
        Function<Integer, MyClass> s3=MyClass::new;
        System.out.println("매개변수 객체성성의 변수값:"+s3.apply(100).a);

        //배열을 사용할 때 Function을 이용해야 한다..입력을 해서 크기를 지정해주기 때문에..
        Function<Integer, int[]> f2=int[]::new;   //많이 쓰임
        System.out.println("배열을 이용한 배열의 크기:"+f2.apply(10).length);
    }
}

class MyClass{
    int a=0;
    MyClass(){

    }

    MyClass(int a){
        this.a=a;
    }

    public String toString(){
        return "MyClass 객체 생성 완료";
    }

}