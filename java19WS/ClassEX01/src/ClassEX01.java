class Circle{
	int radius;
    String name;
    
    public double getArea() {
    	return 3.14*radius*radius;
    }
	
}





public class ClassEX01 {

	public static void main(String[] args) {
		//instance ����
		Circle pizza= new Circle();
		pizza.name="�ڹ�����";
		pizza.radius=20;
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ����" + pizza.getArea() );

	}

}
