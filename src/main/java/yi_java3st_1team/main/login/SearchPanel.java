package yi_java3st_1team.main.login;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class SearchPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public SearchPanel() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setPreferredSize(new Dimension(500, 500));
		setLayout(new GridLayout(0, 1, 10, 10));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("   - ID 찾기");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setPreferredSize(new Dimension(61, 80));
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 25));
		panel_1.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.add(panel_2, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("조회");
		btnNewButton.setFocusable(false);
		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		panel_2.add(btnNewButton);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EmptyBorder(20, 40, 20, 40));
		panel_4.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblNewLabel_2 = new JLabel("등 록 번 호");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_2);
		
		textField = new JTextField();
		panel_4.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("이       름");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		panel_4.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		panel_4.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("   - PASSWORD 찾기");
		lblNewLabel_1.setPreferredSize(new Dimension(117, 80));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 25));
		panel.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaptionBorder);
		panel.add(panel_3, BorderLayout.SOUTH);
		
		JButton btnNewButton_1 = new JButton("임시 비밀번호 전송");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBackground(SystemColor.controlHighlight);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		panel_3.add(btnNewButton_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EmptyBorder(20, 40, 20, 40));
		panel_5.setBackground(SystemColor.inactiveCaptionBorder);
		panel.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblNewLabel_4 = new JLabel("아 이 디");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		panel_5.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		panel_5.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("이 메 일  주 소");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		panel_5.add(textField_3);
		textField_3.setColumns(10);
	}

}
