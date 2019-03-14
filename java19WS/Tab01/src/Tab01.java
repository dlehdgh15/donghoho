import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Tab01 extends JFrame{
     public Tab01() {
    	 setTitle("ÅÇÅ°¸¸µé±â");
    	 
    	 Container c = getContentPane();
    	 JTabbedPane pane = createTabbedPane();
    	 c.add(pane,BorderLayout.NORTH);
    	 setSize(500, 500);

         setVisible(true);
    	 
     }
     
     
	private JTabbedPane createTabbedPane() {
		JTabbedPane pane = new JTabbedPane();
		pane.add("tab1",new JLabel(new ImageIcon("image/superman.png")));
		pane.add("tab2",new JLabel(new ImageIcon("image/betman.png")));
		pane.add("tab3",new Mypanel());
		return pane;
	}
	
	class Mypanel extends JPanel{
		public Mypanel() {
			this.setBackground(Color.RED);	
			
			
		}

		

		
		
		
	}


	public static void main(String[] args) {
		new Tab01();

	}

}
