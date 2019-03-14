class MyThread extends Thread{
	public void run() {
		
		int n=0;
				for(int i=0; i<20; i++){
					n++;
					System.out.println("MyThread: "+n);
					
					
				}
	}
	
}


class MyThread2 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getState());
		int n=0;
		for(int i=0; i<20; i++){
					n++;
					System.out.println("MyThread2: "+n);
					
					
				}
	}
	
}
public class Thread01  {

	public static void main(String[] args) {
		
		
		MyThread th = new MyThread();
		th.setName("쓰래드1");
		th.start();//쓰레드 시작
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
		System.out.println(Thread.currentThread().getState());
		MyThread2 th2 = new MyThread2();
		//th2.setPriority(10);
		th2.setName("쓰래드2");
		th2.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}

}
