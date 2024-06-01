package Ex13;


//데몬 스레드 작성하는 방법
public class Ex13_10 implements Runnable{
    static boolean autoSave=false;

    public static void main(String[] args) {

        Thread th=new Thread(new Ex13_10());  //인터페이스를 이용하여 스레드를 생성하고
        th.setDaemon(true);  //이스레드를 데몬 스레드로 지정한다.
        th.start();          //그리고 나서 데몬스레드를 시작한다.
        for(int i=1;i<=10;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) { }

            System.out.println(i);
            if(i==5)
                autoSave=true;
        }
        System.out.println("프로그램이 종료되었습니다.");

    }

    public void run() {
        while (true) {   //데몬스레드는 주로 무한루프와 if문을 이용해서 조건이 만족되면 실행되는걸로 처리한다.
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {  }

            if(autoSave) autoSave();
        }
    }

    public void autoSave(){
        System.out.println("메모장에 기록했습니다.");
    }
}
