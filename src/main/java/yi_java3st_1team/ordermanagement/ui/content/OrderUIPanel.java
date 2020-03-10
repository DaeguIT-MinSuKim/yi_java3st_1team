package yi_java3st_1team.ordermanagement.ui.content;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import yi_java3st_1team.clientmanagement.dto.Supplier;
import yi_java3st_1team.exception.InvalidCheckException;
import yi_java3st_1team.ordermanagement.dto.Order;
import yi_java3st_1team.ordermanagement.ui.panel.ORegisterPanel;
import yi_java3st_1team.ordermanagement.ui.service.OrderUIService;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class OrderUIPanel extends JPanel implements ActionListener {

	private ORegisterPanel pORPanel;
	private JLabel lblO;
	private JButton btnAdd;
	private JButton btnReset;
	private JButton btnGoMain;
	private JButton btnPCheck;
	private JButton btnQtyCheck;
	private JLabel lblNewLabel;
	private JPanel pDispPanel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblSummary;
	private JLabel lblPNo;
	private JLabel lblSCName;
	private JLabel lblSCost;
	private JLabel lblPPrice;
	private OrderUIService service;
	
	public OrderUIPanel() {
		service = new OrderUIService();
		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(1270, 700));
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pRegisterPanel = new JPanel();
		pRegisterPanel.setBackground(SystemColor.inactiveCaptionBorder);
		add(pRegisterPanel);
		pRegisterPanel.setLayout(null);
		
		pORPanel = new ORegisterPanel();
		pORPanel.setBounds(55, 115, 400, 440);
		pORPanel.setNum(service.lastOrder());
		pRegisterPanel.add(pORPanel);
		
		lblO = new JLabel("소프트웨어 주문 등록");
		lblO.setForeground(Color.BLACK);
		lblO.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		lblO.setBounds(0, 52, 635, 54);
		pRegisterPanel.add(lblO);
		
		btnAdd = new JButton("등 록");
		btnAdd.addActionListener(this);
		btnAdd.setFocusable(false);
		btnAdd.setBackground(new Color(135, 206, 250));
		btnAdd.setForeground(new Color(0, 102, 204));
		btnAdd.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnAdd.setBounds(66, 580, 110, 30);
		pRegisterPanel.add(btnAdd);
		
		btnReset = new JButton("초기화");
		btnReset.setFocusable(false);
		btnReset.setForeground(Color.WHITE);
		btnReset.setBackground(new Color(240, 128, 128));
		btnReset.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnReset.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\test\\삭제.png"));
		btnReset.setBounds(265, 580, 110, 30);
		pRegisterPanel.add(btnReset);
		
		btnGoMain = new JButton("메인화면");
		btnGoMain.setFocusable(false);
		btnGoMain.setBackground(new Color(25, 25, 112));
		btnGoMain.setForeground(Color.WHITE);
		btnGoMain.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnGoMain.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\test\\메인화면.png"));
		btnGoMain.setBounds(460, 580, 110, 30);
		pRegisterPanel.add(btnGoMain);
		
		btnPCheck = new JButton("품목조회");
		btnPCheck.setFocusable(false);
		btnPCheck.setBackground(SystemColor.activeCaptionBorder);
		btnPCheck.setForeground(Color.WHITE);
		btnPCheck.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnPCheck.setBounds(465, 285, 100, 30);
		pRegisterPanel.add(btnPCheck);
		
		btnQtyCheck = new JButton("수량조회");
		btnQtyCheck.setFocusable(false);
		btnQtyCheck.setBackground(SystemColor.activeCaptionBorder);
		btnQtyCheck.setForeground(Color.WHITE);
		btnQtyCheck.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnQtyCheck.setBounds(465, 335, 100, 30);
		pRegisterPanel.add(btnQtyCheck);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(455, 115, 124, 440);
		pRegisterPanel.add(lblNewLabel);
		
		JPanel pListPanel = new JPanel();
		pListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		add(pListPanel);
		pListPanel.setLayout(null);
		
		pDispPanel = new JPanel();
		pDispPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pDispPanel.setBorder(new LineBorder(Color.DARK_GRAY, 3));
		pDispPanel.setBounds(20, 100, 595, 500);
		pListPanel.add(pDispPanel);
		pDispPanel.setLayout(null);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\mainLogo3.png"));
		lblNewLabel_1.setBounds(20, 20, 555, 400);
		pDispPanel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		lblNewLabel_2.setBounds(20, 435, 555, 50);
		pDispPanel.add(lblNewLabel_2);
		
		lblSummary = new JLabel("               /                     /  공급가 :                  원 /  판매가 :               원");
		lblSummary.setForeground(Color.BLACK);
		lblSummary.setFont(new Font("굴림", Font.BOLD, 13));
		lblSummary.setBounds(12, 10, 531, 29);
		lblNewLabel_2.add(lblSummary);
		
		lblPNo = new JLabel("P0001");
		lblPNo.setOpaque(true);
		lblPNo.setBackground(Color.BLACK);
		lblPNo.setForeground(Color.WHITE);
		lblPNo.setFont(new Font("굴림", Font.BOLD, 14));
		lblPNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPNo.setBounds(12, 10, 70, 29);
		lblNewLabel_2.add(lblPNo);
		
		lblSCName = new JLabel("소프트마켓");
		lblSCName.setForeground(new Color(0, 100, 0));
		lblSCName.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCName.setFont(new Font("굴림", Font.BOLD, 14));
		lblSCName.setBounds(95, 10, 100, 29);
		lblNewLabel_2.add(lblSCName);
		
		lblSCost = new JLabel("80,000");
		lblSCost.setForeground(Color.GRAY);
		lblSCost.setFont(new Font("굴림", Font.BOLD, 14));
		lblSCost.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSCost.setBounds(280, 10, 70, 29);
		lblNewLabel_2.add(lblSCost);
		
		lblPPrice = new JLabel("80,000");
		lblPPrice.setForeground(Color.BLUE);
		lblPPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPPrice.setFont(new Font("굴림", Font.BOLD, 14));
		lblPPrice.setBounds(445, 10, 70, 29);
		lblNewLabel_2.add(lblPPrice);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAdd) {
			btnAddActionPerformed(e);
		}
	}
	protected void btnAddActionPerformed(ActionEvent e) {
		try {
			if(pORPanel.tfOCName.getText().equals("") 
					|| pORPanel.tfOPName.getText().equals("") 
					|| pORPanel.tfOQty.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "고객상호명, 품목명, 주문수량은 필수입력사항입니다.");
				return;
			}else {
				Order newOrder = pORPanel.getItem();
				System.out.println(newOrder.toString());
				service.addOrder(newOrder);
				pORPanel.clearTf();
				pORPanel.setNum(newOrder);
			}
		} catch (InvalidCheckException e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage());
		} catch (Exception e1) {
			SQLException e2 = (SQLException) e1;
			if(e2.getErrorCode() == 1062) {
				JOptionPane.showMessageDialog(null, "번호가 중복");
				System.err.println(e2.getMessage());
				return;
			}
			e1.printStackTrace();
		}
	}
}
