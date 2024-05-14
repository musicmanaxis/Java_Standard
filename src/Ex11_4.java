import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {
	static Queue q=new LinkedList();  //저장할 객체생성..
	static final int MAX_SIZE=5;   //history 는 5개를 담는걸로 한다.
	
	public static void main(String[] args) {
		System.out.println("if U typing help, u will see help words");
		
		while(true) {
			System.out.println(">>");
			
			try {
				Scanner s=new Scanner(System.in);
				String input=s.nextLine().trim();
				
				if("".equals(input)) continue;   //빈문자 입력이면 while문으로 되돌아간다. 
				
				if(input.equalsIgnoreCase("q")) {    //프로그램 나가기 
				  System.exit(0);    
				}else if(input.equalsIgnoreCase("help")) {   //도움말 보기   
					System.out.println(" help - 도움말을 보여줍니다.");
					System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
					System.out.println(" history - 최근에 입력한 명령어를 "
                                                  + MAX_SIZE +"개 보여줍니다.");
				}else if(input.equalsIgnoreCase("history")) {   //history라고 입력하면  
					int i=0;  //번호를 붙이기 위해..마
					save(input);   //입력한 history 마저 저장하고..
					
					LinkedList list=(LinkedList)q;  //저장된걸 꺼내기 위해 listIterator를 이용한다.
					ListIterator it=list.listIterator();
					
					while(it.hasNext())     //저장된 객체를 다 읽을때까지 무한반복  
						System.out.println(++i+"."+it.next());  //번호를 붙여서 객체에서 꺼내온다..
				}else {
						save(input);     // history 가 아닌 다른 말입력이라면 그냥 단순히 저장하고..
						System.out.println(input);   //방금 타이핑한걸 보여준다..
						}
				
			
			}catch(Exception e) {
				System.out.println("입력오류입니다.");
			}
		}
	}
	
	public static void save(String input) {    //큐를 이용한 저장  
		if(!"".equals(input))
			q.offer(input);
		if(q.size()>MAX_SIZE)  //입력한 크기가 5개보다 많으면 맨처음 들어간것부터 삭제한다...
			q.remove();
	}

}
