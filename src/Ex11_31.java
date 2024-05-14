import java.util.*;

public class Ex11_31 {
    public static void main(String[] args) {
        HashMap map=new HashMap();

        map.put("김자바", new Integer(100));
        map.put("이자바", new Integer(100));
        map.put("강자바", 80);
        map.put("erlia", 90);

        System.out.println("그냥 map출력:"+map);
        Set set=map.entrySet();  //set은 중복을 허용하지 않고 순서도 없다. map은 iterator가 없다..그래서 변환
        Iterator it=set.iterator();

        while (it.hasNext()){
            Map.Entry e=(Map.Entry)it.next();   //포인트
            System.out.println("이름:"+e.getKey()+", 점수:"+e.getValue());
        }

        set=map.keySet();
        System.out.println("참가자 명단:"+set);

        Collection values=map.values();
        System.out.println("그냥 values값->"+map.values());
        it=values.iterator();

        int total=0;

        while(it.hasNext()){
            Integer i=(Integer) it.next();
            total+=i;
        }
        System.out.println("총점은 "+total);
        System.out.println("평균은 "+(float)total/map.size());
        System.out.println("최고점수는 "+Collections.max(values));
        System.out.println("최저점수는 "+Collections.min(values));
    }
}
