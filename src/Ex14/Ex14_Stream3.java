package Ex14;

//스트림의 중간연산핵심:map, flatMap
//스트림의 최종연산핵심:reduce, collect
//강의 165 06:50 책필기, 강의 166 06:10, 11:30 책필기

import java.util.Comparator;
import java.util.stream.Stream;

public class Ex14_Stream3 {

    public static void main(String[] args) {
        Stream<Student> studentStream=Stream.of(
                        new Student("이자바", 3, 300),
                        new Student("김자바", 1, 200),
                        new Student("박자바", 2, 100),
                        new Student("소자바", 2, 150),
                        new Student("마자바", 1, 200),
                        new Student("살자바", 3, 290)
        );

        studentStream.sorted(Comparator.comparing(Student::getBan)//반병졍렬
                .thenComparing(Comparator.naturalOrder()))//기본졍렬
                .forEach(System.out::println);
    }

}

class Student implements Comparable<Student>{
    String name;
    int ban;
    int totalScore;

    Student(String name, int ban, int totalScore){
        this.name=name;
        this.ban=ban;
        this.totalScore=totalScore;
    }

    public String toString(){
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }

    String getName()        {return name;}
    int getBan()         {return ban;}
    int getTotalScore()    {return totalScore;}


    //총점 내림차순을 기본 정렬로 한다.
    public int compareTo(Student s){
        return s.totalScore-this.totalScore;
    }
}