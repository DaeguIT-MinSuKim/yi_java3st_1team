package yi_java3st_1team.clientmanagement.ui;

import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import yi_java3st_1team.clientmanagement.dto.ZipCode;
import yi_java3st_1team.clientmanagement.ui.panel.SCRegisterPanel;
import yi_java3st_1team.clientmanagement.ui.service.ZipCodeUIService;

@SuppressWarnings("serial")
public class ZipCodePanel extends JPanel implements ItemListener, ActionListener {
	private JTextField tfDoro;
	private JTextField tfNo1;
	private JTextField tfNo2;
	private JTextField tfAll;
	private JTextField tfDetail;
	private JComboBox cmbSido;
	private String selectItem;
	private JButton btnSearch;
	private ZipCodeUIService service;
	public ZipCode addr;
	public SCRegisterPanel pSCRPanel;
	

	public ZipCodePanel() {
		service = new ZipCodeUIService();
		initialize();
	}
	
	public JTextField getTfAll() {
		return tfAll;
	}

	public void setTfAll(JTextField tfAll) {
		this.tfAll = tfAll;
	}

	public JTextField getTfDetail() {
		return tfDetail;
	}

	public void setTfDetail(JTextField tfDetail) {
		this.tfDetail = tfDetail;
	}

	private void initialize() {
		setBounds(new Rectangle(0, 0, 800, 300));
		setBackground(SystemColor.inactiveCaptionBorder);
		setLayout(null);
		
		JLabel lblAddr = new JLabel("주 소 검 색");
		lblAddr.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddr.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 26));
		lblAddr.setBounds(0, 24, 800, 40);
		add(lblAddr);
		
		JLabel lblDoro = new JLabel("도 로 명");
		lblDoro.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 14));
		lblDoro.setBounds(190, 84, 120, 25);
		add(lblDoro);
		
		JLabel lblNo1 = new JLabel("건물번호 본번");
		lblNo1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 14));
		lblNo1.setBounds(340, 84, 120, 25);
		add(lblNo1);
		
		tfDoro = new JTextField();
		tfDoro.setBounds(190, 120, 120, 30);
		add(tfDoro);
		tfDoro.setColumns(10);
		
		tfNo1 = new JTextField();
		tfNo1.setBounds(340, 120, 120, 30);
		add(tfNo1);
		tfNo1.setColumns(10);
		
		JLabel lblNo2 = new JLabel("건물번호 부번");
		lblNo2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 14));
		lblNo2.setBounds(490, 84, 120, 25);
		add(lblNo2);
		
		tfNo2 = new JTextField();
		tfNo2.setColumns(10);
		tfNo2.setBounds(490, 120, 120, 30);
		add(tfNo2);
		
		btnSearch = new JButton("검  색");
		btnSearch.addActionListener(this);
		btnSearch.setBounds(640, 120, 120, 30);
		add(btnSearch);
		
		cmbSido = new JComboBox();
		cmbSido.addItemListener(this);
		cmbSido.setModel(new DefaultComboBoxModel(new String[] {"선택", "서울특별시", "부산광역시", "대구광역시", "인천광역시", "광주광역시", "대전광역시", "울산광역시", "경기도", "강원도", "충청북도", "충청남도", "전라북도", "전라남도", "경상북도", "경상남도", "제주특별자치도", "세종특별자치시"}));
		cmbSido.setBounds(40, 120, 120, 30);
		add(cmbSido);
		
		JLabel lblSido = new JLabel("시 도");
		lblSido.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 14));
		lblSido.setBounds(40, 84, 120, 25);
		add(lblSido);
		
		tfAll = new JTextField();
		tfAll.setBounds(40, 180, 370, 30);
		add(tfAll);
		tfAll.setColumns(10);
		
		tfDetail = new JTextField();
		tfDetail.setBounds(425, 180, 185, 30);
		add(tfDetail);
		tfDetail.setColumns(10);
		
		JLabel lblDetail = new JLabel("(상세주소)");
		lblDetail.setBounds(618, 180, 93, 30);
		add(lblDetail);
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cmbSido) {
			comboBoxItemStateChanged(e);
		}
	}
	public String comboBoxItemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			selectItem = (String) cmbSido.getSelectedItem();
		}
		return null;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSearch) {
			btnSearchActionPerformed(e);
		}
	}
	public void btnSearchActionPerformed(ActionEvent e) {
		if(selectItem == null) {
			return;
		}
		String zSido = selectItem.toString();
		String zDoro = tfDoro.getText();
		int zNum1 = Integer.parseInt(tfNo1.getText().trim());
		if(tfNo2.getText().equals("")) {
			ZipCode zipNumOne = new ZipCode(zSido, zDoro, zNum1);
			tfAll.setText(service.searchAddressNumOne(zipNumOne).toString()); 
		}else {
			int zNum2 = Integer.parseInt(tfNo2.getText().trim());
			ZipCode zipNumAll = new ZipCode(zSido, zDoro, zNum1, zNum2);
			tfAll.setText(service.searchAddressNumAll(zipNumAll).toStringAll());
		}
		cmbSido.setSelectedIndex(0);
		tfDoro.setText("");
		tfNo1.setText("");
		tfNo2.setText("");
	}
}
