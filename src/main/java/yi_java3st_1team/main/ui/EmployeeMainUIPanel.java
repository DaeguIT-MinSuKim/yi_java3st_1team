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

import yi_java3st_1team.clientmanagement.ui.CMMainPanel;
import yi_java3st_1team.main.EmployeeMainFrame;
import yi_java3st_1team.main.dto.Department;
import yi_java3st_1team.main.dto.Employee;
import yi_java3st_1team.main.ui.content.LogoImg01Panel;
import yi_java3st_1team.main.ui.content.LogoImg02Panel;
import yi_java3st_1team.main.ui.content.chart.EmpMiniBarChart;
import yi_java3st_1team.main.ui.content.chart.EmpMiniLineChart;
import yi_java3st_1team.main.ui.content.login.EmpRegiPanel;
import yi_java3st_1team.main.ui.content.login.EmployeeLoginPanel;
import yi_java3st_1team.main.ui.content.login.LoginPanel;
import yi_java3st_1team.main.ui.content.login.SearchPanel;
import yi_java3st_1team.main.ui.service.EmployeeUiService;
import yi_java3st_1team.ordermanagement.ui.OMMainPanel;
import yi_java3st_1team.productmanagement.ui.PMMainPanel;
import yi_java3st_1team.viewsmanagement.ui.panel.ReportMainPanel;

@SuppressWarnings("serial")
public class EmployeeMainUIPanel extends JPanel implements ActionListener {
	private JButton btnLogin;
	private JButton btnRegi;
	private JButton btnSearch;
	private JFrame regiFrame;
	private JFrame searchFrame;
	private LoginPanel pLogin;
	private EmployeeLoginPanel pEmpLogin;
	private EmployeeUiService empService;
	public static Employee loginEmp;
	public static Department loginDept;
	
	public JPanel pStop;
	

	private JPanel pBtns;
	private JPanel pBtns01;
	private JPanel pBtns02;
	private JButton btn01;
	private JButton btn02;
	private JLabel lblImg01;
	private JLabel lblImg02;
	private JButton btn03;
	private JButton btn04;
	private LogoImg02Panel pImg01;
	private LogoImg01Panel pLogo;
	
	private EmpMiniLineChart pLchart;
	private EmpMiniBarChart pBchart;
	private JPanel pImg02;
	
	private CMMainPanel pCMpanel;
	private OMMainPanel pOMpanel;
	private PMMainPanel pPMpanel;
	private ReportMainPanel pViewpanel;
	private JPanel pSbot;
	
	private EmployeeMainFrame empMain;
	
	private String empId; //로그인 아이디
	private String empPass; //로그인 비밀번호
	private int manager;


	public EmployeeMainUIPanel() {
		empService = new EmployeeUiService();
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
		
		pLogin =new LoginPanel();
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
		
		JLabel lblCall = new JLabel("");
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
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn04) {
			actionPerformedBtn04(e);
		}
		if (e.getSource() == btn03) {
			actionPerformedBtn03(e);
		}
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
		//로그인정보
		empId = new String(pLogin.tfId.getText().trim());
		empPass = new String(pLogin.pfPasswd.getPassword());
		
		loginEmp = empService.login(new Employee(empId, empPass));

		
		//로그인 성공 못함
		if(loginEmp == null) {
			ImageIcon icon = new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\loginFail.png");
			JOptionPane.showMessageDialog(null, "<html><h2 align='center'><span style='color:red'>LOGIN FAILED</span><br></h2><h3 align='center'>다시한번 확인해주세요!</h3></html>","Login Failed",JOptionPane.INFORMATION_MESSAGE,icon);
			return;
		}
		
		//로그인 성공시 알림 & 로그인된 패널로 전환
		ImageIcon icon = new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\connect.png");
		JOptionPane.showMessageDialog(null, "<html><h2 align='center'><span style='color:blue'>"+loginEmp.getEmpName()+"</span>님<br><span style='color:red'>Smart</span>한 세계에<br> 오신걸 환영합니다</h2></html>","Software Management System",JOptionPane.INFORMATION_MESSAGE,icon);
		
		pStop.remove(pLogin); //제거
		pEmpLogin = new EmployeeLoginPanel();
		
		// 직책별 로그인 구분
		
		manager = loginEmp.getEmpManager();

