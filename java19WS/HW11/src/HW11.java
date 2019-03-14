import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HW11 extends JFrame {
    public HW11() { 
	setTitle("텍스트필드만들기");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	
	c.add(new JLabel("이름"));
	c.add(new TextField(20));
	c.add(new JLabel("학과"));
	c.add(new TextField("컴퓨터공학과",20));
	c.add(new JLabel("주소"));
	c.add(new TextField("서울시...",20));
	
	setSize(300, 200);
	setVisible(true);
    }
	public static void main(String[] args) {
		new HW11();

	}

}
