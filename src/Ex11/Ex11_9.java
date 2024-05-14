package Ex11;

import java.util.Stack;

public class Ex11_9 {
	
	public static Stack back=new Stack();
	public static Stack forward=new Stack();
	public static int backclick=0;
	public static int forwardclick=0;

	public static void main(String[] args) {
		
		goURL("1.Daum");
		goURL("2.Naver");
		goURL("3.Yahoo");
		goURL("4.Lycos");
		
		printStatus();
		
		goBack();
		System.out.println("After Back Button Click");
		printStatus();
		
		goBack();
		System.out.println("After Back Button Click");
		printStatus();
		
	    goForward();
		System.out.println("After Back Button Click");
		printStatus();
		
		goURL("5.Axis");
		System.out.println("새로운 주소입니다.");
		printStatus();
		

	}
	
	public static void printStatus() {
		System.out.println("back:"+back+backclick+"회 뒤로클릭 입니다.");
		System.out.println("forward:"+forward+forwardclick+"회 앞으로 클릭 입니다.");
		System.out.println("현재화면은 "+back.peek()+"입니다. ");  //peek() 꺼내지는 않고..맨위에 것을 보기만함..
		System.out.println();
	}
	
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty()) forward.clear();
	}
	
	public static void goForward() {
		if(!forward.empty()) back.push(forward.pop());  //pop()은 꺼내면서 삭제함..
		++forwardclick;
	}
	
	public static void goBack() {
		if(!back.empty()) forward.push(back.pop());
		++backclick;
	}

}
