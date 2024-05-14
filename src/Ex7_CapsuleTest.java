//캡슐화
//인스턴스 변수를 보안을 위해 private로 직접접근을 금지시키고 메소드를 통해서 간접접근 시키는 방법  
//private는 내부클래스에서만 데이터를 처리할수 있는데, 이것으로 처리하면 public보다 검수과정범위가 좁아진다.
//오류로 검사시 public으로 선언하면 관련된 다른 클래스까지 다 검사해야 하지만, 이렇게 하면 다른 클래스를 검수할 필요가 없다.

class Time{
	private int hour=-2;  // 0보다 작거나 23보다 크다면 -2값으로 보여주기  .
	private int  min, second;
		
	public void setHour(int hour){
		
		
		if(isNotVaildHour(hour)) return;   // 유효성 검사도 private로 처리하였다.
		//isNotVaildHour(hour)이 참이라면 아래문장을 실행 안하고 호출한곳에 되돌아 간다.
		   this.hour = hour;
	}
	
	private boolean isNotVaildHour(int hour) {
		return  hour<0 || 23< hour ;  
		//위의 2가지조건중에 하나라도 해당하면 참을 반환한다는 의미  
		
	}
	
	public int getHour() {
		return hour;
	}
}


public class Ex7_CapsuleTest {

	public static void main(String[] args) {
		
		Time t=new Time();
		t.setHour(3);
		System.out.println(t.getHour());

	}

}
