class Cal{
	public int getsum(int i, int j) {
    	return i+j;
    }
	
	
}


public class ClassEX05 {
	public static void increase(int[] array) {
		for(int i=0; i<array.length;i++) {
			array[i]++;
		}
	}
	public static void main(String[] args) {
		Cal c =new Cal();
		System.out.println(c.getsum(1,2) );
        
		Cal c2=c;
		System.out.println(c2.getsum(2, 10));
		
		int[] a= {10,20,30,40,50};
		
		increase(a);
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
	}
		
	}


