package Ex6;
class Data{int x;}

public class Ex6_14 {
    public static void main(String[] args) {
        Data d=new Data();
        d.x=20;

        Data d2=copy(d);
        System.out.println("d.x="+d.x);
        System.out.println("d2.x="+d2.x);

    }

    static Data copy(Data d){   //반환값이 참조형이다.(주소복사)
        Data tmp=new Data();
        tmp=d;
        return tmp;
    }
}
