import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class SwingEX01 extends JFrame {
    
	public SwingEX01() {
		this.setTitle("학사관리프로그램");
		this.setSize(300, 300);
		
		
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
		c.add(new JButton("OK"));
		c.add(new JButton("cancle"));
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		SwingEX01 frame = new SwingEX01();
        
	}

}
