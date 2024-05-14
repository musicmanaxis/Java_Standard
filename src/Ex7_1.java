
//상속관계 공부  

class Tv{
	
	boolean power;
	int channel;
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
}

 class SmartTV extends Tv{
	 boolean caption;
	 void displayCaption(String text) {
		 if(caption) {   //캡션 기능이 켜 진다면 매개변수에 입력한 내용을 출력하라  
			 System.out.println(text);
		 }
	 }
	 
 }
 
public class Ex7_1 {

	public static void main(String[] args) {
			
		SmartTV smt=new SmartTV();
		smt.channel=10;
		smt.channelUp();
		System.out.println(smt.channel);
		smt.displayCaption("Hello World");
		smt.caption=true;
		smt.displayCaption("자막설정 후 Hello World");
	}

}
