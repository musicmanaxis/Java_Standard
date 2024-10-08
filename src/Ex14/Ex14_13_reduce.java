/*
스트림의 최종연산 reduce():스트림의 요소를 하나씩 줄여나가면서 누적연산을 수행하고 최종결과를 반환한다.
reduce(초기값, 수행식)처럼 초기값이 있으면 <T>으로 반환하고,
reduce(수행식)처럼  초기값이 없으면 반환되는 것이 null일수 있으므로 Optional<T>으로 반환한다.
* */

package Ex14;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_13_reduce {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance", "Java", "Lamda", "stream",
                "Optional", "IntStream", "count", "sum"
        };

        Stream.of(strArr)
                .parallel()  //병렬처리할 경우
              //.forEach(System.out::println);
                .forEachOrdered(System.out::println);  //스레드를 병렬처리한 것을 순서대로 출력할 때 사용



        boolean noEmptyStr=Stream.of(strArr)
                        .noneMatch(s -> s.length()==0);  //문자열 길이가 0인것이 하나도 없는지?
                        //noneMatch(predicate)은 boolean 타입을 반환한다.
        Optional<String> sWord=Stream.of(strArr)
                        .filter(s->s.charAt(0)=='s') //'s'로 시작하는 단어 첫번째 가져오기  filter()는 스트림을 반환하는 중간연산
                        .findFirst();
                        //findFirst()는 Optional<T>을 반환하는 메서드..Null도 반환할수 있기 때문에

        System.out.println("noEmptyStr="+noEmptyStr);
        System.out.println("sWord="+sWord.get());

        Stream<Integer> intStream=Stream.of(strArr).map(String::length);  //요소를 객체로 다룸
        //아래와 차이점
        IntStream intStream1=Stream.of(strArr).mapToInt(s->s.length());
        IntStream intStream2=Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3=Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4=Stream.of(strArr).mapToInt(String::length);
        //mapToInt  -> Stream<T>을 IntStream(기본형 스트림)으로 변환, 요소를 기본형으로 다룸


        int count=intStream1.reduce(0, (a,b)->a+1);  //단어의 갯수가 몇개?
        //reduce(초기값, 수행식)형식의 반환값은 <T>으로 반환한다.
        int sum=intStream2.reduce(0, (a,b)->a+b);  //단어들의 길이 합계
        System.out.println("count="+count);
        System.out.println("sum="+sum);

        OptionalInt max=intStream3.reduce((a,b)->Integer.max(a,b));
        OptionalInt min=intStream4.reduce(Integer::min);

        //reduce(수행식만)  ->초기값이 없는 수행식만 있는 경우 반환타입은 Null을 고려하여 Optional객체 타입이다.
        System.out.println("max="+max.getAsInt());  //단어들 중에 제일 길이가 긴거, OptionalInt값을 꺼내올때 사용
        System.out.println("min="+min.getAsInt());

        OptionalInt empty=IntStream.empty().reduce(Integer::max);
        System.out.println("empty="+empty.orElseGet(()->0));



    }
}