package yi_java3st_1team.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class LoginMain01Panel extends JPanel {

	public LoginMain01Panel() {

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
		
		LoginImg01Panel pImg01 = new LoginImg01Panel();
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
		
		LogoImgPanel pLogo = new LogoImgPanel();
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
		
		JPanel pBtns = new JPanel();
		pBtns.setBackground(SystemColor.inactiveCaption);
		pSbot.add(pBtns, BorderLayout.CENTER);
		pBtns.setLayout(new GridLayout(0, 1, 0, 10));
	}

}
