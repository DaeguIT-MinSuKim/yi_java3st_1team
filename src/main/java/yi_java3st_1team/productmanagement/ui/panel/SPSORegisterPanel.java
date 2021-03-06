package yi_java3st_1team.productmanagement.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

import yi_java3st_1team.clientmanagement.dto.Supplier;
import yi_java3st_1team.clientmanagement.ui.panel.AbsItemPanel;
import yi_java3st_1team.exception.InvalidCheckException;
import yi_java3st_1team.main.ui.panel.JTextFieldHintUI;
import yi_java3st_1team.productmanagement.dto.Product;
import yi_java3st_1team.productmanagement.dto.SupplierOrder;
import yi_java3st_1team.productmanagement.dto.SupplierPurchase;
import yi_java3st_1team.productmanagement.ui.service.SOUIService;
import yi_java3st_1team.productmanagement.ui.service.SPUIService;

@SuppressWarnings("serial")
public class SPSORegisterPanel extends AbsItemPanel<SupplierPurchase> {
	private JLabel lblSPSONo;
	private JLabel lblSPSOPName;
	private JLabel lblSPSOPrice;
	private JLabel lblSPSOSName;
	private JLabel lblSPSOPQty;
	private JLabel lblSPSODate;
	private JTextField tfSPSONo;
	public JTextField tfSPSOPName;
	public JTextField tfSPSOCost;
	public JTextField tfSPSOSName;
	private JTextField tfSPSOPQty;
	private JDateChooser tfSPSODate;
	private JLabel label;
	private SPUIService service1;
	private SOUIService service2;
	private JLabel notNull1;
	private JLabel notNull2;
	private JLabel notNull3;
	private JLabel notNull4;
	private JLabel notNull5;
	private JLabel notNull6;

