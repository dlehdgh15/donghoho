import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatServer extends JFrame implements ActionListener {
	private BufferedReader in = null;
	private BufferedWriter out = null;
	private ServerSocket listener = null;
	private Socket socket = null;
	private Receiver receiver; // JTextArea�� ��ӹް� Runnable �������̽��� ������ Ŭ�����μ� ���� ������ ��� ��ü
	private JTextField sender; // JTextField ��ü�μ� ������ ������ ��� ��ü
	private JTextField sendername = null;
	private String nickname;
	private JLabel label = new JLabel("�г���");
	
	public ChatServer() {
		setTitle("���� ä�� â"); // ������ Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� ��ư(X)�� Ŭ���ϸ� ���α׷� ����
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout()); //BorderLayout ��ġ�������� ���
		receiver = new Receiver(); // Ŭ���̾�Ʈ���� ���� �޽����� ����� ���۳�Ʈ
		receiver.setEditable(false); // ���� �Ұ�
		
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

		c.add(new JScrollPane(receiver),BorderLayout.CENTER); // ��ũ�ѹٸ� ����  ScrollPane �̿�
		c.add(textpanel,BorderLayout.SOUTH);
		
		setSize(600, 600); // �� 400 �ȼ�, ���� 200 �ȼ��� ũ��� ������ ũ�� ����
		setVisible(true); // �������� ȭ�鿡 ��Ÿ������ ����
		
		try {
			setupConnection();
		} catch (IOException e) {
			handleError(e.getMessage());
		}
		
		Thread th = new Thread(receiver); // ���κ��� �޽��� ������ ���� ������ ����
		th.start();
	}
	private void setupConnection() throws IOException {
		listener = new ServerSocket(9999); // ���� ���� ����
		socket = listener.accept(); // Ŭ���̾�Ʈ�κ��� ���� ��û ���
		//System.out.println("�����");
		receiver.append("Ŭ���̾�Ʈ�κ��� ���� �Ϸ�\n");
		int pos = receiver.getText().length();
		receiver.setCaretPosition(pos); // caret �������� ���� ���������� �̵�
		
		in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Ŭ���̾�Ʈ�κ����� �Է� ��Ʈ��
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // Ŭ���̾�Ʈ���� ��� ��Ʈ��
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
					msg = in.readLine(); // ���κ��� �� ���� ���ڿ� �ޱ�
				} catch (IOException e) {
					handleError(e.getMessage());
				} 
				this.append(msg+"\n"); // ���� ���ڿ��� JTextArea�� ���
				int pos = this.getText().length();
				this.setCaretPosition(pos); // caret �������� ���� ���������� �̵�
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) { // JTextField�� <Enter> Ű ó��
		if (e.getSource() == sender) {
			String msg = sender.getText(); // �ؽ�Ʈ �ʵ忡�� ���ڿ� ����
			try {
				out.write(nickname+" : "+msg+"\n"); // ���ڿ� ����
				out.flush();
				
				receiver.append(nickname+ " : " + msg +"\n");// JTextArea�� ���
				int pos = receiver.getText().length(); //��ũ���� ������ ��ġ�� �̵�
				receiver.setCaretPosition(pos); // caret �������� ���� ���������� �̵�
				sender.setText(null); // �Է�â�� ���ڿ� ����
			} catch (IOException e1) {
				handleError(e1.getMessage());
			} 
		}
	}
	
	public static void main(String[] args) {
		new ChatServer();
	}

}