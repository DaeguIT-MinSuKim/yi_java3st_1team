package yi_java3st_1team.main.ui;

import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JPanel;

import yi_java3st_1team.clientmanagement.ui.content.CMContent;
import yi_java3st_1team.main.LeftMainMenu;
import yi_java3st_1team.main.LoginPanel;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;

@SuppressWarnings("serial")
public class LoginMain02Panel extends JPanel {

	public LoginMain02Panel() {

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
		
		JPanel pImg01 = new JPanel();
		pStop.add(pImg01, BorderLayout.CENTER);
		
		JPanel pSbot = new JPanel();
		pSbot.setBorder(new EmptyBorder(0, 20, 0, 20));
		pSbot.setBackground(SystemColor.inactiveCaption);
		add(pSbot);
		pSbot.setLayout(new BorderLayout(10, 10));
		
		JPanel pImg02 = new JPanel();
		pImg02.setPreferredSize(new Dimension(350, 10));
		pSbot.add(pImg02, BorderLayout.WEST);
		pImg02.setLayout(new BorderLayout(0, 10));
		
		JPanel pBtns = new JPanel();
		pSbot.add(pBtns, BorderLayout.CENTER);
		pBtns.setLayout(new GridLayout(0, 1, 0, 10));
	}

}
