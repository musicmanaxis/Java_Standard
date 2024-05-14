import java.util.*;


public class Ex11_10 {

	public static void main(String[] args) {
		
		Set set=new HashSet();
		
		for(int i=0 ; set.size()<6 ; i++) {   //set크기가 6이 되면 반복문이 멈춘다. 
			int num= (int)(Math.random()*45)+1;  //아직 set이 담긴게 없음..사이즈 0 
			set.add(num);    //여기서 크기가 1이 됨..
			System.out.println("set.size()="+set.size()+"->"+num);
		}
		
		List list =new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
	}
	

}
