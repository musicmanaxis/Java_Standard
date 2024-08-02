package Test;

import java.util.Optional;

public class TestOptional {
    public static void main(String[] args) {
        Optional<String> opt=Optional.of("erlia");  //객체를 생성하는 방법  of(null)하면 익셉션 발생
        System.out.println(opt.get());   //객체를 꺼내는 방법

        Optional<Integer> opt1=Optional.of(22);
        System.out.println(opt1.get());

        Optional<String> op3=Optional.empty();
        try{
        System.out.println(op3.get());
        }catch (Exception e){
            System.out.println("null");
        }

        Optional<String> opt4=Optional.ofNullable(null);  //null도 가능..대부분 이것을 사용.
        System.out.println(opt4.orElse("널발생"));
        //널이 들어갔다면 exception을 발생시키지 않고 orElse 값으로 넣은 메세지 출력 가능
    }
}

