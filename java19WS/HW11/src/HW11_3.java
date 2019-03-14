import java.awt.Container;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HW11_3 extends JFrame {
	
     public HW11_3() {
    	 Calendar cal;
    	 cal = Calendar.getInstance();
    	 int hour = cal.get(Calendar.HOUR_OF_DAY);
		
    	 setTitle("현재시간별로 나타내기");
    	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     	Container c = getContentPane();
     	c.setLayout(null);
     	
     	JLabel e = new JLabel("현재시간");
        if(hour<12)
        	e.setText("Good Morning");
        else if(hour>12 && hour<18)
        	e.setText("Good Afternoon");
        else if(hour>18)
        	e.setText("Good Evening");
        e.setLocation(200,5);
        e.setSize(200, 100);
        
        c.add(e);
     	
        setSize(500,500);
    	setVisible(true);
    	 
     }
     
     
     
	public static void main(String[] args) {
		new HW11_3();
	}

}
