package yi_java3st_1team.viewsmanagement.ui.panel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class MainPanel extends JPanel implements ActionListener {
	private JButton btn01;
	private JButton btn02;
	private JButton btn03;
	private JButton btn04;
	private JButton btn05;
	private JButton btn06;

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
		pTitle.setBorder(new EmptyBorder(80, 0, 0, 0));
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
		
		btn01 = new JButton("");
		btn01.addActionListener(this);
		btn01.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\reportMenu\\btn01.png"));
		btn01.setPreferredSize(new Dimension(250, 170));
		btn01.setBounds(219, 59, 250, 170);
		btn01.setFont(new Font("굴림", Font.PLAIN, 15));
		pBtns.add(btn01);
		
		btn02 = new JButton("");
		btn02.addActionListener(this);
		btn02.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\reportMenu\\btn02.png"));
		btn02.setPreferredSize(new Dimension(250, 170));
		btn02.setSize(new Dimension(270, 190));
		btn02.setBounds(494, 59, 250, 170);
		btn02.setFont(new Font("굴림", Font.PLAIN, 15));
		pBtns.add(btn02);
		
		btn03 = new JButton("");
		btn03.addActionListener(this);
		btn03.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\reportMenu\\btn03.png"));
		btn03.setPreferredSize(new Dimension(250, 170));
		btn03.setSize(new Dimension(270, 190));
		btn03.setBounds(768, 59, 250, 170);
		btn03.setFont(new Font("굴림", Font.PLAIN, 15));
		pBtns.add(btn03);
		
		btn04 = new JButton("");
		btn04.addActionListener(this);
		btn04.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\reportMenu\\btn04.png"));
		btn04.setPreferredSize(new Dimension(250, 170));
		btn04.setSize(new Dimension(270, 190));
		btn04.setBounds(219, 257, 250, 170);
		btn04.setFont(new Font("굴림", Font.PLAIN, 15));
		pBtns.add(btn04);
		
		btn05 = new JButton("");
		btn05.addActionListener(this);
		btn05.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\reportMenu\\btn05.png"));
		btn05.setPreferredSize(new Dimension(250, 170));
		btn05.setSize(new Dimension(270, 190));
		btn05.setBounds(494, 257, 250, 170);
		btn05.setFont(new Font("굴림", Font.PLAIN, 15));
		pBtns.add(btn05);
		
		btn06 = new JButton("");
		btn06.addActionListener(this);
		btn06.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\reportMenu\\btn06.png"));
		btn06.setSize(new Dimension(270, 190));
		btn06.setPreferredSize(new Dimension(250, 170));
		btn06.setFont(new Font("굴림", Font.PLAIN, 15));
		btn06.setBounds(768, 257, 250, 170);
		pBtns.add(btn06);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn06) {
			btn06ActionPerformed(e);
		}
		if (e.getSource() == btn05) {
			btn05ActionPerformed(e);
		}
		if (e.getSource() == btn04) {
			btn04ActionPerformed(e);
		}
		if (e.getSource() == btn03) {
			btn03ActionPerformed(e);
		}
		if (e.getSource() == btn02) {
			btn02ActionPerformed(e);
		}
		if (e.getSource() == btn01) {
			btn01ActionPerformed(e);
		}
	}
	protected void btn01ActionPerformed(ActionEvent e) {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1500, 900);
		ClientSaleUIPanel cs = new ClientSaleUIPanel();
		frame.getContentPane().add(cs);
		frame.setVisible(true);
	}
	protected void btn02ActionPerformed(ActionEvent e) {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1500, 900);
		SWSaleUIPanel cs = new SWSaleUIPanel();
		frame.getContentPane().add(cs);
		frame.setVisible(true);
	}
	protected void btn03ActionPerformed(ActionEvent e) {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1500, 900);
		DateSaleUIPanel cs = new DateSaleUIPanel();
		frame.getContentPane().add(cs);
		frame.setVisible(true);
	}
	protected void btn04ActionPerformed(ActionEvent e) {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1500, 900);
		GraphUIPanel cs = new GraphUIPanel();
		frame.getContentPane().add(cs);
		frame.setVisible(true);
	}
	protected void btn05ActionPerformed(ActionEvent e) {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1500, 900);
		SW_SpecUIPanel cs = new SW_SpecUIPanel();
		frame.getContentPane().add(cs);
		frame.setVisible(true);
	}
	protected void btn06ActionPerformed(ActionEvent e) {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1500, 900);
		IQUIPanel cs = new IQUIPanel();
		frame.getContentPane().add(cs);
		frame.setVisible(true);
	}
}
