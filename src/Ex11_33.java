import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex11_33 {
    public static void main(String[] args) {
        String[] data={"A", "B", "K", "E","F", "F", "F", "C", "C", "C", "G", "G"};

        HashMap map=new HashMap();

        for(int i=0;i< data.length;i++){
            if(map.containsKey(data[i])) {
                Integer value = (Integer) map.get(data[i]);   //get(key값으로)->값반환
                System.out.println( "value.intValue()->"+new Integer(value.intValue())+1);
                map.put(data[i], new Integer(value.intValue())+1);  //깉은 키가 있으면 해당키의 값을 1을 더 증가시킨다.


            }else {
                map.put(data[i], new Integer(1));

            }
        }
        Iterator it=map.entrySet().iterator();

        while (it.hasNext()){
            Map.Entry e=(Map.Entry)it.next();
            int value=((Integer)e.getValue()).intValue();
            System.out.println(e.getKey()+":"+printBar('#', value)+" "+value);
        }

    }

    public  static String printBar(char ch, int value) {
        char[] bar = new char[value];  //중복된 알파벳 갯수만큼의 크기로 배열을 만듦

        for (int i = 0; i < bar.length; i++)
            bar[i] = ch;    //#을 배열의 크기만큼 채움

            return new String(bar);  //char  배열을 String 문자로 반환
    }


}


