package Ex11;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_11 {

	static Queue q= new LinkedList();
	static final int MAX_SIZE=5;  //history 에 저장할 갯
	
	public static void main(String[] args) {
		
		System.out.println("help를 입력하면 도움말을 볼수 있습니다..");
		
		while(true) {
			System.out.println(">>");
			
			try {
				Scanner s=new Scanner(System.in);
				String input=s.nextLine().trim();
				
				if("".equalsIgnoreCase(input)) continue;   //빈문자면 반복문 맨처음으로 돌아감..
				
				if(input.equalsIgnoreCase("q")) { System.exit(0);
				}else if(input.equalsIgnoreCase("help")) {
					System.out.println("help-도움말을 보여줍니다. ");
					System.out.println("q or Q- 프로그램을 종료합니다. ");
					System.out.println("history - 최근에 입력한 명령어를 "+MAX_SIZE+"개 보여줍니다. ");
				}else if(input.equalsIgnoreCase("history")) {
					int i=0;
					
					save(input);  //방금 입력한 history 단어도 저장한다...
					
					LinkedList list=(LinkedList)q;
					ListIterator lt=  list.listIterator();
					
					while(lt.hasNext()) System.out.println(++i+"."+lt.next());
				}else {
						save(input);
						System.out.println(input);
					}
				}catch(Exception e) {
				
					System.out.println("입력 오류입니다. ");
			}
			
			
		}

	}
	
	public static void save(String input) {
		if(!"".equals(input)) {
			q.offer(input);
		}
		
		if(q.size()>MAX_SIZE) {
			q.remove();
		}
	}

}
