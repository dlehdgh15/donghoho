import java.awt.Container;
import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HW14 extends JFrame{
	
	public HW14(){
		setTitle("시계만들기");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel la = new JLabel();
		c.add(la);
		
		
		Thread01 th = new Thread01(la);
		
		setSize(500,500);
		setVisible(true);
		
		th.start();
		
		
	}


	public static void main(String[] args) {
		new HW14();

	}

}

class Thread01 extends Thread{
	private JLabel la;
	
	public Thread01(JLabel la) {
		this.la=la;
		
	}
	
	public void run() {
		
		
		while(true) {
		
			SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
			Date time = new Date();
			la.setText(format1.format(time));
			
			
		}
		
		
		
		
	}
	
	

	
	
}
