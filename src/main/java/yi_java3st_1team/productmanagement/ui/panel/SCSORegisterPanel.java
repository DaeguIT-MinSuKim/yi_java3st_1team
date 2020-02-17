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
		lblSCSO.setFont(new Font("굴림", Font.BOLD, 36));
		lblSCSO.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCSO.setBounds(101, 52, 407, 54);
		panel.add(lblSCSO);
		
		lblSCSONo = new JLabel("번        호");
		lblSCSONo.setFont(new Font("굴림", Font.BOLD, 18));
		lblSCSONo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCSONo.setBounds(66, 140, 120, 30);
		panel.add(lblSCSONo);
		
		lblSCSOPName = new JLabel("품   목   명");
		lblSCSOPName.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCSOPName.setFont(new Font("굴림", Font.BOLD, 18));
		lblSCSOPName.setBounds(66, 210, 120, 30);
		panel.add(lblSCSOPName);
		
		lblSCSOPrice = new JLabel("가        격");
		lblSCSOPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCSOPrice.setFont(new Font("굴림", Font.BOLD, 18));
		lblSCSOPrice.setBounds(66, 350, 120, 30);
		panel.add(lblSCSOPrice);
		
		lblSCSOSName = new JLabel("공급회사명");
		lblSCSOSName.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCSOSName.setFont(new Font("굴림", Font.BOLD, 18));
		lblSCSOSName.setBounds(66, 280, 120, 30);
		panel.add(lblSCSOSName);
		
		lblSCSOPQty = new JLabel("수        량");
		lblSCSOPQty.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCSOPQty.setFont(new Font("굴림", Font.BOLD, 18));
		lblSCSOPQty.setBounds(66, 420, 120, 30);
		panel.add(lblSCSOPQty);
		
		lblSCSODate = new JLabel("등 록 일 자");
		lblSCSODate.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCSODate.setFont(new Font("굴림", Font.BOLD, 18));
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
		btnAdd.setBounds(20, 580, 130, 30);
		panel.add(btnAdd);
		
		btnUpdate = new JButton("수 정");
		btnUpdate.setBounds(170, 580, 130, 30);
		panel.add(btnUpdate);
		
		btnDel = new JButton("삭 제");
		btnDel.setBounds(320, 580, 130, 30);
		panel.add(btnDel);
		
		btnGoMain = new JButton("메 인 화 면");
		btnGoMain.setBounds(470, 580, 130, 30);
		panel.add(btnGoMain);
		
	}

}
