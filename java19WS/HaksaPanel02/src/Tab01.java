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

		this.setTitle("�л����");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		

		

		JTabbedPane pane=new JTabbedPane();

		pane.addTab("�л�����",new Haksa());

		this.add(pane);

		

		this.setSize(300, 350);

		this.setVisible(true);

	}

	public static void main(String[] args) {

		new Tab01();



	}

	

	class Haksa extends JPanel{

		public Haksa() {

			this.add(new JLabel("�й�"));

			this.add(new JTextField(20));

			this.add(new JLabel("�̸�"));

			this.add(new JTextField(20));

			this.add(new JLabel("�а�"));

			this.add(new JTextField(20));

			this.add(new JLabel("�ּ�"));

			this.add(new JTextField(20));

			JTextArea ta=new JTextArea(7,25);

			this.add(new JScrollPane(ta));

			this.add(new JButton("���"));

			this.add(new JButton("���"));

			this.add(new JButton("����"));

			this.add(new JButton("����"));

			

			this.setSize(300,350);			

			

		}

	}



}