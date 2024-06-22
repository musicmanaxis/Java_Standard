package Ex14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex14_4 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0; i<=9; i++)
            list.add(i);

        list.forEach(c->System.out.print(c+","));
        //lterable 인터페이스 void forEach(Consumer<T> action) 메서드 이용
        //인자가 하나들어가서 반환값이 없는 출력만 한다..출력은 Consumer<T> 반환에 해당하지 않음...
        //lterable의 while구문을 이용해 hasNext(), nextLine()사용없이 간단히 출력

//        Iterator it=list.iterator();
//        while(it.hasNext()){
//            System.out.print(it.next()+", ");
//        }//이거와 같은 거임

        System.out.println();

        list.removeIf(x->x%2==0 || x%3==0);  //2와 3의 배수 삭제
        System.out.println(list);

        list.replaceAll(s->s*10);
        System.out.println(list);

        Map<String, String> map=new HashMap<>();
        map.put("1", "11");
        map.put("2", "22");
        map.put("3", "33");
        map.put("4", "44");

        map.forEach((a,b)->System.out.print("key:"+a+"->value:"+b+", "));
    }
}
