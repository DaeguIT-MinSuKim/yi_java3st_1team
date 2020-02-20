package yi_java3st_1team.clientmanagement.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class ZipCodePanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public ZipCodePanel() {

		initialize();
	}
	private void initialize() {
		setBounds(new Rectangle(0, 0, 700, 300));
		setBackground(SystemColor.inactiveCaptionBorder);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("주 소 검 색");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 26));
		lblNewLabel.setBounds(185, 24, 330, 40);
		add(lblNewLabel);
		
		JLabel label = new JLabel("도 로 명");
		label.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 14));
		label.setBounds(70, 85, 120, 25);
		add(label);
		
		JLabel label_1 = new JLabel("상세주소1");
		label_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 14));
		label_1.setBounds(230, 85, 120, 25);
		add(label_1);
		
		textField = new JTextField();
		textField.setBounds(70, 120, 120, 25);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(230, 120, 120, 25);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("상세주소2");
		label_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 14));
		label_2.setBounds(390, 85, 120, 25);
		add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(390, 120, 120, 25);
		add(textField_2);
		
		JButton btnNewButton = new JButton("검  색");
		btnNewButton.setBounds(550, 120, 80, 25);
		add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("서울특별시 강남구 테헤란로 30");
		// 여러개의 검색 결과가 나오면 for문으로 전부 디스플레이하고 선택 버튼을 넣는다. 
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("바탕", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(12, 155, 676, 85);
		add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("등   록");
		btnNewButton_1.setBounds(275, 250, 150, 32);
		add(btnNewButton_1);
	}
}
