package Ex7;

import java.text.DecimalFormat;
import java.util.Vector;

class Buyer2{
	int money=2000;
	int bonusPoint=0;

	Vector v= new Vector();
	int i=0;
	
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
				Product2 p=(Product2)v.get(i);
				if(p==null) break;
				sum += p.price; //합계 내기  
				item += (i==0)?""+p:", "+p;  //장바구니 목록보기..
			}
			DecimalFormat df=new DecimalFormat("###,###");
			String total=df.format(sum);
		
		System.out.println("총구매액은 "+total+"만원입니다.");
		System.out.println("포인트는  "+bonusPoint+"입니다.");
		System.out.println("["+item+"]을 구매했습니다.");
	  }
		
		void refund(Product2 p) {
			if(v.remove(p)) {
				money+=p.price;
				System.out.println(p+"환불하셨습니다.");
				bonusPoint-=p.bonusPoint;
				
				
			}
		}

}


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
		super(300);
	}
	
	public String toString() {
		return "Computer2";
	}
		
}

public class Ex7_23 {

	public static void main(String[] args) {
		
		Buyer2 b1=new Buyer2();
		b1.buy(new Computer2());
		b1.buy(new Tv3());
		b1.summary();
		b1.buy(new Computer2());
		b1.buy(new Computer2());
		b1.refund(new Computer2());
		b1.summary();
		b1.buy(new Computer2());
		b1.buy(new Tv3());
		b1.summary();
	}

}
