package yi_java3st_1team.clientmanagement.ui;

import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

@SuppressWarnings("serial")
public class ZipCodePanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public ZipCodePanel() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("주 소 검 색");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 26));
		lblNewLabel.setBounds(185, 24, 330, 40);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("시 / 도");
		lblNewLabel_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(20, 95, 90, 25);
		add(lblNewLabel_1);
		
		JLabel label = new JLabel("도 로 명");
		label.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 14));
		label.setBounds(160, 95, 90, 25);
		add(label);
		
		JLabel label_1 = new JLabel("상세주소1");
		label_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 14));
		label_1.setBounds(300, 95, 90, 25);
		add(label_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(20, 130, 120, 25);
		add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(160, 130, 120, 25);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(300, 130, 120, 25);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("상세주소2");
		label_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 14));
		label_2.setBounds(445, 95, 90, 25);
		add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(445, 130, 120, 25);
		add(textField_2);
		
		JButton btnNewButton = new JButton("검  색");
		btnNewButton.setBounds(590, 130, 90, 25);
		add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("서울특별시 강남구 테헤란로 30");
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("바탕", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(20, 170, 668, 51);
		add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("등   록");
		btnNewButton_1.setBounds(275, 242, 150, 32);
		add(btnNewButton_1);
	}
}
