package Ex7;//매개변수의 다형성: 조상타입을 매개변수로 하면 자손타입들도 집어넣을 수 있다.
//배열을 이용하여 배열에 객체를 담아 저장하고 꺼낸다..여기선 장바구니 개념으로 이용했다.

class Product1{
	int price;
	Product1(){};
	Product1(int price){
		this.price=price;
	}
}

class Tv2 extends Product1{
	Tv2(){
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}

class Computer1 extends Product1{
	Computer1(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Audio1 extends Product1{
	Audio1(){super(50);}
	public String toString(){return "Audio";}
}

class Buyer1{
	int money=1000;
	int bonusPoint=0;
	Product1[] cart=new Product1[10];  //장바구니   
	int i=0;   //장바구니의 인덱스를 위한 것
	
		void buy(Product1 p){   //매개변수의 다형성..
			if(money < p.price) {
				System.out.println("There is no money");
				return;
			}
			
			cart[i++]=p;   //장바구니에 물건 담기  
			System.out.println(p+"를 구매하셧습니다. ");		
			money -= p.price;
			bonusPoint += (int)(p.price/10.0) ;
		}
	
		void summary() {   // 자기가 산 물건 목록보기  
			int sum=0;
			String item="";
		
			for(int i=0; i<cart.length ;i++) {
				if(cart[i]==null) break;
				sum += cart[i].price; //합계 내기  
				item += (i==0 )? ""+cart[i] : ", "+cart[i];
			}
		System.out.println("cart[0]="+cart[0]);
		System.out.println("총구매액은 "+sum+"이고, "+"포인트는 "+bonusPoint+"입니다.");
		System.out.println("구매목록은 "+item+"을 구매했습니다.");
	}
}

public class Ex7_9 {
	public static void main(String[] args) {
		
		Buyer1 b1=new Buyer1();
		b1.buy(new Computer1());
		b1.buy(new Tv2());
		b1.buy(new Audio1());
		b1.summary();
	}

}
