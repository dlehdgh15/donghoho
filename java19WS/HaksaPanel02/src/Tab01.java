import java.awt.Container;

import java.awt.FlowLayout;



import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JScrollPane;

import javax.swing.JTabbedPane;

import javax.swing.JTextArea;

import javax.swing.JTextField;



public class Tab01 extends JFrame{



	public Tab01() {

		this.setTitle("학사관리");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		

		

		JTabbedPane pane=new JTabbedPane();

		pane.addTab("학생관리",new Haksa());

		this.add(pane);

		

		this.setSize(300, 350);

		this.setVisible(true);

	}

	public static void main(String[] args) {

		new Tab01();



	}

	

	class Haksa extends JPanel{

		public Haksa() {

			this.add(new JLabel("학번"));

			this.add(new JTextField(20));

			this.add(new JLabel("이름"));

			this.add(new JTextField(20));

			this.add(new JLabel("학과"));

			this.add(new JTextField(20));

			this.add(new JLabel("주소"));

			this.add(new JTextField(20));

			JTextArea ta=new JTextArea(7,25);

			this.add(new JScrollPane(ta));

			this.add(new JButton("목록"));

			this.add(new JButton("등록"));

			this.add(new JButton("수정"));

			this.add(new JButton("삭제"));

			

			this.setSize(300,350);			

			

		}

	}



}