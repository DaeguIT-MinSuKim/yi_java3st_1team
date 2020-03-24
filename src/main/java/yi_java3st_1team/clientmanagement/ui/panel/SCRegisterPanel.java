package yi_java3st_1team.clientmanagement.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import yi_java3st_1team.clientmanagement.dto.Supplier;
import yi_java3st_1team.clientmanagement.dto.ZipCode;
import yi_java3st_1team.exception.InvalidCheckException;
import yi_java3st_1team.main.ui.panel.JTextFieldHintUI;

@SuppressWarnings("serial")
public class SCRegisterPanel extends AbsItemPanel<Supplier> {

	private JLabel lblSCNo;
	private JLabel lblSCName;
	private JLabel lblSCBln;
	private JLabel lblSCAddress;
	private JLabel lblSCTel;
	private JLabel lblSCFax;
	private JTextField tfSCNo;
	private JTextField tfSCName;
	private JTextField tfSCBln;
	public JTextField tfSCAddress;
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
		lblSCNo.setBounds(12, 25, 120, 30);
		panel.add(lblSCNo);

		lblSCName = new JLabel("회  사  명");
		lblSCName.setForeground(Color.BLACK);
		lblSCName.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSCName.setBounds(12, 95, 120, 30);
		panel.add(lblSCName);

		lblSCBln = new JLabel("사업자등록번호");
		lblSCBln.setForeground(Color.BLACK);
		lblSCBln.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCBln.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSCBln.setBounds(12, 165, 120, 30);
		panel.add(lblSCBln);

		lblSCAddress = new JLabel("주       소");
		lblSCAddress.setForeground(Color.BLACK);
		lblSCAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCAddress.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSCAddress.setBounds(12, 235, 120, 30);
		panel.add(lblSCAddress);

		lblSCTel = new JLabel("전 화 번 호");
		lblSCTel.setForeground(Color.BLACK);
		lblSCTel.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCTel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSCTel.setBounds(12, 305, 120, 30);
		panel.add(lblSCTel);

		lblSCFax = new JLabel("FAX 번 호");
		lblSCFax.setForeground(Color.BLACK);
		lblSCFax.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCFax.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblSCFax.setBounds(12, 375, 120, 30);
		panel.add(lblSCFax);

		tfSCNo = new JTextField();
		tfSCNo.setForeground(new Color(0, 0, 128));
		tfSCNo.setFont(new Font("굴림", Font.BOLD, 12));
		tfSCNo.setEditable(false);
		tfSCNo.setBounds(176, 25, 200, 30);
		panel.add(tfSCNo);
		tfSCNo.setColumns(10);

		tfSCName = new JTextField();
		tfSCName.setForeground(new Color(153, 0, 0));
		tfSCName.setFont(new Font("굴림", Font.BOLD, 12));
		tfSCName.setColumns(10);
		tfSCName.setBounds(176, 95, 200, 30);
		panel.add(tfSCName);
		tfSCName.setUI(new JTextFieldHintUI(">> 중복확인", Color.gray));

		tfSCBln = new JTextField();
		tfSCBln.setForeground(Color.BLACK);
		tfSCBln.setFont(new Font("굴림", Font.PLAIN, 12));
		tfSCBln.setColumns(10);
		tfSCBln.setBounds(176, 165, 200, 30);
		panel.add(tfSCBln);
		tfSCBln.setUI(new JTextFieldHintUI(" 000-00-00000", Color.gray));

		tfSCAddress = new JTextField();
		tfSCAddress.setForeground(Color.BLACK);
		tfSCAddress.setFont(new Font("굴림", Font.PLAIN, 12));
		tfSCAddress.setHorizontalAlignment(SwingConstants.LEFT);
		tfSCAddress.setColumns(10);
		tfSCAddress.setBounds(176, 235, 200, 30);
		panel.add(tfSCAddress);
		tfSCAddress.setUI(new JTextFieldHintUI(">> 주소검색", Color.gray));
		

		tfSCTel = new JTextField();
		tfSCTel.setForeground(Color.BLACK);
		tfSCTel.setFont(new Font("굴림", Font.PLAIN, 12));
		tfSCTel.setColumns(10);
		tfSCTel.setBounds(176, 305, 200, 30);
		panel.add(tfSCTel);
		tfSCTel.setUI(new JTextFieldHintUI(" '-'로 구분하여 입력", Color.gray));

		tfSCFax = new JTextField();
		tfSCFax.setForeground(Color.BLACK);
		tfSCFax.setFont(new Font("굴림", Font.PLAIN, 12));
		tfSCFax.setColumns(10);
		tfSCFax.setBounds(176, 375, 200, 30);
		panel.add(tfSCFax);
		tfSCFax.setUI(new JTextFieldHintUI(" '-'로 구분하여 입력", Color.gray));

		
		JLabel notNull1 = new JLabel("*");
		notNull1.setBounds(118, 29, 14, 15);
		panel.add(notNull1);
		notNull1.setFont(new Font("굴림", Font.BOLD, 26));
		notNull1.setForeground(Color.RED);
		
		JLabel notNull2 = new JLabel("*");
		notNull2.setForeground(Color.RED);
		notNull2.setFont(new Font("굴림", Font.BOLD, 26));
		notNull2.setBounds(115, 99, 14, 15);
		panel.add(notNull2);
		
		JLabel notNull3 = new JLabel("*");
		notNull3.setForeground(Color.RED);
		notNull3.setFont(new Font("굴림", Font.BOLD, 26));
		notNull3.setBounds(129, 170, 14, 15);
		panel.add(notNull3);
		
		JLabel notNull4 = new JLabel("*");
		notNull4.setForeground(Color.RED);
		notNull4.setFont(new Font("굴림", Font.BOLD, 26));
		notNull4.setBounds(118, 310, 14, 15);
		panel.add(notNull4);
	}

	public void setNum(Supplier item) {
		tfSCNo.setText(String.format("S%04d", item.getsNo() + 1));
	}

	@Override
	public Supplier getItem() {
		int sNo = Integer.parseInt(tfSCNo.getText().substring(1));
		String sName = tfSCName.getText().trim();
		String sBln = tfSCBln.getText().trim();
		String sAddress = tfSCAddress.getText().trim();
		String sTel = tfSCTel.getText().trim();
		String sFax = tfSCFax.getText().trim();
		return new Supplier(sNo, sName, sBln, sAddress, sTel, sFax);
	}

	@Override
	public void setItem(Supplier item) {
		tfSCNo.setText(String.format("S%04d", item.getsNo()));
		tfSCName.setText(item.getsName());
		tfSCBln.setText(item.getsBln());
		tfSCAddress.setText(item.getsAddress());
		tfSCTel.setText(item.getsTel());
		tfSCFax.setText(item.getsFax());

	}

	public void setAddr(ZipCode item) {
		tfSCAddress.setText(item.getAddress());
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
		if (tfSCNo.getText().equals("") || tfSCName.getText().equals("") || tfSCBln.getText().equals("")
				|| tfSCAddress.getText().equals("") || tfSCTel.getText().equals("") || tfSCFax.getText().equals("")) {
			throw new InvalidCheckException();
		}
	}
	
	public void clearTfScName() {
		tfSCName.setText("");
	}
}
