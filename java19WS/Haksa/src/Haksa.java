import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyDialog extends JDialog{
	private JLabel lable = new JLabel("����Ǵ� �Է¾ȵȰ� Ȯ���ϼ��� ");
	private JButton okbt = new JButton("Ȯ��");
	


 public MyDialog () {
	 setLayout(new FlowLayout());
	 add(lable);
	 add(okbt);
	 setSize(200,100);
	 
	 okbt.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			
		}
		 
	 });
	 
	 
 }
}

public class Haksa extends JFrame {
	       private JTextField[] txt = { //�ؽ�Ʈ�ʵ� ����迭����
	    		   new JTextField(20),
	    		   new JTextField(20),
	    		   new JTextField(20),
	    		   new JTextField(20),
	    		   
	       };
	       
	       private JButton[] btn={ //��ư�ʵ� ����迭����
	    	   new JButton("���"),
	    	   new JButton("���"),
	    	   new JButton("����"),
	    	   new JButton("����")
	       };
	       private MyDialog dialog; //���̾�α� ��������
	       private StringBuffer st = new StringBuffer(""); //���ڿ��� ������ ��Ʈ������ ����
	
	public Haksa() {
        	 this.setTitle("�л����");
        	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	 
        	 Container c = this.getContentPane();
        	 c.setLayout(new FlowLayout());
        	 
        	dialog = new MyDialog(); //���̾�α� ��ü����
        	 
        	 c.add(new JLabel("�̸�"));
        	 c.add(txt[0]);
        	 c.add(new JLabel("�й�"));
        	 c.add(txt[1]);
        	 c.add(new JLabel("�а�"));
        	 c.add(txt[2]);
        	 c.add(new JLabel("�ּ�"));
        	 c.add(txt[3]);
        	 JTextArea ta=new JTextArea(7,25);
        	 
        	 btn[1].addActionListener(new ActionListener() { //��Ϲ�ư ������

				@Override
				public void actionPerformed(ActionEvent e) {
					for(int i=0; i<txt.length; i++) { //�ؽ�Ʈ�ʵ��� ����ŭ �ݺ��ؼ� ��ĭȮ�� 
						if(txt[i].getText().equals("")) {  //�Էµ� ĭ�� ��ĭ�̸�
							dialog.setVisible(true); //���̾�α׸� ���
							
						}
						else { //��ĭ�̾��ٸ�
						 
						st.append(txt[i].getText()); //��Ʈ�����ۿ� �ؽ�Ʈ�ʵ� ����
						st.append("\n"); //��ĭ��������
						 ta.setText(st.toString());  //�ؽ�Ʈ�����ƿ� ����
						 
							
						}
							
						
					}
					
				}});
        	 
        	 btn[3].addActionListener(new ActionListener() { //������ư ������

				@Override
				public void actionPerformed(ActionEvent e) { 
					int result = JOptionPane.showConfirmDialog(null,"�����Ͻðھ��?���˷�?��¥��?","����",JOptionPane.YES_NO_CANCEL_OPTION);
					if (result ==JOptionPane.YES_OPTION ) {
						ta.setText("");
						JOptionPane.showMessageDialog(null, "����Ȯ�� ���츲 ����","�����޼���",JOptionPane.ERROR_MESSAGE);
						
					}
						
				}
        		 
        	 });
        	 
        	 c.add(new JScrollPane(ta));
        	 c.add(btn[0]);
        	 c.add(btn[1]);
        	 c.add(btn[2]);
        	 c.add(btn[3]);
        	 
        	 this.setSize(300, 500);
        	 this.setVisible(true);
        	 
        	
        	 
        	 
        	  
        	  
          }
	public static void main(String[] args) {
		new Haksa();
	}

}
