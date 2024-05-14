//do while break, continue 사용

import java.util.Scanner;
public class Ex4_18 {

	public static void main(String[] args) {
		
		int menu=0;
		
		Scanner scan=new Scanner(System.in);
		
		while(true){
			System.out.println("menu 1");
			System.out.println("menu 2");
			System.out.println("menu 3");
			
			String tmp=scan.nextLine();
			menu=Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("program is end");
				break;  //반복문을 벗어난다. 
			}else if(!(1<=menu  && menu<=3)) {
				System.out.println(menu +" is Wrong menu, Try it Again:");
				continue;   // 아래 문장이 실행되지 않고 반복문 처음으로 
			}
			
		  System.out.println("Your Menu is "+menu);
		
		}

	}
}
