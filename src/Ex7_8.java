//매개변수의 다형성: 조상타입을 매개변수로 하면 자손타입들도 집어넣을 수 있다. 

class Buyer{
	int money=1000;
	int bonusPoint=0;
	Product p;
	
	void buy(Product p){   //매개변수의 다형성..
		
		 if(money < p.price) {
			 System.out.println("There is no money");
			 return;
		 }
		money -= p.price;
		bonusPoint += (int)(p.price/10.0) ;
		System.out.println(p+"를 사셨습니다.");
		
	}

}


class Product{
	int price;
	
	Product(int price){
		this.price=price;
	}
}


class Tv1 extends Product{
	
	Tv1(){
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
	
}

class Computer extends Product{
	
	Computer(){
		super(300);
	}
	
	public String toString() {
		return "Computer";
	}
		
}

public class Ex7_8 {

	public static void main(String[] args) {
		
		Buyer b=new Buyer();
		b.buy(new Computer());
		System.out.println("잔액은 "+b.money+"이고 포인트는 "+b.bonusPoint+"입니다.");
		b.buy(new Tv1());
		System.out.println("잔액은 "+b.money+"이고 포인트는 "+b.bonusPoint+"입니다.");
	}

}
