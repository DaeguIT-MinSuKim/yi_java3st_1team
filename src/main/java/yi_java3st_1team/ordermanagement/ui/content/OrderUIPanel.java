package yi_java3st_1team.ordermanagement.ui.content;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import yi_java3st_1team.exception.InvalidCheckException;
import yi_java3st_1team.main.employee.ui.EmployeeMainUIPanel;
import yi_java3st_1team.ordermanagement.dto.Order;
import yi_java3st_1team.ordermanagement.ui.panel.ORegisterPanel;
import yi_java3st_1team.ordermanagement.ui.service.IQUIService;
import yi_java3st_1team.ordermanagement.ui.service.OrderUIService;
import yi_java3st_1team.productmanagement.dto.Product;
import yi_java3st_1team.productmanagement.ui.service.SWUIService;

@SuppressWarnings("serial")
public class OrderUIPanel extends JPanel implements ActionListener {

	private ORegisterPanel pORPanel;
	private JLabel lblO;
	private JButton btnAdd;
	private JButton btnReset;
	public JButton btnGoMain;
	private JButton btnPCheck;
	private JButton btnQtyCheck;
	private JLabel lblNewLabel;
	private JPanel pDispPanel;
	private JLabel lblPic;
	private JLabel lblNewLabel_2;
	private JLabel lblSummary;
	private JLabel lblPNo;
	private JLabel lblSCName;
	private JLabel lblSCost;
	private JLabel lblPPrice;
	private OrderUIService service;
	private String picPath;
	private Dimension picDimension = new Dimension(320, 293);
	private SWUIService pService;
	private Product proSummary;
	private int pQty;
	private IQUIService iqService;
	
