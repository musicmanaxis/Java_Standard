package Ex14;


import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Ex14_Stream2 {
    public static void main(String[] args) {
        //난수 무한스트림

        IntStream intStream=new Random().ints(); //난수를 발생시키는 무한스트림 생성
        intStream.limit(4).forEach(System.out::println);
        //4개로 한정, limit안하면 무한으로 출력됨

        IntStream intStream1=new Random().ints(10, 5, 10); //난수를 발생시키는 무한스트림 생성
         //10은 10개로  5~9까지 지정
        intStream1.forEach(System.out::println);


        //람다식을 소스로 무한 스트림 만들기
        //iterate()는 초기값과 이전 요소를 seed로 해서 다음 요소를 계산한다.
        //generator()는 초기값, seed를 사용하지 않는다.

        Stream<Integer> intStream2=Stream.iterate(0, n->n+2);
        //0은 초기값, n->n+2는 람다식으로 어떤수를 주면 2를 더하는 식
        intStream2.limit(6).forEach(System.out::print);

        System.out.println();
        Stream<Integer> oneStream=Stream.generate(()->1);
        oneStream.limit(6).forEach(System.out::print);
    }
}
