import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferIO {

	public static void main(String[] args) {
		FileReader fin=null;
		int c;
		try {
			fin = new FileReader("c:\\Temp\\test2.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out,5);
			while((c=fin.read())!=-1) {
				out.write(c); //버퍼에 기록을하라
		}
			//엔터키 입력받기
        new Scanner(System.in).nextLine();
        out.flush(); //버퍼의 내용 모두비우기 (버퍼에 남아잇는 문자모두출력)
        fin.close();
        out.close();
	}catch(IOException e) {
		e.printStackTrace();
	}
		

}
}