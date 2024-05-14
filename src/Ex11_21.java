import java.util.*;

public class Ex11_21 {

	public static void main(String[] args) {
		
		Set set=new HashSet();
		
		for(int i=1; set.size()<6;i++) {
			System.out.print(i+"회 반복-> ");
			System.out.println("추가전 setSize():"+set.size());
			int a=(int)(Math.random()*45)+1;
			
			set.add(new Integer(a));
			System.out.print("추가후  setSize():"+set.size()+"  set의 내용: "+set);
			System.out.println();
		}
		System.out.println();
		List list=new LinkedList(set);  //set은 정렬이 불가능..그래서 List에 담음..
		Collections.sort(list);
		
		System.out.println(list);

	}

}
