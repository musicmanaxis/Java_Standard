package Ex10;

import java.util.Calendar;

public class Ex10_2 {

	public static void main(String[] args) {
		
		final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수","목","금", "토"};
		
		Calendar date1=Calendar.getInstance();  //이런식으로 객체를 얻으면 시스템이 쓰고 있는 달력을 얻을 수 있다.
		Calendar date2=Calendar.getInstance();  //시스템이 양력, 불교력, 일본력 등등 시스템마다 다른 달력을 쓰고 있으니 이런식으로 ..
		
		date1.clear();  //캘런더 객체를 얻고나면 모든필드(년, 월, 일..등) 을 초기화해주어야 한다.1000분의 밀리세컨드 차도 안나게  ..
		date2.clear();
		
		date1.set(2020, 0, 1);  //1월은  0부터 시작한다.   
		System.out.println("date1은 "+ toString(date1)+"입니다.");
		System.out.println("오늘은 "+ toString(date2)+ DAY_OF_WEEK[(date2.get(Calendar.DAY_OF_WEEK))]+"요일 입니다.");
		
	
	
	long difference= (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
	
	//날짜의 차이는 초단위로 구하고 나서 원하는 시간으로 구하면 된다.
	//위에서는 1000밀리 초차이를 구하고 이를 1000밀리에서 1초단위로 바꾸려고 나누기 1000을 한것이다.  
	
	System.out.println("date1 부터 date2까지 "+difference+"가 지났습니다.");
	System.out.println("일로 계산하면 " + (difference/(24*60*60))+ "일 입니다. ");
	
	//일단위로 계산할려면 구해진 초단위를 1일의 초로 나눈다..    1일은 24시간 * 60분 * 60초 로 계산됨.
	
	
	}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년" + (date.get(Calendar.MONTH)+1)+ "월" + date.get(Calendar.DATE)+ "일" ;
	}   //date를 그냥 쓰면 복잡하니깐..오버라이딩하여 보기 좋게 한다...
		//object 클래스의 toString()오버라이딩 아님...

}
