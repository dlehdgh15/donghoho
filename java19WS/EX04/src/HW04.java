import java.util.Scanner;
import java.util.Random;
public class HW04 {

	public static void main(String[] args) {
//		int[]  num= {2,3,4,5,6,7,8,9};
//		int[]  num2= {1,2,3,4,5,6,7,8,9};
//		for(int i : num2) {
//			for(int j : num) {
//				System.out.print(j + "*" + i +"="+ j*i + "\t" );
//			}
//			System.out.println();
//		}
		
		Random r = new Random();
	    int[] array = new int[6];
	    for(int i=0; i<array.length; i++) {
	    	int m = r.nextInt(46);
	    	array[i]=m;
	    	for(int j=0; j<i; j++) {
	    		if(array[j]==array[i]) {
	    			i--;
	    			break;
	    		}
	    			
	    		
	    	}
	    
	    	
	    		
	    	
	    }
	    for(int i=0; i<array.length; i++)
	    System.out.println("로또의 번호는 "+ array[i] + "입니다");
	    		
	    		
		
     	
     	}
	
	
	
	}
	


