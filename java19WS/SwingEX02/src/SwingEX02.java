import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEX02 extends JFrame {
           public SwingEX02() {
           this.setTitle("°è»ê±â");
           this.setSize(500,500);
           
           
           Container c = this.getContentPane();
           c.add(new JButton("calc"),BorderLayout.CENTER);
           c.add(new JButton("add"),BorderLayout.NORTH);
           c.add(new JButton("add"),BorderLayout.SOUTH);
           c.add(new JButton("sub"),BorderLayout.WEST);
           c.add(new JButton("multi"),BorderLayout.EAST);
           this.setVisible(true);
           }
	public static void main(String[] args) {
		
		new SwingEX02();

	}

}
