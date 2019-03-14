import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingEX03 extends JFrame {

	public SwingEX03() {
		this.setTitle("회원가입");
		this.setSize(300,300);
		
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(4,2));
		c.add(new JLabel("이름"));
		c.add(new JTextField(""));
		c.add(new JLabel("학번"));
		c.add(new JTextField(""));
		c.add(new JLabel("학과"));
		c.add(new JTextField(""));
		c.add(new JLabel("과목"));
		c.add(new JTextField(""));
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new SwingEX03();

	}

}
