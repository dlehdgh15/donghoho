class Myclass<T>{
	T a;
	public Myclass() {}
	public Myclass(T a) {
		this.a=a;
	}
	
	public T getA() {
		return this.a;
	}
	
}
public class GenericEx {

	public static void main(String[] args) {
		Myclass<String> mc =new Myclass<String>("ȫ�浿");
		System.out.println(mc.getA());
        Myclass<Integer> mc2 = new Myclass<Integer>(213123123);
        System.out.println(mc2.getA());
	}

}
