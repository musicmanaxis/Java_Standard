package Ex14;


import java.io.File;
import java.util.stream.Stream;

//스트림의 중간연산
//map()->스트림의 요소변환, 예)파일스트림에서 스트링 스트림으로 변환
// //peak()는 중간연산->forEach(), flatMap()->map이랑 비슷
public class Ex14_9 {

    public static void main(String[] args) {
        File[] files={  new File("Ex1.java"), new File("Ex1.bak"), new File("Ex1"),
                        new File("Ex2.java"), new File("Ex1.txt")
                    };


        for(int i=0; i< files.length; i++){
            System.out.print(files[i].getName()+", ");
        }

        System.out.println("======");

        Stream<File> fileStream=Stream.of(files);

        //Stream<String> fileNameStream=fileStream.map(File::getName);
        Stream<String> fileNameStream=fileStream.map((f)->f.getName());
        //객체의 메서드이므로 f.getName()으로 표현
        //map()으로 Stream<File>을 Stream<String>로 변환하는 것임.

        fileNameStream.forEach(System.out::println);

        fileStream = Stream.of(files);  //스트림을 다시 생성
        System.out.println("중간연산 작업========");
        fileStream.map(File::getName)
                .filter(s->s.indexOf('.')!=-1)  //확장자가 없는 것은 제외  indexOf('.') 지정한 문자가 문자열에 몇번째에 있는지를 인덱스 위치(int)를 리턴한다.
                .peek(s->System.out.printf("fileName=%s%n", s))  //peek:중간에 작업이 잘 되는지 확인용도로 쓰임
                .map(s->s.substring(s.indexOf('.')+1))//확장자만 추출, substring(숫자)startIndex부터 끝까지의 문자열을 리턴
                .peek(s->System.out.printf("exetension=%s%n", s))
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);

        //11:00

    }


}
