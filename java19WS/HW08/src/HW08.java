import java.util.ArrayList;
import java.util.Scanner;

public class HW08 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();//array����Ʈ ����
		Scanner scanner = new Scanner(System.in);
        //1������!
		//		list.add("å����");
//		list.add("����");
//		list.add("���ǻ�");
//		list.add("����");
//		
//		for(int i=0; i<list.size(); i++) { //����Ʈ���
//			System.out.println(list.get(i));
//		}
		//2������!
		System.out.print("å���� ���� ���ǻ� ������ ������� �Է��ϼ���: ");
		for(int i=0; i<4;i++) {
			String n = scanner.next();
			list.add(n);
			
		}
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i)+ " ");
			
		}
		
		
	}

}
