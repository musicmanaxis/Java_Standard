import java.io.File;

//try catch문에서 예외처리를 메인메소드에서 처리할수 있고, 메소드에서 처리할수 있다.선택은..작성자가 선택  

public class Ex8_10 {

	public static void main(String[] args) {
		try {
			
			File f=createFile(""); //args[0]을 넣어서 파일이름을 적어보자..
			System.out.println(f.getName()+" file is maden");
			
		}catch(Exception e) {
			System.out.println(e.getMessage()+"input Again");
			
		}
		
	}
	
	static File createFile(String fileName) throws Exception{
		if(fileName ==null | fileName.equals(""))
			throw new Exception("FileName is not inValid.");
		File f=new File(fileName);
		 f.createNewFile();
		 return f;
		
	}

}
