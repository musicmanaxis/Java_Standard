package Ex12;


enum Direction{
    EAST(1,">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");

    private final int value;
    private final String symbol;
    private static final Direction[] dir_Arr=Direction.values();
    //values()->열거형에 있는것을 배열에 담는다.
    Direction(int value, String symbol){  //위의 열거형 모양이 생성자라고 생각해라. 그래서 이 모양으로 생성자 정의
        this.value=value;
        this.symbol=symbol;
    }

    public int getValue(){return value;}
    public String getSymbol(){return symbol;}

    public static Direction of(int dir){
        if(dir<1 || dir>4){
            throw new IllegalArgumentException("Invailed dir:"+dir);
        }
        return dir_Arr[dir-1];  //담긴 열거형 배열의 인덱스의 값을 반환
    }

    public Direction rotate(int num){
        num=num%4;
        if(num<0) num+=4;
        return dir_Arr[(value-1+num)%4];
    }

    public String toString(){   //이걸 안하면 기호가 표시가 안됨  왜그럴까?
        return name()+getSymbol();
    }
}

public class Ex12_6 {
    public static void main(String[] args) {
        for(Direction d:Direction.values()){
            System.out.println(d.name()+"="+d.getValue());
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
