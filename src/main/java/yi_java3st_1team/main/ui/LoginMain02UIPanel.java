package yi_java3st_1team.main.ui;

import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JPanel;

import yi_java3st_1team.clientmanagement.ui.content.CMContent;
import yi_java3st_1team.main.LeftMainMenu;
import yi_java3st_1team.main.ui.content.Login01Panel;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import yi_java3st_1team.main.ui.content.LogoImg03Panel;
import java.awt.Color;
import yi_java3st_1team.main.ui.content.LogoImg01Panel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import yi_java3st_1team.main.ui.content.MainBtns03Panel;
import javax.swing.JButton;
import java.awt.Font;

@SuppressWarnings("serial")
public class LoginMain02UIPanel extends JPanel {

	public LoginMain02UIPanel() {

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
		
		Login01Panel pLogin = new Login01Panel();
		pLogin.setPreferredSize(new Dimension(350, 10));
		pStop.add(pLogin, BorderLayout.WEST);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Arial", Font.BOLD, 17));
		btnLogin.setFocusable(false);
		btnLogin.setBounds(20,245,120,45);
		pLogin.add(btnLogin);
		
		JButton btnRegi = new JButton("REGISTER");
		btnRegi.setFont(new Font("Arial", Font.BOLD, 17));
		btnRegi.setFocusable(false);
		btnRegi.setBounds(147,245,120,45);
		pLogin.add(btnRegi);
		
		JButton btnSearch = new JButton("");
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

}
