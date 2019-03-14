import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class ChatClient extends JFrame implements ActionListener {
	private BufferedReader in = null;
	private BufferedWriter out = null;
	private Socket socket = null;
	private Receiver receiver = null; // JTextArea를 상속받고 Runnable 인터페이스를 구현한 클래스로서 받은 정보를 담는 객체
	private JTextField sender = null; // JTextField 객체로서 보내는 정보를 담는 객체
	private JTextField sendername = null;
	private String nickname;
	private JLabel label = new JLabel("닉네임");
	private ButtonGroup btng = new ButtonGroup();
	private JRadioButton [] radio = new JRadioButton[3];
	private ImageIcon[] image = {
			new ImageIcon("image/smile.png"),
			new ImageIcon("image/angry.png"),
			new ImageIcon("image/sad.png")
			
	};
	private String[] text = {"웃음","화남","울음"};
	
	public ChatClient() {
		setTitle("클라이언트 채팅 창"); // 프레임 타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 종료 버튼(X)을 클릭하면 프로그램 종료
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout()); //BorderLayout 배치관리자의 사용
		receiver = new Receiver(); // 서버에서 받은 메시지를 출력할 컴퍼넌트
		receiver.setEditable(false); // 편집 불가
		JPanel textpanel = new JPanel();
		
		sendername= new JTextField(5);
		  
		sendername.addActionListener(new ActionListener() {
      
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == sendername) {
					nickname = sendername.getText();
					sendername.setText("");
				}
			}});
		
		sender = new JTextField(20);
		sender.addActionListener(this);
		
		textpanel.add(label);
		textpanel.add(sendername);
		textpanel.add(sender);
		for(int i=0; i<image.length;i++) {
        	radio[i]=new JRadioButton(text[i],image[i]);
        	btng.add(radio[i]);
        	textpanel.add(radio[i]);
        	radio[i].addItemListener(new MyItemListener());
        	
        }
		
		
		
		c.add(new JScrollPane(receiver),BorderLayout.CENTER); // 스크롤바를 위해  ScrollPane 이용
		
		c.add(textpanel,BorderLayout.SOUTH);
		
		setSize(600, 600); // 폭 400 픽셀, 높이 200 픽셀의 크기로 프레임 크기 설정
		setVisible(true); // 프레임이 화면에 나타나도록 설정
		
		try {
			setupConnection();
		} catch (IOException e) {
			handleError(e.getMessage());
		}
		
		Thread th = new Thread(receiver); // 상대로부터 메시지 수신을 위한 스레드 생성
		th.start();
	}
	
	 class MyItemListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(radio[0].isSelected())
				
				if(radio[1].isSelected())
					
					if(radio[2].isSelected())
				
			
		}
		 
		 
		 
	 }
	        	
	        
	    
	
	private void setupConnection() throws IOException {
		socket = new Socket("localhost", 9999); // 클라이언트 소켓 생성
		// System.out.println("연결됨");
		receiver.append("서버에 연결 완료\n");
		int pos = receiver.getText().length();
		receiver.setCaretPosition(pos); // caret 포지션을 가장 마지막으로 이동
		
		in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 클라이언트로부터의 입력 스트림
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // 클라이언트로의 출력 스트림
	}


	private static void handleError(String string) {
		System.out.println(string);
		System.exit(1);
	}
	
	private class Receiver extends JTextArea implements Runnable {
		@Override
		public void run() {
			String msg = null;
			while (true) {
				try {
					msg = in.readLine(); // 상대로부터 한 행의 문자열 받기
				} catch (IOException e) {
					handleError(e.getMessage());
				} 
				this.append(msg+"\n"); // 받은 문자열을 JTextArea에 출력
				int pos = this.getText().length();
				this.setCaretPosition(pos); // caret(커서)을 가장 마지막으로 이동
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { // JTextField에 <Enter> 키 처리
		if (e.getSource() == sender) {
			String msg = sender.getText(); // 텍스트 필드에 사용자가 입력한 문자열
			try {
				out.write(nickname+" : " +msg+"\n"); // 문자열 전송
				out.flush();
				
				receiver.append(nickname+" : " + msg+"\n"); // JTextArea에 출력
				int pos = receiver.getText().length();
				receiver.setCaretPosition(pos); // caret 포지션을 가장 마지막으로 이동
				sender.setText(null); // 입력창의 문자열 지움
			} catch (IOException e1) {
				handleError(e1.getMessage());
			} 
		}
	}
	
	public static void main(String[] args) {
		new ChatClient();
	}
}