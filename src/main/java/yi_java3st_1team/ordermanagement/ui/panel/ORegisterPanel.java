package yi_java3st_1team.ordermanagement.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

import yi_java3st_1team.clientmanagement.dto.Client;
import yi_java3st_1team.clientmanagement.ui.panel.AbsItemPanel;
import yi_java3st_1team.clientmanagement.ui.service.ClientUIService;
import yi_java3st_1team.exception.InvalidCheckException;
import yi_java3st_1team.main.dto.Employee;
import yi_java3st_1team.ordermanagement.dto.Order;
import yi_java3st_1team.productmanagement.dto.Product;
import yi_java3st_1team.productmanagement.ui.service.SWUIService;

@SuppressWarnings("serial")
public class ORegisterPanel extends AbsItemPanel<Order> {
	private JLabel lblONo;
	private JLabel lblODate;
	private JLabel lblOCName;
	private JLabel lblOPName;
	private JLabel lblOQty;
	private JLabel lblOWant;
	private JTextField tfONo;
	private JDateChooser tfODate;
	public JTextField tfOCName;
	public JTextField tfOPName;
	public JTextField tfOQty;
	private JLabel label;
	private JTextArea taOWant;
	private ClientUIService cService;
	private SWUIService pService;
	
	public ORegisterPanel() {
		cService = new ClientUIService();
		pService = new SWUIService();
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
		
		lblONo = new JLabel("주 문 번 호");
		lblONo.setForeground(Color.BLACK);
		lblONo.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblONo.setHorizontalAlignment(SwingConstants.CENTER);
		lblONo.setBounds(20, 20, 120, 30);
		panel.add(lblONo);
		
		lblODate = new JLabel("주 문 일 자");
		lblODate.setForeground(Color.BLACK);
		lblODate.setHorizontalAlignment(SwingConstants.CENTER);
		lblODate.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblODate.setBounds(20, 70, 120, 30);
		panel.add(lblODate);
		
		lblOCName = new JLabel("고객상호명");
		lblOCName.setForeground(Color.BLACK);
		lblOCName.setHorizontalAlignment(SwingConstants.CENTER);
		lblOCName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblOCName.setBounds(20, 120, 120, 30);
		panel.add(lblOCName);
		
		lblOPName = new JLabel("품   목   명");
		lblOPName.setForeground(Color.BLACK);
		lblOPName.setHorizontalAlignment(SwingConstants.CENTER);
		lblOPName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblOPName.setBounds(20, 170, 120, 30);
		panel.add(lblOPName);
		
		lblOQty = new JLabel("주 문 수 량");
		lblOQty.setForeground(Color.BLACK);
		lblOQty.setHorizontalAlignment(SwingConstants.CENTER);
		lblOQty.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblOQty.setBounds(20, 220, 120, 30);
		panel.add(lblOQty);
		
		lblOWant = new JLabel("고 객 요 구 사 항");
		lblOWant.setForeground(Color.BLACK);
		lblOWant.setHorizontalAlignment(SwingConstants.CENTER);
		lblOWant.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblOWant.setBounds(20, 270, 160, 30);
		panel.add(lblOWant);
		
		tfONo = new JTextField();
		tfONo.setEditable(false);
		tfONo.setBounds(180, 20, 200, 30);
		panel.add(tfONo);
		tfONo.setColumns(10);
		
		tfODate = new JDateChooser(new Date(), "yyyy-MM-dd");
		tfODate.setBounds(180, 70, 200, 30);
		panel.add(tfODate);
		
		tfOCName = new JTextField();
		tfOCName.setColumns(10);
		tfOCName.setBounds(180, 120, 200, 30);
		panel.add(tfOCName);
		
		tfOPName = new JTextField();
		tfOPName.setColumns(10);
		tfOPName.setBounds(180, 170, 200, 30);
		panel.add(tfOPName);
		
		tfOQty = new JTextField();
		tfOQty.setColumns(10);
		tfOQty.setBounds(180, 220, 200, 30);
		panel.add(tfOQty);
		
		taOWant = new JTextArea();
		taOWant.setBorder(new LineBorder(SystemColor.activeCaptionBorder));
		taOWant.setBounds(20, 320, 364, 100);
		panel.add(taOWant);
		
		label = new JLabel("");
		label.setOpaque(true);
		label.setBackground(Color.WHITE);
		label.setBounds(0, 0, 400, 440);
		panel.add(label);
		
	}
	
	public void setNum(Order item) {
		tfONo.setText(String.format("O%04d", item.getoNo()+1));
	}
	
	@Override
	public Order getItem() {
		int oNo = Integer.parseInt(tfONo.getText().substring(1));
		Date oDate = tfODate.getDate();
		Client client = new Client();
		client.setcName(tfOCName.getText().trim());
		Client oCname = new Client(cService.selectOrderCno(client));
		Product product = new Product();
		product.setpName(tfOPName.getText().trim());
		Product oPname = new Product(pService.selectOrderPno(product));
		int oQty = Integer.parseInt(tfOQty.getText().trim());
		String oMemo = taOWant.getText().trim();
		int oDps = 0;
		int oOk = 0;
		Employee oEname = new Employee(80);
		return new Order(oNo, oDate, oCname, oPname, oQty, oMemo, oDps, oOk, oEname);
	}
	@Override
	public void setItem(Order item) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void clearTf() {
		tfONo.setText("");
		tfODate.setDate(new Date());
		tfOCName.setText("");
		tfOPName.setText("");
		tfOQty.setText("");
		taOWant.setText("");
		
	}
	@Override
	public void validCheck() {
		if(tfOCName.getText().equals("")||tfOPName.getText().equals("")
				||tfOQty.getText().equals("")) {
			throw new InvalidCheckException();
		}
		
	}
}
