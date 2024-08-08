package Test;

import java.nio.file.OpenOption;
import java.util.Optional;

public class TestOptional {
    public static void main(String[] args) {
        Optional<String> opt=Optional.of("erlia");  //객체를 생성하는 방법  of(null)하면 익셉션 발생
        System.out.println(opt.get());   //객체를 꺼내는 방법

        Optional<Integer> opt1=Optional.of(22);
        System.out.println(opt1.get());

        Optional<String> op3=Optional.empty();   //null을 넣고 싶으면 이렇게...
        try{
        System.out.println(op3.get());
        }catch (Exception e){
            System.out.println("null");
        }

        //optional 출력방법  orElse(), orElseGet(람다식입력)을 많이 씀
        Optional<String> opt4=Optional.ofNullable(null);  //Optional 객체 null도 생성가능..대부분 이것을 사용.
        System.out.println(opt4.orElse("널발생"));
        //널이 들어갔다면 exception을 발생시키지 않고 orElse 인수값으로 넣은 메세지 출력 가능

        String a="erlia";
        if(Optional.ofNullable(a).isPresent()){  //isPresent()이 널이면 false 아니면 true
            // ..여기선 널이 아니므로 아래코드 실행
            System.out.println(a);
        }
    }
}

