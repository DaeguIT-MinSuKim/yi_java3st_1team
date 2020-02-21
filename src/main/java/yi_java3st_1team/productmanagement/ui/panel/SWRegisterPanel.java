package yi_java3st_1team.productmanagement.ui.panel;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class SWRegisterPanel extends JPanel {

	private JLabel lblSW;
	private JLabel lblPNo;
	private JLabel lblPCate;
	private JLabel lblPName;
	private JLabel lblPCost;
	private JLabel lblPPrice;
	private JLabel lblPSName;
	private JLabel lblPQty;
	private JLabel lblPDate;
	private JTextField tfPNo;
	private JTextField tfPName;
	private JTextField tfPCost;
	private JTextField tfPPrice;
	private JTextField tfPSName;
	private JTextField tfPQty;
	private JTextField tfPDate;
	private JButton btnAdd;
	private JButton btnUpdate;
	private JButton btnDel;
	private JButton btnGoMain;
	private JButton btnDplCheck;
	private JButton btnPSCheck;
	private JComboBox cmbCate;
	private JLabel label;
	public SWRegisterPanel() {

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
		
		lblSW = new JLabel("소프트웨어 제품등록");
		lblSW.setForeground(Color.BLACK);
		lblSW.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		lblSW.setHorizontalAlignment(SwingConstants.CENTER);
		lblSW.setBounds(0, 52, 635, 54);
		panel.add(lblSW);
		
		lblPNo = new JLabel("품 목 번 호");
		lblPNo.setForeground(Color.BLACK);
		lblPNo.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPNo.setBounds(66, 140, 120, 30);
		panel.add(lblPNo);
		
		lblPCate = new JLabel("분  류  명");
		lblPCate.setForeground(Color.BLACK);
		lblPCate.setHorizontalAlignment(SwingConstants.CENTER);
		lblPCate.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPCate.setBounds(66, 190, 120, 30);
		panel.add(lblPCate);
		
		lblPName = new JLabel("품  목  명");
		lblPName.setForeground(Color.BLACK);
		lblPName.setHorizontalAlignment(SwingConstants.CENTER);
		lblPName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPName.setBounds(66, 240, 120, 30);
		panel.add(lblPName);
		
		lblPCost = new JLabel("공 급 가 격");
		lblPCost.setForeground(Color.BLACK);
		lblPCost.setHorizontalAlignment(SwingConstants.CENTER);
		lblPCost.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPCost.setBounds(66, 290, 120, 30);
		panel.add(lblPCost);
		
		lblPPrice = new JLabel("판 매 가 격");
		lblPPrice.setForeground(Color.BLACK);
		lblPPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblPPrice.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPPrice.setBounds(66, 340, 120, 30);
		panel.add(lblPPrice);
		
		lblPSName = new JLabel("공급회사명");
		lblPSName.setForeground(Color.BLACK);
		lblPSName.setHorizontalAlignment(SwingConstants.CENTER);
		lblPSName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPSName.setBounds(66, 390, 120, 30);
		panel.add(lblPSName);
		
		lblPQty = new JLabel("최초재고수량");
		lblPQty.setForeground(Color.BLACK);
		lblPQty.setHorizontalAlignment(SwingConstants.CENTER);
		lblPQty.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPQty.setBounds(66, 440, 120, 30);
		panel.add(lblPQty);
		
		lblPDate = new JLabel("최초등록일자");
		lblPDate.setForeground(Color.BLACK);
		lblPDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblPDate.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPDate.setBounds(66, 490, 120, 30);
		panel.add(lblPDate);
		
		tfPNo = new JTextField();
		tfPNo.setBounds(230, 140, 200, 30);
		panel.add(tfPNo);
		tfPNo.setColumns(10);
		
		tfPName = new JTextField();
		tfPName.setColumns(10);
		tfPName.setBounds(230, 240, 200, 30);
		panel.add(tfPName);
		
		tfPCost = new JTextField();
		tfPCost.setColumns(10);
		tfPCost.setBounds(230, 290, 200, 30);
		panel.add(tfPCost);
		
		tfPPrice = new JTextField();
		tfPPrice.setColumns(10);
		tfPPrice.setBounds(230, 340, 200, 30);
		panel.add(tfPPrice);
		
		tfPSName = new JTextField();
		tfPSName.setColumns(10);
		tfPSName.setBounds(230, 390, 200, 30);
		panel.add(tfPSName);
		
		tfPQty = new JTextField();
		tfPQty.setColumns(10);
		tfPQty.setBounds(230, 440, 200, 30);
		panel.add(tfPQty);
		
		tfPDate = new JTextField();
		tfPDate.setColumns(10);
		tfPDate.setBounds(230, 490, 200, 30);
		panel.add(tfPDate);
		
		btnAdd = new JButton("등 록");
		btnAdd.setFocusable(false);
		btnAdd.setBackground(new Color(135, 206, 250));
		btnAdd.setForeground(new Color(0, 102, 204));
		btnAdd.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnAdd.setBounds(66, 580, 100, 30);
		panel.add(btnAdd);
		
		btnUpdate = new JButton("수 정");
		btnUpdate.setFocusable(false);
		btnUpdate.setBackground(new Color(135, 206, 250));
		btnUpdate.setForeground(new Color(0, 102, 204));
		btnUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnUpdate.setBounds(198, 580, 100, 30);
		panel.add(btnUpdate);
		
		btnDel = new JButton("삭 제");
		btnDel.setFocusable(false);
		btnDel.setBackground(new Color(135, 206, 250));
		btnDel.setForeground(new Color(0, 102, 204));
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
		btnDplCheck.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnDplCheck.setForeground(Color.WHITE);
		btnDplCheck.setBackground(new Color(240, 128, 128));
		btnDplCheck.setBounds(465, 210, 100, 30);
		panel.add(btnDplCheck);
		
		btnPSCheck = new JButton("조 회");
		btnPSCheck.setFocusable(false);
		btnPSCheck.setBackground(SystemColor.activeCaptionBorder);
		btnPSCheck.setForeground(Color.WHITE);
		btnPSCheck.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnPSCheck.setBounds(465, 390, 100, 30);
		panel.add(btnPSCheck);
		
		cmbCate = new JComboBox();
		cmbCate.setBounds(230, 190, 200, 30);
		panel.add(cmbCate);
		
		label = new JLabel("");
		label.setOpaque(true);
		label.setBackground(Color.WHITE);
		label.setBounds(54, 116, 525, 430);
		panel.add(label);
		
	}
}
