package Ex14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//컬렉션을 데이터소스로 하여 스트림을 쓸려면 1.데이터소스에서 스트림으로 변환하고
//2.중간연산(여러번 가능)을 하고
//3.최종연산을 하게 된다...한번 최종 연산된 것은 다시 쓸수 없으며 Iterator처럼 재생성해야 한다

public class Ex14_Stream1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5); 
        Stream<Integer> intStream=list.stream();    //1.
        intStream.forEach(System.out::print);  //3.
        System.out.println();

        intStream=list.stream();    //위에서 최종 연상을 해서 다시 생성
        intStream.forEach(System.out::print);  //3.
        System.out.println();

        //다음은 데이터 소스를 배열로 하여 처리하는 방법이다.
        String[] str={"a, ", "b, ", "v, ", "f"};
        Stream<String> strStream=Stream.of(str);  //배열을 스트림으로 변환
        strStream.forEach(System.out::print);
        System.out.println();

        String[] str1={"ㄱ, ", "ㄴ, ", "ㄷ, ", "ㄹ"};
        Stream<String> strStream1=Arrays.stream(str1);  //배열을 스트림으로 변환
        strStream1.forEach(System.out::print);
        System.out.println();

        //int배열
        int[] intArr1={1,2,3,4,5};
        IntStream intStream1=Arrays.stream(intArr1);  //IntStream 반환타입 주목
        //intStream1.forEach(System.out::print);
        System.out.println("sum="+intStream1.sum());
        intStream1=Arrays.stream(intArr1);
        System.out.println("count="+intStream1.count());


        Integer[] intArr2={1,2,3,4,5}; //레퍼클래스일 경우
        Stream<Integer> intStream2=Arrays.stream(intArr2);  //반환타입 주목
        intStream2.forEach(System.out::println);
        //Stream<Integer> 형식을 쓰면 sum(), average()와 같은 메서드가 없어 쓸수 없다.




    }
}
