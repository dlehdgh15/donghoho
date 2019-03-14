class Circle{
	int radius;
    String name;
    
    public double getArea() {
    	return 3.14*radius*radius;
    }
	
}





public class ClassEX01 {

	public static void main(String[] args) {
		//instance 생성
		Circle pizza= new Circle();
		pizza.name="자바피자";
		pizza.radius=20;
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적" + pizza.getArea() );

	}

}
