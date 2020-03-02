package yi_java3st_1team.clientmanagement.ui;

import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;

@SuppressWarnings("serial")
public class ZipCodePanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public ZipCodePanel() {

		initialize();
	}
	private void initialize() {
		setBounds(new Rectangle(0, 0, 800, 300));
		setBackground(SystemColor.inactiveCaptionBorder);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("주 소 검 색");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 26));
		lblNewLabel.setBounds(0, 24, 800, 40);
		add(lblNewLabel);
		
		JLabel label = new JLabel("도 로 명");
		label.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 14));
		label.setBounds(190, 84, 120, 25);
		add(label);
		
		JLabel label_1 = new JLabel("건물번호 본번");
		label_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 14));
		label_1.setBounds(340, 84, 120, 25);
		add(label_1);
		
		textField = new JTextField();
		textField.setBounds(190, 120, 120, 30);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(340, 120, 120, 30);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("건물번호 부번");
		label_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 14));
		label_2.setBounds(490, 84, 120, 25);
		add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(490, 120, 120, 30);
		add(textField_2);
		
		JButton btnNewButton = new JButton("검  색");
		btnNewButton.setBounds(640, 120, 120, 30);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("등   록");
		btnNewButton_1.setBounds(325, 250, 150, 32);
		add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"서울특별시", "부산광역시", "대구광역시", "인천광역시", "광주광역시", "대전광역시", "울산광역시", "경기도", "강원도", "충청북도", "충청남도", "전라북도", "전라남도", "경상북도", "경상남도", "제주특별자치도", "세종특별자치시"}));
		comboBox.setBounds(40, 120, 120, 30);
		add(comboBox);
		
		JLabel label_3 = new JLabel("시 도");
		label_3.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 14));
		label_3.setBounds(40, 84, 120, 25);
		add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(40, 180, 370, 30);
		add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(425, 180, 185, 30);
		add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("(상세주소)");
		lblNewLabel_1.setBounds(618, 180, 93, 30);
		add(lblNewLabel_1);
	}
}
