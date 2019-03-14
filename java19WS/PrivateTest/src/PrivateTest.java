class person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class cal{
	public static int abs(int a) {return a>0?a:-a;}
	public static int max(int a,int b) {return a>b?a:b;}
	public static int min(int a,int b) {return a<b?a:b;}
	
}

public class PrivateTest {

	public static void main(String[] args) {
		person a = new person();
		a.setName("ȫ�浿");
		System.out.println(a.getName());
		
		
		System.out.println(cal.abs(-22929));
		System.out.println(cal.min(2,4));
		System.out.println(cal.max(30392933,2349890));

	}

}
