package Ex9;
//Object 클래스의 equals()를 오버라이딩하여 같은값임을 확인하는 클래스
//equals()는 원래 주소값을 사용하는 것이라 이것을 그대로 쓰면 각 객체 주소값이 달라 false를 반환한다.
//객체가 가지고 있는 변수값을 오버라이딩하여 객체가 가지고 있는 변수값이 서로 같다면 동일한 객체로 판단하게 작업한것이다.
//대부분 이 메소드는 인스턴스 변수를 비교하게 오버라이딩하여 쓴다...
//작설자가 직접 작성한 클래스나 StringBuffer 클래스는 객체가 동일한건지 비교하고 싶다면 equals()를 오버라이딩하여 사용
//나머지 클래스들은 오버라이딩 되어 있음.


class Ex9_1_equals{

	public static void main(String[] args) {
		Value v1 = new Value(20);
		Value v2 = new Value(20);

		if(v2.equals(v2)) {
			System.out.println("Same Value");
		}else {
			System.out.println("Not Same Value");
		}
	
	
	}
}


class Value{
	
	int value;
	
	Value(int value){
		this.value=value;
	}
	
	public boolean equals(Object obj) {   //오버라이딩 했다.
		//객체의 변수를 이용하여 오버라이딩 하면된다.
		if(!(obj instanceof Value)) return false;  //Object가 Value 객체인지 사전검사  
		
		Value v=(Value)obj;    //실제 Object는 value변수가 없으므로 이를 형변환 한다.
		return this.value==v.value;  //비교하는 객체 value변수값과 비교   
		}
	
	
}