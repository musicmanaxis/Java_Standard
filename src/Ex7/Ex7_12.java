package Ex7;

//final을 이용한 객체생성
//카드는 한번 생성하면 중복이 되지 않아야 한다. 그래서 숫자와 종륲를 객체 생성시 마다 고유하게 하기 위해
//아래와 같이 카드 클래스를 정의했다.

class Card{
    final int NUMBER;   //초기화는 하지 않음..객체 생성시 처음으로 한번 할당할 목적
    final String KIND;
    static int width=100;
    static int height=250;

    Card(String kind, int num){
        KIND=kind;
        NUMBER=num;

    }

    Card(){   //기본값 설정
        this("HEART", 1);
    }

    public String toString(){
        return KIND+", "+NUMBER;
    }
}

public class Ex7_12 {
    public static void main(String[] args) {
        Card c= new Card("HEART", 10);
      //  c.NUMBER=5;   생성한 카드에 숫자를 변경할려고 하면 에러가 난다.
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
}
