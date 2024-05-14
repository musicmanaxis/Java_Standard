public class Ex2_12 {
	//형변환..아래것은 외우던지 찾아 쓸 수 있게 하자
	//testtset
	public static void main(String[] args) {
		String str="3";
		//시험...
		System.out.println(str.charAt(0)-'0');
		//문자열을 문자로 변환하는 방법->str.charAt(0)  후 문자'0'으로 빼기
		//문자3을 숫자로 바꾸려면 -'0'을 해주면 된다. 위의 결과는 숫자3이다.
		System.out.println('3'-'0'+1);  
		//문자를 숫자로 바꾸고 난 다음 숫자더하기 
		//문자에다가 -'0'을 해어서 숫자로 바뀌고 +1을 해서 결과는 숫자4	
		System.out.println(Integer.parseInt("3")+1);  
		//Integer.parseInt("3") 문자열을 정수  결과는 숫자4	
		System.out.println("3"+1);
		//문자열 + 숫자는 문자열   결과는 문자열 4
		System.out.println(3+'0'); 
		//0은 숫자로 48에 해당
		//숫자에다가 +'0'을 하면 문자로 바뀐다.  결과는 51 
		System.out.println((char)(3+'0'));
		//문자로 형변환 3을 문자로 올바르게 표기하기 위해서..결과는 문자3

	}

}
