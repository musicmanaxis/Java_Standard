package Ex14;

//Optional<T> T타입의 객체를 감싸는 래퍼클래스, Null과 모든 타입의 참조변수를 담을 수 있다.
//Null울 다루기 위한 것인데, null을 직접 다루지 않고 간접적으로 다루기 위해 쓰인다.
//간접적으로 쓰게 되면 Exception처리를 하지 않아도 되고, if문을 사용하여 검사를 안해도 된다.


import java.util.Optional;
import java.util.OptionalInt;

public class Ex14_12_Optional {
    public static void main(String[] args) {

        int[] arr={};  //이린식으로 초기화를 해주어야 한다. null로 초기화하면 exception처리 필요
        System.out.println("arr.length="+arr.length);

        //Optional<String> opt=null;  //가능하지만 바람직하지 않다.
        Optional<String> opt11=Optional.empty();  //optional은 이런식으로 초기화한다.
        System.out.println("opt11="+opt11);

        String str="";

        str=opt11.orElse("비어 있습니다");  //orElse("")안의 내용이 반환된다.
        System.out.println(str);


        /////////////////////////책 내용/////////////////////////////////
        System.out.println("Optional 사용하기");
        Optional<String> optStr=Optional.of("abcde");//optional객체 생성방법
        String a=optStr.get();  //optional객체를 꺼내본다.
        System.out.println("a의 내용:"+a+", 문자열 a의 길이:"+a.length());



        Optional<Integer> optInt=optStr.map(s->s.length());  //길이값을 숫자로 변환
        System.out.println("optStr.get()="+optStr.get());
        System.out.println("optInt.get()="+optInt.get());

        int result1=Optional.of("123")
                .filter(x->x.length() >0)  //결과가 boolean값인데, 문자열 길이가 0보다 큰것이라면 통과시켜라 라는 의미
                .map(i->Integer.parseInt(i)).orElse(-1);
                 //map을 사용하여 문자열 123을 숫자로 변환, Optional객체도 map()를 가지고 있다.
        System.out.println("result1="+result1);

        int result2=Optional.of("")
                .filter(x->x.length()>0)  //빈 문자열의 길이가 0보다 큰가? ->false
                .map(i->Integer.parseInt(i)).orElse(-1);  //통과 못한것이 있다면 -1반환

        System.out.println("result2="+result2);

        Optional<String> opt1=Optional.ofNullable("22222");  //optional객체를 생성할 때 이것을 많이 사용한다. Null도 저장가능해서
        String s1=opt1.orElse("No Optional Content");  //빈것이라면 이 내용출력
        System.out.println(s1);


        Optional<Integer> opt2=Optional.ofNullable(33333);
        int intA=opt2.orElse(-1);  //빈것이라면 -1로 반환..Optional<T>에 따라 orElse(여기선 int값 지정)인자가 달라진다.
        System.out.println(intA);

        Optional.of("456").map(Integer::parseInt)
                .ifPresent(x->System.out.printf("result3=%d%n", x));   //값이 있다면 실행
                //ifPresent(람다식) :null이 아닐때만 값을 출력하고 null이면 아무일도 일어나지 않는다.


        //OptionalInt을 사용함으로서 Optional<T>를 사용하는것보다 더 좋은 성능과 다양한 메서드를 제공한다.
        OptionalInt optInt1= OptionalInt.of(0);  //optInt1에 0저장
        OptionalInt optInt2= OptionalInt.empty();    //optInt2에 0저장

        System.out.println("optInt1.isPresent()->"+optInt1.isPresent());
        System.out.println("optInt2.isPresent()->"+optInt2.isPresent());
        //저장된 값이 없는것과 0이 저장된 것을 구분할려면 isPresent()사용

        System.out.println("optInt1.getAsInt()->"+optInt1.getAsInt());  //int값 반환
       // System.out.println("optInt2.getAsInt()->"+optInt2.getAsInt());  //exception 발생

        System.out.println("optInt1->"+optInt1);
        System.out.println("optInt2->"+optInt2);
        System.out.println("optInt1.equals(optInt2)?"+optInt1.equals(optInt2));

        Optional<String> opt=Optional.ofNullable(null) ; //null을 저장
        Optional<String> opt3=Optional.empty();
        System.out.println("opt->"+opt);
        System.out.println("opt3->"+opt3);
        System.out.println("opt.equals(opt3)?"+opt.equals(opt3));

        int result3=optStrToInt(Optional.of("123"), 0);
        int result4=optStrToInt(Optional.of(""), 0);

        System.out.println("result3="+result3);
        System.out.println("result4="+result4);


        }

    static int optStrToInt(Optional<String> optStr, int defaultValue){
        try {
            return optStr.map(Integer::parseInt).get();
        }catch (Exception e){
            return defaultValue;
        }




    }
}
