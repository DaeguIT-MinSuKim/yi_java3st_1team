package yi_java3st_1team.main;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class LoginPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public LoginPanel() {

		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(350, 348));
		setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\user.png"));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(20, 65, 41, 41);
		add(label);
		
		JLabel label_1 = new JLabel("Username");
		label_1.setFont(new Font("Arial", Font.BOLD, 20));
		label_1.setBounds(75, 66, 97, 41);
		add(label_1);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 17));
		textField.setColumns(10);
		textField.setBounds(180, 60, 151, 48);
		add(textField);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\lock.png"));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("굴림", Font.PLAIN, 20));
		label_2.setBounds(20, 160, 41, 41);
		add(label_2);
		
		JLabel label_3 = new JLabel("Password");
		label_3.setFont(new Font("Arial", Font.BOLD, 20));
		label_3.setBounds(75, 167, 97, 31);
		add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("굴림", Font.PLAIN, 17));
		textField_1.setColumns(10);
		textField_1.setBounds(180, 160, 151, 48);
		add(textField_1);
		
		JButton button = new JButton("LOGIN");
		button.setFont(new Font("Arial", Font.BOLD, 17));
		button.setFocusable(false);
		button.setBounds(20, 245, 120, 45);
		add(button);
		
		JButton button_1 = new JButton("REGISTER");
		button_1.setFont(new Font("Arial", Font.BOLD, 17));
		button_1.setFocusable(false);
		button_1.setBounds(147, 245, 120, 45);
		add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\searchBtn.png"));
		button_2.setFocusable(false);
		button_2.setBounds(273, 245, 55, 45);
		add(button_2);
	}
}
