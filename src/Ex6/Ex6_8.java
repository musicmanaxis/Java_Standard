package Ex6;//이번예제는 객체가 어디 메모리에 생성되는지 알고, 그 주소값들이 오고가는 것을 파악해야 하는 예제이다.

class Data3{int x=22;}

public class Ex6_8 {

	public static void main(String[] args) {
		Data3 d=new Data3();
		d.x=12;
		Data3 d1=copy(d);  //1. copy(d)의 d는 main()에서 생성된 객체의 주소값을 copy()에게 넘긴다.
		                   //5. copy()가 만든 객체 tmp주소값을 넘겨받아 d1에게 주소값을 저장 한다. 
		
	
		System.out.println(d.x);
		System.out.println(d1.x);
	}

	
	static Data3 copy(Data3 d2) {   //2.copy() 메모리 영역에 d2가 생성되며 1. d의 주소값을 넘겨받는다.
		Data3 tmp= new Data3();   //3. tmp 객체를 생성하고  
		tmp.x=d2.x;     //4. d2 가진 주소값의 x값을 tmp에게 넘겨준다.
		return tmp;		//  copy()에서 만든 tmp 객체 주소를 반환한다.(중요)   
	}
	
}
