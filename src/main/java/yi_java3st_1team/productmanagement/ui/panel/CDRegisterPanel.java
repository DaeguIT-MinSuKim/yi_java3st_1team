package yi_java3st_1team.productmanagement.ui.panel;

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
public class CDRegisterPanel extends JPanel {
	
	private JLabel lblCD;
	private JLabel lblCDNo;
	private JLabel lblCName;
	private JLabel lblCDQty;
	private JLabel lblCDPName;
	private JLabel lblCDDate;
	private JTextField tfPCDNo;
	private JTextField tfSCName;
	private JTextField tfSCDQty;
	private JTextField tfSCDPName;
	private JTextField tfSCDDate;
	private JButton btnAdd;
	private JButton btnUpdate;
	private JButton btnDel;
	private JButton btnGoMain;
	private JLabel label;

	public CDRegisterPanel() {
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
		
		lblCD = new JLabel("출고 이력 관리");
		lblCD.setForeground(Color.BLACK);
		lblCD.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		lblCD.setHorizontalAlignment(SwingConstants.CENTER);
		lblCD.setBounds(0, 52, 635, 54);
		panel.add(lblCD);
		
		lblCDNo = new JLabel("출 고 번 호");
		lblCDNo.setForeground(Color.BLACK);
		lblCDNo.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblCDNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCDNo.setBounds(66, 140, 120, 30);
		panel.add(lblCDNo);
		
		lblCName = new JLabel("고객상호명");
		lblCName.setForeground(Color.BLACK);
		lblCName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblCName.setBounds(66, 228, 120, 30);
		panel.add(lblCName);
		
		lblCDQty = new JLabel("출 고 수 량");
		lblCDQty.setForeground(Color.BLACK);
		lblCDQty.setHorizontalAlignment(SwingConstants.CENTER);
		lblCDQty.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblCDQty.setBounds(66, 404, 120, 30);
		panel.add(lblCDQty);
		
		lblCDPName = new JLabel("품  목  명");
		lblCDPName.setForeground(Color.BLACK);
		lblCDPName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCDPName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblCDPName.setBounds(66, 316, 120, 30);
		panel.add(lblCDPName);
		
		lblCDDate = new JLabel("출 고 일 자");
		lblCDDate.setForeground(Color.BLACK);
		lblCDDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblCDDate.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblCDDate.setBounds(66, 492, 120, 30);
		panel.add(lblCDDate);
		
		tfPCDNo = new JTextField();
		tfPCDNo.setBounds(230, 140, 200, 30);
		panel.add(tfPCDNo);
		tfPCDNo.setColumns(10);
		
		tfSCName = new JTextField();
		tfSCName.setColumns(10);
		tfSCName.setBounds(230, 228, 200, 30);
		panel.add(tfSCName);
		
		tfSCDQty = new JTextField();
		tfSCDQty.setColumns(10);
		tfSCDQty.setBounds(230, 404, 200, 30);
		panel.add(tfSCDQty);
		
		tfSCDPName = new JTextField();
		tfSCDPName.setColumns(10);
		tfSCDPName.setBounds(230, 316, 200, 30);
		panel.add(tfSCDPName);
		
		tfSCDDate = new JTextField();
		tfSCDDate.setColumns(10);
		tfSCDDate.setBounds(230, 492, 200, 30);
		panel.add(tfSCDDate);
		
		btnAdd = new JButton("등 록");
		btnAdd.setBackground(new Color(135, 206, 250));
		btnAdd.setForeground(new Color(0, 102, 204));
		btnAdd.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnAdd.setFocusable(false);
		btnAdd.setBounds(66, 580, 100, 30);
		panel.add(btnAdd);
		
		btnUpdate = new JButton("수 정");
		btnUpdate.setBackground(new Color(135, 206, 250));
		btnUpdate.setForeground(new Color(0, 102, 204));
		btnUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnUpdate.setFocusable(false);
		btnUpdate.setBounds(198, 580, 100, 30);
		panel.add(btnUpdate);
		
		btnDel = new JButton("삭 제");
		btnDel.setBackground(new Color(135, 206, 250));
		btnDel.setForeground(new Color(0, 102, 204));
		btnDel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnDel.setFocusable(false);
		btnDel.setBounds(330, 580, 100, 30);
		panel.add(btnDel);
		
		btnGoMain = new JButton("메인화면");
		btnGoMain.setBackground(new Color(25, 25, 112));
		btnGoMain.setForeground(Color.WHITE);
		btnGoMain.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnGoMain.setFocusable(false);
		btnGoMain.setBounds(465, 580, 100, 30);
		panel.add(btnGoMain);
		
		label = new JLabel("");
		label.setOpaque(true);
		label.setBackground(Color.WHITE);
		label.setBounds(54, 116, 525, 430);
		panel.add(label);
		
	}

}
