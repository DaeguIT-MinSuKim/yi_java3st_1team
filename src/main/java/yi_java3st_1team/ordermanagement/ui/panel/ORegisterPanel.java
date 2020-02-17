package yi_java3st_1team.ordermanagement.ui.panel;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class ORegisterPanel extends JPanel {

	private JLabel lblO;
	private JLabel lblONo;
	private JLabel lblODate;
	private JLabel lblOCName;
	private JLabel lblOPName;
	private JLabel lblOQty;
	private JLabel lblOWant;
	private JTextField tfONo;
	private JTextField tfODate;
	private JTextField tfOCName;
	private JTextField tfOPName;
	private JTextField tfOQty;
	private JButton btnAdd;
	private JButton btnUpdate;
	private JButton btnGoMain;
	public ORegisterPanel() {

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
		
		lblO = new JLabel("소프트웨어 주문 등록");
		lblO.setFont(new Font("굴림", Font.BOLD, 38));
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		lblO.setBounds(101, 52, 407, 54);
		panel.add(lblO);
		
		lblONo = new JLabel("주 문 번 호");
		lblONo.setFont(new Font("굴림", Font.BOLD, 18));
		lblONo.setHorizontalAlignment(SwingConstants.CENTER);
		lblONo.setBounds(125, 140, 120, 30);
		panel.add(lblONo);
		
		lblODate = new JLabel("주 문 일 자");
		lblODate.setHorizontalAlignment(SwingConstants.CENTER);
		lblODate.setFont(new Font("굴림", Font.BOLD, 18));
		lblODate.setBounds(125, 190, 120, 30);
		panel.add(lblODate);
		
		lblOCName = new JLabel("고객상호명");
		lblOCName.setHorizontalAlignment(SwingConstants.CENTER);
		lblOCName.setFont(new Font("굴림", Font.BOLD, 18));
		lblOCName.setBounds(125, 240, 120, 30);
		panel.add(lblOCName);
		
		lblOPName = new JLabel("품   목   명");
		lblOPName.setHorizontalAlignment(SwingConstants.CENTER);
		lblOPName.setFont(new Font("굴림", Font.BOLD, 18));
		lblOPName.setBounds(125, 290, 120, 30);
		panel.add(lblOPName);
		
		lblOQty = new JLabel("주 문 수 량");
		lblOQty.setHorizontalAlignment(SwingConstants.CENTER);
		lblOQty.setFont(new Font("굴림", Font.BOLD, 18));
		lblOQty.setBounds(125, 340, 120, 30);
		panel.add(lblOQty);
		
		lblOWant = new JLabel("고 객 요 구 사 항");
		lblOWant.setHorizontalAlignment(SwingConstants.CENTER);
		lblOWant.setFont(new Font("굴림", Font.BOLD, 18));
		lblOWant.setBounds(125, 390, 160, 30);
		panel.add(lblOWant);
		
		tfONo = new JTextField();
		tfONo.setBounds(289, 140, 200, 30);
		panel.add(tfONo);
		tfONo.setColumns(10);
		
		tfODate = new JTextField();
		tfODate.setColumns(10);
		tfODate.setBounds(289, 190, 200, 30);
		panel.add(tfODate);
		
		tfOCName = new JTextField();
		tfOCName.setColumns(10);
		tfOCName.setBounds(289, 240, 200, 30);
		panel.add(tfOCName);
		
		tfOPName = new JTextField();
		tfOPName.setColumns(10);
		tfOPName.setBounds(289, 290, 200, 30);
		panel.add(tfOPName);
		
		tfOQty = new JTextField();
		tfOQty.setColumns(10);
		tfOQty.setBounds(289, 340, 200, 30);
		panel.add(tfOQty);
		
		btnAdd = new JButton("등 록");
		btnAdd.setBounds(80, 580, 130, 30);
		panel.add(btnAdd);
		
		btnUpdate = new JButton("초 기 화");
		btnUpdate.setBounds(260, 580, 130, 30);
		panel.add(btnUpdate);
		
		btnGoMain = new JButton("메 인 화 면");
		btnGoMain.setBounds(440, 580, 130, 30);
		panel.add(btnGoMain);
		
		JTextArea taOWant = new JTextArea();
		taOWant.setBorder(new LineBorder(SystemColor.activeCaptionBorder));
		taOWant.setBounds(125, 440, 364, 100);
		panel.add(taOWant);
		
	}
}
