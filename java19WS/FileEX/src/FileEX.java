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
//		//���� ���� ��� ������� ����
//		File[] files = file2.listFiles();
//		for(int i=0; i<files.length; i++) {
//			System.out.print(files[i].getName()+ "\t");
//			System.out.print(files[i].length()+ "\t");
//			long t = files[i].lastModified();
//			System.out.printf("\t�����ѽð�: %tb %td %ta %tT\n",t,t,t,t);
//			
//		}
		
		//���Ϻ���
		File src = new File("c:\\temp\\source.png");
		File dest = new File("c:\\temp\\dest.png");
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte[] buf= new byte[1024*10]; //�ڵ�ȭ���ȵ��ִ� ��¥����
			while(true) {
				int n  = fi.read(buf); //�������Ͽ��� �о ���ۿ� ���
				fo.write(buf,0,n); //���ۿ��� �о ������Ͽ� ���
				if(n<buf.length) //������ ���о����� ����
					break;
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+ "��" +  dest.getPath() + "���� �����Ͽ����ϴ�.");
		}catch(IOException e ) {System.out.println("���Ϻ������");}
		
	}

}
