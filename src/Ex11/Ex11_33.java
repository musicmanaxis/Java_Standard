package Ex11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex11_33 {
    public static void main(String[] args) {
        String[] data={"A", "B", "B", "C", "C", "C", "D", "D", "D", "D", "E", "E"};


        HashMap map=new HashMap();

        for(int i=0;i< data.length;i++){
            if(map.containsKey(data[i])) {   //data의 자료가 맵의 키값으로 사용(알파벳이 키값으로 사용), 1.같은 키값이 있다면..
                Integer value = (Integer) map.get(data[i]);   //get(key값으로)->값반환  2.그 키의 값의 숫자를 가져온다.
              //  int value1=(int)map.get(data[i]);   //위의 것을 이렇게 해도 된다.


               // System.out.println( "value.intValue()->"+new Integer(value.intValue())+1);
                System.out.println(map.values()+":"+  map.get(data[i]));
               map.put(data[i], new Integer(value.intValue())+1);  //3.깉은 키가 있으면 해당키의 값을 1을 더 증가시킨다.
              //  map.put(data[i], value1+1);  //위의 것을 이렇게 해도 된다.

            }else {
                map.put(data[i], new Integer(1));   //해당키가 처음이면 값으로 1로 처음으로 할당

            }
        }  //결국 map에는 (F, 3)이런식으로 담긴다..F 키가 3개있다는 뜻


        Iterator it=map.entrySet().iterator();

        while (it.hasNext()){
            Map.Entry e=(Map.Entry)it.next();  //키와 값으로 이루어진 엔트리를 구하고
            int value=((Integer)e.getValue()).intValue();  //그 엔트리에서 값(숫자)을 가져온다.
          //  int value1=(int)e.getValue();   //이렇게 해도 된다.
            System.out.println(e.getKey()+":"+printBar('#', value)+" "+value);
        }

    }

    public  static String printBar(char ch, int value) {  //value의 숫자만큼 #으로 표시하는 메서드
        char[] bar = new char[value];  //중복된 알파벳 갯수만큼의 크기로 배열을 만듦

        for (int i = 0; i < bar.length; i++)
            bar[i] = ch;    //#을 배열의 크기만큼 채움

            return new String(bar);  //char  배열을 String 문자로 반환
    }


}


