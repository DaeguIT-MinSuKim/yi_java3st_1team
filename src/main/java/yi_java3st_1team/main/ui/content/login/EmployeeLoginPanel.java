package yi_java3st_1team.main.ui.content.login;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class EmployeeLoginPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public EmployeeLoginPanel() {

		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(350, 348));
		setLayout(null);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setFont(new Font("Arial", Font.BOLD, 17));
		btnLogout.setFocusable(false);
		btnLogout.setBounds(20, 245, 120, 45);
		add(btnLogout);
		
		JLabel label = new JLabel("[관리자 로그인]");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		label.setBounds(152, 71, 174, 45);
		add(label);
		
		JLabel label_1 = new JLabel("<html>반갑습니다!<br><span style='color:blue'>권수진 인턴</span>님이<br>로그인 하셨습니다.</html>");
		label_1.setFont(new Font("굴림", Font.BOLD, 17));
		label_1.setBounds(152, 113, 164, 91);
		add(label_1);
		
		JLabel label_2 = new JLabel("<html>- 사원번호 : <span style='color:red'>ET123</span><br>- <span style='color:green'>상품관리부</span></html>");
		label_2.setFont(new Font("굴림", Font.BOLD, 17));
		label_2.setBounds(152, 245, 164, 45);
		add(label_2);
		
		JLabel label_3 = new JLabel("이미지삽입");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(20, 71, 120, 120);
		add(label_3);
	}
}