	public SPSORegisterPanel() {
		service1 = new SPUIService();
		service2 = new SOUIService();
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
		
		lblSPSONo = new JLabel("번        호");
		lblSPSONo.setForeground(Color.BLACK);
		lblSPSONo.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSPSONo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSPSONo.setBounds(12, 37, 120, 30);
		panel.add(lblSPSONo);
		
		lblSPSOPName = new JLabel("품   목   명");
		lblSPSOPName.setForeground(Color.BLACK);
		lblSPSOPName.setHorizontalAlignment(SwingConstants.CENTER);
		lblSPSOPName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSPSOPName.setBounds(12, 104, 120, 30);
		panel.add(lblSPSOPName);
		
		lblSPSOPrice = new JLabel("가        격");
		lblSPSOPrice.setForeground(Color.BLACK);
		lblSPSOPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblSPSOPrice.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSPSOPrice.setBounds(12, 238, 120, 30);
		panel.add(lblSPSOPrice);
		
		lblSPSOSName = new JLabel("공급 회사명");
		lblSPSOSName.setForeground(Color.BLACK);
		lblSPSOSName.setHorizontalAlignment(SwingConstants.CENTER);
		lblSPSOSName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSPSOSName.setBounds(12, 171, 120, 30);
		panel.add(lblSPSOSName);
		
		lblSPSOPQty = new JLabel("수        량");
		lblSPSOPQty.setForeground(Color.BLACK);
		lblSPSOPQty.setHorizontalAlignment(SwingConstants.CENTER);
		lblSPSOPQty.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSPSOPQty.setBounds(12, 305, 120, 30);
		panel.add(lblSPSOPQty);
		
		lblSPSODate = new JLabel("등 록 일 자");
		lblSPSODate.setForeground(Color.BLACK);
		lblSPSODate.setHorizontalAlignment(SwingConstants.CENTER);
		lblSPSODate.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSPSODate.setBounds(12, 372, 120, 30);
		panel.add(lblSPSODate);
		
		tfSPSONo = new JTextField();
		tfSPSONo.setForeground(new Color(0, 0, 128));
		tfSPSONo.setFont(new Font("굴림", Font.BOLD, 12));
		tfSPSONo.setEditable(false);
		tfSPSONo.setBounds(176, 37, 200, 30);
		panel.add(tfSPSONo);
		tfSPSONo.setColumns(10);
		
		tfSPSOPName = new JTextField();
		tfSPSOPName.setForeground(new Color(51, 102, 0));
		tfSPSOPName.setFont(new Font("굴림", Font.BOLD, 12));
		tfSPSOPName.setColumns(10);
		tfSPSOPName.setBounds(176, 104, 200, 30);
		panel.add(tfSPSOPName);
		tfSPSOPName.setUI(new JTextFieldHintUI(">> 품목명 조회", Color.gray));
		
		tfSPSOCost = new JTextField();
		tfSPSOCost.setForeground(Color.BLACK);
		tfSPSOCost.setFont(new Font("굴림", Font.BOLD, 12));
		tfSPSOCost.setEditable(false);
		tfSPSOCost.setColumns(10);
		tfSPSOCost.setBounds(176, 238, 200, 30);
		panel.add(tfSPSOCost);
		
		tfSPSOSName = new JTextField();
		tfSPSOSName.setForeground(Color.BLACK);
		tfSPSOSName.setFont(new Font("굴림", Font.BOLD, 12));
		tfSPSOSName.setEditable(false);
		tfSPSOSName.setColumns(10);
		tfSPSOSName.setBounds(176, 171, 200, 30);
		panel.add(tfSPSOSName);
		
		tfSPSOPQty = new JTextField();
		tfSPSOPQty.setForeground(Color.BLACK);
		tfSPSOPQty.setFont(new Font("굴림", Font.BOLD, 12));
		tfSPSOPQty.setColumns(10);
		tfSPSOPQty.setBounds(176, 305, 200, 30);
		panel.add(tfSPSOPQty);
		
		tfSPSODate = new JDateChooser(new Date(), "yyyy-MM-dd");
		tfSPSODate.setBounds(176, 372, 200, 30);
		panel.add(tfSPSODate);
		
		notNull1 = new JLabel("*");
		notNull1.setForeground(Color.RED);
		notNull1.setFont(new Font("굴림", Font.BOLD, 26));
		notNull1.setBounds(121, 42, 14, 15);
		panel.add(notNull1);
		
		notNull2 = new JLabel("*");
		notNull2.setForeground(Color.RED);
		notNull2.setFont(new Font("굴림", Font.BOLD, 26));
		notNull2.setBounds(121, 108, 14, 15);
		panel.add(notNull2);
		
		notNull3 = new JLabel("*");
		notNull3.setForeground(Color.RED);
		notNull3.setFont(new Font("굴림", Font.BOLD, 26));
		notNull3.setBounds(118, 176, 14, 15);
		panel.add(notNull3);
		
		notNull4 = new JLabel("*");
		notNull4.setForeground(Color.RED);
		notNull4.setFont(new Font("굴림", Font.BOLD, 26));
		notNull4.setBounds(121, 242, 14, 15);
		panel.add(notNull4);
		
		notNull5 = new JLabel("*");
		notNull5.setForeground(Color.RED);
		notNull5.setFont(new Font("굴림", Font.BOLD, 26));
		notNull5.setBounds(121, 310, 14, 15);
		panel.add(notNull5);
		
		notNull6 = new JLabel("*");
		notNull6.setForeground(Color.RED);
		notNull6.setFont(new Font("굴림", Font.BOLD, 26));
		notNull6.setBounds(118, 376, 14, 15);
		panel.add(notNull6);
		
		label = new JLabel("");
		label.setOpaque(true);
		label.setBackground(Color.WHITE);
		label.setBounds(0, 0, 400, 440);
		panel.add(label);
		
	}

	public JTextField getTfSPSOPName() {
		return tfSPSOPName;
	}

	public JTextField getTfSPSOCost() {
		return tfSPSOCost;
	}

	public void setNum1(SupplierPurchase item) {
		tfSPSONo.setText(String.format("SP%04d", item.getSpNo()+1));
	}
	
