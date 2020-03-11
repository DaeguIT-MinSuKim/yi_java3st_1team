package yi_java3st_1team.main.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
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

import yi_java3st_1team.main.ui.content.LogoImg01Panel;
import yi_java3st_1team.main.ui.content.LogoImg03Panel;
import yi_java3st_1team.main.ui.content.login.ClientRegiPanel;
import yi_java3st_1team.main.ui.content.login.LoginPanel;
import yi_java3st_1team.main.ui.content.login.SearchPanel;

@SuppressWarnings("serial")
public class ClientMainUIPanel extends JPanel implements ActionListener {
	private JButton btnLogin;
	private JButton btnRegi;
	private JButton btnSearch;
	private JFrame cliFrame;
	private JFrame searchFrame;
	private JPanel pBtns;
	private JPanel pBtns01;
	private JPanel pBtns02;
	private JButton btn01;
	private JButton btn02;
	
	public ClientMainUIPanel() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaption);
		setBounds(new Rectangle(0, 0, 1544, 700));
		setLayout(new GridLayout(0, 1, 10, 10));
		
		JPanel pStop = new JPanel();
		pStop.setBackground(SystemColor.inactiveCaption);
		pStop.setBorder(new EmptyBorder(0, 20, 0, 20));
		add(pStop);
		pStop.setLayout(new BorderLayout(10, 10));
		
		LoginPanel pLogin = new LoginPanel();
		pLogin.setPreferredSize(new Dimension(350, 10));
		pStop.add(pLogin, BorderLayout.WEST);
		
		btnLogin = new JButton("LOGIN");
		btnLogin.setBackground(SystemColor.controlHighlight);
		btnLogin.addActionListener(this);
		btnLogin.setFont(new Font("Arial", Font.BOLD, 17));
		btnLogin.setFocusable(false);
		btnLogin.setBounds(20,245,120,45);
		pLogin.add(btnLogin);
		
		btnRegi = new JButton("REGISTER");
		btnRegi.setBackground(SystemColor.controlHighlight);
		btnRegi.addActionListener(this);
		btnRegi.setFont(new Font("Arial", Font.BOLD, 17));
		btnRegi.setFocusable(false);
		btnRegi.setBounds(147,245,120,45);
		pLogin.add(btnRegi);
		
		btnSearch = new JButton("");
		btnSearch.setBackground(SystemColor.controlHighlight);
		btnSearch.addActionListener(this);
		btnSearch.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\searchBtn.png"));
		btnSearch.setFocusable(false);
		btnSearch.setBounds(273,245, 55, 45);
		pLogin.add(btnSearch);
		
		LogoImg03Panel pImg01 = new LogoImg03Panel();
		pStop.add(pImg01, BorderLayout.CENTER);
		
		JPanel pSbot = new JPanel();
		pSbot.setBorder(new EmptyBorder(0, 20, 0, 20));
		pSbot.setBackground(SystemColor.inactiveCaption);
		add(pSbot);
		pSbot.setLayout(new BorderLayout(10, 10));
		
		JPanel pImg02 = new JPanel();
		pImg02.setBackground(SystemColor.inactiveCaption);
		pImg02.setPreferredSize(new Dimension(350, 10));
		pSbot.add(pImg02, BorderLayout.WEST);
		pImg02.setLayout(new BorderLayout(0, 10));
		
		LogoImg01Panel panel = new LogoImg01Panel();
		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(350, 250));
		pImg02.add(panel, BorderLayout.NORTH);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\callcenter.png"));
		label.setOpaque(true);
		label.setBackground(SystemColor.inactiveCaptionBorder);
		pImg02.add(label, BorderLayout.CENTER);
		
		pBtns = new JPanel();
		pBtns.setBackground(SystemColor.inactiveCaption);
		pSbot.add(pBtns, BorderLayout.CENTER);
		pBtns.setLayout(new GridLayout(0, 1, 0, 10));
		
		pBtns01 = new JPanel();
		pBtns01.setBackground(SystemColor.inactiveCaption);
		pBtns.add(pBtns01);
		pBtns01.setLayout(new BorderLayout(10, 0));
		
		btn01 = new JButton("");
		btn01.addActionListener(this);
		btn01.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\그림8.png"));
		btn01.setPreferredSize(new Dimension(560, 23));
		btn01.setFocusable(false);
		pBtns01.add(btn01, BorderLayout.WEST);
		
		JLabel lblImg01 = new JLabel("");
		lblImg01.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\subMainImg1.png"));
		lblImg01.setPreferredSize(new Dimension(560, 15));
		lblImg01.setOpaque(true);
		lblImg01.setBackground(new Color(240, 255, 255));
		pBtns01.add(lblImg01, BorderLayout.EAST);
		
		pBtns02 = new JPanel();
		pBtns02.setBackground(SystemColor.inactiveCaption);
		pBtns.add(pBtns02);
		pBtns02.setLayout(new BorderLayout(10, 10));
		
		JLabel lblImg02 = new JLabel("");
		lblImg02.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\subMainImg2.png"));
		lblImg02.setPreferredSize(new Dimension(560, 15));
		lblImg02.setOpaque(true);
		lblImg02.setBackground(new Color(240, 255, 255));
		pBtns02.add(lblImg02, BorderLayout.WEST);
		
		btn02 = new JButton("");
		btn02.addActionListener(this);
		btn02.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\그림9.png"));
		btn02.setPreferredSize(new Dimension(560, 23));
		btn02.setFocusable(false);
		pBtns02.add(btn02, BorderLayout.EAST);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn02) {
			actionPerformedBtn02(e);
		}
		if (e.getSource() == btn01) {
			actionPerformedBtn01(e);
		}
		if (e.getSource() == btnSearch) {
			actionPerformedBtnSearch(e);
		}
		if (e.getSource() == btnRegi) {
			actionPerformedBtnRegi(e);
		}
		if (e.getSource() == btnLogin) {
			actionPerformedBtnLogin(e);
		}
	}
	//로그인
	protected void actionPerformedBtnLogin(ActionEvent e) {
		
	}
	
	//회원가입
	protected void actionPerformedBtnRegi(ActionEvent e) {
		cliFrame = new JFrame();
		cliFrame.setTitle("[고객용] 회원가입");
		cliFrame.setSize(500, 650);
		cliFrame.setResizable(false);
		cliFrame.setLocationRelativeTo(null); // 화면중앙에 프레임 띄우기
		ClientRegiPanel empr = new ClientRegiPanel();
		cliFrame.getContentPane().add(empr);
		cliFrame.setVisible(true);
	}
	
	//찾기
	protected void actionPerformedBtnSearch(ActionEvent e) {
		searchFrame = new JFrame();
		searchFrame.setTitle("아이디 & 비밀번호 찾기");
		searchFrame.setSize(500, 500);
		searchFrame.setResizable(false);
		searchFrame.setLocationRelativeTo(null); // 화면중앙에 프레임 띄우기
		SearchPanel sp = new SearchPanel();
		searchFrame.getContentPane().add(sp);
		searchFrame.setVisible(true);
	}
	protected void actionPerformedBtn01(ActionEvent e) {
	}
	protected void actionPerformedBtn02(ActionEvent e) {
	}
}
