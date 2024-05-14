import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {

	public static void main(String[] args) {

		ArrayList list1=new ArrayList(10);
		//처음에 생성할 때 크기를 적당하게 정하는것이 중요하다.
		
		//add()는 모든게 다 된다고 생각하자..
		
		list1.add(5);   // 이렇게도 가능하는데 이것은 오토박싱에 의해 처리된다.
		list1.add(new Integer(6));  //list는 객체만 저장가능한데..오토박싱기능으로 기본형이 객체화 되었다.
		list1.add(new Integer(1));
		list1.add(new Integer(7));
		list1.add(new Integer(0));
	//	list1.add("사랑해");  //  ->이렇게도 되는데 Collections.sort(list1) 밑에 여기서 정렬이 안됨..
		
		
		ArrayList list2=new ArrayList(list1.subList(1, 4));  //일부만 가져와서 새로운 리스트 생성  
		
		print(list1, list2);
		
	//	System.out.println("so far so good");
		
		Collections.sort(list1);   //정렬 Collection은 인터페이스, Collections는 클래스  
		Collections.sort(list2);
		print(list1, list2);
		
		System.out.println("list1의 내용에 list2가 다포함되었습니까?->"+list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");  //중간에 넣기  
		
		print(list1, list2);
		
		list2.set(3, "AA");   //변경  
		print(list1, list2);
		
		
		list1.add(1, "숫자");  // 숫자만 있는곳에 문자열추가  
		print(list1, list2);
		
	    System.out.println("문자열 숫자의 위치를 알아보자->"+list1.indexOf("숫자")+"에 위치함.");
	    //indexOf 는 지정한 객체의 위치를 알려준다..
	    
	    //삭제는 아래와 같이 위치를 지정하던지, 객체를 지정하던지..맘데로 하나하나를 지울 수 있다...
	   list1.remove(4); //인덱스4 번째인것을 삭제
	   System.out.println("인덱스 4번째  삭제후 출력 ");
	   print(list1, list2);
	   list1.remove(new Integer(5));  //  숫자 5인 것을  지우고 싶을때 
	   list1.remove("숫자");
		 
	  System.out.println("list1의 숫자5,숫자라는 말 삭제후 출력 ");
	   print(list1, list2);
	   
	   
	   //list2에서 list1에 있는 내용을 삭제한다..
	  for(int i=list2.size()-1; i>=0;i--) {  //뒤에서부터 삭제하기 위해...자리이동을 않하고 속도를 높일려고..
		  if(list1.contains(list2.get(i))) 
		  list2.remove(i);
	  }
	  
	  print(list1, list2);
	}
	
	public static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
		
	}

}
