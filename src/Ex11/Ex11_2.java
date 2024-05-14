package Ex11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_2 {

	public static void main(String[] args) {
		Stack st=new Stack();   //stack은 이런식으로 가
		Queue q=new LinkedList();
		//	Queue는 인터페이스라서 직접 생성하지 못하고 이것을 구현한 LinkedList를 이용하는데
		//위와 같이 인터페이스 타입으로 생성가능하고 이런식으로 구현하면 다른 Queue를 구현한 클래스도 사용가능하고 
		//LinkedList(); 이부분만 수정하면 다른 코드는 수정할 필요없이 사용가능한 장점이 있다.
		
		
		st.push(1);
		st.push(2);
		st.push(3);
		
		q.offer(1);
		q.offer(2);
		q.offer(3);
		
		System.out.println("Stack 출력");
		
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println("Queue 출력");
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());   //꺼내기...
		}
		

	}

}
