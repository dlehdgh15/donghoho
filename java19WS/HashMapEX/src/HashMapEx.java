import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
class Student{
	private int id;
	private String tel;
	
	public Student(int id, String tel) {
		super();
		this.id = id;
		this.tel = tel;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Student() {};
	public  int getId() {return id;}
	public String getTel() {return tel;}
	
	
}

public class HashMapEx {

	public static void main(String[] args) {
		
        
//		scoreMap.put("김성동",97);
//		scoreMap.put("황기태",88);
//		scoreMap.put("김남윤",98);
//		scoreMap.put("이재문",70);
//		scoreMap.put("한원선",99);
//		
//	System.out.println("Hash요소의 갯수: " + scoreMap.size());
//	Set<String> keys = scoreMap.keySet();
//	Iterator<String> it =keys.iterator();
//	
//	while(it.hasNext()) {
//		String name=it.next();
//		int score = scoreMap.get(name);
//		System.out.println(name + ": "+ score);
//	}
//	Object[] keyobj=keys.toArray();
//	for(int i=0; i<keyobj.length;i++) {
//		
//	}
		HashMap<String,Student> hm = new HashMap<String,Student>();
		hm.put("황기태",new Student(1,"010-1111-1111"));
		hm.put("이재문",new Student(2,"010-2222-2222"));
		hm.put("김남윤",new Student(3,"010-3333-3333"));
	    
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("검색할이름: ");
			String name = scanner.next();
			if(name.equals("exit")) {
				System.out.println("프로그램종료");
			    break;
			}
			Student student = hm.get(name);
			
				
			
		}
		
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("이순신");
		myList.add("홍길동");
		myList.add("김유신");
		Collections.sort(myList);
		for(int i=0; i<myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		Collections.reverse(myList);
		for(int i=0; i<myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
		
		}
 	}


