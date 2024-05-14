//배열  

import java.util.Arrays;

public class Ex5_1 {

	public static void main(String[] args) {
		
		int[] arr=new int[10];  // int[5] 로 변경하여...
		
		for(int i=0; i<arr.length ;i++) { 
			//(.length)는 배열의 길이를 알수 있다. 
			//arr[10] 으로 표현하는 것보다..int[5]로 후에 변경하여도 수정없이  인덱스에 접근한다.
			System.out.println("arr["+i+"]="+ arr[i]);
		}
		
		int[] score= {10,20,30,40, 50};  //이런식으로 배열을 한번에 할당할 수 있다.
		
		//int[] score;
		// score= {10,20,30,40, 50};  위의 것을 2줄로 쓰면 에러가 발생한다. 
		
		System.out.println(Arrays.toString(score));
		//Arrays.toString(score) 이런방식으로 배열의 내용을 한번에 알수 있다.  많이 사용  

	}

}
