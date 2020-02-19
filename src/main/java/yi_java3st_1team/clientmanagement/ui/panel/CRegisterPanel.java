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
		
		btnUpdate = new JButton("");
		btnUpdate.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\test\\수정.png"));
		btnUpdate.setBounds(66, 580, 100, 30);
		panel.add(btnUpdate);
		
		btnDel = new JButton("");
		btnDel.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\test\\삭제.png"));
		btnDel.setBounds(270, 580, 100, 30);
		panel.add(btnDel);
		
		btnGoMain = new JButton("");
		btnGoMain.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\test\\메인화면.png"));
		btnGoMain.setBounds(465, 580, 100, 30);
		panel.add(btnGoMain);
		
		btnDplCheck = new JButton("");
		btnDplCheck.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\test\\중복확인.png"));
		btnDplCheck.setBounds(465, 210, 100, 30);
		panel.add(btnDplCheck);
		
		btnPostNum = new JButton("");
		btnPostNum.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\test\\우편번호.png"));
		btnPostNum.setBounds(465, 350, 100, 30);
		panel.add(btnPostNum);
		
		JLabel label = new JLabel("");
		label.setOpaque(true);
		label.setBackground(Color.WHITE);
		label.setBounds(54, 116, 525, 430);
		panel.add(label);
		
	}
}
