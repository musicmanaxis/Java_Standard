//equals()를 오버라이딩하면 hashCode()도 오버라이딩 해줘야 한다.
//위의 두메서드는 객체의 주소값을 이용하는데, equals()에서 객체의 변수값을 이용하며 두 객체가 갔다고 표현했다면
// 주소값을 이용하는 hashCode()도 같다고 표현해야 말이 맞다..그리고 이런2가지 오버라이딩을 해줘야 하는것은  규칙이다..
//hashCode()는 객체의 주소값을 int로  반환한다.  


import java.util.Objects;

class Card{
	String kind;
	int num;
	
	Card(){
		this("Sapde", 3);
	}
	
	Card(String kind, int num){
		this.kind=kind;
		this.num=num;
	}
	
	public String toString() {   // toString()은 객체의 변수를 이용해서 표현하여 오버라이딩 하면된다.  
		return "kind:"+this.kind+", num:"+this.num;
	} //toString()을 오버라이딩하지 않고 쓰면 객체의 클래스이름@객체주소 등과 같이 표현되서 쓸모있게 쓸라고..오버라이딩 
	
	public int hashCode() {   //equals()를 오버라이딩하면 hashCode()해줘야 한다..규칙임  
		return Objects.hash(kind, num);  //hash()안의 매개변수를 가변인자다..정해진 갯수가 없다..맘데로 
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Card)) return false;
		
		Card c=(Card)obj;
		
		return this.kind.equals(c.kind) && this.num==c.num;
		
	}
}





public class Ex9_4 {

	public static void main(String[] args) {
		
		Card c1=new Card();
		Card c2=new Card();
		
		System.out.println(c1.equals(c2));
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());

	}

}
