import java.util.Scanner;
import java.util.Random;

public class baseballgame {

	public static void main(String[] args) {
		System.out.println("������ �����Ǿ����ϴ�");
		nansu(); //����ȣ��
		Scanner.scanner = new Scanner(System.in);
		
		
		
		
		
	

	}
  public static int[] nansu() {
	  Random r = new Random();
		int num = r.nextInt(9)+1; //���� 0-9���� �����Ѽ��� 1������ 1-10���� ����
		int[] num2 = new int[3]; //ũ�Ⱑ 3�� num2�迭 ����
		for(int i=0; i<num2.length;i++) {
			num2[i]=num;                     
			for(int j=1;j<i+1;j++) {
				if(num2[j]==num2[i])
					i--;
					break;
			}
			
		}
		return num2;
  }
	

}
