
public class ExceptionTest {

	public static void main(String[] args) {
		int a=100;
		int b=0;
		
		
		try{
			int result=a/b;
		}
		catch(Exception e){
			//System.out.println("0�� �Է��߽��ϴ� �ٽ��Է��ϼ���");
			e.printStackTrace();//������ҋ� ������ ��������
		}

	}

}
