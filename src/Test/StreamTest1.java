package Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest1 {
    public static void main(String[] args) {
        String[] str={" cgv", " abc", " cbafghg"};
        Stream<String> strStream= Arrays.stream(str);
        strStream.sorted().forEach(System.out::print);


         System.out.println();
        Integer[] intA={34,12, 45, 78, 1, 4, 7, 8};
        Stream<Integer> intStream1=Arrays.stream(intA);
        //filter()에 Predicate을 넣기 위해 조건을 만들었다.
        Predicate<Integer> intP= (i)->10<(i)&&(i)<100;

        System.out.print("필터링결과:");
        intStream1.filter(intP).forEach(System.out::print);

        System.out.println();
        Stream<Integer> intStream2=Arrays.stream(intA);
        List<Integer> list1=intStream2.filter(intP).sorted().collect(Collectors.toList());
        System.out.print("필터링과 정렬결과:");
        System.out.println(list1);


    }
}
