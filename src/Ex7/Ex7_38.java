package Ex7;
//익명 클래스  ->한번만 쓰기 때문에 클래스에 이름을 주지 않고 바로 객체생성과 동시에 내용을 적어주는 방식으로 한다.
//원래 클래스는 객체를 생성해서 여러번 사용할려고 하는건데..어차피 한번만 쓸거기 때문에 이름도 주지않고 객체생성하는 식으로 쓴다.
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex7_38 {
    public static void main(String[] args) {
        Button b=new Button("Start");
        b.addActionListener(new ActionListener() {     //new 조상인터페이스(){ 원하는 내용 }
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Action!!");
            }
        });
    }
}
