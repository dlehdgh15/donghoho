import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Event02 extends JFrame {
    private JLabel la= new JLabel("Hello"); //전역변수 생섣
	
    public Event02() {
    	setTitle("Mouse 이벤트 예제");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	Container c = getContentPane();
    	//c.addMouseListener(new MyMouseListener());
        c.addMouseListener(new MyMouseAdapter());
        
    	c.setLayout(null);
    	la.setSize(50,20);
    	la.setLocation(30, 30);
    	c.add(la);
        
    	setSize(250,250);
    	c.addKeyListener(new MyKeyListener());
    	c.setFocusable(true); //키입력받을수 있도록 포커스 강제 지정
    	c.requestFocus();
    	
    	setVisible(true);
    
    }
    
    class MyMouseAdapter extends MouseAdapter{
    	public void mousePressed(MouseEvent e) {
			int x=e.getX();
    		int y=e.getY();
    		la.setLocation(x, y);
		}
    	
    }
     class MyMouseListener implements MouseListener{
    	
    	
    	public void mouseReleased(MouseEvent e){}
    	public void mouseClicked(MouseEvent e){}
    	public void mouseEntered(MouseEvent e){}
    	public void mouseExited(MouseEvent e){}
		@Override
		public void mousePressed(MouseEvent e) {
			int x=e.getX();
    		int y=e.getY();
    		la.setLocation(x, y);
		}
    	
    }
	
	public static void main(String[] args) {
		new Event02();

	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource(); //리턴값이 오브젝트 캐스팅해서씀
			if(e.getKeyChar()=='@')
				contentPane.setBackground(Color.YELLOW);
			if(e.getKeyCode()==KeyEvent.VK_F1)
				contentPane.setBackground(Color.GREEN);
			
			switch(e.getKeyCode()) {
			case KeyEvent.VK_UP:
			la.setLocation(la.getX(), la.getY()-10);
			break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY()+10);
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX()-10, la.getY());
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX()+10, la.getY());
				break;
			}
			
		}
		
	}

}
