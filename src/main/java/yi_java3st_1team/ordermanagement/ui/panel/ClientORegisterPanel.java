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
import java.awt.Color;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class ClientORegisterPanel extends JPanel {

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
	public ClientORegisterPanel() {

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
		
		lblO = new JLabel("주문 등록");
		lblO.setForeground(Color.BLACK);
		lblO.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		lblO.setBounds(0, 52, 635, 54);
		panel.add(lblO);
		
		lblONo = new JLabel("주 문 번 호");
		lblONo.setForeground(Color.BLACK);
		lblONo.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblONo.setHorizontalAlignment(SwingConstants.CENTER);
		lblONo.setBounds(66, 140, 120, 30);
		panel.add(lblONo);
		
		lblODate = new JLabel("주 문 일 자");
		lblODate.setForeground(Color.BLACK);
		lblODate.setHorizontalAlignment(SwingConstants.CENTER);
		lblODate.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblODate.setBounds(66, 190, 120, 30);
		panel.add(lblODate);
		
		lblOCName = new JLabel("고객상호명");
		lblOCName.setForeground(Color.BLACK);
		lblOCName.setHorizontalAlignment(SwingConstants.CENTER);
		lblOCName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblOCName.setBounds(66, 240, 120, 30);
		panel.add(lblOCName);
		
		lblOPName = new JLabel("품   목   명");
		lblOPName.setHorizontalAlignment(SwingConstants.CENTER);
		lblOPName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblOPName.setBounds(66, 290, 120, 30);
		panel.add(lblOPName);
		
		lblOQty = new JLabel("주 문 수 량");
		lblOQty.setHorizontalAlignment(SwingConstants.CENTER);
		lblOQty.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblOQty.setBounds(66, 340, 120, 30);
		panel.add(lblOQty);
		
		lblOWant = new JLabel("요 구 사 항");
		lblOWant.setHorizontalAlignment(SwingConstants.CENTER);
		lblOWant.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblOWant.setBounds(66, 390, 120, 30);
		panel.add(lblOWant);
		
		tfONo = new JTextField();
		tfONo.setBounds(230, 140, 200, 30);
		panel.add(tfONo);
		tfONo.setColumns(10);
		
		tfODate = new JTextField();
		tfODate.setColumns(10);
		tfODate.setBounds(230, 190, 200, 30);
		panel.add(tfODate);
		
		tfOCName = new JTextField();
		tfOCName.setColumns(10);
		tfOCName.setBounds(230, 240, 200, 30);
		panel.add(tfOCName);
		
		tfOPName = new JTextField();
		tfOPName.setColumns(10);
		tfOPName.setBounds(230, 290, 200, 30);
		panel.add(tfOPName);
		
		tfOQty = new JTextField();
		tfOQty.setColumns(10);
		tfOQty.setBounds(230, 340, 200, 30);
		panel.add(tfOQty);
		
		btnAdd = new JButton("주문하기");
		btnAdd.setBounds(66, 580, 100, 30);
		panel.add(btnAdd);
		
		btnUpdate = new JButton("초 기 화");
		btnUpdate.setBounds(270, 580, 100, 30);
		panel.add(btnUpdate);
		
		btnGoMain = new JButton("");
		btnGoMain.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\test\\메인화면.png"));
		btnGoMain.setBounds(465, 580, 100, 30);
		panel.add(btnGoMain);
		
		JTextArea taOWant = new JTextArea();
		taOWant.setBorder(new LineBorder(SystemColor.activeCaptionBorder));
		taOWant.setBounds(66, 440, 364, 100);
		panel.add(taOWant);
		
		JButton btnQtyCheck = new JButton("재고확인");
		btnQtyCheck.setBounds(465, 290, 100, 30);
		panel.add(btnQtyCheck);
		
		JLabel label = new JLabel("");
		label.setOpaque(true);
		label.setBackground(Color.WHITE);
		label.setBounds(54, 116, 525, 445);
		panel.add(label);
		
	}
}
