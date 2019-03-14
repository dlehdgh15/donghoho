import java.util.Scanner;

public class HW07 {
//4번문제
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String number= "E20160001";
		System.out.println(number.substring(1,5)); //2016만 추출
		
		//5번문제
		//5. 주소록 csv데이터에서 데이터를 분리하시오.
		//홍길동,010-1111-2222,hkd@hkd.com
		
		String jongbo = "홍길동,010-1111-2222,hkd@hkd.com"; //정보입력
		String[] part=jongbo.split(","); //","이 문자를 기준으로 나눠서 배열에저장
		for(int i=0; i<part.length;i++) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
			System.out.println(part[i]);  //저장한배열출력
		}
		/*6. csv데이터에 다음과 같은 학번이 저장되어 있을 때.
		EL201800001,CH201800021,EN12231
		EL-전자공학과
		CH-화학공학과
		EN-영어영문학과*/
		
		String hakjom ="EL201800001,CH201800021,EN12231"; //정보입력
		String[] part2 = hakjom.split(",");//문자기준 나눠서 배열에 저장
        for(int j=0; j<part2.length;j++) {
        	String n = part2[j].substring(0,2);
        	if(n.equals("EL")) {   //n이 가지고 있는 문자열이 el일때 출력
        		System.out.println("EL-전자공학과");	
        		}
        	else if(n.equals("CH")) { //n이 가지고 있는 문자열이 CH일때 출력
        		System.out.println("CH-화학공학과");
        		
        	}
        	else if(n.equals("EN")) { //n이 가지고 있는 문자열이 EN일때 출력
        		System.out.println("EN-영어영문학과");
        	}
        	}
        //7. 아이디에 !,@,#,$,%,^가 포함된 경우
        //'아이디에 !,@,#,$,%,^가 포함되면 안됩니다.'
        //메시지 출력하기. charAt()참고.
        
        System.out.print("아이디를 입력하세요: ");
        String id = scanner.nextLine(); //id를 문자열로 입력받음
        for(int k=0; k<id.length(); k++) {
           char t = id.charAt(k);  //문자열을 처음부터 검사함
           if(t=='@'||t=='#'||t=='!'||t=='$'||t=='^') {
           System.out.println("아이디에 !,@,#,$,%,^가포함되면 안됩니다 다시입력하세요");
          
       
	}
           else 
        	   System.out.println("아이디가 성공적으로 생성되었습니다");
           break;
           
	}
        
	}
}

	
	


