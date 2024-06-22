package Ex14;

//람다식 만드는 방법
//메서드 이름제거, 반환타입제거

@FunctionalInterface  //람다식을 위한 인터페이스라고 알려주고 컴파일러에게 체크요쳥
interface MyFunction{
    void run();      //람다식을 위한 인터페이스는 메서드가 한개만 가능
}

public class Ex14_1 {

    static void execute(MyFunction f){
        f.run();
    }

    static MyFunction getMyFunction(){
        MyFunction f=()->System.out.println("f3.run()");  //()은 인터페이스의 void run()을 의미->메서드 이름, 반환타입 제거
        return f;
        //f타입의 객체가 run()을 구현해서 가지고 잇다고 생각하자.

    }

    public static void main(String[] args) {
        MyFunction f1=()->System.out.println("f1.run()");

        MyFunction f2=new MyFunction() {   //익명클래스를 이용
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };

        //익명 클래스는 클래스를 만들지 않고 생성자를 바로 만들어서 생성자가 필요한 메서드 등을 기술해서 쓴다.

        MyFunction f3=getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(()->System.out.println("run()"));
    }

}
