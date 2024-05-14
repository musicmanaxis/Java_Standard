//반복문 while
public class Ex4_13 {

	public static void main(String[] args) {
		int i=0;
		int sum=0;   //while문에 쓰일 변수 선언  
		
		while(sum<=100) {    //while(조건입력)
			
			
			System.out.printf("%d - %d%n", i, sum );
			sum += ++i;   
		}

	}

}
