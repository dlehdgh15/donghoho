
public class ClassEX04 {

	public static void main(String[] args) {
		//c�� reference�����̰� c�� ����Ű�� ������
		//Circle Ÿ���� �迭�� �ִ�.
		//Circle�� ����� ���� ������ Ÿ��
		Circle[] c;
	    c=new Circle[5]; //ũ�Ⱑ 5�� �迭 ����
	    
	    for(int i=0; i<c.length; i++) {
	    	c[i]=new Circle(i);
	    	System.out.println((int)(c[i].getArea()));
	    }

	}

}
