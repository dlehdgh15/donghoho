/**
 * 프로그램명 : 키보드입력을 받아 처리하는 프로그램
 * 작성자 : 이동호
 * 작성일: 2019-02-21
 * 사용법 : 키보드로 이름,도시,나이,체중,독신여부를 
 *        입력받아서 출력합니다.
 */


import java.util.Scanner;
public class ScannerEX {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요");
		String name = scanner.next();
		System.out.println(name);
		
		System.out.print("도시를 입력하세요");
		String city = scanner.next();
		System.out.println(city);
		
		System.out.print("나이를 입력하세요");
		int age = scanner.nextInt();
		System.out.println(age+"살");
		
		System.out.print("몸무계를 입력하세요");
		double weight = scanner.nextDouble();
		System.out.println(weight+"kg,");
		
		System.out.print("독신여부를 입력하세요");
		boolean isSingle = scanner.nextBoolean();
		System.out.println(isSingle+"입니다");
		scanner.close();
		
	}

}
