package yi_java3st_1team.main.ui.content.login;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class EmpRegiPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public EmpRegiPanel() {

		initialize();
	}
	private void initialize() {
		setSize(new Dimension(500, 650));
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("사용자 등록");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(SystemColor.inactiveCaptionBorder);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setPreferredSize(new Dimension(60, 90));
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBorder(new EmptyBorder(20, 40, 20, 40));
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.inactiveCaptionBorder);
		panel_2.setPreferredSize(new Dimension(150, 10));
		panel.add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new GridLayout(0, 1, 10, 10));
		
		JLabel label = new JLabel("사 원 번 호  ");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("이 름  ");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("부 서 명  ");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("직 급  ");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("아 이 디  ");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("비 밀 번 호  ");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setForeground(Color.BLACK);
		label_5.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		panel_2.add(label_5);
		
		JLabel lblNewLabel_4 = new JLabel("");
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("비 밀 번 호  확 인  ");
		lblNewLabel_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		panel_2.add(lblNewLabel_3);
		
		JLabel label_6 = new JLabel("이 메 일  주 소  ");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		panel_2.add(label_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaptionBorder);
		panel_3.setPreferredSize(new Dimension(200, 10));
		panel.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new GridLayout(0, 1, 10, 10));
		
		textField = new JTextField();
		textField.setColumns(10);
		panel_3.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel_3.add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		panel_3.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		panel_3.add(comboBox_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_3.add(textField_2);
		
		passwordField = new JPasswordField();
		panel_3.add(passwordField);
		
		JLabel label_7 = new JLabel("<html>6자리 이상 이어야 하며 영문과 숫자를 반드시 포함해야 합니다<br></html>");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(Color.BLUE);
		label_7.setFont(new Font("굴림", Font.PLAIN, 11));
		panel_3.add(label_7);
		
		passwordField_1 = new JPasswordField();
		panel_3.add(passwordField_1);
		
		JLabel lblNewLabel_2 = new JLabel("비밀번호 일치");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		panel_3.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.inactiveCaptionBorder);
		panel_4.setPreferredSize(new Dimension(80, 10));
		panel.add(panel_4, BorderLayout.EAST);
		panel_4.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("<html>중복<br>확인</html>");
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 12));
		btnNewButton_2.setBounds(12, 3, 60, 39);
		panel_4.add(btnNewButton_2);
		
		JButton button = new JButton("<html>중복<br>확인</html>");
		button.setFont(new Font("굴림", Font.BOLD, 12));
		button.setBounds(12, 182, 60, 39);
		panel_4.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.setPreferredSize(new Dimension(10, 45));
		add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("등록");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 12));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 12));
		panel_1.add(btnNewButton_1);
	}

}
