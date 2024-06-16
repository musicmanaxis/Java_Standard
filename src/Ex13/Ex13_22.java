package Ex13;

 class Account{
    private int balance=1000;

    public int getBalance(){
        return balance;
    }

    public synchronized void withdraw(int value){
        if(balance>=value){
            try{Thread.sleep(1000);}
                catch(InterruptedException e){}

            balance-=value;
        }
    }
}

class Runnable1 implements Runnable{
     int money;

    public void run(){
        Account ac=new Account();


         while (true) {
             money=(int)(Math.random()*3+1)*100;
             System.out.println("인출금:"+money);
             ac.withdraw(money);
             System.out.println("잔액:" + ac.getBalance());

             if(ac.getBalance()<=0) break;
         }

    }
}

public class Ex13_22 {
    public static void main(String[] args) {
        Runnable r=new Runnable1();
       new Thread(r).start();
       new Thread(r).start();

    }
}
