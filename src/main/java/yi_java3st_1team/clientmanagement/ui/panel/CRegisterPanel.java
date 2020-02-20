package yi_java3st_1team.clientmanagement.ui.panel;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class CRegisterPanel extends JPanel {

	private JLabel lblSC;
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
	private JButton btnUpdate;
	private JButton btnDel;
	private JButton btnGoMain;
	private JButton btnDplCheck;
	private JButton btnPostNum;
	public CRegisterPanel() {

		initialize();
	}
	private void initialize() {
		setBounds(new Rectangle(0, 0, 635, 700));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setBounds(new Rectangle(0, 0, 635, 700));
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setLayout(null);
		
		lblSC = new JLabel("고 객 사 관 리");
		lblSC.setForeground(Color.BLACK);
		lblSC.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		lblSC.setHorizontalAlignment(SwingConstants.CENTER);
		lblSC.setBounds(0, 52, 635, 54);
		panel.add(lblSC);
		
		lblCNo = new JLabel("고 객 번 호");
		lblCNo.setForeground(Color.BLACK);
		lblCNo.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 16));
		lblCNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCNo.setBounds(66, 140, 120, 30);
		panel.add(lblCNo);
		
		lblCName = new JLabel("상   호   명");
		lblCName.setForeground(Color.BLACK);
		lblCName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblCName.setBounds(66, 210, 120, 30);
		panel.add(lblCName);
		
		lblCCEO = new JLabel("대   표   명");
		lblCCEO.setForeground(Color.BLACK);
		lblCCEO.setHorizontalAlignment(SwingConstants.CENTER);
		lblCCEO.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblCCEO.setBounds(66, 280, 120, 30);
		panel.add(lblCCEO);
		
		lblCAddress = new JLabel("주        소");
		lblCAddress.setForeground(Color.BLACK);
		lblCAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblCAddress.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblCAddress.setBounds(66, 350, 120, 30);
		panel.add(lblCAddress);
		
		lblCTel = new JLabel("전 화 번 호");
		lblCTel.setForeground(Color.BLACK);
		lblCTel.setHorizontalAlignment(SwingConstants.CENTER);
		lblCTel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblCTel.setBounds(66, 420, 120, 30);
		panel.add(lblCTel);
		
		lblStaff = new JLabel("담 당 직 원");
		lblStaff.setForeground(Color.BLACK);
		lblStaff.setHorizontalAlignment(SwingConstants.CENTER);
		lblStaff.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblStaff.setBounds(66, 490, 120, 30);
		panel.add(lblStaff);
		
		tfCNo = new JTextField();
		tfCNo.setBounds(230, 140, 200, 30);
		panel.add(tfCNo);
		tfCNo.setColumns(10);
		
		tfCName = new JTextField();
		tfCName.setColumns(10);
		tfCName.setBounds(230, 210, 200, 30);
		panel.add(tfCName);
		
		tfCCEO = new JTextField();
		tfCCEO.setColumns(10);
		tfCCEO.setBounds(230, 280, 200, 30);
		panel.add(tfCCEO);
		
		tfCAddress = new JTextField();
		tfCAddress.setColumns(10);
		tfCAddress.setBounds(230, 350, 200, 30);
		panel.add(tfCAddress);
		
		tfCTel = new JTextField();
		tfCTel.setColumns(10);
		tfCTel.setBounds(230, 420, 200, 30);
		panel.add(tfCTel);
		
		tfStaff = new JTextField();
		tfStaff.setColumns(10);
		tfStaff.setBounds(230, 490, 200, 30);
		panel.add(tfStaff);
		
		btnUpdate = new JButton("수 정");
		btnUpdate.setBackground(new Color(0, 204, 255));
		btnUpdate.setForeground(new Color(0, 102, 204));
		btnUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnUpdate.setBounds(66, 580, 100, 30);
		panel.add(btnUpdate);
		
		btnDel = new JButton("삭 제");
		btnDel.setBackground(new Color(0, 204, 255));
		btnDel.setForeground(new Color(0, 102, 204));
		btnDel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnDel.setBounds(270, 580, 100, 30);
		panel.add(btnDel);
		
		btnGoMain = new JButton("메인화면");
		btnGoMain.setBackground(new Color(25, 25, 112));
		btnGoMain.setForeground(Color.WHITE);
		btnGoMain.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnGoMain.setBounds(465, 580, 100, 30);
		panel.add(btnGoMain);
		
		btnDplCheck = new JButton("중복확인");
		btnDplCheck.setForeground(Color.WHITE);
		btnDplCheck.setBackground(new Color(240, 128, 128));
		btnDplCheck.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnDplCheck.setBounds(465, 210, 100, 30);
		panel.add(btnDplCheck);
		
		btnPostNum = new JButton("우편번호");
		btnPostNum.setBackground(new Color(70, 130, 180));
		btnPostNum.setForeground(Color.WHITE);
		btnPostNum.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnPostNum.setBounds(465, 350, 100, 30);
		panel.add(btnPostNum);
		
		JLabel label = new JLabel("");
		label.setOpaque(true);
		label.setBackground(Color.WHITE);
		label.setBounds(54, 116, 525, 430);
		panel.add(label);
		
	}
}
