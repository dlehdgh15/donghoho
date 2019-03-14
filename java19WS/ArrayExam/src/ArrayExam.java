import java.util.Scanner;
public class ArrayExam {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int[] Arrayint= new int[5];
		
		for(int i=0; i<Arrayint.length; i++) {
			Arrayint[i]=(i+1)*10;
			
			System.out.println(Arrayint[i]);
		}
		
		for(int k : Arrayint) {
            
			System.out.println(k);
		}
		
		
		//2차원배열
		double score[][]= {{3.3,3.4},
		                   {3.5,3.6},
		                   {3.7,4.0},
		                   {4.1,4.2}};
		double sum=0;
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.println(score[i][j]);
			}
		
		}
		
		}
		
		
		
		
	}


