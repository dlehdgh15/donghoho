import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HW11_2 extends JFrame {
	static JLabel la = new JLabel("����ð�");
    public HW11_2() {
    	setTitle("����ð� ����ϴ� â");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	Container c = getContentPane();
    	c.setLayout(null);
    	
    	SimpleDateFormat format1 = new SimpleDateFormat ( "HH��mm��ss��"); //����ð��� �����ҹ������
    	SimpleDateFormat format2 = new SimpleDateFormat ( "yyyy�� MM��dd�� HH��mm��ss��");
    	Date time = new Date();  //����ð��� Ÿ���ν��Ͻ��� ����
    	String time1 = format1.format(time); //���������� ����ð� ����
    	String time2 = format2.format(time); //����2������� ����ð� ����
    	
    	
    	
    	
    	
    	
        la.setLocation(200,5);
        la.setSize(100, 100);
        
    	
    	JButton btn = new JButton("��ư1");
    	btn.setSize(80, 80);
    	btn.setLocation(0, 100);
    	JButton btn2 = new JButton("��ư2");
    	btn2.setSize(80, 80);
    	btn2.setLocation(120, 100);
    	
    	JButton btn3 = new JButton("��ư3");
    	btn3.setSize(80, 80);
    	btn3.setLocation(240, 100);
    	
    	
    	JButton btn4 = new JButton("��ư4");
    	btn4.setSize(80, 80);
    	btn4.setLocation(360, 100);
    	
    	c.add(btn);
    	c.add(la);
    	c.add(btn2);
    	c.add(btn3);
    	
    	c.add(btn4);
    	btn.addActionListener(new MyActionListener());
    	btn2.addActionListener(new MActionListener());
    	
    	
    	setSize(500,500);
    	setVisible(true);
    	
    	
    	
    }
	public static void main(String[] args) {
		new HW11_2();

	}
	//����Ŭ����
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			SimpleDateFormat format2 = new SimpleDateFormat ( "yyyy�� MM��dd�� HH��mm��ss��");
			Date time = new Date();
			String time2 = format2.format(time); //����2������� ����ð� ����
			if(b.getText().equals("��ư1"))
				la.setText(time2);
		}
		
	}

}
//�ܺ�Ŭ����
class MActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		SimpleDateFormat format2 = new SimpleDateFormat ( "yyyy�� MM��dd�� HH��mm��ss��");
		Date time = new Date();
		String time2 = format2.format(time); //����2������� ����ð� ����
		if(b.getText().equals("��ư2"))
			HW11_2.la.setText(time2);
	}
	
}
