package yi_java3st_1team.main.ui.content;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;

public class MainBtns01Panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MainBtns01Panel() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaption);
		setPreferredSize(new Dimension(1134, 348));
		setLayout(new GridLayout(0, 1, 0, 10));
		
		JPanel pBtns01 = new JPanel();
		pBtns01.setBackground(SystemColor.inactiveCaption);
		add(pBtns01);
		pBtns01.setLayout(new BorderLayout(10, 0));
		
		JButton btn01 = new JButton("");
		btn01.setFocusable(false);
		btn01.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\mainBtn1.png"));
		btn01.setPreferredSize(new Dimension(240, 23));
		pBtns01.add(btn01, BorderLayout.WEST);
		
		JButton btn02 = new JButton("");
		btn02.setFocusable(false);
		btn02.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\mainBtn2.png"));
		pBtns01.add(btn02, BorderLayout.CENTER);
		
		JLabel lblImg01 = new JLabel("");
		lblImg01.setOpaque(true);
		lblImg01.setBackground(new Color(240, 255, 255));
		lblImg01.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\subMainImg1.png"));
		lblImg01.setPreferredSize(new Dimension(640, 15));
		pBtns01.add(lblImg01, BorderLayout.EAST);
		
		JPanel pBtns02 = new JPanel();
		pBtns02.setBackground(SystemColor.inactiveCaption);
		add(pBtns02);
		pBtns02.setLayout(new BorderLayout(10, 10));
		
		JLabel lb1Img02 = new JLabel("");
		lb1Img02.setOpaque(true);
		lb1Img02.setBackground(new Color(240, 255, 255));
		lb1Img02.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\subMainImg2.png"));
		lb1Img02.setPreferredSize(new Dimension(640, 15));
		pBtns02.add(lb1Img02, BorderLayout.WEST);
		
		JButton btn03 = new JButton("");
		btn03.setFocusable(false);
		btn03.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\mainBtn3.png"));
		pBtns02.add(btn03, BorderLayout.CENTER);
		
		JButton btn04 = new JButton("");
		btn04.setFocusable(false);
		btn04.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\mainBtn4.png"));
		btn04.setPreferredSize(new Dimension(240, 23));
		pBtns02.add(btn04, BorderLayout.EAST);
	}
}
