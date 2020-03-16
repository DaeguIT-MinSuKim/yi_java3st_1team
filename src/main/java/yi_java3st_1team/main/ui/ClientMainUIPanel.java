package yi_java3st_1team.main.ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
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

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import yi_java3st_1team.clientmanagement.dto.Client;
import yi_java3st_1team.clientmanagement.ui.service.ClientUIService;
import yi_java3st_1team.main.ClientMainFrame;
import yi_java3st_1team.main.chart.InitScene;
import yi_java3st_1team.main.chart.PanelPieChart;
import yi_java3st_1team.main.login.ClientRegiPanel;
import yi_java3st_1team.main.login.LoginInputPanel;
import yi_java3st_1team.main.login.SearchPanel;
import yi_java3st_1team.main.logout.ClientLoginOkPanel;
import yi_java3st_1team.main.logout.EmpLoginOkPanel;
import yi_java3st_1team.main.ui.panel.LogoImg01Panel;
import yi_java3st_1team.main.ui.panel.LogoImg03Panel;
import yi_java3st_1team.ordermanagement.ui.ClientOMainPanel;

@SuppressWarnings("serial")
public class ClientMainUIPanel extends JPanel implements ActionListener {
	/**** pStop ****/
	public JPanel pStop;

	// 로그인(1)
	public LoginInputPanel pLogin;
	private JButton btnLogin;
	private JButton btnRegi;
	private JButton btnSearch;
	private JFrame regiFrame;
	private JFrame searchFrame;

	// 로그인(2)
	private ClientLoginOkPanel pCLogin;
	private ClientUIService clService;
	public static Client loginCl;

	// 로그인(3)
	public String cId; // 로그인 아이디
	public String cPass; // 로그인 비밀번호

	// 이미지패널(1)
	private LogoImg03Panel pImg01;

	/**** pSbot ****/
	private JPanel pSbot;

	// 이미지패널(2)
	private LogoImg01Panel pLogo; // 로고
	private JLabel lblCall; // 콜센터

	// 버튼
	private JPanel pBtns;
	private JPanel pBtns01;
	private JPanel pBtns02;
	private JButton btn01; // 주문등록
	private JButton btn02; // 주문현황

	// + 이미지
	private JPanel pImg02;
	private JLabel lblImg01;
	private JLabel lblImg02;

	/** 버튼 -> 화면전환 **/
	private ClientOMainPanel pCOrder;

	/** 메인프레임 **/
	private ClientMainFrame cMain;

