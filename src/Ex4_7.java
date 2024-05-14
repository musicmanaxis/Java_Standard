//Math.random()  사용하기  
//Math.random()의 범위는  -> 0.0 <= x <10.0 이고 반환형은 double값이다. 
public class Ex4_7 {

	public static void main(String[] args) {
		//Quiz-1) 1이상 10이하 사이의 난수를 20번 출력하시오.
		
		
		System.out.print(Math.random());
		System.out.println();
		System.out.println("1이상 10이하 사이의 난수를 20번 출력하시오.");
		for(int i=1 ; i <=20 ; i++) {
			System.out.print((int)((Math.random()*10)+1) + ", ");
			//Math.random()*10 -> 1,2,3,4,5,6,7,8,9,10 ->10개  
		}
		
		System.out.println("");
		//Quiz-2) -5 ~ 5 사이의 난수를 20번 출력하시오.  -5, -4,-3,-2,-1, 0,1,2,3,4,5 ->11개(개별값 갯수 )   
		// 0.0 <= x < 1.0
		// 0.0*11 <= x*11 < 11.0   ->개별값 갯수  11개  
		// (0.0*11)-5 <= (x*11)-5 < (11.0)-5  -> -5 <= x <6 의 범위가 된다. 
		//(int)  형변환으로 소수점 아래 제거  
		System.out.println(" -5 ~ 5 사이의 난수를 20번 출력하시오.");
		for(int i=1 ; i <=20 ; i++) {
			System.out.print((int)((Math.random()*11)-5 ) + ", ");
			//Math.random()*10 -> 1,2,3,4,5,6,7,8,9,10 ->10개  
		}
	}

}
