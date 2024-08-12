package Ex14;

//Optional 객체
//Null울 다루기 위한 것인데, null을 직접 다루지 않고 간접적으로 다루기 위해 쓰인다.
//간접적으로 쓰게 되면 Exception처리를 하지 않아도 되고, if문을 사용하여 검사를 안해도 된다.


import java.util.Optional;

public class Ex14_12_Optional {
    public static void main(String[] args) {

        int[] arr={};  //이린식으로 초기화를 해주어야 한다. null로 초기화하면 exception처리 필요
        System.out.println("arr.length="+arr.length);

        //Optional<String> opt=null;  //가능하지만 바람직하지 않다.
        Optional<String> opt=Optional.empty();  //optional은 이런식으로 초기화한다.
        System.out.println("opt="+opt);

        String str="";

        str=opt.orElse("비어 있습니다");  //orElse("")안의 내용이 반환된다.
        System.out.println(str);

    }
}
