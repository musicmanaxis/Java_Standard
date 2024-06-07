package Ex7;

//내부클래스 사용법

public class Ex7_31 {
    class InstanceInner{  //인스턴스 내부클래스 ->인스턴스 변수위치에 작성
        int iv=100;
        final static int CONST=100;   //상수는 허용, 상수는 모든 내부클래스위치 할수 있다.
       // static int cv=100;   //static변수는 선언할수 없음
    }

    static class StaticInner{  //static 변수 위치에 작성
        int iv=700;            //static 변수는 내부클래스중 static내부클래스만 위치할수 있음
        static int cv=200;
    }

    void myMethod(){
        class LocalInner{
            int iv=300;
          //  static int cv=300;   //static변수는 선언할수 없음
            final static int CONST=300;   //상수는 허용
        }
        int c=LocalInner.CONST;   //메서드 안에서의 내부클래스는 메서드안에서만 사용가능하다.
        System.out.println(c);
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
        Ex7_31 ex=new Ex7_31();
        ex.myMethod();

    }
}
