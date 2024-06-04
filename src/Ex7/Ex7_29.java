package Ex7;


public class Ex7_29 {
    public static void main(String[] args) {
        A a=new A();
        a.methodA();
    }
}

interface I{
    public abstract void methodB();
}

class A {   //메서드를 통해 특정클래스의 객체를 제공받고 그 객체의 메서드를 사용하는 클래스
    void methodA(){
        I i=InstanceManager.getInstance();   //인스턴스를 직접 생성하지 않고 메서드를 통해서 제공받는다. A클래스를 변경할 필요없음
        i.methodB();
        System.out.println(i);
    }
}
class B implements I{
    public void methodB(){
        System.out.println("B class Method");
    }

    public String toString(){
        return "B class Instance";
    }
}

class InstanceManager{   //특정클래스의 인스턴스를 제공할 목적으로 만든 클래스
    public static I getInstance(){
        return new B();   //어떤 클래스의 객체를 제공받을것인지 이부분만 수정하면 되므로 A클래스의 내용을 수정할 필요없다.
    }
}