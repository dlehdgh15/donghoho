import java.util.Scanner;
import java.util.Random;

public class baseballgame {

	public static void main(String[] args) {
		System.out.println("난수가 생성되었습니다");
		nansu(); //난수호출
		Scanner.scanner = new Scanner(System.in);
		
		
		
		
		
	

	}
  public static int[] nansu() {
	  Random r = new Random();
		int num = r.nextInt(9)+1; //난수 0-9까지 생성한수에 1을더해 1-10까지 생성
		int[] num2 = new int[3]; //크기가 3인 num2배열 생성
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
