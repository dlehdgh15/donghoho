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
		
		System.out.println("제목 저자 출판사 가격 순서대로 입력하세요: ");
		for(int i=0; i<4; i++) {
           String n= scanner.next();
           list2.add(n);			
		}
		list.put("책제목",list2.get(0) );
		list.put("저자",list2.get(1) );
		list.put("출판사",list2.get(2) );
		list.put("가격",list2.get(3) );
		
		Set<String> keys= list.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name=it.next();
			String title=list.get(name);
			System.out.println(name + " : " + title);
		}
		
				   
					   
		
	}

}
