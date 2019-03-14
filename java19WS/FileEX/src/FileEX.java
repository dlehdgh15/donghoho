import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEX {

	public static void main(String[] args) {
//		File file = new File("c:\\temp\\test.text");
//		System.out.println(file.getName());
//		System.out.println(file.getPath());
//		System.out.println(file.length());
//		
//		File file2 = new File("c:\\temp");
//		//파일 폴더 모두 목록으로 리턴
//		File[] files = file2.listFiles();
//		for(int i=0; i<files.length; i++) {
//			System.out.print(files[i].getName()+ "\t");
//			System.out.print(files[i].length()+ "\t");
//			long t = files[i].lastModified();
//			System.out.printf("\t수정한시간: %tb %td %ta %tT\n",t,t,t,t);
//			
//		}
		
		//파일복사
		File src = new File("c:\\temp\\source.png");
		File dest = new File("c:\\temp\\dest.png");
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte[] buf= new byte[1024*10]; //자동화가안되있는 가짜버퍼
			while(true) {
				int n  = fi.read(buf); //원본파일에서 읽어서 버퍼에 기록
				fo.write(buf,0,n); //버퍼에서 읽어서 대상파일에 기록
				if(n<buf.length) //끝까지 다읽엇으면 종료
					break;
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+ "을" +  dest.getPath() + "으로 복사하였습니다.");
		}catch(IOException e ) {System.out.println("파일복사오류");}
		
	}

}
