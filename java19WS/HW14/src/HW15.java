import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HW15 extends JFrame {
	private final int FLYING_UNIT = 10;
	private JLabel imagela = new JLabel(new ImageIcon("image/rocket2.png"));
	private JLabel imagela2 = new JLabel(new ImageIcon("image/devil.png"));
	private JLabel imagela3 = new JLabel(new ImageIcon("image/bullet.png"));

	public HW15() {

		setTitle("게임만들기");
		Container c = getContentPane();
		c.setLayout(null);
		c.add(imagela);
		c.add(imagela2);
		c.add(imagela3);
		c.addKeyListener(new MyKeyListener());
		c.setBackground(Color.WHITE);
		imagela.setLocation(300, 400);
		imagela.setSize(300, 300);
		imagela2.setSize(200, 200);
		imagela2.setLocation(200, 0);
		imagela3.setSize(150,150);
		imagela3.setLocation(350,450);
		devil th = new devil();
        
		bullet th1 = new bullet();
		setSize(800, 800);
		setVisible(true);
		th.start();
		th1.start();

		c.setFocusable(true);
		c.requestFocus();
	

	}

	
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();

			switch (keyCode) {
			case KeyEvent.VK_UP:
				imagela.setLocation(imagela.getX(), imagela.getY() - FLYING_UNIT);
				break;
			case KeyEvent.VK_DOWN:
				imagela.setLocation(imagela.getX(), imagela.getY() + FLYING_UNIT);
				break;
			case KeyEvent.VK_LEFT:
				imagela.setLocation(imagela.getX() - FLYING_UNIT, imagela.getY());
				break;
			case KeyEvent.VK_RIGHT:
				imagela.setLocation(imagela.getX() + FLYING_UNIT, imagela.getY());
				break;
			
			}
		}

	}

	class bullet extends Thread{
		private int x1;
		
		public bullet() {
			
		}
        
		
		@Override
		public void run() {
			while(true) {
				imagela3.setLocation(imagela.getX(), imagela3.getY()-FLYING_UNIT);
				try {
					Thread.sleep(10);
					if(imagela3.getY()<0) {
						
						imagela3.setLocation(imagela.getX(),imagela.getY());
						
					}
					
					
				}catch (InterruptedException e) {
					
					e.printStackTrace();
				
			}
		}
		}
		
	}
	class devil extends Thread {
		private int x, y;
		private Container contentpane;

		public devil() {

		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true) {
				imagela2.setLocation(imagela2.getX(), imagela2.getY()+FLYING_UNIT);
				try {
					Thread.sleep(100);
					if(imagela2.getY()>500) {
						Random ran = new Random();
						x=0;
						x=ran.nextInt(700);
						imagela2.setLocation(x, 0);
						
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

		

	public static void main(String[] args) {
		new HW15();
	}

}
