package yi_java3st_1team.main.ui.content.login;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class ClientLoginPanel extends JPanel {

	
	public ClientLoginPanel() {

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
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\loginCustomer.png"));
		label.setBounds(27, 71, 120, 120);
		add(label);
		
		JLabel label_1 = new JLabel("[고객 로그인]");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		label_1.setBounds(152, 71, 174, 45);
		add(label_1);
		
		JLabel label_2 = new JLabel("<html>반갑습니다!<br><span style='color:blue'>김민수 고객</span>님이<br>로그인 하셨습니다.</html>");
		label_2.setFont(new Font("굴림", Font.BOLD, 17));
		label_2.setBounds(152, 113, 164, 91);
		add(label_2);
		
		JLabel label_3 = new JLabel("<html>- 고객번호 : <span style='color:red'>C0001</span><br>- <span style='color:green'>민수 System</span></html>");
		label_3.setFont(new Font("굴림", Font.BOLD, 17));
		label_3.setBounds(152, 245, 164, 45);
		add(label_3);
	}
}
