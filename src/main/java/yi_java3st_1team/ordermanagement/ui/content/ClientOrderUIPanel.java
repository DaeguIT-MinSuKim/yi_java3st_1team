package yi_java3st_1team.ordermanagement.ui.content;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import yi_java3st_1team.exception.InvalidCheckException;
import yi_java3st_1team.main.client.ui.ClientMainUIPanel;
import yi_java3st_1team.ordermanagement.dto.Order;
import yi_java3st_1team.ordermanagement.ui.panel.ClientORegisterPanel;
import yi_java3st_1team.ordermanagement.ui.service.IQUIService;
import yi_java3st_1team.ordermanagement.ui.service.OrderUIService;
import yi_java3st_1team.productmanagement.dto.Product;
import yi_java3st_1team.productmanagement.ui.service.SWUIService;

@SuppressWarnings("serial")
public class ClientOrderUIPanel extends JPanel implements ActionListener, ChangeListener, ItemListener {
	
	private JTextField tfWon;
	private ClientORegisterPanel pCORPanel;
	private JLabel lblO;
	private JButton btnAdd;
	private JButton btnReset;
	public JButton btnGoMain;
	private JButton btnQtyCheck;
	private JButton btnPCheck;
	private JLabel lblNewLabel;
	private JPanel pDisPanel;
	private JLabel lblPic;
	private JLabel lblIntro;
	private JLabel lblSummary;
	private JLabel lblPNo;
	private JLabel lblSCName;
	private JLabel lblPPrice;
	private JPanel pDisPanel_2;
	private JLabel lblPriceMulNum;
	private JSpinner spNum;
	private JComboBox cmbNum;
	private JLabel lblDiscountRate;
	private JLabel lblPrice;
	private JLabel lblWon;
	private OrderUIService service;
	private SWUIService pService;
	private IQUIService iqService;
	private Product proSummary;
	private Dimension picDimension = new Dimension(320, 293);
	private String picPath;
	private int pQty;
	
	public ClientOrderUIPanel() {
		service = new OrderUIService();
		pService = new SWUIService();
		iqService = new IQUIService();
		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(1530, 700));
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pRegisterPanel = new JPanel();
		pRegisterPanel.setBackground(SystemColor.inactiveCaptionBorder);
		add(pRegisterPanel);
		pRegisterPanel.setLayout(null);
		
		pCORPanel = new ClientORegisterPanel();
		pCORPanel.setBounds(60, 117, 460, 445);
		pCORPanel.setNum(service.lastOrder());
		pCORPanel.setCName(ClientMainUIPanel.loginCl);
		pCORPanel.setService(pService);
		pRegisterPanel.add(pCORPanel);
		
		lblO = new JLabel("주문 등록");
		lblO.setForeground(Color.BLACK);
		lblO.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		lblO.setBounds(0, 52, 765, 54);
		pRegisterPanel.add(lblO);
		
		btnAdd = new JButton("주문하기");
		btnAdd.addActionListener(this);
		btnAdd.setFocusable(false);
		btnAdd.setBackground(new Color(70, 130, 180));
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnAdd.setBounds(100, 580, 120, 30);
		pRegisterPanel.add(btnAdd);
		
		btnReset = new JButton("초기화");
		btnReset.addActionListener(this);
		btnReset.setFocusable(false);
		btnReset.setForeground(Color.WHITE);
		btnReset.setBackground(new Color(240, 128, 128));
		btnReset.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnReset.setBounds(322, 580, 120, 30);
		pRegisterPanel.add(btnReset);
		
		btnGoMain = new JButton("메인화면");
		btnGoMain.setBackground(new Color(25, 25, 112));
		btnGoMain.setForeground(Color.WHITE);
		btnGoMain.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnGoMain.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\test\\메인화면.png"));
		btnGoMain.setBounds(545, 580, 120, 30);
		pRegisterPanel.add(btnGoMain);
		
		btnPCheck = new JButton("품목확인");
		btnPCheck.addActionListener(this);
		btnPCheck.setFocusable(false);
		btnPCheck.setBackground(new Color(255, 204, 102));
		btnPCheck.setForeground(Color.WHITE);
		btnPCheck.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnPCheck.setBounds(534, 288, 120, 30);
		pRegisterPanel.add(btnPCheck);
		
		btnQtyCheck = new JButton("재고확인");
		btnQtyCheck.addActionListener(this);
		btnQtyCheck.setFocusable(false);
		btnQtyCheck.setBackground(new Color(255, 204, 102));
		btnQtyCheck.setForeground(Color.WHITE);
		btnQtyCheck.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnQtyCheck.setBounds(534, 338, 120, 30);
		pRegisterPanel.add(btnQtyCheck);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(520, 117, 186, 445);
		pRegisterPanel.add(lblNewLabel);
		
		JPanel pListPanel = new JPanel();
		pListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		add(pListPanel);
		pListPanel.setLayout(null);
		
