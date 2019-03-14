
public class ClassEX04 {

	public static void main(String[] args) {
		//c는 reference변수이고 c가 가리키는 곳에는
		//Circle 타입의 배열이 있다.
		//Circle은 사용자 정의 데이터 타입
		Circle[] c;
	    c=new Circle[5]; //크기가 5인 배열 생성
	    
	    for(int i=0; i<c.length; i++) {
	    	c[i]=new Circle(i);
	    	System.out.println((int)(c[i].getArea()));
	    }

	}

}
