package yi_java3st_1team.ordermanagement.ui.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import yi_java3st_1team.clientmanagement.dto.Client;
import yi_java3st_1team.clientmanagement.ui.panel.AbsItemPanel;
import yi_java3st_1team.clientmanagement.ui.service.ClientUIService;
import yi_java3st_1team.ordermanagement.dto.Order;
import yi_java3st_1team.productmanagement.dto.Product;
import yi_java3st_1team.productmanagement.ui.service.SWUIService;

@SuppressWarnings("serial")
public class OrderModify extends AbsItemPanel<Order> {
	private JTextField tfONo;
	private JDateChooser tfODate;
	private JTextField tfOCName;
	private JTextField tfOPName;
	private JTextField tfOQty;
	private JTextField tfOMemo;
	private JPanel pOModifyPanel;
	private ClientUIService cService;
	private SWUIService pService;
	public JPanel panel;
	
	public OrderModify() {
		cService = new ClientUIService();
		pService = new SWUIService();
		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setSize(new Dimension(500, 500));
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel(">> 주문 수정");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 27));
		lblNewLabel.setBackground(SystemColor.inactiveCaptionBorder);
		lblNewLabel.setPreferredSize(new Dimension(60, 90));
		add(lblNewLabel, BorderLayout.NORTH);
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 60));
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		add(panel, BorderLayout.SOUTH);
		
		pOModifyPanel = new JPanel();
		pOModifyPanel.setBorder(new EmptyBorder(20, 40, 20, 40));
		pOModifyPanel.setBackground(SystemColor.inactiveCaptionBorder);
		add(pOModifyPanel, BorderLayout.CENTER);
		pOModifyPanel.setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblONo = new JLabel("주 문 번 호   ");
		lblONo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblONo.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		pOModifyPanel.add(lblONo);
		
		tfONo = new JTextField();
		tfONo.setEditable(false);
		pOModifyPanel.add(tfONo);
		tfONo.setColumns(10);
		
		JLabel lblODate = new JLabel("주 문 일 자   ");
		lblODate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblODate.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		pOModifyPanel.add(lblODate);
		
		tfODate = new JDateChooser(new Date(), "yyyy-MM-dd");
		pOModifyPanel.add(tfODate);
		
		JLabel lblOCName = new JLabel("고 객 상 호 명   ");
		lblOCName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOCName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		pOModifyPanel.add(lblOCName);
		
		tfOCName = new JTextField();
		pOModifyPanel.add(tfOCName);
		tfOCName.setColumns(10);
		
		JLabel lblOPName = new JLabel("품 목 명   ");
		lblOPName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOPName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		pOModifyPanel.add(lblOPName);
		
		tfOPName = new JTextField();
		tfOPName.setColumns(10);
		pOModifyPanel.add(tfOPName);
		
		JLabel lblOQty = new JLabel("주 문 수 량   ");
		lblOQty.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOQty.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		pOModifyPanel.add(lblOQty);
		
		tfOQty = new JTextField();
		tfOQty.setColumns(10);
		pOModifyPanel.add(tfOQty);
		
		JLabel lblOMemo = new JLabel("고 객 요 구 사 항   ");
		lblOMemo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOMemo.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		pOModifyPanel.add(lblOMemo);
		
		tfOMemo = new JTextField();
		tfOMemo.setColumns(10);
		pOModifyPanel.add(tfOMemo);
	}
	@Override
	public Order getItem() {
		int oNo = Integer.parseInt(tfONo.getText().substring(1));
		Date oDate = tfODate.getDate();
		Client client = new Client(tfOCName.getText().trim());
		Client oCname = new Client(cService.selectOrderCno(client));
		Product product = new Product(tfOPName.getText().trim());
		Product oPname = new Product(pService.selectOrderPno(product));
		int oQty = Integer.parseInt(tfOQty.getText().trim());
		String oMemo = tfOMemo.getText().trim();
		return new Order(oNo, oDate, oCname, oPname, oQty, oMemo);
	}
	@Override
	public void setItem(Order item) {
		tfONo.setText(String.format("O%04d", item.getoNo()));
		tfODate.setDate(item.getoDate());
		tfOCName.setText(item.getoCname().getcName());
		tfOPName.setText(item.getoPname().getpName());
		tfOQty.setText(item.getoQty()+"");
		tfOMemo.setText(item.getoMemo());
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
