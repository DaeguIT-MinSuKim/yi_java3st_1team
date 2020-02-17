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
		lblSC.setFont(new Font("굴림", Font.BOLD, 40));
		lblSC.setHorizontalAlignment(SwingConstants.CENTER);
		lblSC.setBounds(101, 52, 407, 54);
		panel.add(lblSC);
		
		lblCNo = new JLabel("고 객 번 호");
		lblCNo.setFont(new Font("굴림", Font.BOLD, 18));
		lblCNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCNo.setBounds(66, 140, 120, 30);
		panel.add(lblCNo);
		
		lblCName = new JLabel("상   호   명");
		lblCName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCName.setFont(new Font("굴림", Font.BOLD, 18));
		lblCName.setBounds(66, 210, 120, 30);
		panel.add(lblCName);
		
		lblCCEO = new JLabel("대   표   명");
		lblCCEO.setHorizontalAlignment(SwingConstants.CENTER);
		lblCCEO.setFont(new Font("굴림", Font.BOLD, 18));
		lblCCEO.setBounds(66, 280, 120, 30);
		panel.add(lblCCEO);
		
		lblCAddress = new JLabel("주        소");
		lblCAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblCAddress.setFont(new Font("굴림", Font.BOLD, 18));
		lblCAddress.setBounds(66, 350, 120, 30);
		panel.add(lblCAddress);
		
		lblCTel = new JLabel("전 화 번 호");
		lblCTel.setHorizontalAlignment(SwingConstants.CENTER);
		lblCTel.setFont(new Font("굴림", Font.BOLD, 18));
		lblCTel.setBounds(66, 420, 120, 30);
		panel.add(lblCTel);
		
		lblStaff = new JLabel("담 당 직 원");
		lblStaff.setHorizontalAlignment(SwingConstants.CENTER);
		lblStaff.setFont(new Font("굴림", Font.BOLD, 18));
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
		btnUpdate.setBounds(60, 580, 130, 30);
		panel.add(btnUpdate);
		
		btnDel = new JButton("삭 제");
		btnDel.setBounds(240, 580, 130, 30);
		panel.add(btnDel);
		
		btnGoMain = new JButton("메 인 화 면");
		btnGoMain.setBounds(420, 580, 130, 30);
		panel.add(btnGoMain);
		
		btnDplCheck = new JButton("중 복 확 인");
		btnDplCheck.setBounds(454, 210, 130, 30);
		panel.add(btnDplCheck);
		
		btnPostNum = new JButton("우 편 번 호");
		btnPostNum.setBounds(454, 350, 130, 30);
		panel.add(btnPostNum);
		
	}
}
