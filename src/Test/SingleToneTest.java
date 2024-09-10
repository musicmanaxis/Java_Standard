package Test;

//싱글톤:하나의 객체만 생성해서 사용할 경우
//예)크롬탭에 한 아이디로 로그인하면 여러탭을 띄워도 동일아이디 정보가 남아있게 작동시킬 경우에 해당

class Singleton1 {   //이 클래스를 싱글톤으로 만든다!!. 여기부분이 핵심
    private int a;
    private static Singleton1 s;   //자신의 클래스도 필드로 가능!!

    private Singleton1() { }  //생성자를 private로!!:외부에서 생성 못하도록

    public static Singleton1 getSingleton() {
        if(s==null) {  //프로그램이 처음 호출시 생성됨
            s= new Singleton1();
        }
        return s;
    }

    public int  getField() {
        return this.a;
    }

    public void  setField(int a) {
        this.a=a;
    }
}

class Tab{
    Tab(){}
    private  Singleton1 s=Singleton1.getSingleton();  //공유되는 유일한 인스턴스를 받아온다.

    public Singleton1 getSingletonInstance(){
        return s;
    }

}


public class SingleToneTest {

    public static void main(String[] args) {
        Tab tab1= new Tab();
        Tab tab2= new Tab();
        Tab tab3= new Tab();

        System.out.println(tab1.getSingletonInstance().getField());
        tab2.getSingletonInstance().setField(3);
        System.out.println(tab1.getSingletonInstance().getField());
    }
}





