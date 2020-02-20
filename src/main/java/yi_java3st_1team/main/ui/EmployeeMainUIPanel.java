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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import yi_java3st_1team.main.ui.content.LogoImg01Panel;
import yi_java3st_1team.main.ui.content.LogoImg02Panel;
import yi_java3st_1team.main.ui.content.MainBtns01Panel;
import yi_java3st_1team.main.ui.content.login.EmpRegiPanel;
import yi_java3st_1team.main.ui.content.login.EmployeeLoginPanel;
import yi_java3st_1team.main.ui.content.login.LoginPanel;
import yi_java3st_1team.main.ui.content.login.SearchPanel;

@SuppressWarnings("serial")
public class EmployeeMainUIPanel extends JPanel implements ActionListener {
	private JButton btnLogin;
	private JButton btnRegi;
	private JButton btnSearch;
	private JFrame regiFrame;
	private JFrame searchFrame;
	private LoginPanel pLogin;
	private EmployeeLoginPanel pEmpLogin;
	private JPanel pStop;
	
	private JPanel loginok;
	private JPanel pBtns;
	private JPanel pBtns01;
	private JPanel pBtns02;
	private JButton button;
	private JButton button_1;
	private JLabel label;
	private JLabel label_1;
	private JButton button_2;
	private JButton button_3;

	public EmployeeMainUIPanel() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaption);
		setBounds(new Rectangle(0, 0, 1544, 700));
		setLayout(new GridLayout(0, 1, 10, 10));
		
		pStop = new JPanel();
		pStop.setBackground(SystemColor.inactiveCaption);
		pStop.setBorder(new EmptyBorder(0, 20, 0, 20));
		add(pStop);
		pStop.setLayout(new BorderLayout(10, 10));
		
		pLogin = new LoginPanel();
		pLogin.setPreferredSize(new Dimension(350, 10));
		pStop.add(pLogin, BorderLayout.WEST);
		
		btnLogin = new JButton("LOGIN");
		btnLogin.setBackground(SystemColor.controlHighlight);
		btnLogin.addActionListener(this);
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setFont(new Font("Arial", Font.BOLD, 17));
		btnLogin.setFocusable(false);
		btnLogin.setBounds(20, 245, 120, 45);
		pLogin.add(btnLogin);
		
		btnRegi = new JButton("REGISTER");
		btnRegi.setBackground(SystemColor.controlHighlight);
		btnRegi.addActionListener(this);
		btnRegi.setForeground(Color.BLACK);
		btnRegi.setFont(new Font("Arial", Font.BOLD, 17));
		btnRegi.setFocusable(false);
		btnRegi.setBounds(147, 245, 120, 45);
		pLogin.add(btnRegi);
		
		btnSearch = new JButton("");
		btnSearch.setBackground(SystemColor.controlHighlight);
		btnSearch.addActionListener(this);
		btnSearch.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\searchBtn.png"));
		btnSearch.setFocusable(false);
		btnSearch.setBounds(273, 245, 55, 45);
		pLogin.add(btnSearch);
		
		LogoImg02Panel pImg01 = new LogoImg02Panel();
		pImg01.setBackground(SystemColor.inactiveCaptionBorder);
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
		
		LogoImg01Panel pLogo = new LogoImg01Panel();
		pLogo.setBackground(Color.WHITE);
		pLogo.setPreferredSize(new Dimension(350, 250));
		pImg02.add(pLogo, BorderLayout.NORTH);
		
		JLabel lblCall = new JLabel("");
		lblCall.setBackground(SystemColor.inactiveCaptionBorder);
		lblCall.setOpaque(true);
		lblCall.setForeground(SystemColor.inactiveCaptionBorder);
		lblCall.setHorizontalAlignment(SwingConstants.CENTER);
		lblCall.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\callcenter.png"));
		pImg02.add(lblCall, BorderLayout.CENTER);
		
		pBtns = new JPanel();
		pBtns.setBackground(SystemColor.inactiveCaption);
		pSbot.add(pBtns, BorderLayout.CENTER);
		
		pBtns01 = new JPanel();
		pBtns01.setBackground(SystemColor.inactiveCaption);
		pBtns.add(pBtns01);
		pBtns01.setLayout(new BorderLayout(10, 0));
		
		button = new JButton("");
		button.setPreferredSize(new Dimension(240, 23));
		button.setFocusable(false);
		pBtns01.add(button, BorderLayout.NORTH);
		
		button_1 = new JButton("");
		button_1.setFocusable(false);
		pBtns01.add(button_1, BorderLayout.SOUTH);
		
		label = new JLabel("");
		label.setPreferredSize(new Dimension(640, 15));
		label.setOpaque(true);
		label.setBackground(new Color(240, 255, 255));
		pBtns01.add(label, BorderLayout.WEST);
		
		pBtns02 = new JPanel();
		pBtns02.setBackground(SystemColor.inactiveCaption);
		pBtns.add(pBtns02);
		pBtns02.setLayout(new BorderLayout(10, 10));
		
		label_1 = new JLabel("");
		label_1.setPreferredSize(new Dimension(640, 15));
		label_1.setOpaque(true);
		label_1.setBackground(new Color(240, 255, 255));
		pBtns02.add(label_1, BorderLayout.NORTH);
		
		button_2 = new JButton("");
		button_2.setFocusable(false);
		pBtns02.add(button_2, BorderLayout.SOUTH);
		
		button_3 = new JButton("");
		button_3.setPreferredSize(new Dimension(240, 23));
		button_3.setFocusable(false);
		pBtns02.add(button_3, BorderLayout.WEST);
	}
	public void actionPerformed(ActionEvent e) {
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
		JOptionPane.showMessageDialog(null, "반갑습니다");
		pLogin.setVisible(false);
//		loginok = new JPanel();
//		loginok.setPreferredSize(new Dimension(350, 10));
//		loginok.add(loginok, BorderLayout.WEST);
		pEmpLogin = new EmployeeLoginPanel();
		pEmpLogin.setPreferredSize(new Dimension(350, 10));
		pStop.add(pEmpLogin, BorderLayout.WEST);
		pStop.revalidate();
		pStop.repaint();
		
	}
	
	//회원가입
	protected void actionPerformedBtnRegi(ActionEvent e) {
		regiFrame = new JFrame();
		regiFrame.setTitle("[관리자용] 회원가입");
		regiFrame.setSize(500, 650);
		regiFrame.setResizable(false);
		regiFrame.setLocationRelativeTo(null); // 화면중앙에 프레임 띄우기
		EmpRegiPanel empr = new EmpRegiPanel();
		regiFrame.getContentPane().add(empr);
		regiFrame.setVisible(true);
	}
	
	//찾기
	protected void actionPerformedBtnSearch(ActionEvent e) {
		searchFrame = new JFrame();
		searchFrame.setTitle("아이디 & 비밀번호 찾기");
		searchFrame.setSize(500, 500);
		searchFrame.setResizable(false);
		searchFrame.setLocationRelativeTo(null);
		SearchPanel sp = new SearchPanel();
		searchFrame.getContentPane().add(sp);
		searchFrame.setVisible(true);
	}
}
