package Ex4;//if문의 예제

import java.util.Scanner;

public class Ex4_4 {  
		
	public static void main(String[] args) {
		int score=0;
		char grade=' ';//등급을 매기는 변수인데 공백으로 초기화한다.
		
		System.out.println("점수를 입력하세요.>");
		
		Scanner scan=new Scanner(System.in);
		score=scan.nextInt();
		
		if(score >= 90) {
			grade='A';
		}else if(score >=80) {
		    grade='B';
		}else if(score >= 70) {
			grade= 'C';
		}else {   //else는 false일때 실행되는 구간이다.
			grade='D';
		}
		
		System.out.println("당신의 등급은 "+grade+"등급입니다.");
		
	}
	

}
