import java.util.ArrayList;
import java.util.Scanner;

public class HW08 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();//array리스트 생성
		Scanner scanner = new Scanner(System.in);
        //1번문제!
		//		list.add("책제목");
//		list.add("저자");
//		list.add("출판사");
//		list.add("가격");
//		
//		for(int i=0; i<list.size(); i++) { //리스트출력
//			System.out.println(list.get(i));
//		}
		//2번문제!
		System.out.print("책제목 저자 출판사 가격을 순서대로 입력하세요: ");
		for(int i=0; i<4;i++) {
			String n = scanner.next();
			list.add(n);
			
		}
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i)+ " ");
			
		}
		
		
	}

}
