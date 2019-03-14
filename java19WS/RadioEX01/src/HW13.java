import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class HW13 extends JFrame {
	
	private File[] image;
	private String[] file ;
	private int count1 =0;
	
	private JLabel imagela = new JLabel();
	
	public HW13() {
		
		image = new File("c:/myphoto").listFiles(); //파일리스트를 뽑아서 image 파일배열에 저장
		
		file = new String[image.length]; //파일배열의 수를 리스트수만큼 만듬
	    for(int i=0; i<image.length;i++) {
	    	file[i]=image[i].getPath(); //리스트의 이름을 읽어와서 문자열로 기록
	    	String name = new String(file[i].replace("\\", "/")); //경로의 \를 /로 바꿔줌
	    	file[i] = name; //다시 파일배열에 순차적으로 저장
	    	System.out.println(file[i]);
	    	
	    }
	    
	    
	     imagela = new JLabel();
	     imagela.setIcon(new ImageIcon(file[0])); //첫화면 파일의 첫번째그림
	     
		
		ImageIcon rtbt = new ImageIcon("image/right.png");
		ImageIcon ltbt = new ImageIcon("image/left.png");
		this.setTitle("갤러리");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		this.setLayout(new BorderLayout());
		
		
		JButton btn1 = new JButton("",ltbt);
		JButton btn2 = new JButton("",rtbt);
		
		JPanel buttonpn = new JPanel();
	    buttonpn.add(btn1);
	    buttonpn.add(btn2);
	    
	    btn2.addActionListener(new MyActionListener());
	    btn1.addActionListener(new MActionListener());
	    this.add(buttonpn,BorderLayout.SOUTH);
	    this.add(imagela,BorderLayout.CENTER);
	    imagela.setHorizontalAlignment(SwingConstants.CENTER);
	    
	    
	    
	    
	    this.setSize(500, 500);
	    this.setVisible(true);	  
		
	}
	
	
	
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(count1>3) {  //배열의크기가 3까지므로 3이상가면 그만
				System.out.println("그만가세요");
				return;
			}
			count1++;
			imagela.setIcon(new ImageIcon(file[count1]));
			
			
		}
		
	}
	
	class MActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(count1<1) {  //배열의크기가 3까지므로 3이상가면 그만
				System.out.println("그만가세요");
				return;
			}
			count1--;
			imagela.setIcon(new ImageIcon(file[count1]));
			
			
			
		}
		
	}
	

	public static void main(String[] args) {
		new HW13();

	}
	}
	


