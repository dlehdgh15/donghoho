import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingEX03 extends JFrame {

	public SwingEX03() {
		this.setTitle("ȸ������");
		this.setSize(300,300);
		
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(4,2));
		c.add(new JLabel("�̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�й�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�а�"));
		c.add(new JTextField(""));
		c.add(new JLabel("����"));
		c.add(new JTextField(""));
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new SwingEX03();

	}

}
