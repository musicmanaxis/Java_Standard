package Ex14;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class Ex14_Stream5 {
    public static void main(String[] args) {

        Stream<String[]> strArrStrm=Stream.of(
                new String[]{"abc", "def", "jkl"},
                new String[]{"ABC", "GHI", "JKL"}
        );


        Stream<String> strStrm=strArrStrm.flatMap(Arrays::stream);
        //2개의 스트링 배열을 한개의 스트림으로 합침

        strStrm.map(String::toLowerCase)  //스트림 요소를 소문자
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        String[] lineArr={
                "Believe or not It is true",
                "Do or do not There is no try"
        };

        Stream<String> lineStream=Arrays.stream(lineArr);
        lineStream.flatMap(line->Stream.of(line.split(" +")))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        //line(String을) ->line.split(" +") :String[](문자열 배열로 변환)
        //" +" ->정규식:하나 이상의 공백  cf)" ":공백하나를 의미

    }
}
