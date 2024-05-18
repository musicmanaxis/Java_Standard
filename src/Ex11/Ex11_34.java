package Ex11;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.*;

public class Ex11_34 {
    public static void main(String[] args) {

        String[] data={"E","C", "C", "C","A", "B", "B", "D", "D", "D", "D", "E" };

        TreeMap tmp= new TreeMap();

        for(int i=0; i< data.length;i++){
            if(tmp.containsKey(data[i])){
                int a=(int)tmp.get(data[i]);
                tmp.put(data[i], a+1);
            }else{
                tmp.put(data[i], 1);
            }
        }

        //단순히 Map자체에서 꺼내거나 집어넣을때는 get(), put()을 쓰지만,
        //하나하나 데이터 조작을 위해선 Iterator가 필요하고 map에서는 Iterator를 생성할수 없어서 Set으로 변환한 다음
        //Iteraror를 얻어내고, 읽어온것을 다시 Map.Entry(키와 값)으로 변환하여 사용한다.

        Iterator it=tmp.entrySet().iterator();  //tmp.entrySet()->맵을 Set으로 변환

        while(it.hasNext()){
           Map.Entry me=(Map.Entry) it.next();
           System.out.println(me);
           int b=(int)me.getValue();  //키와 값으로 된것중에(Map.Entry me) 값만(me.getValue()) 가져온다.
           System.out.println(me.getKey()+":"+printBar('#', b)+"->"+b);
        }


        System.out.println("데이터 내림차순으로 정렬후");
        Set set=tmp.entrySet();
        List arrayList=new ArrayList(set);   //정렬을 위해 ArrayList사용
        Collections.sort(arrayList, new ValueComparator());  //sort(정렬대상, 정렬기준)

        it=arrayList.iterator();

        while ((it.hasNext())){
            Map.Entry me=(Map.Entry) it.next();

            int b=(int)me.getValue();
            System.out.println(me.getKey()+":"+printBar('#', b)+"->"+b);
        }
   }

   public  static String printBar(char a, int b){
        char[] sharp=new char[b];

        for(int i=0; i<sharp.length;i++){
            sharp[i]=a;
        }

        return  new String(sharp);
   }


    static class ValueComparator implements Comparator{   //내림차순 정렬
        public int compare(Object o1, Object o2){

            if(o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
                Map.Entry e1 = (Map.Entry) o1;
                Map.Entry e2 = (Map.Entry) o2;

                int a=(int) e1.getValue();
                int b=(int) e2.getValue();
                return  b-a;
            }else{
                return  -1;
            }
        }
    }
}