		pDisPanel = new JPanel();
		pDisPanel.setBorder(new LineBorder(Color.DARK_GRAY, 3));
		pDisPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pDisPanel.setBounds(85, 100, 595, 446);
		pListPanel.add(pDisPanel);
		pDisPanel.setLayout(null);
		
		lblPic = new JLabel("");
		lblPic.setOpaque(true);
		lblPic.setBackground(Color.WHITE);
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		lblPic.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\mainLogo3.png"));
		lblPic.setBounds(20, 20, 555, 350);
		pDisPanel.add(lblPic);
		
		lblIntro = new JLabel("");
		lblIntro.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		lblIntro.setBounds(20, 385, 555, 50);
		pDisPanel.add(lblIntro);
		
		lblSummary = new JLabel("                  /                                /    판매가 :                          원");
		lblSummary.setForeground(Color.BLACK);
		lblSummary.setFont(new Font("굴림", Font.BOLD, 13));
		lblSummary.setBounds(20, 10, 515, 29);
		lblIntro.add(lblSummary);
		
		lblPNo = new JLabel("품목번호");
		lblPNo.setBackground(Color.BLACK);
		lblPNo.setOpaque(true);
		lblPNo.setForeground(Color.WHITE);
		lblPNo.setFont(new Font("굴림", Font.BOLD, 14));
		lblPNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPNo.setBounds(20, 10, 70, 29);
		lblIntro.add(lblPNo);
		
		lblSCName = new JLabel("품목명");
		lblSCName.setForeground(new Color(0, 128, 0));
		lblSCName.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCName.setFont(new Font("굴림", Font.BOLD, 14));
		lblSCName.setBounds(120, 10, 150, 29);
		lblIntro.add(lblSCName);
		
		lblPPrice = new JLabel("0");
		lblPPrice.setForeground(Color.BLUE);
		lblPPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPPrice.setFont(new Font("굴림", Font.BOLD, 14));
		lblPPrice.setBounds(360, 9, 120, 29);
		lblIntro.add(lblPPrice);
		
		pDisPanel_2 = new JPanel();
		pDisPanel_2.setBorder(new LineBorder(Color.DARK_GRAY, 3));
		pDisPanel_2.setBackground(SystemColor.inactiveCaptionBorder);
		pDisPanel_2.setBounds(85, 543, 595, 65);
		pListPanel.add(pDisPanel_2);
		pDisPanel_2.setLayout(null);
		
		lblPriceMulNum = new JLabel("판매가 X 수량");
		lblPriceMulNum.setForeground(Color.BLACK);
		lblPriceMulNum.setFont(new Font("굴림", Font.BOLD, 14));
		lblPriceMulNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriceMulNum.setBounds(93, 20, 131, 25);
		pDisPanel_2.add(lblPriceMulNum);
		
		spNum = new JSpinner();
		spNum.addChangeListener(this);
		spNum.setModel(new SpinnerNumberModel(1, 1, 500, 10));
		spNum.setBounds(213, 20, 69, 25);
		pDisPanel_2.add(spNum);
		
		lblDiscountRate = new JLabel("<html>  X      <span style='color:red;'>할인율</span></html>");
		lblDiscountRate.setForeground(Color.BLACK);
		lblDiscountRate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiscountRate.setFont(new Font("굴림", Font.BOLD, 14));
		lblDiscountRate.setBounds(280, 17, 90, 25);
		pDisPanel_2.add(lblDiscountRate);
		
		cmbNum = new JComboBox();
		cmbNum.addItemListener(this);
		cmbNum.setFont(new Font("굴림", Font.PLAIN, 12));
		cmbNum.setForeground(Color.BLACK);
		cmbNum.setModel(new DefaultComboBoxModel(new String[] {"선택", "50개 이상", "100개 이상"}));
		cmbNum.setBounds(370, 20, 131, 25);
		pDisPanel_2.add(cmbNum);
		
		lblPrice = new JLabel("예상 지불 금액");
		lblPrice.setForeground(Color.BLACK);
		lblPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrice.setFont(new Font("굴림", Font.BOLD, 14));
		lblPrice.setBounds(388, 618, 131, 25);
		pListPanel.add(lblPrice);
		
		tfWon = new JTextField();
		tfWon.setHorizontalAlignment(SwingConstants.RIGHT);
		tfWon.setForeground(Color.BLACK);
		tfWon.setFont(new Font("굴림", Font.BOLD, 13));
		tfWon.setEditable(false);
		tfWon.setBounds(521, 618, 130, 25);
		pListPanel.add(tfWon);
		tfWon.setColumns(10);
		
