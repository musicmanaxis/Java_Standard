package Ex12;


enum Direction{
    EAST(1,">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");

    //EAST..이렇것들은 사실 다 객체이다. ()를 사용하려면 생성자와 변수를 선언해줘야 한다.
    private final int value;   //private, final로 변수선언
    private final String symbol;
    private static final Direction[] dir_Arr=Direction.values();
    //values()->열거형에 있는 모든것을 배열로 반환한다.
    Direction(int value, String symbol){
        //생성자 선언, 위의 열거형에 있는 것들이 하나하나 객체이다.. 그래서 이 모양으로 생성자 정의
        //열거형 생성자는 묵시적으로 private이다... Direction d1=new Direction(1,">")이렇게 외부에서 호출이 불가능.
        this.value=value;
        this.symbol=symbol;
    }

    public int getValue(){return value;}
    public String getSymbol(){return symbol;}

    public static Direction of(int dir){
        if(dir<1 || dir>4){
            throw new IllegalArgumentException("Invailed dir:"+dir);
            //매개변수가 1보다 작거나 4보다 크면 에러발생시킴
        }
        return dir_Arr[dir-1];  //담긴 열거형 배열의 인덱스의 값을 반환
    }

    public Direction rotate(int num){
        num=num%4;
        if(num<0) num+=4;  //num이 음술일 때 시계반대방향으로 회전
        //num+=4 시계반대방향 -1칸은 +3칸과 동일함으로 이같이 처리
        return dir_Arr[(value-1+num)%4];
    }

    public String toString(){   //이걸 안하면 기호가 표시가 안됨  왜그럴까?
        return name()+getSymbol();
    }
}

public class Ex12_6_Enum {
    public static void main(String[] args) {
        for(Direction d:Direction.values()){
            System.out.println(d.name()+"="+d.getValue());   //열거형의 이름과
        }

        Direction d1=Direction.EAST;
        Direction d2=Direction.of(2);

        System.out.println("d1="+d1.name()+", "+d1.getValue());
        System.out.println("d2="+d2.name()+", "+d2.getValue());

        System.out.println(Direction.EAST.rotate(1));
        System.out.println(Direction.EAST.rotate(2));
        System.out.println(Direction.EAST.rotate(-1));
        System.out.println(Direction.EAST.rotate(-2));

    }
}
