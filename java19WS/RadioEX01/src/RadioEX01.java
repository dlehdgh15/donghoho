import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class RadioEX01 extends JFrame {
	//Radio��ư
	private JRadioButton[] radio = new JRadioButton[3];
	private String[] name = {"���","��","ü��"};
	private ImageIcon[] image={
		new ImageIcon("image/apple.png"),
		new ImageIcon("image/pear.png"),
		new ImageIcon("image/cherry.png")
	};
	
	private JLabel imageLabel = new JLabel();
	private JComboBox<String> strComb=new JComboBox<String>(name);
	
	public RadioEX01() {
		this.setTitle("������");
		this.setSize(500, 500);
			
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.gray);
		radioPanel.add(strComb);
		
		strComb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int index = cb.getSelectedIndex();
				imageLabel.setIcon(image[index]);
				
			}
			
		});
			
			
		
		//�׷����
		ButtonGroup g = new ButtonGroup();
		for(int i=0; i<radio.length; i++) {//������ư ����
			radio[i]=new JRadioButton(name[i]);  
			g.add(radio[i]); //������ư �׷쿡�߰�
			radioPanel.add(radio[i]); //�гο� ������ư �߰�
			radio[i] .addItemListener(new MyItemListener());
		}
		
		//��� �⺻ ����
		radio[0].setSelected(true);
		
		
		
	     Container c = new Container();
	     this.add(radioPanel,BorderLayout.NORTH);
	     this.add(imageLabel,BorderLayout.CENTER);
	     imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
	     radioPanel.setSize(100,100);
	     imageLabel.setSize(200,200);
	     
	     
		 this.setVisible(true);
				
		}
	
	class MyItemListener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.DESELECTED) //���������Ȱ�� ���� �������
				return; 
			if(radio[0].isSelected())     
				imageLabel.setIcon(image[0]);
			if(radio[1].isSelected())
				imageLabel.setIcon(image[1]);
			if(radio[2].isSelected())
				imageLabel.setIcon(image[2]);
			
		}
	
		
	}	
	
	public static void main(String[] args) {
		new RadioEX01();

	}




	
}