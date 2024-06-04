package Test;

//상속에 대해 연구
//최종 자손 클래스에서 객체를 생성하먄 이에 연관된 조상 클래스 객체들까지 따로따로 다 만들어진다.
//B클래스의 toString()호출을 보면 이에 확인할 수 있다.


public class Test1 extends B{
    int a;
    String s;
    Test1(){
        s=super.s;
    }

    public static void main(String[] args) {
        Test1 t1=new Test1();
        t1.A_method();  //A클래스 메서드
        System.out.println(t1);  //B클래스 toString()사용

         System.out.println(new Test1().s);

         t1.B_method();
        // System.out.println(new Test1().s);

    }
}

class A{
    int a;
    String s="A class String Memeber";
     void A_method(){
        System.out.println("Class A Method");

    }


}

class B extends A{
    int b;
    String s="B class String Memeber";

    void B_method(){
        System.out.println("Class B Method");
        s=new A().s;
        System.out.println(s);
    }


    public String toString(){
        return "B 객체입니다.";

    }
}
