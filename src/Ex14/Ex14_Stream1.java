package Ex14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//스트림을 쓸려면 1.데이터소스에서 스트림으로 변환하고
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
        
        
    }
}
