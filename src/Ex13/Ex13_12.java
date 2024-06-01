package Ex13;
//sleep() 의 사용
public class Ex13_12 {
    public static void main(String[] args) {
        Thread1 th1=new Thread1();
        Thread2 th2=new Thread2();
        th1.start();
        th2.start();
        //delay(2000);   //메인스레드 시간지연

        try {
            th1.sleep(3000);
            //이렇게 적으면 th2가 sleep이 아니라 메인메서드가 sleep상태이다. 저렇게 적어도 th2가 슬립이 안된다.
            //sleep은 자기자신만 효과를 볼수 있다. Thread.sleep()로 적는게 올바른 표기법이다.
            //th1를 sleep하고자 한다면 th1의 run()에서 적어준다.
        }catch (InterruptedException e){}

        System.out.println("Main Thread End");
    }//main()

    //sleep()은 매번 예외처리를 해줘야 하기때문에 이처럼 delay()를 임의로 만들어 코드를 간결하게 만든다..
    public static void delay(long time){
        try{
            System.out.println("Main Thread time delay");
            Thread.sleep(time);   //메인 스레드 sleep
        }catch (InterruptedException e){}
    }
}//class

class Thread1 extends Thread{
    public void run(){
        System.out.println("th1 start");
        for(int i=1;i<=300;i++){
            System.out.print("#");
        }
        System.out.println();
        try {
            System.out.println("&& th1 sleep start &&");
            Thread.sleep(3000);
        }catch (InterruptedException e){}
        System.out.println("#Thread 1 End");
    }
}

class Thread2 extends Thread{
    public void run(){
        System.out.println("th2 start");
        for(int i=1;i<=300;i++){
            System.out.print("*");
        }
        System.out.println("Thread 2 End");
    }

}