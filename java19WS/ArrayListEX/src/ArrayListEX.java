import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListEX {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();
        for(int i=0; i<4;i++) {
        	System.out.println("�̸��� �Է��ϼ���>>");
        	String s= scanner.next();
        	a.add(s);
        }
        for(int i=0; i<a.size();i++) {
        	String name = a.get(i);
        	System.out.print(name+" ");
        }
        
        
        
	}

}
