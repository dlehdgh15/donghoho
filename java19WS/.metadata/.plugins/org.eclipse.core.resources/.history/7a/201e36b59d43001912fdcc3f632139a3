import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

    class Thread02 implements Runnable{
	private JLabel timeLabel;

     public Thread02(JLabel timerLabel) {
    	 
    	 this.timeLabel=timeLabel;
     }
     
     public void run() {
    	 int n=0;
    	 while(true) {
    		 timeLabel.setText(Integer.toString(n));
    		 n++;
    		 try {
    			 Thread.sleep(1000);
    			 
    		 }catch(InterruptedException e) {
    			 return;
    			 
    		 }
    		 
    	 }
    	 
    	 
     }
     
     
}
     public class RunnalbeTimerEx extends JFrame{
    	 public RunnalbeTimerEx() {
    		 setTitle("러너블을 구현할 타이머 쓰레드");
    		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		 Container c = getContentPane();
    		 c.setLayout(new FlowLayout());
    		 JLabel timeLabel = new JLabel();
    		 timeLabel.setFont(new Font("Gothic",Font.ITALIC,80));
    		 
    		 
    		 Thread02 runnable = new Thread02(timeLabel);
    		 Thread th = new Thread(runnable);
    		 c.add(timeLabel);
    		 setSize(250,150);
    		 setVisible(true);
    		 
    		 th.start();
    	 }
    	 
    	 public static void main(String[] args) {
    	 		new RunnalbeTimerEx();

    	 	}
	
	

     }