	public void setNum2(SupplierOrder item) {
		tfSPSONo.setText(String.format("SO%04d", item.getSoNo()+1));
	}
	
	@Override
	public SupplierPurchase getItem() {
		int spNo = Integer.parseInt(tfSPSONo.getText().substring(2));
		Product spPname = new Product(tfSPSOPName.getText().trim(), Integer.parseInt(tfSPSOCost.getText().trim()));
		Product spPno = new Product(service1.selectSupplierPurchasePno(spPname));
		Supplier spSname = new Supplier(tfSPSOSName.getText().trim());
		Product spPcost = new Product(tfSPSOPName.getText().trim(), Integer.parseInt(tfSPSOCost.getText().trim()));
		int spQty = Integer.parseInt(tfSPSOPQty.getText().trim());
		Date spDate = tfSPSODate.getDate();
		return new SupplierPurchase(spNo, spPno, spPname, spSname, spPcost, spQty, spDate);
	}
	
	public SupplierOrder getSOItem() {
		int soNo = Integer.parseInt(tfSPSONo.getText().substring(2));
		Product soPname = new Product(tfSPSOPName.getText().trim(), Integer.parseInt(tfSPSOCost.getText().trim()));
		Product soPno = new Product(service2.selectSupplierOrderPno(soPname));
		Supplier soSname = new Supplier(tfSPSOSName.getText().trim());
		Product soPcost = new Product(tfSPSOPName.getText().trim(), Integer.parseInt(tfSPSOCost.getText().trim()));
		int soQty = Integer.parseInt(tfSPSOPQty.getText().trim());
		Date soDate = tfSPSODate.getDate();
		return new SupplierOrder(soNo, soPno, soPname, soSname, soPcost, soQty, soDate);
	}

	@Override
	public void setItem(SupplierPurchase item) {
		tfSPSONo.setText(String.format("SP%04d", item.getSpNo()));
		tfSPSOPName.setText(item.getSpPname().getpName());
		tfSPSOSName.setText(item.getSpSname().getsName());
		tfSPSOCost.setText(String.format("%s", item.getSpPcost().getpCost()));
		tfSPSOPQty.setText(String.format("%s", item.getSpQty()));
		tfSPSODate.setDate(item.getSpDate());
	}
	
	public void setSOItem(SupplierOrder item) {
		tfSPSONo.setText(String.format("SO%04d", item.getSoNo()));
		tfSPSOPName.setText(item.getSoPname().getpName());
		tfSPSOSName.setText(item.getSoSname().getsName());
		tfSPSOCost.setText(String.format("%s", item.getSoPcost().getpCost()));
		tfSPSOPQty.setText(String.format("%s", item.getSoQty()));
		tfSPSODate.setDate(item.getSoDate());
	}
	
	@Override
	public void clearTf() {
		tfSPSONo.setText("");
		tfSPSOPName.setText("");
		tfSPSOSName.setText("");
		tfSPSOCost.setText("");
		tfSPSOPQty.setText("");
		tfSPSODate.setDate(new Date());
	}
	
	public void clearSOTf() {
		tfSPSONo.setText("");
		tfSPSOPName.setText("");
		tfSPSOSName.setText("");
		tfSPSOCost.setText("");
		tfSPSOPQty.setText("");
		tfSPSODate.setDate(new Date());
	}

	@Override
	public void validCheck() {
		if(tfSPSONo.getText().equals("")||tfSPSOPName.getText().equals("")||tfSPSOSName.getText().equals("")
				||tfSPSOCost.getText().equals("")||tfSPSOPQty.getText().equals("")) {
			throw new InvalidCheckException();
		}
	}
	
	public void SOValidCheck() {
		if(tfSPSONo.getText().equals("")||tfSPSOPName.getText().equals("")||tfSPSOSName.getText().equals("")
				||tfSPSOCost.getText().equals("")||tfSPSOPQty.getText().equals("")) {
			throw new InvalidCheckException();
		}
	}

}
