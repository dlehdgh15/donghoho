import java.util.Scanner;
public class GuGu {

	public static void main(String[] args) {
		//������
		Scanner scanner = new Scanner(System.in);
		for(int i=1; i<10; i++) {
			for(int j=2;j<10;j++) {
				System.out.print(j + "*" + i + "=" + i*j);
				System.out.print("\t"); //��
			}
		System.out.println(); //�ٹٲٱ�
		}
		
		System.out.println("������ 5�� �Է��ϼ���: ");
		int sum=0;
		for(int num=0; num<5; num++) {
			int n= scanner.nextInt();
			if(n<=0) 
				continue;
			
			sum+=n;
		}
		System.out.println("5���� ������ �հ��"+ sum + "�Դϴ�");
		System.out.println("exit���� �Է��ϸ� ����˴ϴ�.");
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine();
			if(text.equals("exit"))
				break;
		}
		System.out.println("�����մϴ�");

	}

}
