package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1; i<=10 ;i++){
            list.add(i);
        }


        Consumer<Integer> a=i->System.out.print(i);

        list.forEach(a);
        list.removeIf(i->i%2==0);
        System.out.println();
        list.forEach((s)->System.out.println(s));


        ArrayList<String> list1=new ArrayList<>();
        list1.add("all");
        list1.add("ball");
        list1.add("call");

        Consumer<String> b=i->System.out.println(i);
        list1.forEach(b);

        StringBuilder sb=new StringBuilder();
        Map<Integer, String> mp=new HashMap();
        mp.put(1, "String");
        mp.put(2, "mpa");
        System.out.println(mp.get(1));

        mp.forEach((key, value)->System.out.println(key+":" +value));
        //mp.entrySet().forEach(map -> {sb.append(mp.getKey() + ":" + map.getValue() + "\n"); });

    }
}
