package Ex14;

/*스트림에서 정렬을 사용하는 방법
Comparator.comparing(), .thenComparing() 사용법*/

import java.util.Comparator;
import java.util.stream.Stream;


public class Ex14_8_streamSort {

    public static void main(String[] args) {
        Stream<Student> studentStream=Stream.of(
                        new Student("이자바", 3, 300),
                        new Student("김자바", 1, 200),
                        new Student("박자바", 2, 100),
                        new Student("소자바", 2, 150),
                        new Student("마자바", 1, 200),
                        new Student("살자바", 3, 290)
        );

        studentStream.sorted(Comparator.comparing((Student s)->s.getBan())//반별졍렬  (Student s)->s.getBan() == (Student::getBan)
                .thenComparing(Comparator.naturalOrder()))//기본졍렬로 정렬조건을 추가한 메서드 사용, sorted()안에 comparing(), thenComparing()이 있음
                .forEach(System.out::println);

        //Comparator.comparing()을 써서 정렬인터페이스를 매개변수로 넣는다...


    }

}

class Student implements Comparable<Student>{  //정렬을 위해 인터페이스 구현
    String name;
    int ban;
    int totalScore;

    Student(String name, int ban, int totalScore){
        this.name=name;
        this.ban=ban;
        this.totalScore=totalScore;
    }

    public String toString(){
       // return String.format("[%s, %d, %d]", name, ban, totalScore);
        return "["+this.name+", "+this.ban+", "+this.totalScore+"]";
    }

    String getName()        {return name;}
    int getBan()         {return ban;}
    int getTotalScore()    {return totalScore;}


    //정렬기준 오버라이딩:여기서 정렬기준은 totalScore을 기준으로 정렬시킨다
    public int compareTo(Student s){
        return s.totalScore-this.totalScore;  //총점 내림차순을 기본 정렬로 한다.(높은 점수가 맨위로)
    }
}