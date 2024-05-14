//예외 되던지기   
public class Ex8_12 {

	public static void main(String[] args) {
		try {
			
			method1();
			
		}catch(Exception e){
			System.out.println("Main()에서 예외처리했습니다. ");
			
		}

	}
	
	static void method1() throws Exception {   //throws Exception-> 메소드에서 예외를 처리하겠다고 선
			try {
				throw new Exception();  //일부러 예외를 발생시킨다.
			}catch(Exception e){
				System.out.println("method1()에서 예외처리를 했습니다.");
				throw e;  //처리된 예외를 다시호출한 곳에 넘겨준다.  
			}
		
	}

}
