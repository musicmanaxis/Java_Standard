import java.util.HashMap;
import java.util.Scanner;

public class Ex11_30 {

	public static void main(String[] args) {

		HashMap hm=new HashMap();
		
		hm.put("erlia", "5291");
		hm.put("axis", "1234");
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
						
			System.out.print("Input id:");
			String id=sc.nextLine().trim();
			
			System.out.print("Input password:");
			String pwd=sc.nextLine().trim();
			
			if(!hm.containsKey(id)) {
				System.out.println("Not Correct id,  Input Again");
				continue;
			}
				
				
			if(!(hm.get(id).equals(pwd))) {
				System.out.println("Not Correct PWD,  Try Again");
					
			}else {
				System.out.println("Correct pwd, Bye");
				break;
			}
			
		}
		
	}

}
