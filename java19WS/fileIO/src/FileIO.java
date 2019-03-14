import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) {
         //�����۾� =(�����)
		Scanner scanner=new Scanner(System.in);
         FileWriter fout=null;
         int c;
         try {
        	 fout=new FileWriter("c:\\Temp\\text.txt",true);
        	 while(true) {
        		 String line=scanner.nextLine();//�����Է�
        		 if(line.length()==0) { //�Է°��̾����� ����
        		    break;
        		 }
        		 //�Է°��� ó������ ������ ���Ͽ� ���
        		 fout.write(line,0,line.length());
        		 fout.write("\r\n",0,2);
        		 }
        	 fout.close();
        	 }catch(Exception e) {
             e.printStackTrace();//������
             System.out.println("����¿������߻��߽��ϴ�."); //End user��
         }
         
         //�б��۾�
				InputStreamReader in= null;
		FileInputStream fin=null;
        try {
        	fin=new FileInputStream("c:\\Temp\\text.txt");
        	in = new InputStreamReader(fin,"MS949"); //ms949�� ���ڵ�
        	
        	System.out.println("���ڵ� ������ ����"+ in.getEncoding() );
        	while((c=in.read())!=-1) {
        		System.out.print((char)c);
        	}
        	in.close();
        	fin.close();
        }catch(Exception e) {
        e.printStackTrace();
        //���ܰ� �߻������� �α׿� ����ϴ� �ڵ�� ���⿡ �ۼ�
	}
	finally 
	{   try {
		if(in!=null) in.close();
		if(fin!=null) fin.close();
			
		
	}catch(Exception e) {e.printStackTrace();};
	}
	
	}
}