		switch (manager) {
			case 1: // 책임관리자 로그인 : 대표이사, 경영관리이사, 부장, 차장, 과장
				pEmpLogin.manager.setText("[책임관리자 로그인]");
				pEmpLogin.loginImg.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\topManager.png"));
	
				// 책임관리자(대표이사~과장) 로그인시 차트 패널 불러오기
				// 1. 라인차트
				pStop.remove(pImg01); // 제거
				JPanel line = new JPanel();
				line.setBackground(SystemColor.yellow);
				pStop.add(line, BorderLayout.CENTER);
	
				// 2. 바차트
				pImg02.remove(pLogo); // 제거
				JPanel bar = new JPanel();
				bar.setBackground(Color.red);
				bar.setPreferredSize(new Dimension(350, 250));
				pImg02.add(bar, BorderLayout.NORTH);
				break;
			case 2: // 관리자 로그인 : 대리, 사원, 인턴
				pEmpLogin.manager.setText("[관리자 로그인]");
				pEmpLogin.loginImg.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\manager2.png"));
				break;
		}			
				
		pEmpLogin.loginSuc.setText("<html>반갑습니다!<br><span style='color:blue'>"+loginEmp.getEmpName()+" "+loginEmp.getEmpTitle()+"</span>님이<br>로그인 하셨습니다.</html>");
		String empNum = String.format("EE%03d", loginEmp.getEmpNo());
		pEmpLogin.empInfo.setText("<html>- 사원번호 : <span style='color:red'>"+empNum+"</span><br>- 부서명 : <span style='color:green'>"+loginEmp.getdNo().getDeptName()+"</span></html>");

		pStop.add(pEmpLogin, BorderLayout.WEST);
		pStop.revalidate();
		pStop.repaint();
	}
	
	//거래처 관리 클릭 : CMMainPanel
	protected void actionPerformedBtn01(ActionEvent e) {
		LoginFirst();
		
		if(loginEmp != null) {
			pStop.removeAll();
			pSbot.removeAll();
			revalidate();
			repaint();
			setLayout(new CardLayout(-19,0));
			pCMpanel = new CMMainPanel();
			pCMpanel.setPreferredSize(new Dimension(1544, 0));
			pStop.add(pCMpanel, BorderLayout.WEST);
			pStop.revalidate();
			pStop.repaint();
		}
	}
	
	//제품 관리 클릭
	protected void actionPerformedBtn02(ActionEvent e) {
		LoginFirst();
		
		if(loginEmp != null) {
			pStop.removeAll();
			pSbot.removeAll();
			revalidate();
			repaint();
			setLayout(new CardLayout(-19,0));
			pPMpanel = new PMMainPanel();
			pPMpanel.setPreferredSize(new Dimension(1544, 0));
			pStop.add(pPMpanel, BorderLayout.WEST);
			pStop.revalidate();
			pStop.repaint();
		}
	}
	
	//주문 관리 클릭
	protected void actionPerformedBtn03(ActionEvent e) {
		LoginFirst();
		
		if(loginEmp != null) {
			pStop.removeAll();
			pSbot.removeAll();
			revalidate();
			repaint();
			setLayout(new CardLayout(-19,0));
			pOMpanel = new OMMainPanel();
			pOMpanel.setPreferredSize(new Dimension(1544, 0));
			pStop.add(pOMpanel, BorderLayout.WEST);
			pStop.revalidate();
			pStop.repaint();
		}
	}
	
	//현황조회/보고
	protected void actionPerformedBtn04(ActionEvent e) {
		LoginFirst();
		
		// 직책별 비활성화 적용
		switch (manager) {
			case 1: //책임관리자(활성화)
				if (loginEmp != null) {
					pStop.removeAll();
					pSbot.removeAll();
					revalidate();
					repaint();
					setLayout(new CardLayout(-19, 0));
					pViewpanel = new ReportMainPanel();
					pViewpanel.setPreferredSize(new Dimension(1544, 0));
					pStop.add(pViewpanel, BorderLayout.WEST);
					pStop.revalidate();
					pStop.repaint();
				}
				break;
			case 2: //관리자(비활성화)
				ImageIcon icon = new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\manager1.png");
				JOptionPane.showMessageDialog(null, "<html><h3 align='center'>권한이 없습니다.</h3></html>","Don't have Premission",JOptionPane.INFORMATION_MESSAGE,icon);
				break;
		}

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
	
	//로그인먼저 선행 적용
	public void LoginFirst() {
		if(loginEmp == null) {
			ImageIcon icon = new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\preLogin.png");
			JOptionPane.showMessageDialog(null, "<html><h3 align='center'>로그인부터 먼저 해주세요!</h3></html>","Login First",JOptionPane.INFORMATION_MESSAGE,icon);
			return;
		}
	}

}
