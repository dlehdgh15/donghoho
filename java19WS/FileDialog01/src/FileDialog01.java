import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileDialog01 extends JFrame {
	private JLabel imagela = new JLabel();
	public FileDialog01() {
		setTitle("파일다이얼로그");
		setSize(500,500);
		Container c= getContentPane();
		c.add(imagela);
		createMenu();
		setVisible(true);
		
		
		
	}

	private void createMenu() {
		JMenuBar jb = new JMenuBar();
		JMenu jm = new JMenu("File");
		JMenuItem jmt = new JMenuItem("open");
		
		jmt.addActionListener(new OpenActionListener());
		
		jm.add(jmt);
		jb.add(jm);
		setJMenuBar(jb);
		
		
	}
	
	class OpenActionListener implements ActionListener{
		private JFileChooser chooser;

		public OpenActionListener() {
			chooser = new JFileChooser();
			
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images","jpg","png","gif");
			chooser.setFileFilter(filter);
			
			int ret = chooser.showOpenDialog(null);
			if(ret!=JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null,"파일을 선택하지않았습니다","경고",JOptionPane.WARNING_MESSAGE);
				return;
				
			}
			
			String filePath = chooser.getSelectedFile().getPath();
			imagela.setIcon(new ImageIcon(filePath));
			pack();
			
		}
	
		
	}

	public static void main(String[] args) {
		new FileDialog01();

	}

}
