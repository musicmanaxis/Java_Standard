//반복문 while에서 break;의 역할

public class Ex4_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0, sum=0;
		
		while(true) {   //while(true)  -> 무한반복을 의미...for(;;)은 이런식으
				
			if(sum>100) {
				break;   // break가 속한 반복문을 벗어난다. 
			}
			++i;
			sum += i;
			
		}
		System.out.println(sum);
		
	}

}
