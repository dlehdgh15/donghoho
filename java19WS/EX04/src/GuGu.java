import java.util.Scanner;
public class GuGu {

	public static void main(String[] args) {
		//구구단
		Scanner scanner = new Scanner(System.in);
		for(int i=1; i<10; i++) {
			for(int j=2;j<10;j++) {
				System.out.print(j + "*" + i + "=" + i*j);
				System.out.print("\t"); //탭
			}
		System.out.println(); //줄바꾸기
		}
		
		System.out.println("정수를 5개 입력하세요: ");
		int sum=0;
		for(int num=0; num<5; num++) {
			int n= scanner.nextInt();
			if(n<=0) 
				continue;
			
			sum+=n;
		}
		System.out.println("5개의 정수의 합계는"+ sum + "입니다");
		System.out.println("exit문을 입력하면 종료됩니다.");
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine();
			if(text.equals("exit"))
				break;
		}
		System.out.println("종료합니다");

	}

}
