package yi_java3st_1team.viewsmanagement.ui.panel;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Dimension;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class MainPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MainPanel() {

		initialize();
	}
	private void initialize() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pTitle = new JPanel();
		pTitle.setBackground(SystemColor.inactiveCaptionBorder);
		pTitle.setBorder(new EmptyBorder(60, 0, 0, 0));
		add(pTitle, BorderLayout.NORTH);
		
		JLabel lblTitle = new JLabel("현황조회 / 보고");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("굴림", Font.BOLD, 36));
		pTitle.add(lblTitle);
		
		JPanel pBtns = new JPanel();
		pBtns.setBackground(SystemColor.inactiveCaptionBorder);
		pBtns.setBorder(new EmptyBorder(50, 100, 50, 100));
		add(pBtns, BorderLayout.CENTER);
		pBtns.setLayout(null);
		
		JButton btn01 = new JButton("");
		btn01.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\reportMainMenu\\그림11.png"));
		btn01.setPreferredSize(new Dimension(250, 170));
		btn01.setBounds(219, 59, 250, 170);
		btn01.setFont(new Font("굴림", Font.PLAIN, 15));
		pBtns.add(btn01);
		
		JButton btn02 = new JButton("");
		btn02.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\reportMainMenu\\그림19.png"));
		btn02.setPreferredSize(new Dimension(250, 170));
		btn02.setSize(new Dimension(270, 190));
		btn02.setBounds(494, 59, 250, 170);
		btn02.setFont(new Font("굴림", Font.PLAIN, 15));
		pBtns.add(btn02);
		
		JButton btn03 = new JButton("");
		btn03.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\reportMainMenu\\DateImg.png"));
		btn03.setPreferredSize(new Dimension(250, 170));
		btn03.setSize(new Dimension(270, 190));
		btn03.setBounds(768, 59, 250, 170);
		btn03.setFont(new Font("굴림", Font.PLAIN, 15));
		pBtns.add(btn03);
		
		JButton btn04 = new JButton("");
		btn04.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\reportMainMenu\\그림24.png"));
		btn04.setPreferredSize(new Dimension(250, 170));
		btn04.setSize(new Dimension(270, 190));
		btn04.setBounds(219, 257, 250, 170);
		btn04.setFont(new Font("굴림", Font.PLAIN, 15));
		pBtns.add(btn04);
		
		JButton btn05 = new JButton("");
		btn05.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\reportMainMenu\\그림29.png"));
		btn05.setPreferredSize(new Dimension(250, 170));
		btn05.setSize(new Dimension(270, 190));
		btn05.setBounds(494, 257, 250, 170);
		btn05.setFont(new Font("굴림", Font.PLAIN, 15));
		pBtns.add(btn05);
		
		JButton btn06 = new JButton("");
		btn06.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\reportMainMenu\\그림26.png"));
		btn06.setSize(new Dimension(270, 190));
		btn06.setPreferredSize(new Dimension(250, 170));
		btn06.setFont(new Font("굴림", Font.PLAIN, 15));
		btn06.setBounds(768, 257, 250, 170);
		pBtns.add(btn06);
	}
}
