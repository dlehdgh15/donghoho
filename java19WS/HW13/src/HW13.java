import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class HW13 extends JFrame {
	private ImageIcon[] image = {    //이미지를 저장할 배열생성
			new ImageIcon("image/spiderman.png"),   //이미지 순차적으로 저장
			new ImageIcon("image/wonderwoman.png"),
			new ImageIcon("image/betman.png"),
			new ImageIcon("image/superman.png"),
	};
	
	
	private JLabel imagela = new JLabel(image[2]); 
	
	public HW13() {
		
		
		this.setTitle("갤러리");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		Container c = this.getContentPane();
	    
		this.setLayout(new BorderLayout()); //브로드레이아웃생성
		getContentPane().add(imagela,BorderLayout.CENTER); //이미지 레이블 가운데부착
		
	    
	    
	    this.setSize(500, 500);
	    this.setVisible(true);
	    
		
		
		
		
		
	  
		
	}
	
	
	

	private void createMenu() {
		JMenuBar jm= new JMenuBar();
		JMenu screen = new JMenu("screen");
		JMenuItem [] jmt = { //메뉴에들어갈 배열생성
				new JMenuItem("view"),
				new JMenuItem("next"),
				new JMenuItem("past"),
				new JMenuItem("exit")
				};
		
	
	MenuActionListener listen = new MenuActionListener();
	for(int i=0; i<jmt.length; i++) {
		jmt[i].addActionListener(new MenuActionListener()); //메뉴리스너등록
		screen.add(jmt[i]);
	}

	jm.add(screen);
	setJMenuBar(jm);
	
	
	}
	
	class MenuActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String name = e.getActionCommand();
			System.out.println(name);
			int count=0;
			switch(name) {
			case "view":
				imagela.setIcon(image[0]);
				break;
			case "next":
				count++;
				imagela.setIcon(image[count]);
				
				break;
			case "past":
				count--;
				imagela.setIcon(image[1+count]);
				
				break;
			case "exit":
			    System.exit(0);
			    break;
			}
			
			
		}
		
		
	}




	public static void main(String[] args) {
		new HW13();

	}

}
