package Ex7;

import java.text.DecimalFormat;
import java.util.Vector;

class Product2{
	int price;
	int bonusPoint=0;

	Product2(int price){
		this.price=price;
		bonusPoint += (int)(price/10.0) ;
	}
}

class Tv3 extends Product2{
	Tv3(){
		super(100);
	}
	public String toString() {
		return "Tv2";
	}
}

class Computer2 extends Product2{
	Computer2(){
		super(200);
	}
	public String toString() {
		return "Computer2";
	}
}

class Buyer2{
	int money=2000;
	int bonusPoint=0;

	Vector v= new Vector();   //장바구니를 벡터로 사용함..크기를 조절할 필요가 없다.
	//int i=0;

		void buy(Product2 p){   //매개변수의 다형성..
			if(money < p.price) {
				System.out.println("There is no money");
				return;
			}
			
		    v.add(p);
			System.out.println(p+"를 구매하셧습니다. ");		
			money -= p.price;
			bonusPoint+=p.bonusPoint;
		}
	
		void summary() {   // 자기가 산 물건 목록보기  
			int sum=0;
			String item="";

			for(int i=0; i<v.size() ;i++) {
				Product2 p=(Product2)v.get(i);    //형변환
				if(p==null) break;
				sum += p.price; //합계 내기  
				item += (i==0)?""+p:", "+p;  //장바구니 목록보기..
			}
			DecimalFormat df=new DecimalFormat("###,###");
			String total=df.format(sum);

			String money=df.format(this.money);
		
		System.out.println("총구매액:"+total+"만원, 남은 금액:"+money+"만원, 포인트:"+bonusPoint);
		System.out.println("장바구니 목록:["+item+"]");
	  }
		
		void refund(Product2 p) {
			if(v.remove(p)) {
				money+=p.price;
				System.out.println(p+"를 환불하셨습니다.");
				bonusPoint-=p.bonusPoint;
			}else{
				System.out.println("구매하신 제품이 아닙니다");
			}
		}
}

public class Ex7_23 {
	public static void main(String[] args) {
		
		Buyer2 b1=new Buyer2();

		Computer2 com=new Computer2();
		Tv3 tv= new Tv3();
		Computer2 com1=new Computer2();

		b1.buy(com);
		b1.buy(tv);
		System.out.println("-------1차 정산-------");
		b1.summary();
        System.out.println("재구매================");
		b1.buy(com);
		b1.buy(com1);
		b1.buy(tv);
		b1.refund(com);
		System.out.println("-------2차 정산-------");
		b1.summary();


	}

}
