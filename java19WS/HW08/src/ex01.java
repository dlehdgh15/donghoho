import java.util.Scanner;
import java.util.Vector;

public class ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int temp=0;
		Vector<Integer> num = new Vector<Integer>();
		
		System.out.print("정수를  몇개 입력할건가요?");
		int n=scanner.nextInt();
		
		System.out.print("정수를 입력하세요(-1이입력되면종료)>>");
		for(int i =0; i<n; i++) {
			int s=scanner.nextInt();
			if(s==-1) {
				System.out.println("-1을 입력했습니다 종료");
			}
			num.add(s);
			
		}
		
		for(int i=0; i<num.size(); i++) {
			int num2 = num.get(i);
			System.out.print(num2+" ");
		}
		
		for(int i=0;i<num.size();i++) {
			for(int j=i+1; j<num.size();j++) {

				if(num.get(j)>num.get(i)) {
				temp=num.get(j);
				num.add(j,num.get(i));
				num.remove(j+1);
				num.add(i,temp);
				num.remove(i+1);
			}
		}
		
			
			
			
		}
		System.out.println("최대값은" + num.get(0));
	}
}



