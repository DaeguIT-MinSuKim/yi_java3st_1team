package yi_java3st_1team.ordermanagement.ui.panel;

import java.awt.BorderLayout;
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
public class ClientORegisterPanel extends AbsItemPanel<Order> {
	private JLabel lblONo;
	private JLabel lblODate;
	private JLabel lblOCName;
	private JLabel lblOPName;
	private JLabel lblOQty;
	private JLabel lblOWant;
	private JTextField tfONo;
	public JTextField tfOCName;
	public JTextField tfOPName;
	public JTextField tfOQty;
	private JTextArea taOWant;
	private JLabel label;
	private JDateChooser tfODate;
	private ClientUIService cService;
	private SWUIService pService;
	
	public ClientORegisterPanel() {
		cService = new ClientUIService();
		pService = new SWUIService();
		initialize();
	}
	private void initialize() {
		setBounds(new Rectangle(0, 0, 460, 445));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setFocusable(false);
		add(panel, BorderLayout.CENTER);
		panel.setBounds(new Rectangle(0, 0, 460, 445));
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setLayout(null);
		
		lblONo = new JLabel("주 문 번 호");
		lblONo.setForeground(Color.BLACK);
		lblONo.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblONo.setHorizontalAlignment(SwingConstants.CENTER);
		lblONo.setBounds(70, 22, 120, 30);
		panel.add(lblONo);
		
		lblODate = new JLabel("주 문 일 자");
		lblODate.setForeground(Color.BLACK);
		lblODate.setHorizontalAlignment(SwingConstants.CENTER);
		lblODate.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblODate.setBounds(70, 72, 120, 30);
		panel.add(lblODate);
		
		lblOCName = new JLabel("고객상호명");
		lblOCName.setForeground(Color.BLACK);
		lblOCName.setHorizontalAlignment(SwingConstants.CENTER);
		lblOCName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblOCName.setBounds(70, 122, 120, 30);
		panel.add(lblOCName);
		
		lblOPName = new JLabel("품   목   명");
		lblOPName.setForeground(Color.BLACK);
		lblOPName.setHorizontalAlignment(SwingConstants.CENTER);
		lblOPName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblOPName.setBounds(70, 172, 120, 30);
		panel.add(lblOPName);
		
		lblOQty = new JLabel("주 문 수 량");
		lblOQty.setForeground(Color.BLACK);
		lblOQty.setHorizontalAlignment(SwingConstants.CENTER);
		lblOQty.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblOQty.setBounds(70, 222, 120, 30);
		panel.add(lblOQty);
		
		lblOWant = new JLabel("요 구 사 항");
		lblOWant.setForeground(Color.BLACK);
		lblOWant.setHorizontalAlignment(SwingConstants.CENTER);
		lblOWant.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblOWant.setBounds(70, 272, 120, 30);
		panel.add(lblOWant);
		
		tfONo = new JTextField();
		tfONo.setEditable(false);
		tfONo.setBounds(232, 22, 200, 30);
		panel.add(tfONo);
		tfONo.setColumns(10);
		
		tfODate = new JDateChooser(new Date(), "yyyy-MM-dd");
		tfODate.setBounds(232, 72, 200, 30);
		panel.add(tfODate);
		
		tfOCName = new JTextField();
		tfOCName.setColumns(10);
		tfOCName.setBounds(232, 122, 200, 30);
		panel.add(tfOCName);
		
		tfOPName = new JTextField();
		tfOPName.setColumns(10);
		tfOPName.setBounds(232, 172, 200, 30);
		panel.add(tfOPName);
		
		tfOQty = new JTextField();
		tfOQty.setColumns(10);
		tfOQty.setBounds(232, 222, 200, 30);
		panel.add(tfOQty);
		
		taOWant = new JTextArea();
		taOWant.setBorder(new LineBorder(SystemColor.activeCaptionBorder));
		taOWant.setBounds(70, 322, 364, 100);
		panel.add(taOWant);
		
		label = new JLabel("");
		label.setOpaque(true);
		label.setBackground(Color.WHITE);
		label.setBounds(0, 0, 460, 445);
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
		Employee oEname = new Employee(cService.selectOrderCsalesman(client));
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
