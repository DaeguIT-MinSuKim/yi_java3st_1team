package yi_java3st_1team.main.employee.ui;

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
import yi_java3st_1team.clientmanagement.ui.CMMainPanel;
import yi_java3st_1team.main.employee.EmployeeMainFrame;
import yi_java3st_1team.main.employee.chart.InitScene;
import yi_java3st_1team.main.employee.chart.PanelBarChart;
import yi_java3st_1team.main.employee.chart.PanelLineChart;
import yi_java3st_1team.main.employee.dto.Department;
import yi_java3st_1team.main.employee.dto.Employee;
import yi_java3st_1team.main.employee.login.EmpRegiPanel;
import yi_java3st_1team.main.employee.login.EmpSearchPanel;
import yi_java3st_1team.main.employee.login.LoginInputPanel;
import yi_java3st_1team.main.employee.logout.EmpLoginOkPanel;
import yi_java3st_1team.main.employee.ui.service.EmployeeUIService;
import yi_java3st_1team.main.ui.panel.LogoImg01Panel;
import yi_java3st_1team.main.ui.panel.LogoImg02Panel;
import yi_java3st_1team.ordermanagement.ui.OMMainPanel;
import yi_java3st_1team.productmanagement.ui.PMMainPanel;
import yi_java3st_1team.viewsmanagement.ui.panel.ReportMainPanel;

@SuppressWarnings("serial")
public class EmployeeMainUIPanel extends AbsMainUIPanel implements ActionListener {
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
	private EmpLoginOkPanel pEmpLogin;
	private EmployeeUIService empService;
	public static Employee loginEmp;
	public static Department loginDept;

	// 로그인(3)
	public String empId; // 로그인 아이디
	public String empPass; // 로그인 비밀번호
	public int manager; // 로그인 관리자구분
	private String empNum; // 로그인 사원번호

	// 이미지패널(1)
	public LogoImg02Panel pImg01;

	/**** pSbot ****/
	public JPanel pSbot;

	// 이미지패널(2)
	public LogoImg01Panel pLogo; // 로고
	private JLabel lblCall; // 콜센터

	// 버튼
	private JPanel pBtns;
	private JPanel pBtns01;
	private JPanel pBtns02;
	private JButton btn01;
	private JButton btn02;
	private JButton btn03;
	private JButton btn04;

	// + 이미지
	public JPanel pImg02;
	private JLabel lblImg01;
	private JLabel lblImg02;

	/** 버튼 -> 화면전환 **/
	private CMMainPanel pCMpanel; // 거래처관리
	private PMMainPanel pPMpanel; // 제품관리
	private OMMainPanel pOMpanel; // 주문관리
	private ReportMainPanel pViewpanel; // 현황조회

	/** 메인 차트 **/
	public PanelLineChart lineChart;
	public PanelBarChart barChart;
	private Thread thread;


