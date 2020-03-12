package yi_java3st_1team.ordermanagement.ui.panel;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

public class OrderModify extends JPanel{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	public OrderModify() {
		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setSize(new Dimension(500, 500));
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel(">> 주문 수정");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 27));
		lblNewLabel.setBackground(SystemColor.inactiveCaptionBorder);
		lblNewLabel.setPreferredSize(new Dimension(60, 90));
		add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 60));
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("수 정");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(135, 206, 235));
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(20, 40, 20, 40));
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblNewLabel_1 = new JLabel("주 문 번 호   ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("주 문 일 자   ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		panel_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("고 객 상 호 명   ");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		panel_1.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label = new JLabel("품 목 명   ");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		panel_1.add(label);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_1.add(textField_3);
		
		JLabel label_1 = new JLabel("주 문 수 량   ");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		panel_1.add(label_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel_1.add(textField_4);
		
		JLabel label_2 = new JLabel("고 객 요 구 사 항   ");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		panel_1.add(label_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		panel_1.add(textField_5);
	}

}
