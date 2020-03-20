package yi_java3st_1team.productmanagement.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

import yi_java3st_1team.clientmanagement.dto.Supplier;
import yi_java3st_1team.clientmanagement.ui.panel.AbsItemPanel;
import yi_java3st_1team.clientmanagement.ui.service.SupplierUIService;
import yi_java3st_1team.exception.InvalidCheckException;
import yi_java3st_1team.productmanagement.dto.Category;
import yi_java3st_1team.productmanagement.dto.Product;
import yi_java3st_1team.productmanagement.ui.service.SWUIService;

@SuppressWarnings("serial")
public class SWRegisterPanel extends AbsItemPanel<Product> implements ItemListener {
	private JLabel lblPNo;
	private JLabel lblPCate;
	private JLabel lblPName;
	private JLabel lblPCost;
	private JLabel lblPPrice;
	private JLabel lblPSName;
	private JLabel lblPQty;
	private JLabel lblPDate;
	private JTextField tfPNo;
	public JTextField tfPName;
	public JTextField tfPCost;
	public JTextField tfPPrice;
	public JTextField tfPSName;
	public JTextField tfPQty;
	public JDateChooser tfPDate;
	private JComboBox<Category> cmbCate;
	public JTextField tfImgSearch;
	private SWUIService service;
	private String pPicPath;
	private byte[] pPics;
	private SupplierUIService supService;
	
	public SWRegisterPanel() {
		service = new SWUIService();
		supService = new SupplierUIService();
		initialize();
	}
	
	public JTextField getTfPSName() {
		return tfPSName;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize() {
		setBounds(new Rectangle(0, 0, 635, 700));
		setLayout(null);
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setBounds(new Rectangle(0, 0, 400, 440));
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setLayout(null);
		
		lblPNo = new JLabel("품 목 번 호");
		lblPNo.setForeground(Color.BLACK);
		lblPNo.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPNo.setBounds(12, 4, 120, 30);
		panel.add(lblPNo);
		
		lblPCate = new JLabel("분  류  명");
		lblPCate.setForeground(Color.BLACK);
		lblPCate.setHorizontalAlignment(SwingConstants.CENTER);
		lblPCate.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPCate.setBounds(12, 54, 120, 30);
		panel.add(lblPCate);
		
		lblPName = new JLabel("품  목  명");
		lblPName.setForeground(Color.BLACK);
		lblPName.setHorizontalAlignment(SwingConstants.CENTER);
		lblPName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPName.setBounds(12, 104, 120, 30);
		panel.add(lblPName);
		
		lblPCost = new JLabel("공 급 가 격");
		lblPCost.setForeground(Color.BLACK);
		lblPCost.setHorizontalAlignment(SwingConstants.CENTER);
		lblPCost.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPCost.setBounds(12, 154, 120, 30);
		panel.add(lblPCost);
		
		lblPPrice = new JLabel("판 매 가 격");
		lblPPrice.setForeground(Color.BLACK);
		lblPPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblPPrice.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPPrice.setBounds(12, 204, 120, 30);
		panel.add(lblPPrice);
		
		lblPSName = new JLabel("공급 회사명");
		lblPSName.setForeground(Color.BLACK);
		lblPSName.setHorizontalAlignment(SwingConstants.CENTER);
		lblPSName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPSName.setBounds(12, 254, 120, 30);
		panel.add(lblPSName);
		
		lblPQty = new JLabel("최초재고수량");
		lblPQty.setForeground(Color.BLACK);
		lblPQty.setHorizontalAlignment(SwingConstants.CENTER);
		lblPQty.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPQty.setBounds(12, 304, 120, 30);
		panel.add(lblPQty);
		
		lblPDate = new JLabel("최초등록일자");
		lblPDate.setForeground(Color.BLACK);
		lblPDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblPDate.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblPDate.setBounds(12, 354, 120, 30);
		panel.add(lblPDate);
		
		tfPNo = new JTextField();
		tfPNo.setEditable(false);
		tfPNo.setBounds(176, 4, 200, 30);
		panel.add(tfPNo);
		tfPNo.setColumns(10);
		
		tfPName = new JTextField();
		tfPName.setColumns(10);
		tfPName.setBounds(176, 104, 200, 30);
		panel.add(tfPName);
		
		tfPCost = new JTextField();
		tfPCost.setColumns(10);
		tfPCost.setBounds(176, 154, 200, 30);
		panel.add(tfPCost);
		
		tfPPrice = new JTextField();
		tfPPrice.setColumns(10);
		tfPPrice.setBounds(176, 204, 200, 30);
		panel.add(tfPPrice);
		
		tfPSName = new JTextField();
		tfPSName.setColumns(10);
		tfPSName.setBounds(176, 254, 200, 30);
		panel.add(tfPSName);
		
		tfPQty = new JTextField();
		tfPQty.setColumns(10);
		tfPQty.setBounds(176, 304, 200, 30);
		panel.add(tfPQty);
		
		tfPDate = new JDateChooser(new Date(), "yyyy-MM-dd");
		tfPDate.setBounds(176, 354, 200, 30);
		panel.add(tfPDate);
		
		cmbCate = new JComboBox();
		cmbCate.addItemListener(this);
		cmbCate.setBounds(176, 54, 200, 30);
		panel.add(cmbCate);
		
		JLabel lblImgSearch = new JLabel("제품 이미지");
		lblImgSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgSearch.setForeground(Color.BLACK);
		lblImgSearch.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblImgSearch.setBounds(12, 404, 120, 30);
		panel.add(lblImgSearch);
		
		tfImgSearch = new JTextField();
		tfImgSearch.setColumns(10);
		tfImgSearch.setBounds(176, 404, 200, 30);
		panel.add(tfImgSearch);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 400, 440);
		panel.add(lblNewLabel);
		
	}
	
