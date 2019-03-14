import java.util.Scanner;

public class subject {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		for(int i=1; i<10; i++) {
//			for(int j=2;j<10;j++) {
//				System.out.print(j + "*" + i + "=" + i*j);
//				System.out.print("\t"); //탭
//			}
//		System.out.println(); //줄바꾸기
//		}
		
//		for(int i=1; i<=5; i++) {
//			for(int j=0; j<6-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		Scanner scanner = new Scanner(System.in);
        int[] score = new int[3];
        int sum=0;
        
        double avg=0;
        System.out.println("국어 영어 수학 점수를 입력하세요");
        for(int i=0; i<score.length; i++) {
        	score[i]=scanner.nextInt();        	
        }
        for(int i=0; i<score.length; i++) {
        	sum+=score[i];
        }
        avg=sum/3;
        System.out.println("평균은"+ avg + "입니다");
	}
}
