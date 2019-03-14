import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Label01 extends JFrame {
             public Label01() {
            	 this.setTitle("°¶·¯¸®");
            	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	 
            	 Container c = this.getContentPane();
            	 c.setLayout(new FlowLayout());
            	 this.setSize(200, 200);
            	 
            	 ImageIcon beaty =new ImageIcon("images/image01.png");
            	 JLabel imageLabel = new JLabel(beaty);
            	 c.add(imageLabel);
            	 
            	 
            	 ImageIcon icon1 = new ImageIcon("images/java1.png");
            	 ImageIcon icon2 = new ImageIcon("images/java2.png");
            	 
            	 JButton btn = new JButton("call~~",icon1);
            	 btn.setPressedIcon(icon1);
            	 btn.setRolloverIcon(icon2);
            	 
            	 c.add(btn);
            	 this.setVisible(true);
            	 
             }
	public static void main(String[] args) {
		new Label01();

	}

}