	public EmployeeMainUIPanel() {
		empService = new EmployeeUIService();
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
		pLogin.pfPasswd.setForeground(new Color(0, 0, 255));
		pLogin.tfId.setForeground(new Color(0, 0, 255));
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
		btnSearch.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\searchBtn.png"));
		btnSearch.setFocusable(false);
		btnSearch.setBounds(273, 245, 55, 45);
		pLogin.add(btnSearch);

		pImg01 = new LogoImg02Panel();
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
		lblCall.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\callcenter.png"));
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
		btn01.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\mainBtn1.png"));
		btn01.setPreferredSize(new Dimension(240, 23));
		btn01.setFocusable(false);
		pBtns01.add(btn01, BorderLayout.WEST);

		btn02 = new JButton("");
		btn02.addActionListener(this);
		btn02.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\mainBtn2.png"));
		btn02.setFocusable(false);
		pBtns01.add(btn02, BorderLayout.CENTER);

		lblImg01 = new JLabel("");
		lblImg01.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\subMainImg1.png"));
		lblImg01.setPreferredSize(new Dimension(640, 15));
		lblImg01.setOpaque(true);
		lblImg01.setBackground(new Color(240, 255, 255));
		pBtns01.add(lblImg01, BorderLayout.EAST);

		pBtns02 = new JPanel();
		pBtns02.setBackground(SystemColor.inactiveCaption);
		pBtns.add(pBtns02);
		pBtns02.setLayout(new BorderLayout(10, 10));

		lblImg02 = new JLabel("");
		lblImg02.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\subMainImg2.png"));
		lblImg02.setPreferredSize(new Dimension(640, 15));
		lblImg02.setOpaque(true);
		lblImg02.setBackground(new Color(240, 255, 255));
		pBtns02.add(lblImg02, BorderLayout.WEST);

		btn03 = new JButton("");
		btn03.addActionListener(this);
		btn03.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\mainBtn3.png"));
		btn03.setFocusable(false);
		pBtns02.add(btn03, BorderLayout.CENTER);

		btn04 = new JButton("");
		btn04.addActionListener(this);
		btn04.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\mainBtn4.png"));
		btn04.setPreferredSize(new Dimension(240, 23));
		btn04.setFocusable(false);
		pBtns02.add(btn04, BorderLayout.EAST);
		
		thread = new Thread(new Runnable() {
			@Override
			public void run() {
				lineChart = new PanelLineChart();
				barChart = new PanelBarChart();
				Platform.runLater(() -> initFX(lineChart));
				Platform.runLater(() -> initFX(barChart));
			}
		});
		thread.run();
	}

	/******************** 버튼 기능  ******************************/
	public void actionPerformed(ActionEvent e) {
		
		/*** (1) 로그인 ***/
		if (e.getSource() == btnSearch) {
			actionPerformedBtnSearch(e);
		}
		if (e.getSource() == btnRegi) {
			actionPerformedBtnRegi(e);
		}
		if (e.getSource() == btnLogin) {
			actionPerformedBtnLogin(e);
		}
		
		/*** (2) 로그아웃 ***/
		try {
			if (e.getSource() == pEmpLogin.btnLogout) {
				actionPerformedBtnLogout(e);
			}
		} catch (NullPointerException a) {

		}
		
		/*** (3) 메뉴버튼 ***/
		if (e.getSource() == btn01) { // -- 거래처관리
			actionPerformedBtn01(e);
		}
		if (e.getSource() == btn02) { // -- 제품관리
			actionPerformedBtn02(e);
		}
		if (e.getSource() == btn03) { // -- 주문관리
			actionPerformedBtn03(e);
		}
		if (e.getSource() == btn04) { // -- 현황조회/보고
			actionPerformedBtn04(e);
		}
	}

	/****************************************************************************** (1) 로그인 ******************************************************************************/
	
	// ▶ (1-1) 아이디&비밀번호 찾기
	protected void actionPerformedBtnSearch(ActionEvent e) {
		searchFrame = new JFrame();
		searchFrame.setTitle("아이디 & 비밀번호 찾기");
		searchFrame.setSize(500, 500);
		searchFrame.setResizable(false);// 프레임 사이즈 막기
		searchFrame.setLocationRelativeTo(null);// 화면중앙에 프레임 띄우기
		EmpSearchPanel sp = new EmpSearchPanel();
		searchFrame.getContentPane().add(sp);
		searchFrame.setVisible(true);
	}
	
	// ▶ (1-2) 회원가입
	protected void actionPerformedBtnRegi(ActionEvent e) {
		regiFrame = new JFrame();
		regiFrame.setTitle("[관리자용] 회원가입");
		regiFrame.setSize(500, 650);
		regiFrame.setResizable(false);
		regiFrame.setLocationRelativeTo(null);
		EmpRegiPanel empr = new EmpRegiPanel();
		regiFrame.getContentPane().add(empr);
		regiFrame.setVisible(true);
	}


