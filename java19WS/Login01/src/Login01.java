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
            	this.setTitle("�α���");
            	this.setSize(170,200);
            	
            	Container c = this.getContentPane();
            	c.setLayout(new FlowLayout(FlowLayout.LEFT));
            	c.add(new JLabel("ID"));
            	c.add(new JTextField(10));
            	c.add(new JLabel("PW"));
            	c.add(new JPasswordField(10));
            	c.add(new JCheckBox("�ڵ��α���"));
            	c.add(new JButton("�α���"));
            	
            	
            	
            	this.setVisible(true);
            }
	public static void main(String[] args) {
		new Login01();

	}

}
