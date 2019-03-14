import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HW11_2 extends JFrame {
	static JLabel la = new JLabel("현재시간");
    public HW11_2() {
    	setTitle("현재시간 출력하는 창");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	Container c = getContentPane();
    	c.setLayout(null);
    	
    	SimpleDateFormat format1 = new SimpleDateFormat ( "HH시mm분ss초"); //현재시간을 포멧할방법제시
    	SimpleDateFormat format2 = new SimpleDateFormat ( "yyyy년 MM월dd일 HH시mm분ss초");
    	Date time = new Date();  //현재시간을 타임인스턴스에 저장
    	String time1 = format1.format(time); //포멧방식으로 현재시간 저장
    	String time2 = format2.format(time); //포멧2방식으로 현재시간 저장
    	
    	
    	
    	
    	
    	
        la.setLocation(200,5);
        la.setSize(100, 100);
        
    	
    	JButton btn = new JButton("버튼1");
    	btn.setSize(80, 80);
    	btn.setLocation(0, 100);
    	JButton btn2 = new JButton("버튼2");
    	btn2.setSize(80, 80);
    	btn2.setLocation(120, 100);
    	
    	JButton btn3 = new JButton("버튼3");
    	btn3.setSize(80, 80);
    	btn3.setLocation(240, 100);
    	
    	
    	JButton btn4 = new JButton("버튼4");
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
	//내부클래스
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			SimpleDateFormat format2 = new SimpleDateFormat ( "yyyy년 MM월dd일 HH시mm분ss초");
			Date time = new Date();
			String time2 = format2.format(time); //포멧2방식으로 현재시간 저장
			if(b.getText().equals("버튼1"))
				la.setText(time2);
		}
		
	}

}
//외부클래스
class MActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		SimpleDateFormat format2 = new SimpleDateFormat ( "yyyy년 MM월dd일 HH시mm분ss초");
		Date time = new Date();
		String time2 = format2.format(time); //포멧2방식으로 현재시간 저장
		if(b.getText().equals("버튼2"))
			HW11_2.la.setText(time2);
	}
	
}
