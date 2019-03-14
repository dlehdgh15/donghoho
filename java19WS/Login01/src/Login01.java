import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login01 extends JFrame {
            public Login01() {
            	this.setTitle("로그인");
            	this.setSize(170,200);
            	
            	Container c = this.getContentPane();
            	c.setLayout(new FlowLayout(FlowLayout.LEFT));
            	c.add(new JLabel("ID"));
            	c.add(new JTextField(10));
            	c.add(new JLabel("PW"));
            	c.add(new JPasswordField(10));
            	c.add(new JCheckBox("자동로그인"));
            	c.add(new JButton("로그인"));
            	
            	
            	
            	this.setVisible(true);
            }
	public static void main(String[] args) {
		new Login01();

	}

}
