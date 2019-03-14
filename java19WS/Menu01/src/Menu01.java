

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

public class Menu01 extends JFrame {
        
		
		public Menu01() {
        	  setTitle("메뉴프로그램");
        	  createMenu();
        	  setSize(250,200);
        	  setVisible(true);
        	  
        	  
          }
	private void createMenu() {
		JToolBar tb = new JToolBar("kitae menu");
		tb.setBackground(Color.BLACK);
		JButton btn = new JButton("NEW");
		tb.add(btn);
		
		JMenuBar mb =new JMenuBar();
			 JMenu screenmenu = new JMenu("Screen");
			 
			 JMenuItem m1 = new JMenuItem("Load");
			 m1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("로드클릭");
					
				}});
			 screenmenu.add(m1);
			 screenmenu.add(new JMenuItem("Hide"));
			 screenmenu.add(new JMenuItem("Reshow"));
			 screenmenu.addSeparator();
			 screenmenu.add(new JMenuItem("Exit"));
			 
			 mb.add(screenmenu);
			 mb.add(new JMenu("Edit"));
			 mb.add(new JMenu("Source"));
			 mb.add(new JMenu("Project"));
			 mb.add(new JMenu("Run"));
			 tb.addSeparator();
			 tb.add(new JButton("open"));
			 this.add(tb,BorderLayout.NORTH);
			 
			 
			 
			 setJMenuBar(mb);
		
		}
	public static void main(String[] args) {
		new Menu01();

	}

}
