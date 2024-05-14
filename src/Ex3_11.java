
public class Ex3_11 {

	public static void main(String[] args) {
		double pi=3.141592;
		double shortPi=Math.round(pi * 1000) / 1000.0;
		//1000.0  더블타입으로 나누어야 제대로 소수점형식이 된다.  
		//소수 3째 자리 값을 구하기 
		//Math.round()는 소수 첫째자리를 반올림해서 반환한다. 
		System.out.println(shortPi);
		//khkhk
	    System.out.println((int)(pi*1000)/1000.0);
	    //3.141 로 구하고 싶으면....
	}

}
