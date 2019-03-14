import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) {
         //쓰기작업 =(덮어쓰기)
		Scanner scanner=new Scanner(System.in);
         FileWriter fout=null;
         int c;
         try {
        	 fout=new FileWriter("c:\\Temp\\text.txt",true);
        	 while(true) {
        		 String line=scanner.nextLine();//한줄입력
        		 if(line.length()==0) { //입력값이없으면 중지
        		    break;
        		 }
        		 //입력값을 처음부터 끝까지 파일에 출력
        		 fout.write(line,0,line.length());
        		 fout.write("\r\n",0,2);
        		 }
        	 fout.close();
        	 }catch(Exception e) {
             e.printStackTrace();//디버깅용
             System.out.println("입출력오류가발생했습니다."); //End user용
         }
         
         //읽기작업
				InputStreamReader in= null;
		FileInputStream fin=null;
        try {
        	fin=new FileInputStream("c:\\Temp\\text.txt");
        	in = new InputStreamReader(fin,"MS949"); //ms949로 인코딩
        	
        	System.out.println("인코딩 문자의 합은"+ in.getEncoding() );
        	while((c=in.read())!=-1) {
        		System.out.print((char)c);
        	}
        	in.close();
        	fin.close();
        }catch(Exception e) {
        e.printStackTrace();
        //예외가 발생했을때 로그에 기록하는 코드는 여기에 작성
	}
	finally 
	{   try {
		if(in!=null) in.close();
		if(fin!=null) fin.close();
			
		
	}catch(Exception e) {e.printStackTrace();};
	}
	
	}
}

