import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chart01 extends JFrame {
    private Vector<Integer> vc = new Vector<Integer>();
    private Vector<Integer> vc2 = new Vector<Integer>();
    private int sum=0;
    private int avg=0;
    private MyPanel panel = new MyPanel();
	public Chart01() {

	
		            
                	this.setTitle("차트");
                	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                	this.setSize(500, 500);
                	
                	this.setContentPane(panel);
                
                	
                	
                	this.setVisible(true);
                	
                }
	 
                class MyPanel extends JPanel{
                	public void paintComponent(Graphics g) {
                		super.paintComponents(g);
                		
                		Scanner scanner = new Scanner(System.in);
                        System.out.println("1/4분기부터 4/4분기까지 실적을 입력하세요: ");
                		for(int i=0; i<vc.size();i++) {
                			int n=scanner.nextInt();
                			vc.add(n);
                			
                		}
                		for(int i=0; i<vc.size();i++) {
                			int n1 = vc.get(i);
                			sum+=n1;
                			
                		}
                		
                		
                		for(int i=0; i<vc.size(); i++) {
                			
                			vc2.add((vc.get(i)/sum)*100);
                			
                			System.out.println(vc2.get(i));
                		}
                 		
                 		
                		
                		
                		//막대그래프
                		g.drawString("매출현황",200,30);
                		g.drawString("1/4분기",40,65);
                		g.drawString("2/4분기",40,100);
                		g.drawString("3/4분기",40,135);
                		g.drawString("4/4분기",40,170);
                		
                		g.setColor(Color.RED);
                		g.fillRect(100, 50, 100, 20);
       
                		g.setColor(Color.BLUE);
                		g.fillRect(100, 85, 200, 20);
                		
                		g.setColor(Color.YELLOW);
                		g.fillRect(100, 120, 300, 20);
 
                		g.setColor(Color.BLUE);
                		g.fillRect(100, 155, 400, 20);
                		
                	}
                
                		
                	
                
                	
                }
	public static void main(String[] args) {
		
		new Chart01();
	

	}

}