	public OrderUIPanel() {
		service = new OrderUIService();
		pService = new SWUIService();
		iqService = new IQUIService();
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
		pORPanel.setService(pService);
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
		btnReset.addActionListener(this);
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
		btnPCheck.addActionListener(this);
		btnPCheck.setFocusable(false);
		btnPCheck.setBackground(SystemColor.activeCaptionBorder);
		btnPCheck.setForeground(Color.WHITE);
		btnPCheck.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnPCheck.setBounds(465, 285, 100, 30);
		pRegisterPanel.add(btnPCheck);
		
		btnQtyCheck = new JButton("수량조회");
		btnQtyCheck.addActionListener(this);
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
		
		lblPic = new JLabel("");
		lblPic.setOpaque(true);
		lblPic.setBackground(Color.WHITE);
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\mainLogo3.png"));
		lblPic.setBounds(20, 20, 555, 400);
		pDispPanel.add(lblPic);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		lblNewLabel_2.setBounds(20, 435, 555, 50);
		pDispPanel.add(lblNewLabel_2);
		
		lblSummary = new JLabel("               /                  /  공급가 :                  원 /  판매가 :                   원");
		lblSummary.setForeground(Color.BLACK);
		lblSummary.setFont(new Font("굴림", Font.BOLD, 13));
		lblSummary.setBounds(12, 10, 531, 29);
		lblNewLabel_2.add(lblSummary);
		
		lblPNo = new JLabel("품목번호");
		lblPNo.setOpaque(true);
		lblPNo.setBackground(Color.BLACK);
		lblPNo.setForeground(Color.WHITE);
		lblPNo.setFont(new Font("굴림", Font.BOLD, 14));
		lblPNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPNo.setBounds(12, 10, 70, 29);
		lblNewLabel_2.add(lblPNo);
		
		lblSCName = new JLabel("품목명");
		lblSCName.setForeground(new Color(0, 100, 0));
		lblSCName.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCName.setFont(new Font("굴림", Font.BOLD, 14));
		lblSCName.setBounds(95, 10, 90, 29);
		lblNewLabel_2.add(lblSCName);
		
		lblSCost = new JLabel("0");
		lblSCost.setForeground(Color.GRAY);
		lblSCost.setFont(new Font("굴림", Font.BOLD, 14));
		lblSCost.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSCost.setBounds(240, 10, 100, 29);
		lblNewLabel_2.add(lblSCost);
		
		lblPPrice = new JLabel("0");
		lblPPrice.setForeground(Color.BLUE);
		lblPPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPPrice.setFont(new Font("굴림", Font.BOLD, 14));
		lblPPrice.setBounds(420, 10, 100, 29);
		lblNewLabel_2.add(lblPPrice);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnQtyCheck) {
			btnQtyCheckActionPerformed(e);
		}
		if (e.getSource() == btnPCheck) {
			btnPCheckActionPerformed(e);
		}
		if (e.getSource() == btnReset) {
			btnResetActionPerformed(e);
		}
		if (e.getSource() == btnAdd) {
			btnAddActionPerformed(e);
		}
	}
	protected void btnAddActionPerformed(ActionEvent e) {
		try {
			if(pORPanel.tfOCName.getText().equals("") 
					|| pORPanel.cmbPList.getSelectedItem().toString().equals("") 
					|| pORPanel.tfOQty.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "고객상호명, 품목명, 주문수량은 필수입력사항입니다.");
				return;
			}else {
				if(pQty < Integer.parseInt(pORPanel.tfOQty.getText().trim())) {
					JOptionPane.showMessageDialog(null, "현 재고수량을 초과하여 주문할 수 없습니다.");
				}else {
					Order newOrder = pORPanel.getItem();
					newOrder.setoEname(EmployeeMainUIPanel.loginEmp);
					service.addOrder(newOrder);
					int sub = pQty - Integer.parseInt(pORPanel.tfOQty.getText().trim());
					iqService.SubProductQty(proSummary, sub);
					pORPanel.clearTf();
					pORPanel.setNum(newOrder);
					setPic(getClass().getClassLoader().getResource("mainLogo3.png").getPath());
					lblPNo.setText("품목번호");
					lblSCName.setText("품목명");
					lblSCost.setText("0");
					lblPPrice.setText("0");
					pORPanel.tfOQty.setEditable(true);
					JOptionPane.showMessageDialog(null, "제품주문이 등록되었습니다.");
				}
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
	protected void btnResetActionPerformed(ActionEvent e) {
		pORPanel.clearTf();
		pORPanel.setNum(service.lastOrder());
		setPic(getClass().getClassLoader().getResource("mainLogo3.png").getPath());
		lblPNo.setText("품목번호");
		lblSCName.setText("품목명");
		lblSCost.setText("0");
		lblPPrice.setText("0");
		pORPanel.tfOQty.setEditable(true);
	}
	protected void btnPCheckActionPerformed(ActionEvent e) {
		if(pORPanel.cmbPList.getSelectedItem().toString().equals("")) {
			JOptionPane.showMessageDialog(null, "조회하려는 품목명을 선택해주세요.");
		}else {
			Product product = new Product();
			product.setpName(pORPanel.cmbPList.getSelectedItem().toString().trim());
			Product proImg = new Product(pService.selectProductPic(product));
			if(proImg.getpPic()==null) {
				setPic(getClass().getClassLoader().getResource("mainLogo3.png").getPath());
			}else {
				setPic(proImg.getpPic());
			}
			proSummary = pService.selectProductSummary(product);
			proSummary(proSummary);
		}
	}
	private void proSummary(Product proSummary) {
		lblPNo.setText(String.format("P%04d", proSummary.getpNo()));
		lblSCName.setText(String.format(proSummary.getpName()));
		lblSCost.setText(String.format("%,d", proSummary.getpCost()));
		lblPPrice.setText(String.format("%,d", proSummary.getpPrice()));
	}
	
	private void setPic(byte[] getpPic) {
		lblPic.setIcon(new ImageIcon(new ImageIcon(getpPic).getImage().getScaledInstance((int)picDimension.getWidth(), 
				(int)picDimension.getHeight(), Image.SCALE_DEFAULT)));
		
	}
	private void setPic(String imgPath) {
		picPath = imgPath;
		lblPic.setIcon(new ImageIcon(new ImageIcon(imgPath).getImage().getScaledInstance((int)picDimension.getWidth(), 
				(int)picDimension.getHeight(), Image.SCALE_DEFAULT)));
		
	}
	protected void btnQtyCheckActionPerformed(ActionEvent e) {
		if(pORPanel.cmbPList.getSelectedItem().toString().equals("")) {
			JOptionPane.showMessageDialog(null, "먼저 품목을 조회해주세요.");
		}else {
			pQty = iqService.showQty(proSummary);
			if(pQty == 0 || pQty < 0) {
				pORPanel.tfOQty.setEditable(false);
				JOptionPane.showMessageDialog(null, "수량이 부족하여 주문할 수 없습니다.");
			}else {
				JOptionPane.showMessageDialog(null, "본 상품은 현재 수량이 "+pQty+"개 입니다.");
			}
		}
	}
}
