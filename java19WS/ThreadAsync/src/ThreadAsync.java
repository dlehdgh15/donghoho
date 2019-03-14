
//공유클래스
class SharedBoard{
	private int sum=0; //공유데이터
	 public void add() {
		synchronized(this) {
		 int n=sum;
		Thread.yield();
		n+=10;
		sum=n;
		}
		System.out.println(Thread.currentThread().getName()+ ":"+sum);
		
		
	}
	
	public int getsum() {return sum;}
	
	
}
//쓰레드

class StudentThread extends Thread {
	private SharedBoard borad;
	public StudentThread (String name,SharedBoard borad) {
		super(name);
		this.borad=borad;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++)
			borad.add();
	}
	
	
}

public class ThreadAsync {

	public static void main(String[] args) {
	//공유데이터
		SharedBoard board = new SharedBoard();
		Thread th1 = new StudentThread("kitae",board);
		Thread th2 = new StudentThread("hyosu",board);
		
		th1.start();
		th2.start();
		
	}

}
