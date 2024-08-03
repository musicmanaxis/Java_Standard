package Test;

import java.util.function.Predicate;

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


    }
}
