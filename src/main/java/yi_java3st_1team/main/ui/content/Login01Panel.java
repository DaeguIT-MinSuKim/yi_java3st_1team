package yi_java3st_1team.main.ui.content;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Login01Panel extends JPanel {
	private JTextField tfId;
	private JTextField tfPass;

	/**
	 * Create the panel.
	 */
	public Login01Panel() {

		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(350, 348));
		setLayout(null);
		
		JLabel lblImg01 = new JLabel("");
		lblImg01.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\user.png"));
		lblImg01.setHorizontalAlignment(SwingConstants.CENTER);
		lblImg01.setBounds(20, 65, 41, 41);
		add(lblImg01);
		
		JLabel lblId = new JLabel("Username");
		lblId.setFont(new Font("Arial", Font.BOLD, 20));
		lblId.setBounds(75, 66, 97, 41);
		add(lblId);
		
		tfId = new JTextField();
		tfId.setFont(new Font("굴림", Font.PLAIN, 17));
		tfId.setColumns(10);
		tfId.setBounds(180, 60, 151, 48);
		add(tfId);
		
		JLabel lblImg02 = new JLabel("");
		lblImg02.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\lock.png"));
		lblImg02.setHorizontalAlignment(SwingConstants.CENTER);
		lblImg02.setFont(new Font("굴림", Font.PLAIN, 20));
		lblImg02.setBounds(20, 160, 41, 41);
		add(lblImg02);
		
		JLabel lblPass = new JLabel("Password");
		lblPass.setFont(new Font("Arial", Font.BOLD, 20));
		lblPass.setBounds(75, 167, 97, 31);
		add(lblPass);
		
		tfPass = new JTextField();
		tfPass.setFont(new Font("굴림", Font.PLAIN, 17));
		tfPass.setColumns(10);
		tfPass.setBounds(180, 160, 151, 48);
		add(tfPass);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Arial", Font.BOLD, 17));
		btnLogin.setFocusable(false);
		btnLogin.setBounds(20, 245, 120, 45);
		add(btnLogin);
		
		JButton btnResiter = new JButton("REGISTER");
		btnResiter.setFont(new Font("Arial", Font.BOLD, 17));
		btnResiter.setFocusable(false);
		btnResiter.setBounds(147, 245, 120, 45);
		add(btnResiter);
		
		JButton btnSearch = new JButton("");
		btnSearch.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\searchBtn.png"));
		btnSearch.setFocusable(false);
		btnSearch.setBounds(273, 245, 55, 45);
		add(btnSearch);
	}
}