	public ClientMainUIPanel() {
		clService = new ClientUIService();
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

		pLogin = new LoginInputPanel();
		pLogin.pfPasswd.setForeground(new Color(0, 100, 0));
		pLogin.tfId.setForeground(new Color(0, 100, 0));
		pLogin.pfPasswd.setFont(new Font("굴림", Font.BOLD, 20));
		pLogin.tfId.setFont(new Font("굴림", Font.BOLD, 20));
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
		btnSearch.setIcon(
				new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\searchBtn.png"));
		btnSearch.setFocusable(false);
		btnSearch.setBounds(273, 245, 55, 45);
		pLogin.add(btnSearch);

		pImg01 = new LogoImg03Panel();
		pImg01.setBackground(SystemColor.inactiveCaptionBorder);
		pStop.add(pImg01, BorderLayout.CENTER);

		pSbot = new JPanel();
		pSbot.setBorder(new EmptyBorder(0, 20, 0, 20));
		pSbot.setBackground(SystemColor.inactiveCaption);
		add(pSbot);
		pSbot.setLayout(new BorderLayout(10, 10));

		pImg02 = new JPanel();
		pImg02.setBackground(SystemColor.inactiveCaption);
		pImg02.setPreferredSize(new Dimension(350, 10));
		pSbot.add(pImg02, BorderLayout.WEST);
		pImg02.setLayout(new BorderLayout(0, 10));

		pLogo = new LogoImg01Panel();
		pLogo.setBackground(Color.WHITE);
		pLogo.setPreferredSize(new Dimension(350, 250));
		pImg02.add(pLogo, BorderLayout.NORTH);

		lblCall = new JLabel("");
		lblCall.setBackground(new Color(255, 250, 240));
		lblCall.setOpaque(true);
		lblCall.setForeground(SystemColor.inactiveCaptionBorder);
		lblCall.setHorizontalAlignment(SwingConstants.CENTER);
		lblCall.setIcon(
				new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\callcenter.png"));
		pImg02.add(lblCall, BorderLayout.CENTER);

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
		btn01.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\clientBtn01.png"));
		btn01.setPreferredSize(new Dimension(560, 23));
		btn01.setFocusable(false);
		pBtns01.add(btn01, BorderLayout.WEST);

		lblImg01 = new JLabel("");
		lblImg01.setIcon(
				new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\subMainImg1.png"));
		lblImg01.setPreferredSize(new Dimension(560, 15));
		lblImg01.setOpaque(true);
		lblImg01.setBackground(new Color(240, 255, 255));
		pBtns01.add(lblImg01, BorderLayout.EAST);

		pBtns02 = new JPanel();
		pBtns02.setBackground(SystemColor.inactiveCaption);
		pBtns.add(pBtns02);
		pBtns02.setLayout(new BorderLayout(10, 10));

		lblImg02 = new JLabel("");
		lblImg02.setIcon(
				new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\subMainImg2.png"));
		lblImg02.setPreferredSize(new Dimension(560, 15));
		lblImg02.setOpaque(true);
		lblImg02.setBackground(new Color(240, 255, 255));
		pBtns02.add(lblImg02, BorderLayout.WEST);

		btn02 = new JButton("");
		btn02.addActionListener(this);
		btn02.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\clientBtn02.png"));
		btn02.setPreferredSize(new Dimension(560, 23));
		btn02.setFocusable(false);
		pBtns02.add(btn02, BorderLayout.EAST);
	}

	public void actionPerformed(ActionEvent e) {
		// 로그인
		if (e.getSource() == btnLogin) {
			actionPerformedBtnLogin(e);
		}
		if (e.getSource() == btnRegi) {
			actionPerformedBtnRegi(e);
		}
		if (e.getSource() == btnSearch) {
			actionPerformedBtnSearch(e);
		}
		// 버튼
		if (e.getSource() == btn01) {
			actionPerformedBtn01(e);
		}
		if (e.getSource() == btn02) {
			actionPerformedBtn02(e);
		}
		
		// 로그아웃
		try {
			if (e.getSource() == pCLogin.btnLogout) {
				actionPerformedBtnLogout(e);
			}
		} catch (NullPointerException a) {

		}
	}

	// 로그인
	protected void actionPerformedBtnLogin(ActionEvent e) {
		// 로그인정보
		cId = new String(pLogin.tfId.getText().trim());
		cPass = new String(pLogin.pfPasswd.getPassword());

		loginCl = clService.login(new Client(cId, cPass));
		System.out.println(loginCl);

		// 로그인 성공 못함
		if (loginCl == null) {
			ImageIcon icon = new ImageIcon(
					"D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\loginFail.png");
			JOptionPane.showMessageDialog(null,
					"<html><h2 align='center'><span style='color:red'>LOGIN FAILED</span><br></h2><h3 align='center'>다시한번 확인해주세요!</h3></html>",
					"Login Failed", JOptionPane.INFORMATION_MESSAGE, icon);
			return;
		}

		// 로그인 성공시 알림 & 로그인된 패널로 전환
		ImageIcon icon = new ImageIcon(
				"D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\connect2.png");
		JOptionPane.showMessageDialog(null,
				"<html><h2 align='center'><span style='color:blue'>" + loginCl.getcName()
						+ "</span>님<br><span style='color:red'>Smart</span>한 세계에<br> 오신걸 환영합니다</h2></html>",
				"Software Management System", JOptionPane.INFORMATION_MESSAGE, icon);

		pStop.remove(pLogin); // 제거
		pCLogin = new ClientLoginOkPanel();

		pCLogin.manager.setText("[고객 로그인]");
		pCLogin.loginImg.setIcon(new ImageIcon(
				"D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\loginCustomer.png"));
		pCLogin.loginSuc.setText(
				"<html>반갑습니다!<br><span style='color:blue'>" + loginCl.getcName() + " 고객</span>님이<br>로그인 하셨습니다.</html>");
		String cNum = String.format("C%04d", loginCl.getcNo());
		pCLogin.empInfo.setText("<html>- 고객번호 : <span style='color:red'>" + cNum
				+ "</span><br>- 상호명 : <span style='color:green'>" + loginCl.getcName() + "</span></html>");

		// 파이차트
		pImg02.remove(pLogo);
		PanelPieChart pie = new PanelPieChart();
		pie.setPreferredSize(new Dimension(350, 250));
		pImg02.add(pie, BorderLayout.NORTH);
		Platform.runLater(() -> initFX(pie));
		pStop.add(pCLogin, BorderLayout.WEST);
		pStop.revalidate();
		pStop.repaint();
		
		//로그아웃버튼
		pCLogin.btnLogout.addActionListener(this);
	}
	
	//로그아웃
	private void actionPerformedBtnLogout(ActionEvent e) {
		removeAll();
		revalidate();
		repaint();
		loginCl = null;
		initialize();
		revalidate();
		repaint();
	}

	// 주문등록
	protected void actionPerformedBtn01(ActionEvent e) {
		LoginFirst();
		if (loginCl != null) {
			pStop.removeAll();
			pSbot.removeAll();
			revalidate();
			repaint();
			setLayout(new CardLayout(-18, 0));
			pCOrder = new ClientOMainPanel();
			pCOrder.setPreferredSize(new Dimension(1544, 0));
			pStop.add(pCOrder, BorderLayout.WEST);
			pStop.revalidate();
			pStop.repaint();
			ClientMainFrame.btnlogout.setVisible(true);
		}
	}

	// 주문현황
	protected void actionPerformedBtn02(ActionEvent e) {
		LoginFirst();
		if(loginCl != null) {
			pStop.removeAll();
			pSbot.removeAll();
			revalidate();
			repaint();
			setLayout(new CardLayout(-18, 0));
			pCOrder = new ClientOMainPanel();
			pCOrder.setPreferredSize(new Dimension(1544, 0));
			pStop.add(pCOrder, BorderLayout.WEST);
			pStop.revalidate();
			pStop.repaint();
			pCOrder.tpClientManagement.setSelectedIndex(1);
			ClientMainFrame.btnlogout.setVisible(true);
		}
	}

	// 회원가입
	protected void actionPerformedBtnRegi(ActionEvent e) {
		regiFrame = new JFrame();
		regiFrame.setTitle("[고객용] 회원가입");
		regiFrame.setSize(500, 650);
		regiFrame.setResizable(false);
		//regiFrame.setLocationRelativeTo(null); // 화면중앙에 프레임 띄우기
		regiFrame.setLocation(400, 195);
		ClientRegiPanel crp = new ClientRegiPanel();
		regiFrame.getContentPane().add(crp);
		regiFrame.setVisible(true);
	}

	// 찾기
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

	public void initFX(InitScene fxPanel) {
		Scene scene = fxPanel.createScene();
		JFXPanel panel = (JFXPanel) fxPanel;
		panel.setScene(scene);
	}

	// 로그인먼저 선행 적용
	public void LoginFirst() {
		if (loginCl == null) {
			ImageIcon icon = new ImageIcon(
					"D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\preLogin.png");
			JOptionPane.showMessageDialog(null, "<html><h3 align='center'>로그인부터 먼저 해주세요!</h3></html>", "Login First",
					JOptionPane.INFORMATION_MESSAGE, icon);
			return;
		}
	}

}
