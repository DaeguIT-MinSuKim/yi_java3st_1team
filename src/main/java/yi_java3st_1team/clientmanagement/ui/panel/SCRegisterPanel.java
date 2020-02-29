package yi_java3st_1team.clientmanagement.ui.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import yi_java3st_1team.clientmanagement.dto.Supplier;
import yi_java3st_1team.exception.InvalidCheckException;

@SuppressWarnings("serial")
public class SCRegisterPanel extends AbsItemPanel<Supplier> {

	private JLabel lblSC;
	private JLabel lblSCNo;
	private JLabel lblSCName;
	private JLabel lblSCBln;
	private JLabel lblSCAddress;
	private JLabel lblSCTel;
	private JLabel lblSCFax;
	private JTextField tfSCNo;
	private JTextField tfSCName;
	private JTextField tfSCBln;
	private JTextField tfSCAddress;
	private JTextField tfSCTel;
	private JTextField tfSCFax;
	public SCRegisterPanel() {

		initialize();
	}
	private void initialize() {
		setBounds(new Rectangle(0, 0, 635, 700));
		setLayout(null);
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setBounds(new Rectangle(0, 0, 400, 430));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		
		lblSCNo = new JLabel("회 사 번 호");
		lblSCNo.setForeground(Color.BLACK);
		lblSCNo.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSCNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCNo.setBounds(12, 10, 120, 30);
		panel.add(lblSCNo);
		
		lblSCName = new JLabel("회  사  명");
		lblSCName.setForeground(Color.BLACK);
		lblSCName.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSCName.setBounds(12, 80, 120, 30);
		panel.add(lblSCName);
		
		lblSCBln = new JLabel("사업자등록번호");
		lblSCBln.setForeground(Color.BLACK);
		lblSCBln.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCBln.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSCBln.setBounds(12, 150, 120, 30);
		panel.add(lblSCBln);
		
		lblSCAddress = new JLabel("주       소");
		lblSCAddress.setForeground(Color.BLACK);
		lblSCAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCAddress.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSCAddress.setBounds(12, 220, 120, 30);
		panel.add(lblSCAddress);
		
		lblSCTel = new JLabel("전 화 번 호");
		lblSCTel.setForeground(Color.BLACK);
		lblSCTel.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCTel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSCTel.setBounds(12, 290, 120, 30);
		panel.add(lblSCTel);
		
		lblSCFax = new JLabel("FAX 번 호");
		lblSCFax.setForeground(Color.BLACK);
		lblSCFax.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCFax.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSCFax.setBounds(12, 360, 120, 30);
		panel.add(lblSCFax);
		
		tfSCNo = new JTextField();
		tfSCNo.setBounds(176, 10, 200, 30);
		panel.add(tfSCNo);
		tfSCNo.setColumns(10);
		
		tfSCName = new JTextField();
		tfSCName.setColumns(10);
		tfSCName.setBounds(176, 80, 200, 30);
		panel.add(tfSCName);
		
		tfSCBln = new JTextField();
		tfSCBln.setColumns(10);
		tfSCBln.setBounds(176, 150, 200, 30);
		panel.add(tfSCBln);
		
		tfSCAddress = new JTextField();
		tfSCAddress.setColumns(10);
		tfSCAddress.setBounds(176, 220, 200, 30);
		panel.add(tfSCAddress);
		
		tfSCTel = new JTextField();
		tfSCTel.setColumns(10);
		tfSCTel.setBounds(176, 290, 200, 30);
		panel.add(tfSCTel);
		
		tfSCFax = new JTextField();
		tfSCFax.setColumns(10);
		tfSCFax.setBounds(176, 360, 200, 30);
		panel.add(tfSCFax);
		
	}
	@Override
	public Supplier getItem() {
		int sNo = Integer.parseInt(tfSCNo.getText().substring(3));
		String sName = tfSCName.getText().trim();
		String sBln = tfSCBln.getText().trim();
		String sAddress = tfSCAddress.getText().trim();
		String sTel = tfSCTel.getText().trim();
		String sFax = tfSCFax.getText().trim();
		return new Supplier(sNo, sName, sBln, sAddress, sTel, sFax);
	}
	@Override
	public void setItem(Supplier item) {
		tfSCNo.setText(String.format("D%03d", item.getsNo()));
		tfSCName.setText(item.getsName());
		tfSCBln.setText(item.getsBln());
		tfSCAddress.setText(item.getsAddress());
		tfSCTel.setText(item.getsTel());
		tfSCFax.setText(item.getsFax());
		
	}
	@Override
	public void clearTf() {
		tfSCNo.setText("");
		tfSCName.setText("");
		tfSCBln.setText("");
		tfSCAddress.setText("");
		tfSCTel.setText("");
		tfSCFax.setText("");
		
	}
	@Override
	public void validCheck() {
		if(tfSCNo.getText().equals("") || tfSCName.getText().equals("") || tfSCBln.getText().equals("") || tfSCAddress.getText().equals("") ||
				tfSCTel.getText().equals("") || tfSCFax.getText().equals("")) {
			throw new InvalidCheckException();
		}
	}
}
