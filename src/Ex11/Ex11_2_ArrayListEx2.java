package Ex11;

import java.util.ArrayList;
import java.util.List;

public class Ex11_2_ArrayListEx2 {

	public static void main(String[] args) {
		final int LIMIT=10;
		String source="0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length=source.length();
		System.out.println("대상 문자열 길이:"+length);
		
		
		List list=new ArrayList(length/LIMIT +10);  
		System.out.println("리스트 크기 :"+(length/LIMIT +10));
	    System.out.println("====================");
		
		//System.out.println("생성한 리스트 사이즈:"+list.size());  
		//여기서 size()는 생성한 리스트의 크기를 말하는 것이 아니라,리스트에 실제로 객체를 집어넣고 난 다음에 객체의 갯수를 말한다.
		
		for(int i=0; i<length;i+=LIMIT) {  //10개 단위.
			if(i+LIMIT<length) {
				//System.out.print(i+"번째:");
				//System.out.println(source.substring(i, i+LIMIT));
				list.add(source.substring(i, i+LIMIT));
				
			}else
				//System.out.println("나머지:"+source.substring(i));
				list.add(source.substring(i));   //substring()->인자값을 하나만 주면 그 이후에 나머지를 가져온다..
		}
		
		System.out.println("리스트에 들어가 있는 객체갯수:"+list.size());  

		for(int i=0; i<list.size();i++) {
			System.out.println(i+"번째:"+list.get(i));
			
		}
	}

}
