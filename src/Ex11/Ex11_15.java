package Ex11;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex11_15 {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList(10);
		ArrayList list2=new ArrayList(10);
		ArrayList list3=new ArrayList(10);
		
		for(int i=0; i<10;i++) list1.add(i+"");
		
		Iterator lt=list1.iterator();
		
		while(lt.hasNext()) list2.add(lt.next());
		
		System.out.print("list1의 내용 :"+list1);
		System.out.println();
		System.out.print("list2의 내용 :"+list2);
		
		lt=list1.iterator();   //iterator를 사용할려면 다시 생성해줘야 한다..
		
		while(lt.hasNext()) {
			list3.add(lt.next());
			lt.remove();   //remove()를 사용하려면 그 이전에 next()를 사용해야 한다..
		}
		System.out.println();
		System.out.print("list1의 내용 :"+list1);
		System.out.println();
		System.out.print("list2의 내용 :"+list3);
	}

}
