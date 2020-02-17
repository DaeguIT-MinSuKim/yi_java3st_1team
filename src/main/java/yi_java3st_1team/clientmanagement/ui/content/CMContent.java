package yi_java3st_1team.clientmanagement.ui.content;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class CMContent extends JPanel {
	private JTabbedPane tpClientManagetment;
	private JPanel pSWRegister;
	private JPanel pSCSO;
	private JPanel pClientDelivery;
	private JPanel panel_3;
	private JPanel panel_4;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JButton btnNewButton;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JComboBox comboBox;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JComboBox comboBox_1;
	private JTextField textField_1;
	private JButton button_6;
	private JPanel panel_5;

	public CMContent() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setBounds(new Rectangle(0, 0, 1270, 700));
		setLayout(new BorderLayout(0, 0));
		
		tpClientManagetment = new JTabbedPane(JTabbedPane.TOP);
		tpClientManagetment.setBackground(SystemColor.inactiveCaption);
		add(tpClientManagetment, BorderLayout.CENTER);
		
		pSWRegister = new JPanel();
		pSWRegister.setBounds(0, 0, 100, 50);
		pSWRegister.setBackground(SystemColor.inactiveCaptionBorder);
		tpClientManagetment.addTab("제품 등록", null, pSWRegister, null);
		pSWRegister.setLayout(new GridLayout(0, 2, 0, 0));
		
		panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaptionBorder);
		pSWRegister.add(panel_3);
		panel_3.setLayout(null);
		
		lblNewLabel = new JLabel("소프트웨어 제품등록");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(101, 52, 407, 54);
		panel_3.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("품 목 번 호");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(66, 140, 120, 30);
		panel_3.add(lblNewLabel_1);
		
		label = new JLabel("분  류  명");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("굴림", Font.BOLD, 18));
		label.setBounds(66, 190, 120, 30);
		panel_3.add(label);
		
		label_1 = new JLabel("품  목  명");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("굴림", Font.BOLD, 18));
		label_1.setBounds(66, 240, 120, 30);
		panel_3.add(label_1);
		
		label_2 = new JLabel("공 급 가 격");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("굴림", Font.BOLD, 18));
		label_2.setBounds(66, 290, 120, 30);
		panel_3.add(label_2);
		
		label_3 = new JLabel("판 매 가 격");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("굴림", Font.BOLD, 18));
		label_3.setBounds(66, 340, 120, 30);
		panel_3.add(label_3);
		
		label_4 = new JLabel("공급회사명");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("굴림", Font.BOLD, 18));
		label_4.setBounds(66, 390, 120, 30);
		panel_3.add(label_4);
		
		label_5 = new JLabel("재 고 수 량");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("굴림", Font.BOLD, 18));
		label_5.setBounds(66, 440, 120, 30);
		panel_3.add(label_5);
		
		label_6 = new JLabel("최초등록일자");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("굴림", Font.BOLD, 18));
		label_6.setBounds(66, 490, 120, 30);
		panel_3.add(label_6);
		
		textField = new JTextField();
		textField.setBounds(230, 140, 200, 30);
		panel_3.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(230, 240, 200, 30);
		panel_3.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(230, 290, 200, 30);
		panel_3.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(230, 340, 200, 30);
		panel_3.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(230, 390, 200, 30);
		panel_3.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(230, 440, 200, 30);
		panel_3.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(230, 490, 200, 30);
		panel_3.add(textField_7);
		
		btnNewButton = new JButton("등 록");
		btnNewButton.setBounds(20, 580, 130, 30);
		panel_3.add(btnNewButton);
		
		button = new JButton("수 정");
		button.setBounds(170, 580, 130, 30);
		panel_3.add(button);
		
		button_1 = new JButton("삭 제");
		button_1.setBounds(320, 580, 130, 30);
		panel_3.add(button_1);
		
		button_2 = new JButton("메 인 화 면");
		button_2.setBounds(470, 580, 130, 30);
		panel_3.add(button_2);
		
		button_3 = new JButton("중 복 확 인");
		button_3.setBounds(454, 240, 130, 30);
		panel_3.add(button_3);
		
		button_4 = new JButton("조 회");
		button_4.setBounds(454, 390, 130, 30);
		panel_3.add(button_4);
		
		button_5 = new JButton("조 회");
		button_5.setBounds(454, 440, 130, 30);
		panel_3.add(button_5);
		
		comboBox = new JComboBox();
		comboBox.setBounds(230, 190, 200, 30);
		panel_3.add(comboBox);
		
		panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.inactiveCaptionBorder);
		pSWRegister.add(panel_4);
		panel_4.setLayout(null);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\workspace\\wokrspace_java\\sw_sales_management\\images\\list.png"));
		lblNewLabel_2.setBounds(30, 60, 40, 40);
		panel_4.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("소프트웨어 LIST");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(80, 60, 170, 40);
		panel_4.add(lblNewLabel_3);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(260, 65, 120, 30);
		panel_4.add(comboBox_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(400, 65, 130, 30);
		panel_4.add(textField_1);
		
		button_6 = new JButton("검 색");
		button_6.setBounds(550, 65, 70, 30);
		panel_4.add(button_6);
		
		panel_5 = new JPanel();
		panel_5.setBounds(30, 123, 590, 488);
		panel_4.add(panel_5);
		
		pSCSO = new JPanel();
		pSCSO.setBounds(0, 0, 100, 50);
		pSCSO.setBackground(SystemColor.inactiveCaptionBorder);
		tpClientManagetment.addTab("매입 / 발주", null, pSCSO, null);
		
		pClientDelivery = new JPanel();
		pClientDelivery.setBounds(0, 0, 100, 50);
		pClientDelivery.setBackground(SystemColor.inactiveCaptionBorder);
		tpClientManagetment.addTab("출  고", null, pClientDelivery, null);
	}
}
