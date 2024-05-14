//참조변수의 형변환:사용할 수 있는 멤버의 갯수를 조절하는 것, 조상과 자손관계일 때만 형변환 가능


public class Ex7_7 {

	public static void main(String[] args) {
		Car car;
		fireCar f1=new fireCar();
		fireCar f2;
		
		f1.water();
		car=f1;  //기능이 많은 객체를 적은 조상타입의 객체로 형변환 하는 것은 가
		car.drive();
		//car.water();  //기능이 적은 객체로 형변환했는데 없는 것을 이용할려니 에러발
		f2=(fireCar)car;  //본래 타입으로 변환하면 다시 water()기능을 사용할 수 있다.
		f2.water();
		
	}

}

class Car{
	String color;
	int door;
	
	void drive() {	
		System.out.println("운전합니다");
	}
	void stop() {
		System.out.println("stop");
	}
	
}

class fireCar extends Car{
	
	void water() {
		System.out.println("물줍니다.");
		
	}
}
