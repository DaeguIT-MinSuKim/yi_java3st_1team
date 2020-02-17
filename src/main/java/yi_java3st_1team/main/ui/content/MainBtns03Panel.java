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

public class MainBtns03Panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MainBtns03Panel() {

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
		btn01.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\그림8.png"));
		btn01.setPreferredSize(new Dimension(560, 23));
		pBtns01.add(btn01, BorderLayout.WEST);
		
		JLabel lblImg01 = new JLabel("");
		lblImg01.setOpaque(true);
		lblImg01.setBackground(new Color(240, 255, 255));
		lblImg01.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\subMainImg1.png"));
		lblImg01.setPreferredSize(new Dimension(560, 15));
		pBtns01.add(lblImg01, BorderLayout.EAST);
		
		JPanel pBtns02 = new JPanel();
		pBtns02.setBackground(SystemColor.inactiveCaption);
		add(pBtns02);
		pBtns02.setLayout(new BorderLayout(10, 10));
		
		JLabel lblImg02 = new JLabel("");
		lblImg02.setOpaque(true);
		lblImg02.setBackground(new Color(240, 255, 255));
		lblImg02.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\subMainImg2.png"));
		lblImg02.setPreferredSize(new Dimension(560, 15));
		pBtns02.add(lblImg02, BorderLayout.WEST);
		
		JButton btn02 = new JButton("");
		btn02.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\그림9.png"));
		btn02.setPreferredSize(new Dimension(560, 23));
		pBtns02.add(btn02, BorderLayout.EAST);
	}
}
