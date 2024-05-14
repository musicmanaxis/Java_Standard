//2차원 배열의 예  
public class Ex5_8 {

	public static void main(String[] args) {
		
		int score[][]= {
				{10,20,30},
				{40,50,30},
				{100,89,99},
				{50,80,70,66}
		};
		
		int sum=0;
		
		for(int i=0; i<score.length ;i++) {
			for(int j=0; j<score[i].length ;j++) {
				System.out.println("score["+i+"]["+j+"]="+score[i][j]);
				sum+=score[i][j];
			}
		}
		System.out.println("sum = "+sum);

	}

}
