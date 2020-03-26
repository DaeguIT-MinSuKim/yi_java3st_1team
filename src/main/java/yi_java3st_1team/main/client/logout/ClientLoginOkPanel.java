package yi_java3st_1team.main.client.logout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class ClientLoginOkPanel extends JPanel implements ActionListener{
	public JButton btnLogout;
	public JLabel loginSuc;
	public JLabel manager;
	public JLabel empInfo;
	public JLabel loginImg;
	private JButton btnMyProfile;
	private JFrame profileFrame;

	
	public ClientLoginOkPanel() {
		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(350, 348));
		setLayout(null);
		
		btnLogout = new JButton("LOGOUT");
		btnLogout.setBackground(SystemColor.controlHighlight);

		btnLogout.setFont(new Font("Arial", Font.BOLD, 17));
		btnLogout.setFocusable(false);
		btnLogout.setBounds(20, 245, 120, 45);
		add(btnLogout);
		
		manager = new JLabel();
		manager.setHorizontalAlignment(SwingConstants.CENTER);
		manager.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		manager.setBounds(152, 71, 174, 45);
		add(manager);
		
		loginSuc = new JLabel();
		loginSuc.setFont(new Font("굴림", Font.BOLD, 15));
		loginSuc.setBounds(152, 113, 180, 91);
		add(loginSuc);
		
		empInfo = new JLabel();
		empInfo.setFont(new Font("굴림", Font.BOLD, 13));
		empInfo.setBounds(152, 214, 190, 76);
		add(empInfo);
		
		loginImg = new JLabel();
		loginImg.setHorizontalAlignment(SwingConstants.CENTER);
		loginImg.setBounds(20, 71, 120, 120);
		add(loginImg);
		
	      btnMyProfile = new JButton("My Profile");
	      btnMyProfile.addActionListener(this);
	      btnMyProfile.setFont(new Font("Arial", Font.BOLD, 13));
	      btnMyProfile.setFocusable(false);
	      btnMyProfile.setBackground(new Color(255, 255, 51));
	      btnMyProfile.setBounds(20, 205, 120, 29);
	      add(btnMyProfile);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnMyProfile) {
			actionPerformedBtnMyProfile(e);
		}
	}
	
	// 프로필
	protected void actionPerformedBtnMyProfile(ActionEvent e) {
		profileFrame = new JFrame();
		profileFrame.setTitle("[관리자용] 사용자 정보");
		profileFrame.setSize(550, 900);
		profileFrame.setResizable(false);
		profileFrame.setLocation(400, 70);
		ClientMyProfile cmp = new ClientMyProfile();
		profileFrame.getContentPane().add(cmp);
		profileFrame.setVisible(true);
		
	}
}
