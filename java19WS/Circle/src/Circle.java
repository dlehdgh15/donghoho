
public class Circle {
int radius;
String name;

 public Circle() {
	 radius=1; name="";
 }
 
 //������ �����ε�
 //�����ε��� �޼������ ����,parameter�� �ٸ�
 public Circle(int r, String n) {
	 radius=r; name=n;
 }
 public double getArea() {
	 return 3.14*radius*radius;
 }
	public static void main(String[] args) {
		//instance ����
		Circle pizza=new Circle(10,"�ڹ�����");
		
		double area = pizza.getArea();//�޼��� ȣ��
		System.out.println(pizza.name +"�� ���̴�"+ area + "�Դϴ�");
		//instance ����
		Circle donut = new Circle();
		donut.name="�ڹٵ���";
	    area = donut.getArea();
		System.out.println(donut.name+"�� ���̴�"+ area+"�Դϴ�");

	}

}
