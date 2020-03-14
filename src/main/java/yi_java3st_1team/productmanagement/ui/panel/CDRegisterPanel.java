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

import com.toedter.calendar.JDateChooser;

import yi_java3st_1team.clientmanagement.ui.panel.AbsItemPanel;
import yi_java3st_1team.productmanagement.dto.ClientDelivery;
import yi_java3st_1team.productmanagement.ui.service.CDUIService;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CDRegisterPanel extends AbsItemPanel<ClientDelivery>{
	
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
	private JButton btnAdd;
	private JButton btnUpdate;
	private JButton btnDel;
	public JButton btnGoMain;
	private JLabel label;

	private CDUIService cdService;
	private JDateChooser tfCDDate;
	
	public CDRegisterPanel(){
		cdService = new CDUIService();
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
		

		
		lblCDNo = new JLabel("출 고 번 호");
		lblCDNo.setForeground(Color.BLACK);
		lblCDNo.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblCDNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCDNo.setBounds(12, 37, 120, 30);
		panel.add(lblCDNo);
		
		lblCName = new JLabel("고객 상호명");
		lblCName.setForeground(Color.BLACK);
		lblCName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblCName.setBounds(12, 120, 120, 30);
		panel.add(lblCName);
		
		lblCDQty = new JLabel("출 고 수 량");
		lblCDQty.setForeground(Color.BLACK);
		lblCDQty.setHorizontalAlignment(SwingConstants.CENTER);
		lblCDQty.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblCDQty.setBounds(12, 286, 120, 30);
		panel.add(lblCDQty);
		
		lblCDPName = new JLabel("품  목  명");
		lblCDPName.setForeground(Color.BLACK);
		lblCDPName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCDPName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblCDPName.setBounds(12, 203, 120, 30);
		panel.add(lblCDPName);
		
		lblCDDate = new JLabel("출 고 일 자");
		lblCDDate.setForeground(Color.BLACK);
		lblCDDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblCDDate.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblCDDate.setBounds(12, 373, 120, 30);
		panel.add(lblCDDate);
		
		tfPCDNo = new JTextField();
		tfPCDNo.setBounds(176, 37, 200, 30);
		panel.add(tfPCDNo);
		tfPCDNo.setColumns(10);
		tfPCDNo.setEditable(false);
		
				
				tfSCName = new JTextField();
				tfSCName.setColumns(10);
				tfSCName.setBounds(176, 120, 200, 30);
				panel.add(tfSCName);
				
				tfSCDQty = new JTextField();
				tfSCDQty.setColumns(10);
				tfSCDQty.setBounds(176, 286, 200, 30);
				panel.add(tfSCDQty);
				
				tfCDDate = new JDateChooser(new Date(), "yyyy-MM-dd");
				tfCDDate.setBounds(176, 373, 200, 30);
				panel.add(tfCDDate);
				
				tfSCDPName = new JTextField();
				tfSCDPName.setColumns(10);
				tfSCDPName.setBounds(176, 203, 200, 30);
				panel.add(tfSCDPName);
				

				
				label = new JLabel("");
				label.setOpaque(true);
				label.setBackground(Color.WHITE);
				label.setBounds(0, 0, 400, 440);
				panel.add(label);
	}
	
	public void setCDNum (ClientDelivery item) {
		tfPCDNo.setText(String.format("CD%04d", item.getCdNo()+1));
	}

	@Override
	public ClientDelivery getItem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setItem(ClientDelivery item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearTf() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validCheck() {
		// TODO Auto-generated method stub
		
	}

}
