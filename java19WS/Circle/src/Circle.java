
public class Circle {
int radius;
String name;

 public Circle() {
	 radius=1; name="";
 }
 
 //생성자 오버로딩
 //오버로딩은 메서드명은 같고,parameter가 다름
 public Circle(int r, String n) {
	 radius=r; name=n;
 }
 public double getArea() {
	 return 3.14*radius*radius;
 }
	public static void main(String[] args) {
		//instance 생성
		Circle pizza=new Circle(10,"자바피자");
		
		double area = pizza.getArea();//메서드 호출
		System.out.println(pizza.name +"의 넓이는"+ area + "입니다");
		//instance 생성
		Circle donut = new Circle();
		donut.name="자바도넛";
	    area = donut.getArea();
		System.out.println(donut.name+"의 넓이는"+ area+"입니다");

	}

}
