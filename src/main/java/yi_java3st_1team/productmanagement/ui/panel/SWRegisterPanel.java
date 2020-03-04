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
	private JComboBox cmbCate;
	private JTextField tfImgSearch;
	public SWRegisterPanel() {

		initialize();
	}
	private void initialize() {
		setBounds(new Rectangle(0, 0, 635, 700));
		setLayout(null);
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setBounds(new Rectangle(0, 0, 400, 440));
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setLayout(null);
		
		lblPNo = new JLabel("품 목 번 호");
		lblPNo.setForeground(Color.BLACK);
		lblPNo.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPNo.setBounds(12, 4, 120, 30);
		panel.add(lblPNo);
		
		lblPCate = new JLabel("분  류  명");
		lblPCate.setForeground(Color.BLACK);
		lblPCate.setHorizontalAlignment(SwingConstants.CENTER);
		lblPCate.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPCate.setBounds(12, 54, 120, 30);
		panel.add(lblPCate);
		
		lblPName = new JLabel("품  목  명");
		lblPName.setForeground(Color.BLACK);
		lblPName.setHorizontalAlignment(SwingConstants.CENTER);
		lblPName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPName.setBounds(12, 104, 120, 30);
		panel.add(lblPName);
		
		lblPCost = new JLabel("공 급 가 격");
		lblPCost.setForeground(Color.BLACK);
		lblPCost.setHorizontalAlignment(SwingConstants.CENTER);
		lblPCost.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPCost.setBounds(12, 154, 120, 30);
		panel.add(lblPCost);
		
		lblPPrice = new JLabel("판 매 가 격");
		lblPPrice.setForeground(Color.BLACK);
		lblPPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblPPrice.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPPrice.setBounds(12, 204, 120, 30);
		panel.add(lblPPrice);
		
		lblPSName = new JLabel("공급 회사명");
		lblPSName.setForeground(Color.BLACK);
		lblPSName.setHorizontalAlignment(SwingConstants.CENTER);
		lblPSName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPSName.setBounds(12, 254, 120, 30);
		panel.add(lblPSName);
		
		lblPQty = new JLabel("최초재고수량");
		lblPQty.setForeground(Color.BLACK);
		lblPQty.setHorizontalAlignment(SwingConstants.CENTER);
		lblPQty.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPQty.setBounds(12, 304, 120, 30);
		panel.add(lblPQty);
		
		lblPDate = new JLabel("최초등록일자");
		lblPDate.setForeground(Color.BLACK);
		lblPDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblPDate.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPDate.setBounds(12, 354, 120, 30);
		panel.add(lblPDate);
		
		tfPNo = new JTextField();
		tfPNo.setBounds(176, 4, 200, 30);
		panel.add(tfPNo);
		tfPNo.setColumns(10);
		
		tfPName = new JTextField();
		tfPName.setColumns(10);
		tfPName.setBounds(176, 104, 200, 30);
		panel.add(tfPName);
		
		tfPCost = new JTextField();
		tfPCost.setColumns(10);
		tfPCost.setBounds(176, 154, 200, 30);
		panel.add(tfPCost);
		
		tfPPrice = new JTextField();
		tfPPrice.setColumns(10);
		tfPPrice.setBounds(176, 204, 200, 30);
		panel.add(tfPPrice);
		
		tfPSName = new JTextField();
		tfPSName.setColumns(10);
		tfPSName.setBounds(176, 254, 200, 30);
		panel.add(tfPSName);
		
		tfPQty = new JTextField();
		tfPQty.setColumns(10);
		tfPQty.setBounds(176, 304, 200, 30);
		panel.add(tfPQty);
		
		tfPDate = new JTextField();
		tfPDate.setColumns(10);
		tfPDate.setBounds(176, 354, 200, 30);
		panel.add(tfPDate);
		
		cmbCate = new JComboBox();
		cmbCate.setBounds(176, 54, 200, 30);
		panel.add(cmbCate);
		
		JLabel lblImgSearch = new JLabel("제품 이미지");
		lblImgSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgSearch.setForeground(Color.BLACK);
		lblImgSearch.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblImgSearch.setBounds(12, 404, 120, 30);
		panel.add(lblImgSearch);
		
		tfImgSearch = new JTextField();
		tfImgSearch.setColumns(10);
		tfImgSearch.setBounds(176, 404, 200, 30);
		panel.add(tfImgSearch);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 400, 440);
		panel.add(lblNewLabel);
		
	}
}
