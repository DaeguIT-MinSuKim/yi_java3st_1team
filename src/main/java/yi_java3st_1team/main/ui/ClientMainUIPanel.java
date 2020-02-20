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
import yi_java3st_1team.main.ui.content.MainBtns03Panel;
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
		
		MainBtns03Panel pBtns = new MainBtns03Panel();
		pSbot.add(pBtns, BorderLayout.CENTER);
		pBtns.setLayout(new GridLayout(0, 1, 0, 10));
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
	protected void actionPerformedBtnLogin(ActionEvent e) {
	}
	protected void actionPerformedBtnRegi(ActionEvent e) {
		cliFrame = new JFrame();
		cliFrame.setTitle("회원가입");
		cliFrame.setSize(500, 650);
		cliFrame.setResizable(false);
		cliFrame.setLocationRelativeTo(null); // 화면중앙에 프레임 띄우기
		ClientRegiPanel empr = new ClientRegiPanel();
		cliFrame.getContentPane().add(empr);
		cliFrame.setVisible(true);
	}
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
}
