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
public class SCSORegisterPanel extends JPanel {
	
	private JLabel lblSCSO;
	private JLabel lblSCSONo;
	private JLabel lblSCSOPName;
	private JLabel lblSCSOPrice;
	private JLabel lblSCSOSName;
	private JLabel lblSCSOPQty;
	private JLabel lblSCSODate;
	private JTextField tfPSCSONo;
	private JTextField tfSCSOPName;
	private JTextField tfSCSOPrice;
	private JTextField tfSCSOSName;
	private JTextField tfSCSOPQty;
	private JTextField tfSCSODate;
	private JButton btnAdd;
	private JButton btnUpdate;
	private JButton btnDel;
	private JButton btnGoMain;
	private JLabel label;

	public SCSORegisterPanel() {
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
		
		lblSCSO = new JLabel("매입 & 발주 이력 관리");
		lblSCSO.setForeground(Color.BLACK);
		lblSCSO.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		lblSCSO.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCSO.setBounds(0, 52, 635, 54);
		panel.add(lblSCSO);
		
		lblSCSONo = new JLabel("번        호");
		lblSCSONo.setForeground(Color.BLACK);
		lblSCSONo.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSCSONo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCSONo.setBounds(66, 140, 120, 30);
		panel.add(lblSCSONo);
		
		lblSCSOPName = new JLabel("품   목   명");
		lblSCSOPName.setForeground(Color.BLACK);
		lblSCSOPName.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCSOPName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSCSOPName.setBounds(66, 210, 120, 30);
		panel.add(lblSCSOPName);
		
		lblSCSOPrice = new JLabel("가        격");
		lblSCSOPrice.setForeground(Color.BLACK);
		lblSCSOPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCSOPrice.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSCSOPrice.setBounds(66, 350, 120, 30);
		panel.add(lblSCSOPrice);
		
		lblSCSOSName = new JLabel("공급회사명");
		lblSCSOSName.setForeground(Color.BLACK);
		lblSCSOSName.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCSOSName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSCSOSName.setBounds(66, 280, 120, 30);
		panel.add(lblSCSOSName);
		
		lblSCSOPQty = new JLabel("수        량");
		lblSCSOPQty.setForeground(Color.BLACK);
		lblSCSOPQty.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCSOPQty.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSCSOPQty.setBounds(66, 420, 120, 30);
		panel.add(lblSCSOPQty);
		
		lblSCSODate = new JLabel("등 록 일 자");
		lblSCSODate.setForeground(Color.BLACK);
		lblSCSODate.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCSODate.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSCSODate.setBounds(66, 490, 120, 30);
		panel.add(lblSCSODate);
		
		tfPSCSONo = new JTextField();
		tfPSCSONo.setBounds(230, 140, 200, 30);
		panel.add(tfPSCSONo);
		tfPSCSONo.setColumns(10);
		
		tfSCSOPName = new JTextField();
		tfSCSOPName.setColumns(10);
		tfSCSOPName.setBounds(230, 210, 200, 30);
		panel.add(tfSCSOPName);
		
		tfSCSOPrice = new JTextField();
		tfSCSOPrice.setColumns(10);
		tfSCSOPrice.setBounds(230, 350, 200, 30);
		panel.add(tfSCSOPrice);
		
		tfSCSOSName = new JTextField();
		tfSCSOSName.setColumns(10);
		tfSCSOSName.setBounds(230, 280, 200, 30);
		panel.add(tfSCSOSName);
		
		tfSCSOPQty = new JTextField();
		tfSCSOPQty.setColumns(10);
		tfSCSOPQty.setBounds(230, 420, 200, 30);
		panel.add(tfSCSOPQty);
		
		tfSCSODate = new JTextField();
		tfSCSODate.setColumns(10);
		tfSCSODate.setBounds(230, 490, 200, 30);
		panel.add(tfSCSODate);
		
		btnAdd = new JButton("등 록");
		btnAdd.setBackground(new Color(135, 206, 250));
		btnAdd.setForeground(new Color(0, 102, 204));
		btnAdd.setFocusable(false);
		btnAdd.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnAdd.setBounds(66, 580, 100, 30);
		panel.add(btnAdd);
		
		btnUpdate = new JButton("수 정");
		btnUpdate.setBackground(new Color(135, 206, 250));
		btnUpdate.setForeground(new Color(0, 102, 204));
		btnUpdate.setFocusable(false);
		btnUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnUpdate.setBounds(198, 580, 100, 30);
		panel.add(btnUpdate);
		
		btnDel = new JButton("삭 제");
		btnDel.setBackground(new Color(135, 206, 250));
		btnDel.setForeground(new Color(0, 102, 204));
		btnDel.setFocusable(false);
		btnDel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnDel.setBounds(330, 580, 100, 30);
		panel.add(btnDel);
		
		btnGoMain = new JButton("메인화면");
		btnGoMain.setForeground(Color.WHITE);
		btnGoMain.setBackground(new Color(25, 25, 112));
		btnGoMain.setFocusable(false);
		btnGoMain.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnGoMain.setBounds(465, 580, 100, 30);
		panel.add(btnGoMain);
		
		label = new JLabel("");
		label.setOpaque(true);
		label.setBackground(Color.WHITE);
		label.setBounds(54, 116, 525, 430);
		panel.add(label);
		
	}

}
