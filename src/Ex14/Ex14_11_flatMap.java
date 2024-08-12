//flapMap(람다식)
//2개이상의 스트림을 하나의 스트림으로 만들려고 할 때 사용

package Ex14;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Ex14_11_flatMap {
    public static void main(String[] args) {

        Stream<String[]> strArrStrm=Stream.of(
                new String[]{"abc", "def", "jkl"},
                new String[]{"ABC", "GHI", "JKL"}
        );   //Stream<String[]> 생성


      //  Stream<String> strStrm=strArrStrm.flatMap(Arrays::stream);
        Stream<String> strStrm=strArrStrm.flatMap((s)->Arrays.stream(s));
        //2개의 스트링 배열을 한개의 스트림으로 합침 -> Stream<String> strStrm

        strStrm.map(String::toLowerCase)  //스트림 요소를 소문자로 변환
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        String[] lineArr={
                "Believe Or Not It Is True",   //1번째 배열
                "Do Or Do Not There Is No Try"  //2번째 배열
        };   //대상 2문장...2개이상의 배열을 가지고 있는 위의 상황과 비슷하다. ->flatMap(람다식)사용


        Stream<String> lineStream=Arrays.stream(lineArr);  //문자열 배열을 문자열스트림으로  생성
        lineStream.flatMap(line->Stream.of(line.split(" +")))
                .peek(s -> System.out.print(s))
                .distinct()
                .sorted()
                .forEach(System.out::println);

        //line(문장을) ->line.split(" +") :String[](문자열 배열로 나누어서 변환)
        //" +" ->정규식:'하나 이상의 공백'을 의미(혹시 공백이 하나이상일 경우를 대비해서..)  cf)" ":공백하나를 의미

    }
}
