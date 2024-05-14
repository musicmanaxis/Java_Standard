import java.util.EmptyStackException;
import java.util.Stack;

//괄호 검사를 하는 프로그램, '(' 갯수와 ')'의 갯수가 일치하는지 검사.  ->스텍을 이용 (수식이용에 쓰임)

public class Ex11_3 {

	public static void main(String[] args) {
		
		Stack st=new Stack();
		
		String exp= "((3+4)*4)";  //검사대상  
		
		try {
			for(int i=0; i< exp.length() ; i++) {
			
				char ch=exp.charAt(i);  //String을 반복적으로 배열처럼 꺼낸다.  
				
			
				if(ch == '(') {
					st.push(ch);   //문자열 객체로 집어넣음   
					System.out.println(st);
				}else if(ch == ')') {
					st.pop();
				}
			}
			
			if(st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
				
			}else{
				System.out.println("괄호가 일치하지 않습니다.");
				
			}
		}catch(EmptyStackException e) {   //만약에 닫는 괄호가 많으면..이런 예외처리를 한다. 
			System.out.println("괄호가 일치하지 않습니다. Exceptio Error");
		}

	}

}
