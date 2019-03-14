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
	private JLabel lable = new JLabel("공백또는 입력안된곳 확인하세요 ");
	private JButton okbt = new JButton("확인");
	


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
	       private JTextField[] txt = { //텍스트필드 저장배열생성
	    		   new JTextField(20),
	    		   new JTextField(20),
	    		   new JTextField(20),
	    		   new JTextField(20),
	    		   
	       };
	       
	       private JButton[] btn={ //버튼필드 저장배열생성
	    	   new JButton("목록"),
	    	   new JButton("등록"),
	    	   new JButton("수정"),
	    	   new JButton("삭제")
	       };
	       private MyDialog dialog; //다이얼로그 변수생성
	       private StringBuffer st = new StringBuffer(""); //문자열을 저장할 스트링버퍼 생성
	
	public Haksa() {
        	 this.setTitle("학사관리");
        	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	 
        	 Container c = this.getContentPane();
        	 c.setLayout(new FlowLayout());
        	 
        	dialog = new MyDialog(); //다이얼로그 객체생성
        	 
        	 c.add(new JLabel("이름"));
        	 c.add(txt[0]);
        	 c.add(new JLabel("학번"));
        	 c.add(txt[1]);
        	 c.add(new JLabel("학과"));
        	 c.add(txt[2]);
        	 c.add(new JLabel("주소"));
        	 c.add(txt[3]);
        	 JTextArea ta=new JTextArea(7,25);
        	 
        	 btn[1].addActionListener(new ActionListener() { //등록버튼 리스너

				@Override
				public void actionPerformed(ActionEvent e) {
					for(int i=0; i<txt.length; i++) { //텍스트필드의 수만큼 반복해서 빈칸확인 
						if(txt[i].getText().equals("")) {  //입력된 칸이 빈칸이면
							dialog.setVisible(true); //다이얼로그를 띄움
							
						}
						else { //빈칸이없다면
						 
						st.append(txt[i].getText()); //스트링버퍼에 텍스트필드 저장
						st.append("\n"); //한칸띄우기위해
						 ta.setText(st.toString());  //텍스트에리아에 저장
						 
							
						}
							
						
					}
					
				}});
        	 
        	 btn[3].addActionListener(new ActionListener() { //삭제버튼 리스너

				@Override
				public void actionPerformed(ActionEvent e) { 
					int result = JOptionPane.showConfirmDialog(null,"삭제하시겠어요?레알로?진짜로?","삭제",JOptionPane.YES_NO_CANCEL_OPTION);
					if (result ==JOptionPane.YES_OPTION ) {
						ta.setText("");
						JOptionPane.showMessageDialog(null, "삭제확인 못살림 ㅃㅃ","삭제메세지",JOptionPane.ERROR_MESSAGE);
						
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
