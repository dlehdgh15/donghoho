import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HW08HM {

	public static void main(String[] args) {
		ArrayList<String> list2 = new ArrayList<String>();
		HashMap<String,String> list = new HashMap<String,String>();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("���� ���� ���ǻ� ���� ������� �Է��ϼ���: ");
		for(int i=0; i<4; i++) {
           String n= scanner.next();
           list2.add(n);			
		}
		list.put("å����",list2.get(0) );
		list.put("����",list2.get(1) );
		list.put("���ǻ�",list2.get(2) );
		list.put("����",list2.get(3) );
		
		Set<String> keys= list.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name=it.next();
			String title=list.get(name);
			System.out.println(name + " : " + title);
		}
		
				   
					   
		
	}

}
