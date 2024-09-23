package Java_Design_Pattern;

public class Java_Strategy_Pattern {
    public static void main(String[] args) {
        SumPrinter sumPrinter=new SumPrinter();

        sumPrinter.print(new SimpleSumStrategy(), 10);
        sumPrinter.print(new GaussSumStrategy(), 10);
    }
}

class SumPrinter{
    //오로지 인터페이스에서 메서드만 보고 값을 구하는 방식
    //SimpleSumStrategy, GaussSumStrategy존재를 모르는 상태
  void print(SumStrategy sumStrategy, int N){
      System.out.printf("The Sum of 1 - %d:", N);
      System.out.println(sumStrategy.get(N));  //인터페이스 메서드만 이용한다.->코드를 변경할 필요가 없다.
  }
}

 interface SumStrategy{
    //1부터 n까지의 총합을 얻는 메서드만 제공
    int get(int N);
}

class SimpleSumStrategy implements SumStrategy{
    @Override
    public int get(int N) {
        int sum=N;

        for(int i=1;i<N;i++){
            sum+=i;
        }
        return sum;
    }
}

class GaussSumStrategy implements SumStrategy{
    @Override
    public int get(int N) {
        return  (N+1)*N/2;
    }
}