	// ▶ (1-3) 로그인
	protected void actionPerformedBtnLogin(ActionEvent e) {
		// 로그인정보 -- 아이디 / 비밀번호
		empId = new String(pLogin.tfId.getText().trim());
		empPass = new String(pLogin.pfPasswd.getPassword());

		loginEmp = empService.login(new Employee(empId, empPass));

		
		// 로그인 실패
		if (loginEmp == null) {
			ImageIcon icon = new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\loginFail.png");
			JOptionPane.showMessageDialog(null,"<html><h2 align='center'><span style='color:red'>LOGIN FAILED</span><br></h2><h3 align='center'>다시한번 확인해주세요!</h3></html>",
					                            "Login Failed", JOptionPane.INFORMATION_MESSAGE, icon);
			return;
		}

		
		// 로그인 성공시 알림 & 로그인된 패널로 전환
		ImageIcon icon = new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\connect.png");
		JOptionPane.showMessageDialog(null,"<html><h2 align='center'><span style='color:blue'>" + loginEmp.getEmpName() + " "
						              + loginEmp.getEmpTitle()
						              + "</span> 님<br><span style='color:red'>Smart</span>한 세계에<br> 오신걸 환영합니다</h2></html>",
				                      "Software Management System", JOptionPane.INFORMATION_MESSAGE, icon);
		pStop.remove(pLogin); // 제거
		pEmpLogin = new EmpLoginOkPanel();

		
		// 직책별 로그인 구분 -- 책임관리자 vs 관리자
		manager = loginEmp.getEmpManager();
		switch (manager) {
		case 1: // 책임관리자 로그인 : 대표이사, 경영관리이사, 부장, 차장, 과장
			pEmpLogin.manager.setText("[책임관리자 로그인]");
			pEmpLogin.loginImg.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\topManager.png"));
			thread.interrupt();
			thread.run();
			
			// 책임관리자(대표이사~과장) 로그인시 차트 패널 불러오기
			// 1. 라인차트
			pStop.remove(pImg01); // 제거
			pStop.add(lineChart, BorderLayout.CENTER);
			// 2. 바차트
			pImg02.removeAll(); // 제거
			JPanel bar = new JPanel();
			bar.add(barChart);
			bar.setBackground(SystemColor.inactiveCaptionBorder);
			pImg02.add(bar, BorderLayout.NORTH);

			lblCall = new JLabel("");
			lblCall.setBackground(new Color(255, 250, 240));
			lblCall.setOpaque(true);
			lblCall.setForeground(SystemColor.inactiveCaptionBorder);
			lblCall.setHorizontalAlignment(SwingConstants.CENTER);
			lblCall.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\callcenter.png"));
			pImg02.add(lblCall, BorderLayout.CENTER);

			break;
			
		case 2: // 관리자 로그인 : 대리, 사원, 인턴
			pEmpLogin.manager.setText("[일반관리자 로그인]");
			pEmpLogin.loginImg.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\manager2.png"));
			break;
		}

		pEmpLogin.loginSuc.setText("<html>반갑습니다!<br><span style='color:blue'>" + loginEmp.getEmpName() + " "
				+ "</span><u>" + loginEmp.getEmpTitle() + "</u>님이<br>로그인 하셨습니다.</html>");
		empNum = String.format("EE%04d", loginEmp.getEmpNo());
		pEmpLogin.empInfo.setText("<html>- 사원번호 : <span style='color:red'>" + empNum
				+ "</span><br>- 부서명 : <span style='color:green'>" + loginEmp.getdNo().getDeptName() + "</span></html>");

		pStop.add(pEmpLogin, BorderLayout.WEST);
		pStop.revalidate();
		pStop.repaint();

		// 로그아웃버튼
		pEmpLogin.btnLogout.addActionListener(this);

	}

	// (+) 차트
	@Override
	public void initFX(InitScene fxPanel) {
		Scene scene = fxPanel.createScene();
		JFXPanel panel = (JFXPanel) fxPanel;
		panel.setScene(scene);
	}
	
	
	/****************************************************************************** (2) 로그아웃 ******************************************************************************/

	// ▶ (2-1)로그아웃
	private void actionPerformedBtnLogout(ActionEvent e) {
		removeAll();
		revalidate();
		repaint();
		loginEmp = null;
		initialize();
		revalidate();
		repaint();
	}
	
	
	/****************************************************************************** (3) 메뉴버튼 ******************************************************************************/
	

