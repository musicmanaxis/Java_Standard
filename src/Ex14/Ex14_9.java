package Ex14;
import java.io.File;
import java.util.stream.Stream;

// 스트림의 중간연산
// map()->스트림에서 원하는 필드만 뽑아내거나 특수형태로 변환, 예)파일스트림에서 스트링 스트림으로 변환
// peek()는 중간연산->forEach()출력과 비슷, flatMap()->map이랑 비슷
public class Ex14_9 {

    public static void main(String[] args) {
        File[] files={  new File("Ex1"), new File("Ex1.bak"), new File("Ex12.txt"),
                        new File("Ex2.java"), new File("Ex1.txt")
                    };

        System.out.println("getName()용도를 알아보자==========");
        for(int i=0; i< files.length; i++){
            System.out.print(files[i].getName()+", ");   //File클래스의 getName()용도를 알고 싶어서 작성함
        }



        Stream<File> fileStream=Stream.of(files);

        //매서드 참조표현
        //Stream<String> fileNameStream=fileStream.map(File::getName);
        Stream<String> fileNameStream=fileStream.map((f)->f.getName());  //map(람다식)
        //객체의 메서드이므로 f.getName()으로 표현, File클래스에 이름을  String으로 반환하는 getName()메서드가 있다.
        //Stream<File>을 Stream<String>로 변환할려고 map()사용
        System.out.println();
        System.out.println("파일이름 출력===========");

        fileNameStream
                .map(s->s.concat(", "))  //String class의 덧붙이기로 변경
                .forEach(f->System.out.print(f));  //아래와 같음
              //.forEach(System.out::print);

        System.out.println();
        System.out.println("중간연산 작업========");
        fileStream = Stream.of(files);  //스트림을 다시 생성
        fileStream.map(File::getName)   //fileStream<File>속성을 fileStresm<String>으로 map을 사용해서 변환
                  .filter(s->s.indexOf('.')!= -1)  //확장자가 없는 것은 제외, indexOf('.')!= -1의 의미->'.'이 있다면..이후 코드 수행
                  //indexOf('.') 지정한 문자가 문자열에 몇번째에 있는지를 인덱스 위치(int)를 리턴한다.
                  //indexOf('.') -> -1이 반환된다면 .이 없다는 것을 의미한다...없으면 -1을 반환
                  //filter()->연산결과가 boolean인 람다식을 사용한다. true이면 아래문장실행...
                  //indexOf('.')!= -1 -> -1이 아니지?->true
                 .peek(s->System.out.printf("peek 이용, 파일이름추출=%s%n", s))  //peek:중간에 작업이 잘 되는지 확인용도로 쓰임
                 .map(s->s.substring(s.indexOf('.')+1))//확장자만 추출, substring(숫자)startIndex부터 끝까지의 문자열을 리턴
                 .peek(s->System.out.printf("peek 이용, 확장자만추출=%s%n", s))
                 .map(String::toUpperCase)
                 .distinct()
                 .forEach((s)->System.out.println(s));



    }


}
