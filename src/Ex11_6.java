
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex11_6 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList(1000000);
		LinkedList ll=new LinkedList();
		add(al);
		add(ll);
		
		System.out.println("ArrayList의 속도 :"+access(al));
		System.out.println("LinkedList의 속도 :"+access(ll));
		
		System.out.println("ArrayList의 크기 :"+getSize(al));
		System.out.println("LinkedListSize의 크기 :"+getSize(ll));
		
		System.out.println(al.get(300));
		al.add("love");
		System.out.println(al.get(10000));
		

	}

	public static void add(List list) {
		for(int i=0; i<10000; i++) {
			list.add(i+"*");
		
		}
	}
	
	public static long access(List list) {
		long start=System.currentTimeMillis();
		for(int i=0 ; i<10000 ;i++)
			list.get(i);
		   
		long end=System.currentTimeMillis();
		return end-start;
	}
	
	public static int getSize(List list) {
		return list.size();
	}
	
	public static Object getObject(List list, int index) {
		return list.get(index);
	}
}
