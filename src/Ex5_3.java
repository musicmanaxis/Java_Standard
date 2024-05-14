//배열의 최대 최소값 구하기...
public class Ex5_3 {

	public static void main(String[] args) {
		int[] score= {79,88,91,33,100,55,95};
		int max=score[0], min=score[0]; //배열의 첫번째 값으로 초기화한다.
		//배열의 인덱스는 0부터 시작 
		 
		for(int i=1; i<score.length ;i++ ) { //0부터 시작한 값과 2번짹 인덱스(i=1)부터 비교시작
			if(score[i] > max) {  
				max = score[i];
			}else if(score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("최대값은 "+ max + "입니다.");
		System.out.println("최소값은 "+ min + "입니다.");
	}

}