	// ▶  (3-1) 거래처 관리 클릭 : CMMainPanel
	protected void actionPerformedBtn01(ActionEvent e) {
		LoginFirst();

		if (loginEmp != null) {
			thread.interrupt();
			thread.run();
			removePanel();
			pCMpanel = new CMMainPanel();
			pCMpanel.setPreferredSize(new Dimension(1544, 0));
			pStop.add(pCMpanel, BorderLayout.WEST);
			pStop.revalidate();
			pStop.repaint();
			btnLogoutandLoginInfo();

		}
	}


	// ▶  (3-2) 제품 관리 클릭 : PMMainPanel
	protected void actionPerformedBtn02(ActionEvent e) {
		LoginFirst();

		if (loginEmp != null) {
			removePanel();
			pPMpanel = new PMMainPanel();
			pPMpanel.setPreferredSize(new Dimension(1544, 0));
			pStop.add(pPMpanel, BorderLayout.WEST);
			pStop.revalidate();
			pStop.repaint();
			btnLogoutandLoginInfo();
		}
	}

	// ▶  (3-3) 주문 관리 클릭 : OMMainPanel
	protected void actionPerformedBtn03(ActionEvent e) {
		LoginFirst();

		if (loginEmp != null) {
			removePanel();
			pOMpanel = new OMMainPanel();
			pOMpanel.setPreferredSize(new Dimension(1544, 0));
			pStop.add(pOMpanel, BorderLayout.WEST);
			pStop.revalidate();
			pStop.repaint();
			btnLogoutandLoginInfo();
		}
	}

	// ▶  (3-4) 현황조회/보고 : ReportMainPanel
	protected void actionPerformedBtn04(ActionEvent e) {
		LoginFirst();
		// 직책별 비활성화 적용
		if (loginEmp == null) {
			return;
		} else {
			int manager = loginEmp.getEmpManager();
			switch (manager) {
			case 1: // 책임관리자(활성화)
				if (loginEmp != null) {
					removePanel();
					pViewpanel = new ReportMainPanel();
					pViewpanel.setPreferredSize(new Dimension(1544, 0));
					pStop.add(pViewpanel, BorderLayout.WEST);
					pStop.revalidate();
					pStop.repaint();
					btnLogoutandLoginInfo();
				}
				break;
			case 2: // 관리자(비활성화)
				ImageIcon icon = new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\manager1.png");
				JOptionPane.showMessageDialog(null, "<html><h3 align='center'>권한이 없습니다.</h3></html>",
						                      "Don't have Premission", JOptionPane.INFORMATION_MESSAGE, icon);
				break;
			}
		}
	}


	// (+) 로그인 선행 적용
	@Override
	public void LoginFirst() {
		if (loginEmp == null) {
			ImageIcon icon = new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\preLogin.png");
			JOptionPane.showMessageDialog(null, "<html><h3 align='center'>로그인부터 먼저 해주세요!</h3></html>", "Login First", JOptionPane.INFORMATION_MESSAGE, icon);
			return;
		}
	}

	// (+) 각 버튼 누를시 패널삭제 & 전환
	@Override
	public void removePanel() {
		pStop.removeAll();
		pSbot.removeAll();
		revalidate();
		repaint();
		setLayout(new CardLayout(-18, 0));
	}

	// (+) 프레임 HEADER부분 - 로그아웃 버튼 & 로그인 정보
	@Override
	public void btnLogoutandLoginInfo() {
		/** 로그아웃 버튼 **/
		EmployeeMainFrame.btnlogout.setVisible(true);

		/** 로그인 정보 **/
		EmployeeMainFrame.lblLoginTitle.setText("(" + loginEmp.getEmpId() + ")" + " 로그인");
		empNum = String.format("EE%04d", loginEmp.getEmpNo());
		EmployeeMainFrame.lblLoginInfo.setText("<html><p align='center'><span style='color:blue'>" + loginEmp.getEmpName()
						                        + "</spna><span style='color:red'>[" + empNum + "]</span><br><span style='color:black'>"
						                        + loginEmp.getdNo().getDeptName() + "-" + loginEmp.getEmpTitle() + "</span></p></html>");
		EmployeeMainFrame.lblLoginTitle.setVisible(true);
		EmployeeMainFrame.lblLoginInfo.setVisible(true);
	}

}
