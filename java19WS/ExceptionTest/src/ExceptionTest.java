
public class ExceptionTest {

	public static void main(String[] args) {
		int a=100;
		int b=0;
		
		
		try{
			int result=a/b;
		}
		catch(Exception e){
			//System.out.println("0을 입력했습니다 다시입력하세요");
			e.printStackTrace();//디버깅할떄 유용함 오류검출
		}

	}

}
