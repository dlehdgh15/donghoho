
public class exdddd {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<(2*i)+1; k++ ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(int i=0; i<5; i++) {
			for(int j=1; j<i+1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<9-(2*i); k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
