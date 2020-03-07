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
import yi_java3st_1team.productmanagement.dto.Product;
import yi_java3st_1team.productmanagement.dto.SupplierOrder;
import yi_java3st_1team.productmanagement.dto.SupplierPurchase;

@SuppressWarnings("serial")
public class SPSORegisterPanel extends AbsItemPanel<SupplierPurchase> {
	private JLabel lblSPSONo;
	private JLabel lblSPSOPName;
	private JLabel lblSPSOPrice;
	private JLabel lblSPSOSName;
	private JLabel lblSPSOPQty;
	private JLabel lblSPSODate;
	private JTextField tfSPSONo;
	private JTextField tfSPSOPName;
	private JTextField tfSPSOCost;
	private JTextField tfSPSOSName;
	private JTextField tfSPSOPQty;
	private JDateChooser tfSPSODate;
	private JLabel label;

	public SPSORegisterPanel() {
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
		
		lblSPSOSName = new JLabel("공급회사명");
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
		tfSPSONo.setBounds(176, 37, 200, 30);
		panel.add(tfSPSONo);
		tfSPSONo.setColumns(10);
		
		tfSPSOPName = new JTextField();
		tfSPSOPName.setColumns(10);
		tfSPSOPName.setBounds(176, 104, 200, 30);
		panel.add(tfSPSOPName);
		
		tfSPSOCost = new JTextField();
		tfSPSOCost.setColumns(10);
		tfSPSOCost.setBounds(176, 238, 200, 30);
		panel.add(tfSPSOCost);
		
		tfSPSOSName = new JTextField();
		tfSPSOSName.setColumns(10);
		tfSPSOSName.setBounds(176, 171, 200, 30);
		panel.add(tfSPSOSName);
		
		tfSPSOPQty = new JTextField();
		tfSPSOPQty.setColumns(10);
		tfSPSOPQty.setBounds(176, 305, 200, 30);
		panel.add(tfSPSOPQty);
		
		tfSPSODate = new JDateChooser(new Date(), "yyyy-MM-dd");
		tfSPSODate.setBounds(176, 372, 200, 30);
		panel.add(tfSPSODate);
		
		label = new JLabel("");
		label.setOpaque(true);
		label.setBackground(Color.WHITE);
		label.setBounds(0, 0, 400, 440);
		panel.add(label);
		
	}

	@Override
	public SupplierPurchase getItem() {
		int spNo = Integer.parseInt(tfSPSONo.getText().substring(1));
		Product spPname = new Product(tfSPSOPName.getText().trim(), Integer.parseInt(tfSPSOCost.getText().trim()));
		Supplier spSname = new Supplier(tfSPSOSName.getText().trim());
		Product spPcost = new Product(tfSPSOPName.getText().trim(), Integer.parseInt(tfSPSOCost.getText().trim()));
		int spQty = Integer.parseInt(tfSPSOPQty.getText().trim());
		Date spDate = tfSPSODate.getDate();
		return new SupplierPurchase(spNo, spPname, spSname, spPcost, spQty, spDate);
	}
	
	public SupplierOrder getSOItem() {
		int soNo = Integer.parseInt(tfSPSONo.getText().substring(1));
		Product soPname = new Product(tfSPSOPName.getText().trim(), Integer.parseInt(tfSPSOCost.getText().trim()));
		Supplier soSname = new Supplier(tfSPSOSName.getText().trim());
		Product soPcost = new Product(tfSPSOPName.getText().trim(), Integer.parseInt(tfSPSOCost.getText().trim()));
		int soQty = Integer.parseInt(tfSPSOPQty.getText().trim());
		Date soDate = tfSPSODate.getDate();
		return new SupplierOrder(soNo, soPname, soSname, soPcost, soQty, soDate);
	}

	@Override
	public void setItem(SupplierPurchase item) {
		tfSPSONo.setText(String.format("SC%04d", item.getSpNo()));
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
