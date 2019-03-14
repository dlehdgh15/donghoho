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
       this.setTitle("로그인");
       this.setSize(300,200);
       
       Container c = this.getContentPane();
       c.setLayout(null); //레이아웃사용안함
       
       JLabel id=new JLabel("ID");
       id.setLocation(10, 10);
       id.setSize(50,20);
       c.add(id); //add를 해야 화면에 나타남
       
       JTextField idtxt = new JTextField();
       idtxt.setBounds(10+50+5, 10, 80, 20);
       c.add(idtxt);
       
       JLabel pw = new JLabel("PW");
       pw.setBounds(10, 10+20+5, 50, 20);
       c.add(pw);
       
       JPasswordField pwtxt = new JPasswordField();
       pwtxt.setBounds(10+50+5, 10+20+5, 80, 20);
       c.add(pwtxt);
       
       JButton bt = new JButton("로그인");
       bt.setBounds(10+50+5+80, 10, 80, 70);
       c.add(bt);
       
       
       //bt에 actionlistener등록
       //bt.addActionListener(new MyActionListener());
       
//       bt.addActionListener(new ActionListener() {
//
//		@Override
//		public void actionPerformed(ActionEvent arg0) {
//			System.out.println("버튼이눌려짐");
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
	//별다른 호출없이도 리스너가 자동호출함(callback이라고함)
	public void actionPerformed(ActionEvent e) {
		//DB연동해서, id,pw가 일치하는지 조회.
		System.out.println("버튼이 클릭됨");
		
	}
	
	
}