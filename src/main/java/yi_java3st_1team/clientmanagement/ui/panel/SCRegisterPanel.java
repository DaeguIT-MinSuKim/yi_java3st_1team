package yi_java3st_1team.clientmanagement.ui.panel;

import java.awt.BorderLayout;
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
public class SCRegisterPanel extends JPanel {

	private JLabel lblSC;
	private JLabel lblSCNo;
	private JLabel lblSCName;
	private JLabel lblSCBln;
	private JLabel lblSCAddress;
	private JLabel lblSCTel;
	private JLabel lblSCFax;
	private JTextField tfSCNo;
	private JTextField tfSCName;
	private JTextField tfSCBln;
	private JTextField tfSCAddress;
	private JTextField tfSCTel;
	private JTextField tfSCFax;
	private JButton btnAdd;
	private JButton btnUpdate;
	private JButton btnDel;
	private JButton btnGoMain;
	private JButton btnDplCheck;
	private JButton btnPostNum;
	private JLabel lblWhite;
	public SCRegisterPanel() {

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
		
		lblSC = new JLabel("공급회사 등록");
		lblSC.setForeground(Color.BLACK);
		lblSC.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 40));
		lblSC.setHorizontalAlignment(SwingConstants.CENTER);
		lblSC.setBounds(0, 52, 635, 54);
		panel.add(lblSC);
		
		lblSCNo = new JLabel("회 사 번 호");
		lblSCNo.setForeground(Color.BLACK);
		lblSCNo.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSCNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCNo.setBounds(66, 140, 120, 30);
		panel.add(lblSCNo);
		
		lblSCName = new JLabel("회  사  명");
		lblSCName.setForeground(Color.BLACK);
		lblSCName.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSCName.setBounds(66, 210, 120, 30);
		panel.add(lblSCName);
		
		lblSCBln = new JLabel("사업자등록번호");
		lblSCBln.setForeground(Color.BLACK);
		lblSCBln.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCBln.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSCBln.setBounds(66, 280, 120, 30);
		panel.add(lblSCBln);
		
		lblSCAddress = new JLabel("주       소");
		lblSCAddress.setForeground(Color.BLACK);
		lblSCAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCAddress.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSCAddress.setBounds(66, 350, 120, 30);
		panel.add(lblSCAddress);
		
		lblSCTel = new JLabel("전 화 번 호");
		lblSCTel.setForeground(Color.BLACK);
		lblSCTel.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCTel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSCTel.setBounds(66, 420, 120, 30);
		panel.add(lblSCTel);
		
		lblSCFax = new JLabel("FAX 번 호");
		lblSCFax.setForeground(Color.BLACK);
		lblSCFax.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCFax.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSCFax.setBounds(66, 490, 120, 30);
		panel.add(lblSCFax);
		
		tfSCNo = new JTextField();
		tfSCNo.setBounds(230, 140, 200, 30);
		panel.add(tfSCNo);
		tfSCNo.setColumns(10);
		
		tfSCName = new JTextField();
		tfSCName.setColumns(10);
		tfSCName.setBounds(230, 210, 200, 30);
		panel.add(tfSCName);
		
		tfSCBln = new JTextField();
		tfSCBln.setColumns(10);
		tfSCBln.setBounds(230, 280, 200, 30);
		panel.add(tfSCBln);
		
		tfSCAddress = new JTextField();
		tfSCAddress.setColumns(10);
		tfSCAddress.setBounds(230, 350, 200, 30);
		panel.add(tfSCAddress);
		
		tfSCTel = new JTextField();
		tfSCTel.setColumns(10);
		tfSCTel.setBounds(230, 420, 200, 30);
		panel.add(tfSCTel);
		
		tfSCFax = new JTextField();
		tfSCFax.setColumns(10);
		tfSCFax.setBounds(230, 490, 200, 30);
		panel.add(tfSCFax);
		
		btnAdd = new JButton("등 록");
		btnAdd.setFocusable(false);
		btnAdd.setForeground(new Color(0, 102, 204));
		btnAdd.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnAdd.setBackground(new Color(135, 206, 250));
		btnAdd.setBounds(66, 580, 100, 30);
		panel.add(btnAdd);
		
		btnUpdate = new JButton("수 정");
		btnUpdate.setFocusable(false);
		btnUpdate.setForeground(new Color(0, 102, 204));
		btnUpdate.setBackground(new Color(135, 206, 250));
		btnUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnUpdate.setBounds(198, 580, 100, 30);
		panel.add(btnUpdate);
		
		btnDel = new JButton("삭 제");
		btnDel.setFocusable(false);
		btnDel.setForeground(new Color(0, 102, 204));
		btnDel.setBackground(new Color(135, 206, 250));
		btnDel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnDel.setBounds(330, 580, 100, 30);
		panel.add(btnDel);
		
		btnGoMain = new JButton("메인화면");
		btnGoMain.setFocusable(false);
		btnGoMain.setBackground(new Color(25, 25, 112));
		btnGoMain.setForeground(Color.WHITE);
		btnGoMain.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnGoMain.setBounds(465, 580, 100, 30);
		panel.add(btnGoMain);
		
		btnDplCheck = new JButton("중복확인");
		btnDplCheck.setFocusable(false);
		btnDplCheck.setBackground(new Color(240, 128, 128));
		btnDplCheck.setForeground(Color.WHITE);
		btnDplCheck.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnDplCheck.setBounds(465, 210, 100, 30);
		panel.add(btnDplCheck);
		
		btnPostNum = new JButton("주소검색");
		btnPostNum.setFocusable(false);
		btnPostNum.setBackground(new Color(70, 130, 180));
		btnPostNum.setForeground(Color.WHITE);
		btnPostNum.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnPostNum.setBounds(465, 350, 100, 30);
		panel.add(btnPostNum);
		
		lblWhite = new JLabel("");
		lblWhite.setOpaque(true);
		lblWhite.setBackground(Color.WHITE);
		lblWhite.setBounds(54, 116, 525, 430);
		panel.add(lblWhite);
		
	}
}
