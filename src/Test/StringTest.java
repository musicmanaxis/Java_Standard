package Test;

public class StringTest {
    public static void main(String[] args) {
        String s="hello, carbot";

        int a=s.indexOf('.');   //-1이 반환된다면 ','이 없다는 애기다..
        System.out.println(a);
    }
}
