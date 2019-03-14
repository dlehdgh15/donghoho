class Point{
	 int x,y;
	public void set(int x,int y) {
		this.x=x; this.y=y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point{
	private String color;
	public void setcolor(String color) {
		this.color=color;
	}
	public void showColorpoint(){
		System.out.println(color);
		super.showPoint();
	}
	public String toString() {
		return ("(" + x + "," + y + ")");
	}
}


public class ColorPointEX {

	public static void main(String[] args) {
		Point a = new Point();
		a.set(2, 5);
		a.showPoint();
		System.out.println(a.toString());
		
		ColorPoint b = new ColorPoint();
		b.set(4, 6);
		b.setcolor("red");
		b.showColorpoint();
		

	}

}
