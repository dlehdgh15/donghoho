import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HW11 extends JFrame {
    public HW11() { 
	setTitle("�ؽ�Ʈ�ʵ常���");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	
	c.add(new JLabel("�̸�"));
	c.add(new TextField(20));
	c.add(new JLabel("�а�"));
	c.add(new TextField("��ǻ�Ͱ��а�",20));
	c.add(new JLabel("�ּ�"));
	c.add(new TextField("�����...",20));
	
	setSize(300, 200);
	setVisible(true);
    }
	public static void main(String[] args) {
		new HW11();

	}

}
