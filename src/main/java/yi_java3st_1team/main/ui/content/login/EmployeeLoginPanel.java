package yi_java3st_1team.main.ui.content.login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class EmployeeLoginPanel extends JPanel implements ActionListener{
	public JButton btnLogout;
	public JLabel loginSuc;
	public JLabel manager;
	public JLabel empInfo;
	public JLabel loginImg;
	private JButton btnMyProfile;
	private JFrame regiFrame;
	

	/**
	 * Create the panel.
	 */
	public EmployeeLoginPanel() {
		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(350, 348));
		setLayout(null);
		
		btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(this);
		btnLogout.setBackground(SystemColor.controlHighlight);

		btnLogout.setFont(new Font("Arial", Font.BOLD, 17));
		btnLogout.setFocusable(false);
		btnLogout.setBounds(20, 245, 120, 45);
		add(btnLogout);
		
		manager = new JLabel();
		//manager.setText("[관리자 로그인]");
		manager.setHorizontalAlignment(SwingConstants.CENTER);
		manager.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		manager.setBounds(152, 71, 174, 45);
		add(manager);
		
		loginSuc = new JLabel();
		//loginSuc.setText("<html>반갑습니다!<br><span style='color:blue'>권수진 인턴</span>님이<br>로그인 하셨습니다.</html>");
		loginSuc.setFont(new Font("굴림", Font.BOLD, 17));
		loginSuc.setBounds(152, 113, 164, 91);
		add(loginSuc);
		
		empInfo = new JLabel();
		//empInfo.setText("<html>- 사원번호 : <span style='color:red'>ET123</span><br>- <span style='color:green'>상품관리부</span></html>");
		empInfo.setFont(new Font("굴림", Font.BOLD, 17));
		empInfo.setBounds(152, 245, 180, 45);
		add(empInfo);
		
		loginImg = new JLabel();
		//loginImg.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\manager2.png"));
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
		if (e.getSource() == btnLogout) {
			actionPerformedBtnLogout(e);
		}
		if (e.getSource() == btnMyProfile) {
			actionPerformedBtnMyProfile(e);
		}
	}
	protected void actionPerformedBtnMyProfile(ActionEvent e) {
		regiFrame = new JFrame();
		regiFrame.setTitle("[관리자용] 회원가입");
		regiFrame.setSize(500, 650);
		regiFrame.setResizable(false);
		regiFrame.setLocationRelativeTo(null); // 화면중앙에 프레임 띄우기
		ClientRegiPanel cm = new ClientRegiPanel();
//		EmpRegiPanel empr = new EmpRegiPanel();
		regiFrame.getContentPane().add(cm);
		regiFrame.setVisible(true);
	}
	protected void actionPerformedBtnLogout(ActionEvent e) {
		System.out.println("22");
	}
}
