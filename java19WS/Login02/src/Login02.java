import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login02 extends JFrame implements ActionListener {
    public Login02() {
       this.setTitle("�α���");
       this.setSize(300,200);
       
       Container c = this.getContentPane();
       c.setLayout(null); //���̾ƿ�������
       
       JLabel id=new JLabel("ID");
       id.setLocation(10, 10);
       id.setSize(50,20);
       c.add(id); //add�� �ؾ� ȭ�鿡 ��Ÿ��
       
       JTextField idtxt = new JTextField();
       idtxt.setBounds(10+50+5, 10, 80, 20);
       c.add(idtxt);
       
       JLabel pw = new JLabel("PW");
       pw.setBounds(10, 10+20+5, 50, 20);
       c.add(pw);
       
       JPasswordField pwtxt = new JPasswordField();
       pwtxt.setBounds(10+50+5, 10+20+5, 80, 20);
       c.add(pwtxt);
       
       JButton bt = new JButton("�α���");
       bt.setBounds(10+50+5+80, 10, 80, 70);
       c.add(bt);
       
       
       //bt�� actionlistener���
       //bt.addActionListener(new MyActionListener());
       
//       bt.addActionListener(new ActionListener() {
//
//		@Override
//		public void actionPerformed(ActionEvent arg0) {
//			System.out.println("��ư�̴�����");
//			
//		}});
      
       
       this.setVisible(true);
    
    }
    
	public static void main(String[] args) {
		new Login02();

	}

	
	

}

class MyActionListener implements ActionListener{


	@Override
	//���ٸ� ȣ����̵� �����ʰ� �ڵ�ȣ����(callback�̶����)
	public void actionPerformed(ActionEvent e) {
		//DB�����ؼ�, id,pw�� ��ġ�ϴ��� ��ȸ.
		System.out.println("��ư�� Ŭ����");
		
	}
	
	
}