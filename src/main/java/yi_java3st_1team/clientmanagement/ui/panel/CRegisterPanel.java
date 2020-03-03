package yi_java3st_1team.clientmanagement.ui.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class CRegisterPanel extends JPanel {
	private JLabel lblCNo;
	private JLabel lblCName;
	private JLabel lblCCEO;
	private JLabel lblCAddress;
	private JLabel lblCTel;
	private JLabel lblStaff;
	private JTextField tfCNo;
	private JTextField tfCName;
	private JTextField tfCCEO;
	private JTextField tfCAddress;
	private JTextField tfCTel;
	private JTextField tfStaff;
	private JLabel lblNewLabel;
	public CRegisterPanel() {

		initialize();
	}
	private void initialize() {
		setBounds(new Rectangle(0, 0, 635, 700));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		add(panel, BorderLayout.CENTER);
		panel.setBounds(new Rectangle(0, 0, 635, 700));
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setLayout(null);
		
		lblCNo = new JLabel("고 객 번 호");
		lblCNo.setForeground(Color.BLACK);
		lblCNo.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 16));
		lblCNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCNo.setBounds(12, 25, 120, 30);
		panel.add(lblCNo);
		
		lblCName = new JLabel("상   호   명");
		lblCName.setForeground(Color.BLACK);
		lblCName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblCName.setBounds(12, 95, 120, 30);
		panel.add(lblCName);
		
		lblCCEO = new JLabel("대   표   명");
		lblCCEO.setForeground(Color.BLACK);
		lblCCEO.setHorizontalAlignment(SwingConstants.CENTER);
		lblCCEO.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblCCEO.setBounds(12, 165, 120, 30);
		panel.add(lblCCEO);
		
		lblCAddress = new JLabel("주        소");
		lblCAddress.setForeground(Color.BLACK);
		lblCAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblCAddress.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblCAddress.setBounds(12, 235, 120, 30);
		panel.add(lblCAddress);
		
		lblCTel = new JLabel("전 화 번 호");
		lblCTel.setForeground(Color.BLACK);
		lblCTel.setHorizontalAlignment(SwingConstants.CENTER);
		lblCTel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblCTel.setBounds(12, 305, 120, 30);
		panel.add(lblCTel);
		
		lblStaff = new JLabel("담 당 직 원");
		lblStaff.setForeground(Color.BLACK);
		lblStaff.setHorizontalAlignment(SwingConstants.CENTER);
		lblStaff.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblStaff.setBounds(12, 375, 120, 30);
		panel.add(lblStaff);
		
		tfCNo = new JTextField();
		tfCNo.setEditable(false);
		tfCNo.setBounds(176, 25, 200, 30);
		panel.add(tfCNo);
		tfCNo.setColumns(10);
		
		tfCName = new JTextField();
		tfCName.setColumns(10);
		tfCName.setBounds(176, 95, 200, 30);
		panel.add(tfCName);
		
		tfCCEO = new JTextField();
		tfCCEO.setColumns(10);
		tfCCEO.setBounds(176, 165, 200, 30);
		panel.add(tfCCEO);
		
		tfCAddress = new JTextField();
		tfCAddress.setColumns(10);
		tfCAddress.setBounds(176, 235, 200, 30);
		panel.add(tfCAddress);
		
		tfCTel = new JTextField();
		tfCTel.setColumns(10);
		tfCTel.setBounds(176, 305, 200, 30);
		panel.add(tfCTel);
		
		tfStaff = new JTextField();
		tfStaff.setColumns(10);
		tfStaff.setBounds(176, 375, 200, 30);
		panel.add(tfStaff);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 400, 430);
		panel.add(lblNewLabel);
		
	}
}
