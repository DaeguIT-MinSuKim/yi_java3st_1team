package yi_java3st_1team.productmanagement.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

import yi_java3st_1team.clientmanagement.dto.Client;
import yi_java3st_1team.clientmanagement.ui.panel.AbsItemPanel;
import yi_java3st_1team.clientmanagement.ui.service.ClientUIService;
import yi_java3st_1team.ordermanagement.dto.Order;
import yi_java3st_1team.ordermanagement.ui.service.OrderUIService;
import yi_java3st_1team.productmanagement.dto.ClientDelivery;
import yi_java3st_1team.productmanagement.dto.Product;
import yi_java3st_1team.productmanagement.ui.service.CDUIService;
import yi_java3st_1team.productmanagement.ui.service.SWUIService;

@SuppressWarnings("serial")
public class CDRegisterPanel extends AbsItemPanel<ClientDelivery> implements ItemListener {
	
	private JLabel lblCD;
	private JLabel lblCDNo;
	private JLabel lblCName;
	private JLabel lblCDQty;
	private JLabel lblCDPName;
	private JLabel lblCDDate;
	private JTextField tfPCDNo;
	public JTextField tfSCName;
	private JTextField tfSCDQty;
	private JButton btnAdd;
	private JButton btnUpdate;
	private JButton btnDel;
	public JButton btnGoMain;

	private CDUIService cdService;
	private JDateChooser tfCDDate;
	private SWUIService pService;
	private ClientUIService cService;
	private OrderUIService oService;
	private JTextField tfCDPName;
	private JLabel notNull1;
	private JLabel notNull2;
	private JLabel notNull3;
	private JLabel notNull4;
	private JLabel notNull5;
	
	public CDRegisterPanel(){
		cService = new ClientUIService();
		cdService = new CDUIService();
		pService = new SWUIService();
		oService = new OrderUIService();
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
		tfPCDNo.setFont(new Font("굴림", Font.BOLD, 12));
		tfPCDNo.setForeground(new Color(0, 0, 128));
		tfPCDNo.setBounds(176, 37, 200, 30);
		panel.add(tfPCDNo);
		tfPCDNo.setColumns(10);
		tfPCDNo.setEditable(false);
		
				
				tfSCName = new JTextField();
				tfSCName.setForeground(new Color(153, 0, 0));
				tfSCName.setFont(new Font("굴림", Font.BOLD, 12));
				tfSCName.setColumns(10);
				tfSCName.setBounds(176, 120, 200, 30);
				panel.add(tfSCName);
				tfSCName.setEditable(false);
				
				tfSCDQty = new JTextField();
				tfSCDQty.setForeground(Color.BLACK);
				tfSCDQty.setFont(new Font("굴림", Font.BOLD, 12));
				tfSCDQty.setColumns(10);
				tfSCDQty.setBounds(176, 286, 200, 30);
				panel.add(tfSCDQty);
				tfSCDQty.setEditable(false);
				
				tfCDDate = new JDateChooser(new Date(), "yyyy-MM-dd");
				tfCDDate.setBounds(176, 373, 200, 30);
				panel.add(tfCDDate);
				
				tfCDPName = new JTextField();
				tfCDPName.setForeground(new Color(51, 102, 0));
				tfCDPName.setFont(new Font("굴림", Font.BOLD, 12));
				tfCDPName.setBounds(176, 203, 200, 30);
				panel.add(tfCDPName);
				tfCDPName.setColumns(10);
				tfCDPName.setEditable(false);
				
				notNull1 = new JLabel("*");
				notNull1.setForeground(Color.RED);
				notNull1.setFont(new Font("굴림", Font.BOLD, 26));
				notNull1.setBounds(118, 41, 14, 15);
				panel.add(notNull1);
				
				notNull2 = new JLabel("*");
				notNull2.setForeground(Color.RED);
				notNull2.setFont(new Font("굴림", Font.BOLD, 26));
				notNull2.setBounds(118, 125, 14, 15);
				panel.add(notNull2);
				
				notNull3 = new JLabel("*");
				notNull3.setForeground(Color.RED);
				notNull3.setFont(new Font("굴림", Font.BOLD, 26));
				notNull3.setBounds(114, 207, 14, 15);
				panel.add(notNull3);
				
				notNull4 = new JLabel("*");
				notNull4.setForeground(Color.RED);
				notNull4.setFont(new Font("굴림", Font.BOLD, 26));
				notNull4.setBounds(118, 290, 14, 15);
				panel.add(notNull4);
				
				notNull5 = new JLabel("*");
				notNull5.setForeground(Color.RED);
				notNull5.setFont(new Font("굴림", Font.BOLD, 26));
				notNull5.setBounds(118, 377, 14, 15);
				panel.add(notNull5);
				JLabel label = new JLabel("");
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
		int cdNo = Integer.parseInt(tfPCDNo.getText().substring(1));
		
		Order order = new Order();
		order.setoQty(Integer.parseInt(tfSCDQty.getText().trim()));
		Order cdSno = new Order();
		
		Client client =  new Client();
		client.setcName(tfSCName.getText().trim());
		Client cName = new Client(cService.selectOrderCno(client));
		
		Product product = new Product();
		product.setpName(tfCDPName.getText().trim());
		Product pName = new Product(pService.selectOrderPno(product));
		
		Date cdDate =  tfCDDate.getDate();
		return new ClientDelivery(cdNo, cdSno, cName, pName, cdDate);
	}

	@Override
	public void setItem(ClientDelivery item) {
		tfPCDNo.setText(String.format("CD%04d", item.getCdNo())); // ex. CD0004
		tfSCName.setText(item.getcName().getcName()); // ex. 제임스포워딩
		tfCDPName.setText(item.getpName().getpName()); // ex. dropbox business 
		tfSCDQty.setText(String.format("%s", item.getCdSno().getoQty())); // ex. 46
		tfCDDate.setDate(item.getCdDate());	// ex. 	2019-02-02
	}

	@Override
	public void clearTf() {
		tfPCDNo.setText("");
		tfSCDQty.setText("");
		tfSCName.setText("");
		tfCDPName.setText("");
		tfCDDate.setDate(new Date());
		
	}

	@Override
	public void validCheck() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}


}
