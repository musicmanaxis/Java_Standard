package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map=new HashMap<>();
        map.put(1, "banana");
        map.put(2,"apple");
        map.put(3,"grape");

        Set<Map.Entry<Integer, String>> s1=map.entrySet();
        //entrySet()의 반환타입이 Set<Map.Entry<K, V>>이다..
        s1.forEach(s->System.out.println(s.getKey()+", "+s.getValue()));


        map.entrySet().forEach(s->System.out.println(s.getKey()+"= "+s.getValue()));


    }
}
