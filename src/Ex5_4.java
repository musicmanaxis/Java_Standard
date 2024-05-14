import java.util.Arrays;

public class Ex5_4 {

	public static void main(String[] args) {
			int[] Arr= {0,1,2,3,4,5,6,7,8,9};
			System.out.println(Arrays.toString(Arr));
			
			for(int i=0; i<100 ; i++) {
				
				int n=(int)(Math.random()*10);
				int tmp=Arr[0];
				Arr[0]=Arr[n];
				Arr[n]=tmp;
			}
			System.out.println(Arrays.toString(Arr));
			
					   
	}

}
