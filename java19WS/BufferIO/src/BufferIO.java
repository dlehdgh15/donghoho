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
				out.write(c); //���ۿ� ������϶�
		}
			//����Ű �Է¹ޱ�
        new Scanner(System.in).nextLine();
        out.flush(); //������ ���� ��κ��� (���ۿ� �����մ� ���ڸ�����)
        fin.close();
        out.close();
	}catch(IOException e) {
		e.printStackTrace();
	}
		

}
}