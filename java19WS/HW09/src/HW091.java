import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HW091 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		FileWriter fout = null;
		InputStreamReader in = null;
		FileInputStream fin=null;
		int c;
		String line = scanner.nextLine();
		String sub[] = line.split(" ");
		
		try {
			fout = new FileWriter("c:\\Temp\\data.txt");
			while(true) {
				if(int i=0;i<sub.length; i++) {
					f.write
				}
				
				if(sub.length==0) {
					break;
				}
				
				fout.write(line,0,line.length());
				fout.write(",",0,1);
				
			}
			fout.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
       try {
    	   fin = new FileInputStream("c:\\Temp\\data.txt");
    	   in = new InputStreamReader(fin,"MS949");
    	   
    	   
    	   while((c=in.read())!=-1) {
                System.out.print((char)c);    		   
    	   }
    	in.close();
    	fin.close();
       }catch(Exception e){
    	   System.out.println(e.getMessage());
       }
	}

}
