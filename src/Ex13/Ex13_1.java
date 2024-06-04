package Ex13;

//쓰레드를 구현하는 방식은 1.Thread클래스를 상속받아서 객체를 만들어 사용하거나
//2.Runnable 인터페이스를 받아서 쓰는 방법이 있는데 주로 2번방법이 많이 쓰인다.
//1.상속받아서 쓰면 그자체가 쓰레드 이기 때문에 단순히 객체를 생성해서 실행하면 되고
//2.인터페이스를 쓰게 되면 반환되는 인터페이스 타입을 다시 쓰레드 객체의 인자로 집어넣어서 사용한다.

public class Ex13_1 {

    public static void main(String[] args) {
        Thread_1 tr1=new Thread_1();
        Thread_1 tr2=new Thread_1();

        Thread ra=new Thread(new Thread_2());
//        Runnable ra=new Thread_2();  아래 2줄을 위의 한줄로 표현
//        Thread tr=new Thread(ra);

        tr1.start();
        tr2.start();

        //start()의 역할은 main()와 같은 역할인 run()를 호출하여 새로운 스택을 생성하여 main()을 역할을 run()이 하게 된다.

        ra.start();

        //OS의 스케줄러에 따라 어떤것이 먼저 실행될지는 각기 다르다.

    }
}

class Thread_1 extends Thread{
    public void  run(){
        for(int i=0 ;i<10 ;i++) {
            //  System.out.print(this.getName());
            System.out.println("--t1:"+getName()+"##");
        }

    }
}

class Thread_2 implements Runnable{
    public void run(){
        for(int i=0 ;i<10 ;i++) {
            //  System.out.print(Thread.currentThread().getName());
            System.out.print("Runable Thread:"+i+"**");
        }
    }

}
