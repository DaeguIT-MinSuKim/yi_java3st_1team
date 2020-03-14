package yi_java3st_1team.viewsmanagement.ui.panel;

import java.awt.Color;
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
		setPreferredSize(new Dimension(1270, 700));
		setLayout(null);
		
		JPanel pTitle = new JPanel();
		pTitle.setBounds(0, 0, 1338, 132);
		pTitle.setBackground(SystemColor.inactiveCaptionBorder);
		pTitle.setBorder(new EmptyBorder(80, 0, 0, 0));
		add(pTitle);
		pTitle.setLayout(null);
		
		JLabel lblTitle = new JLabel("현황조회 / 보고");
		lblTitle.setForeground(Color.BLACK);
		lblTitle.setBounds(0, 85, 1196, 42);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		pTitle.add(lblTitle);
		
		JPanel pBtns = new JPanel();
		pBtns.setBounds(0, 132, 1338, 585);
		pBtns.setBackground(SystemColor.inactiveCaptionBorder);
		pBtns.setBorder(new EmptyBorder(50, 100, 50, 100));
		add(pBtns);
		pBtns.setLayout(null);
		
		btn01 = new JButton("");
		btn01.setBackground(Color.WHITE);
		btn01.setFocusable(false);
		btn01.addActionListener(this);
		btn01.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\reportMenu\\btn01.png"));
		btn01.setPreferredSize(new Dimension(250, 170));
		btn01.setBounds(219, 70, 240, 148);
		btn01.setFont(new Font("굴림", Font.PLAIN, 15));
		pBtns.add(btn01);
		
		btn02 = new JButton("");
		btn02.setBackground(new Color(255, 245, 238));
		btn02.setFocusable(false);
		btn02.addActionListener(this);
		btn02.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\reportMenu\\btn02.png"));
		btn02.setPreferredSize(new Dimension(250, 170));
		btn02.setSize(new Dimension(270, 190));
		btn02.setBounds(494, 70, 240, 148);
		btn02.setFont(new Font("굴림", Font.PLAIN, 15));
		pBtns.add(btn02);
		
		btn03 = new JButton("");
		btn03.setBackground(new Color(245, 255, 250));
		btn03.setFocusable(false);
		btn03.addActionListener(this);
		btn03.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\reportMenu\\btn03.png"));
		btn03.setPreferredSize(new Dimension(250, 170));
		btn03.setSize(new Dimension(270, 190));
		btn03.setBounds(768, 70, 240, 148);
		btn03.setFont(new Font("굴림", Font.PLAIN, 15));
		pBtns.add(btn03);
		
		btn04 = new JButton("");
		btn04.setBackground(new Color(245, 255, 250));
		btn04.setFocusable(false);
		btn04.addActionListener(this);
		btn04.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\reportMenu\\btn04.png"));
		btn04.setPreferredSize(new Dimension(250, 170));
		btn04.setSize(new Dimension(270, 190));
		btn04.setBounds(219, 257, 240, 148);
		btn04.setFont(new Font("굴림", Font.PLAIN, 15));
		pBtns.add(btn04);
		
		btn05 = new JButton("");
		btn05.setBackground(new Color(255, 245, 238));
		btn05.setFocusable(false);
		btn05.addActionListener(this);
		btn05.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\reportMenu\\btn05.png"));
		btn05.setPreferredSize(new Dimension(250, 170));
		btn05.setSize(new Dimension(270, 190));
		btn05.setBounds(494, 257, 240, 148);
		btn05.setFont(new Font("굴림", Font.PLAIN, 15));
		pBtns.add(btn05);
		
		btn06 = new JButton("");
		btn06.setBackground(Color.WHITE);
		btn06.setFocusable(false);
		btn06.addActionListener(this);
		btn06.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\reportMenu\\btn06.png"));
		btn06.setSize(new Dimension(270, 190));
		btn06.setPreferredSize(new Dimension(250, 170));
		btn06.setFont(new Font("굴림", Font.PLAIN, 15));
		btn06.setBounds(768, 257, 240, 148);
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
		frame.setResizable(false);//사이즈막음
		frame.setLocationRelativeTo(null);//모니터정중앙에 프레임 뜨도록
	}
	protected void btn02ActionPerformed(ActionEvent e) {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1500, 900);
		SWSaleUIPanel cs = new SWSaleUIPanel();
		frame.getContentPane().add(cs);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
	}
	protected void btn03ActionPerformed(ActionEvent e) {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1500, 900);
		DateSaleUIPanel cs = new DateSaleUIPanel();
		frame.getContentPane().add(cs);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
	}
	protected void btn04ActionPerformed(ActionEvent e) {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1500, 900);
		GraphUIPanel cs = new GraphUIPanel();
		frame.getContentPane().add(cs);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
	}
	protected void btn05ActionPerformed(ActionEvent e) {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1500, 900);
		SW_TSUIPanel cs = new SW_TSUIPanel();
		frame.getContentPane().add(cs);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
	}
	protected void btn06ActionPerformed(ActionEvent e) {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1500, 900);
		IQEvaluationUIPanel cs = new IQEvaluationUIPanel();
		frame.getContentPane().add(cs);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
	}
}