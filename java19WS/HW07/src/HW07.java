import java.util.Scanner;

public class HW07 {
//4������
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String number= "E20160001";
		System.out.println(number.substring(1,5)); //2016�� ����
		
		//5������
		//5. �ּҷ� csv�����Ϳ��� �����͸� �и��Ͻÿ�.
		//ȫ�浿,010-1111-2222,hkd@hkd.com
		
		String jongbo = "ȫ�浿,010-1111-2222,hkd@hkd.com"; //�����Է�
		String[] part=jongbo.split(","); //","�� ���ڸ� �������� ������ �迭������
		for(int i=0; i<part.length;i++) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
			System.out.println(part[i]);  //�����ѹ迭���
		}
		/*6. csv�����Ϳ� ������ ���� �й��� ����Ǿ� ���� ��.
		EL201800001,CH201800021,EN12231
		EL-���ڰ��а�
		CH-ȭ�а��а�
		EN-������а�*/
		
		String hakjom ="EL201800001,CH201800021,EN12231"; //�����Է�
		String[] part2 = hakjom.split(",");//���ڱ��� ������ �迭�� ����
        for(int j=0; j<part2.length;j++) {
        	String n = part2[j].substring(0,2);
        	if(n.equals("EL")) {   //n�� ������ �ִ� ���ڿ��� el�϶� ���
        		System.out.println("EL-���ڰ��а�");	
        		}
        	else if(n.equals("CH")) { //n�� ������ �ִ� ���ڿ��� CH�϶� ���
        		System.out.println("CH-ȭ�а��а�");
        		
        	}
        	else if(n.equals("EN")) { //n�� ������ �ִ� ���ڿ��� EN�϶� ���
        		System.out.println("EN-������а�");
        	}
        	}
        //7. ���̵� !,@,#,$,%,^�� ���Ե� ���
        //'���̵� !,@,#,$,%,^�� ���ԵǸ� �ȵ˴ϴ�.'
        //�޽��� ����ϱ�. charAt()����.
        
        System.out.print("���̵� �Է��ϼ���: ");
        String id = scanner.nextLine(); //id�� ���ڿ��� �Է¹���
        for(int k=0; k<id.length(); k++) {
           char t = id.charAt(k);  //���ڿ��� ó������ �˻���
           if(t=='@'||t=='#'||t=='!'||t=='$'||t=='^') {
           System.out.println("���̵� !,@,#,$,%,^�����ԵǸ� �ȵ˴ϴ� �ٽ��Է��ϼ���");
          
       
	}
           else 
        	   System.out.println("���̵� ���������� �����Ǿ����ϴ�");
           break;
           
	}
        
	}
}

	
	


