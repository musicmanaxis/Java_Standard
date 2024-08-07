package Ex14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex14_5 {
    public static void main(String[] args) {
        Supplier<Integer> s = ()->(int)(Math.random()*100)+1;  //무작위에 사용할려고..Supplier의 get()를 오버라이딩 s.get()로 이용
        Consumer<Integer> c = i->System.out.print(i+", ");  //출력만 하려고...c.accept(i)로 이용
        Predicate<Integer> p = i->i%2==0 ;  //짝수만 구하기 위해 ...p.test(i)로 이용
        Function<Integer, Integer> f = i->i/10*10;  //i의 일의 자리를 없애려고...f.apply(i)로 아용

        List<Integer> list=new ArrayList<>();
        makeRandomList(s, list);  //10번을 반복하여 무작위수를 리스트에 담는 메서드
        System.out.println("무작위값 리스트:"+list);
        printEvenNum(p, c, list);  //리스트에 담긴 숫자에서 짝수만 출력
        List<Integer> newList=doSomething(f, list);
        System.out.println(newList);

    }
    
    static <T> List<T> doSomething(Function<T, T> f, List<T> list){
        List<T> newList=new ArrayList<>(list.size());
        
        for(T i:list){
            newList.add(f.apply(i));   //apply -> Function인터페이스의 메서드
        }
        return newList;
    }

    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list){
        System.out.print("[");
        for(T i:list){
            if(p.test(i))
                c.accept(i);
        }
        System.out.println("]");
    }

    static <T> void makeRandomList(Supplier<T> s, List<T> list){
        for(int i=0; i<10; i++){
            list.add(s.get());   //get() -> Supplier<T>인터페이스의 메서드
        }
    }
}