		lblWon = new JLabel("원");
		lblWon.setForeground(Color.BLACK);
		lblWon.setFont(new Font("굴림", Font.BOLD, 14));
		lblWon.setBounds(658, 618, 22, 25);
		pListPanel.add(lblWon);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnPCheck) {
			btnPCheckActionPerformed(e);
		}
		if (e.getSource() == btnReset) {
			btnResetActionPerformed(e);
		}
		if (e.getSource() == btnQtyCheck) {
			btnQtyCheckActionPerformed(e);
		}
		if (e.getSource() == btnAdd) {
			btnAddActionPerformed(e);
		}
	}
	protected void btnAddActionPerformed(ActionEvent e) {
		try {
			if(pCORPanel.tfOCName.getText().equals("") 
					|| pCORPanel.cmbPList.getSelectedItem().toString().equals("") 
					|| pCORPanel.tfOQty.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "고객상호명, 품목명, 주문수량은 필수입력사항입니다.");
				return;
			}else {
				if(pQty < Integer.parseInt(pCORPanel.tfOQty.getText().trim())) {
					JOptionPane.showMessageDialog(null, "현 재고수량을 초과하여 주문할 수 없습니다.");
				}else {
					Order newOrder = pCORPanel.getItem();
					service.addOrder(newOrder);
					int sub = pQty - Integer.parseInt(pCORPanel.tfOQty.getText().trim());
					iqService.SubProductQty(proSummary, sub);
					pCORPanel.clearTf();
					pCORPanel.setNum(newOrder);
					pCORPanel.setCName(ClientMainUIPanel.loginCl);
					setPic(getClass().getClassLoader().getResource("mainLogo3.png").getPath());
					lblPNo.setText("품목번호");
					lblSCName.setText("품목명");
					lblPPrice.setText("0");
					pCORPanel.tfOQty.setEditable(true);
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
	
	protected void btnPCheckActionPerformed(ActionEvent e) {
		if(pCORPanel.cmbPList.getSelectedItem().toString().equals("")) {
			JOptionPane.showMessageDialog(null, "조회하려는 품목명을 선택해주세요.");
		}else {
			Product product = new Product();
			product.setpName(pCORPanel.cmbPList.getSelectedItem().toString().trim());
			Product proImg = new Product(pService.selectProductPic(product));
			System.out.println(proImg.getpPic());
			if(proImg.getpPic()==null) {
				setPic(getClass().getClassLoader().getResource("mainLogo3.png").getPath());
			}else {
				setPic(proImg.getpPic());
			}
			proSummary = pService.selectProductSummary(product);
			proSummary(proSummary);
			tfWon.setText(String.format("%,d", proSummary.getpPrice()));
			
		}
	}
	
	private void proSummary(Product proSummary) {
		lblPNo.setText(String.format("P%04d", proSummary.getpNo()));
		lblSCName.setText(String.format(proSummary.getpName()));
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
	
	protected void btnResetActionPerformed(ActionEvent e) {
		pCORPanel.clearTf();
		pCORPanel.setNum(service.lastOrder());
		pCORPanel.setCName(ClientMainUIPanel.loginCl);
		setPic(getClass().getClassLoader().getResource("mainLogo3.png").getPath());
		lblPNo.setText("품목번호");
		lblSCName.setText("품목명");
		lblPPrice.setText("0");
		spNum.setValue(1);
		cmbNum.setSelectedItem("선택");
		tfWon.setText("0");
		pCORPanel.tfOQty.setEditable(true);
	}
	
	protected void btnQtyCheckActionPerformed(ActionEvent e) {
		if(pCORPanel.cmbPList.getSelectedItem().toString().equals("")) {
			JOptionPane.showMessageDialog(null, "먼저 품목을 조회해주세요.");
		}else {
			pQty = iqService.showQty(proSummary);
			if(pQty == 0 || pQty < 0) {
				pCORPanel.tfOQty.setEditable(false);
				JOptionPane.showMessageDialog(null, "수량이 부족하여 주문할 수 없습니다.");
			}else {
				JOptionPane.showMessageDialog(null, "본 상품은 현재 수량이 "+pQty+"개 입니다.");
			}
		}
	}
	public void stateChanged(ChangeEvent e) {
		if (e.getSource() == spNum) {
			spNumStateChanged(e);
		}
	}
	protected void spNumStateChanged(ChangeEvent e) {
		int num = (int) spNum.getValue();
		tfWon.setText(String.format("%,d", num*(proSummary.getpPrice())));
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cmbNum) {
			cmbNumItemStateChanged(e);
		}
	}
	protected void cmbNumItemStateChanged(ItemEvent e) {
		if(e.getItem().equals("선택")) {
			int num = (int) spNum.getValue();
			tfWon.setText(String.format("%,d", num*(proSummary.getpPrice())));
		}
		if(e.getItem().equals("50개 이상")) {
			double rate = 0.1;
			int won = Integer.parseInt(tfWon.getText().replace(",", "").trim());
			int sub = (int) Math.floor(rate*won);
			tfWon.setText(String.format("%,d", won-sub));
		}
		if(e.getItem().equals("100개 이상")) {
			double rate = 0.15;
			int won = Integer.parseInt(tfWon.getText().replace(",", "").trim());
			int sub = (int) Math.floor(rate*won);
			tfWon.setText(String.format("%,d", won-sub));
		}
	}
}
