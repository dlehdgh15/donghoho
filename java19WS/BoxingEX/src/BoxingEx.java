class Test{
	Integer a=10;
	Integer b=20;
	
}


public class BoxingEx {

	public static void main(String[] args) {
		int a =10;
		//Integer b=a;
		Integer b = new Integer(a); //b라는 레퍼런스에 a의 10의 값을 넣어준다  boxing 작업
		//ing c =b; unboxing
		int c = b.intValue(); //b에 들어있는 값을 읽어와 c에 넣는다  unboxing
		
		System.out.println(b);
		System.out.println(c);
		

	}

}
