import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11_32 {

    static HashMap phoneBook =new HashMap();   //그룹이름으로 키값지정, 값으로는 HashMap내부적으로 또 생성
    //phoneBook은 (key:groupName, value:HashMap(tel, name)) 형태로 되어 있음..
    //phoneBook HashMap안에 값으로 HashMap이 있는 상태

    public static void main(String[] args) {
        addPhoneNo("친구", "이자바", "010-3445-3456");
        addPhoneNo("친구", "김자", "010-3435-3456");
        addPhoneNo("친구", "이자바", "010-445-3456");
        addPhoneNo("company", "이자바", "010-34445-3456");
        addPhoneNo("친구", "이자바", "010-31235-3456");
        addPhoneNo("company", "이자바", "010-34456-3456");
        addPhoneNo("ace", "010-3485-3445");
        printList();

    }

    static void addPhoneNo(String groupName, String name, String tel){
        addGroup(groupName);  //그룹이름으로 해당 그룹이 없다면 내부적으로 HashMap생성
        HashMap group=(HashMap)phoneBook.get(groupName);  //get(key값)로 값을 object형태로 반환받음
        //그룹이름으로 값인 HashMap을 가져와서   맡애초롬 번호와 이름을 HashMap형태로 저장.
        group.put(tel, name);
    }

    static  void addPhoneNo(String name, String tel){  //그룹은 없고 이름과 번호만 있는 경우
        addPhoneNo("기타", name, tel);
    }

    static void addGroup(String groupName){  //그룹생성
        if(!phoneBook.containsKey(groupName)){  //key값에서 groupName으로 된 키가 없다면..새로운 그룹아름으로 생성
            phoneBook.put(groupName, new HashMap());
        }
    }

    static void printList(){
        Set set=phoneBook.entrySet();
        Iterator it=set.iterator();
        while(it.hasNext()){
           Map.Entry e= (Map.Entry)it.next();
           Set subSet=((HashMap)e.getValue()).entrySet();
           Iterator subIt=subSet.iterator();

           System.out.println("* "+e.getKey()+"["+subSet.size()+"]");
           while (subIt.hasNext()){
              Map.Entry subE=(Map.Entry) subIt.next();
              String tel=(String) subE.getKey();
              String name=(String)subE.getValue();
              System.out.println("Name:"+name+", tel:"+tel);
           }
            System.out.println();
        }


    }


}
