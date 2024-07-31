package Test;


import java.util.function.*;

//함수형 인터페이스 연습
//함수형 인터페이스를 정의해서 만들어 쓸수 도 있지만 아래와 같이 자바에서 제공하는 함수형 인터페이스를 사용해서
//사용자가 적절하게 재정의 하여 사용한다.
//함수형인터페이스는 객체생성하여 메서드를 사용하는 방식이 아닌 바로 메서드(수학의 함수)를 사용하는 방식이다.
public class Test3 {
    public static void main(String[] args) {

        //숫자의 인자를 주면 주어진 값과 같은지 판별하는 것..참인지 거짓인지..
        System.out.println("Predicate Test====================");
        Predicate<Integer> equalCount=(count)->count.equals(50);
        System.out.println(equalCount.test(50));
        System.out.println(equalCount.test(30));

        //입력은 있느나 출력은 없는 것..
        System.out.println("Consumer Test=====================");
        Consumer<String> cs=(ss)->System.out.println("cs "+ss);
        cs.accept("test");

        //입력없이 출력만 구현
        System.out.println("Supplier Test=====================");
        Supplier<Integer> supplier=()-> 30+50;
        System.out.println(supplier.get());

        //읿력 하나를 하면 그에 따른 출력하나를 하는것..
        System.out.println("Function Test======================");
        Function<Integer, String> ft=(in)-> in+"" ;
        System.out.println(ft.apply(100));

        //입력2개를 하면 결과를 출력할 때 쓰임
        System.out.println("BiFunction Test======================");
        BiFunction<Integer, Integer, String> biFunction=
                (num1, num2)->{int sum=num1+num2; return ""+sum; };
         System.out.println(biFunction.apply(20, 20));
    }
}
