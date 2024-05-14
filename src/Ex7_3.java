
//상속관계가 아닌 포함관계
//상속은 ...은 ~이다...라고 문장으로 표현한다.  포함은 ...은 ~을 가지고 있다라고 표현한다.
//예) 원은 점을 가지고 있다..라고 표현하는 것이 더 자연스러운 문장이다.
//실무적으로 90%는 포함관계를 가지고 코드를 작성한다.

//비중이 높은 것은 상속관계로 나머지는 포함관계로 작성한다.  

class Point{
	int x,y;
}

class Circle{
	Point p=new Point();  //포함관계를 표시  
	
	int r;
}

public class Ex7_3 {

	public static void main(String[] args) {
		
		Circle c=new Circle();
		c.p.x=1;   //객체의 객체에 변수에 값을 불러 저장할수 있다.
		c.p.y=2;
		c.r=3;
		
		System.out.println("c.p.x= "+c.p.x);
		System.out.println("c.p.y= " + c.p.y);
		System.out.println("c.r= "+c.r);

	}

}
