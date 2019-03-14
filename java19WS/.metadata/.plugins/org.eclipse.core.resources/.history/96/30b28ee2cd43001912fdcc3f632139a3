import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HW12 extends JFrame {
	private ImageIcon[] image = {    //이미지를 저장할 배열생성
			new ImageIcon("image/spiderman.png"),   //이미지 순차적으로 저장
			new ImageIcon("image/wonderwoman.png"),
			new ImageIcon("image/betman.png"),
			new ImageIcon("image/superman.png"),
	};
	private int count1 =0; //카운트변수생성
	
	private JLabel imagela = new JLabel(image[0]); //첫화면에 스파이더맨이 뜨게해줌
	
	public HW12() {
		ImageIcon rtbt = new ImageIcon("image/right.png"); //버튼에 이미지를 입혀줌
		ImageIcon ltbt = new ImageIcon("image/left.png");
		this.setTitle("갤러리");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		this.setLayout(new BorderLayout()); //브로드레이아웃생성
		
		
		
		JButton btn1 = new JButton("",ltbt); //왼쪽버튼생성
		JButton btn2 = new JButton("",rtbt); //오른쪽버튼생성
		
		JPanel buttonpn = new JPanel(); //패널생성
	    buttonpn.add(btn1);  //버튼을 패널에 부착
	    buttonpn.add(btn2);
	    
	    btn2.addActionListener(new MyActionListener()); //오른쪽버튼 누를시 발생되는 리스너
	    btn1.addActionListener(new MActionListener());  //왼쪽 버튼 누를시 발생되는 리스너
	    this.add(buttonpn,BorderLayout.SOUTH); //버튼은 아래로	
	    this.add(imagela,BorderLayout.CENTER); //이미지는 가운데
	    
	    
	    
	    
	    this.setSize(500, 500);
	    this.setVisible(true);
	    
		
		
		
		
		
	  
		
	}
	
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(count1>2) {  //배열의크기가 3까지므로 3이상가면 그만
				System.out.println("그만가세요");
				return;
			}
			count1++;
			imagela.setIcon(image[count1]); //클릭수에따라 이미지를 넘김
			
			
		}
		
	}
	
	class MActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			if(count1<1) { //배열의끝이 0까지므로 0이상가면 그만
				System.out.println("그만가세요");
				return;
			}
			count1--;
			imagela.setIcon(image[count1]);
			
			
		}
		
	}
	

	public static void main(String[] args) {
		new HW12();

	}

}
