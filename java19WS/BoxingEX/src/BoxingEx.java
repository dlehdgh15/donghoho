class Test{
	Integer a=10;
	Integer b=20;
	
}


public class BoxingEx {

	public static void main(String[] args) {
		int a =10;
		//Integer b=a;
		Integer b = new Integer(a); //b��� ���۷����� a�� 10�� ���� �־��ش�  boxing �۾�
		//ing c =b; unboxing
		int c = b.intValue(); //b�� ����ִ� ���� �о�� c�� �ִ´�  unboxing
		
		System.out.println(b);
		System.out.println(c);
		

	}

}