	public void setService(SWUIService service) {
		this.service = service;
		setCmbCateList(service.showCategoryList());
	}
	
	private void setCmbCateList(List<Category> showCategoryList) {
		DefaultComboBoxModel<Category> model = new DefaultComboBoxModel<Category>(new Vector<>(showCategoryList));
		cmbCate.setModel(model);
		cmbCate.setSelectedIndex(-1);
		
	}
	
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cmbCate) {
			cmbCateItemStateChanged(e);
		}
	}
	protected void cmbCateItemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			
		}
	}
	
	public void setNum(Product item) {
		tfPNo.setText(String.format("P%04d", item.getpNo()+1));
	}
	
	public Product getItem1() {
		int pNo = Integer.parseInt(tfPNo.getText().substring(1));
		String pName = tfPName.getText().trim();
		return new Product(pNo, pName);
	}
	
	@Override
	public Product getItem() {
		int pNo = Integer.parseInt(tfPNo.getText().substring(1));
		Category pCate = (Category) cmbCate.getSelectedItem();
		String pName = tfPName.getText().trim();
		int pCost = Integer.parseInt(tfPCost.getText().trim());
		int pPrice = Integer.parseInt(tfPPrice.getText().trim());
		Supplier supplier = new Supplier(tfPSName.getText().trim(), null, null);
		Supplier pSno = supService.overlapSupplier(supplier);
		System.out.println(pSno.toString());
		int pQty = Integer.parseInt(tfPQty.getText().trim());
		Date pDate = tfPDate.getDate();
		if(tfImgSearch.getText().trim().equals("")) {
			pPicPath = null;
			pPics = null;
		}else {
			pPicPath = tfImgSearch.getText().trim();
			pPics = getImg(pPicPath);
		}		
		return new Product(pNo, pCate, pName, pCost, pPrice, pSno, pQty, pDate, pPics, pPicPath);
	}
	private byte[] getImg(String path) {
		byte[] pic = null;
		File file = new File(path);
		try(InputStream is = new FileInputStream(file)){
			pic = new byte[is.available()];
			is.read(pic);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pic;
	}
	@Override
	public void setItem(Product item) {
		tfPNo.setText(String.format("P%04d", item.getpNo()));
		cmbCate.setSelectedItem(item.getpCate());
		tfPName.setText(item.getpName());
		tfPCost.setText(String.format("%d", item.getpCost()));
		tfPPrice.setText(String.format("%d", item.getpPrice()));
		tfPSName.setText(item.getpSno().getsName());
		tfPQty.setText(String.format("%s", item.getpQty()));
		tfPDate.setDate(item.getpDate());
		if(item.getpPicPath()==null) {
			tfImgSearch.setText("");
		}else {
			tfImgSearch.setText(item.getpPicPath());
		}
	}

	@Override
	public void clearTf() {
		tfPNo.setText("");
		cmbCate.setSelectedIndex(-1);
		tfPName.setText("");
		tfPCost.setText("");
		tfPPrice.setText("");
		tfPSName.setText("");
		tfPQty.setText("");
		tfPDate.setDate(new Date());
		tfImgSearch.setText("");
	}
	@Override
	public void validCheck() {
		if(tfPNo.getText().equals("")||cmbCate.getSelectedIndex()==-1||tfPName.getText().equals("")||tfPCost.getText().equals("")
				||tfPPrice.getText().equals("")||tfPSName.getText().equals("")||tfPQty.getText().equals("")) {
			throw new InvalidCheckException();
		}
	}
	public void clearTfPName() {
		tfPName.setText("");
	}
	public void clearTfPSName() {
		tfPSName.setText("");
	}
}
