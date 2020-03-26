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

import yi_java3st_1team.clientmanagement.dto.Client;
import yi_java3st_1team.exception.InvalidCheckException;
import yi_java3st_1team.main.ui.panel.JTextFieldHintUI;

@SuppressWarnings("serial")
public class CRegisterPanel extends AbsItemPanel<Client> {
	private JLabel lblCNo;
	private JLabel lblCName;
	private JLabel lblCCEO;
	private JLabel lblCAddress;
	private JLabel lblCTel;
	private JLabel lblStaff;
	private JTextField tfCNo;
	private JTextField tfCName;
	private JTextField tfCCEO;
	public JTextField tfCAddress;
	private JTextField tfCTel;
	private JTextField tfStaff;
	private JLabel lblNewLabel;
	private JLabel notNull1;
	private JLabel notNull2;
	private JLabel notNull3;
	private JLabel notNull4;

	public CRegisterPanel() {

		initialize();
	}

	private void initialize() {
		setBounds(new Rectangle(0, 0, 635, 700));
		setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setOpaque(false);
		add(panel, BorderLayout.CENTER);
		panel.setBounds(new Rectangle(0, 0, 635, 700));
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setLayout(null);

		lblCNo = new JLabel("고 객 번 호");
		lblCNo.setForeground(Color.BLACK);
		lblCNo.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 16));
		lblCNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCNo.setBounds(12, 25, 120, 30);
		panel.add(lblCNo);

		lblCName = new JLabel("상   호   명");
		lblCName.setForeground(Color.BLACK);
		lblCName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblCName.setBounds(12, 95, 120, 30);
		panel.add(lblCName);

		lblCCEO = new JLabel("대   표   명");
		lblCCEO.setForeground(Color.BLACK);
		lblCCEO.setHorizontalAlignment(SwingConstants.CENTER);
		lblCCEO.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblCCEO.setBounds(12, 165, 120, 30);
		panel.add(lblCCEO);

		lblCAddress = new JLabel("주        소");
		lblCAddress.setForeground(Color.BLACK);
		lblCAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblCAddress.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblCAddress.setBounds(12, 235, 120, 30);
		panel.add(lblCAddress);

		lblCTel = new JLabel("전 화 번 호");
		lblCTel.setForeground(Color.BLACK);
		lblCTel.setHorizontalAlignment(SwingConstants.CENTER);
		lblCTel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblCTel.setBounds(12, 305, 120, 30);
		panel.add(lblCTel);

		lblStaff = new JLabel("담 당 직 원");
		lblStaff.setForeground(Color.BLACK);
		lblStaff.setHorizontalAlignment(SwingConstants.CENTER);
		lblStaff.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		lblStaff.setBounds(12, 375, 120, 30);
		panel.add(lblStaff);

		tfCNo = new JTextField();
		tfCNo.setForeground(new Color(0, 0, 128));
		tfCNo.setFont(new Font("굴림", Font.BOLD, 12));
		tfCNo.setEditable(false);
		tfCNo.setBounds(176, 25, 200, 30);
		panel.add(tfCNo);
		tfCNo.setColumns(10);

		tfCName = new JTextField();
		tfCName.setFont(new Font("굴림", Font.BOLD, 12));
		tfCName.setForeground(new Color(153, 0, 0));
		tfCName.setColumns(10);
		tfCName.setBounds(176, 95, 200, 30);
		panel.add(tfCName);
		tfCName.setUI(new JTextFieldHintUI(">> 중복확인", Color.gray));

		tfCCEO = new JTextField();
		tfCCEO.setFont(new Font("굴림", Font.PLAIN, 12));
		tfCCEO.setForeground(Color.BLACK);
		tfCCEO.setColumns(10);
		tfCCEO.setBounds(176, 165, 200, 30);
		panel.add(tfCCEO);

		tfCAddress = new JTextField();
		tfCAddress.setFont(new Font("굴림", Font.PLAIN, 12));
		tfCAddress.setForeground(Color.BLACK);
		tfCAddress.setColumns(10);
		tfCAddress.setBounds(176, 235, 200, 30);
		panel.add(tfCAddress);
		tfCAddress.setUI(new JTextFieldHintUI(">> 주소검색", Color.gray));

		tfCTel = new JTextField();
		tfCTel.setFont(new Font("굴림", Font.PLAIN, 12));
		tfCTel.setForeground(Color.BLACK);
		tfCTel.setColumns(10);
		tfCTel.setBounds(176, 305, 200, 30);
		panel.add(tfCTel);
		tfCTel.setUI(new JTextFieldHintUI(" '-'로 구분하여 입력", Color.gray));

		tfStaff = new JTextField();
		tfStaff.setFont(new Font("굴림", Font.PLAIN, 12));
		tfStaff.setForeground(Color.RED);
		tfStaff.setColumns(10);
		tfStaff.setBounds(176, 375, 200, 30);
		panel.add(tfStaff);
		
		notNull1 = new JLabel("*");
		notNull1.setForeground(Color.RED);
		notNull1.setFont(new Font("굴림", Font.BOLD, 26));
		notNull1.setBounds(123, 29, 14, 15);
		panel.add(notNull1);
		
		notNull2 = new JLabel("*");
		notNull2.setForeground(Color.RED);
		notNull2.setFont(new Font("굴림", Font.BOLD, 26));
		notNull2.setBounds(122, 99, 14, 15);
		panel.add(notNull2);
		
		notNull3 = new JLabel("*");
		notNull3.setForeground(Color.RED);
		notNull3.setFont(new Font("굴림", Font.BOLD, 26));
		notNull3.setBounds(123, 239, 14, 15);
		panel.add(notNull3);
		
		notNull4 = new JLabel("*");
		notNull4.setForeground(Color.RED);
		notNull4.setFont(new Font("굴림", Font.BOLD, 26));
		notNull4.setBounds(119, 309, 14, 15);
		panel.add(notNull4);

		lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 400, 430);
		panel.add(lblNewLabel);

	}

	public void setNum(Client item) {
		tfCNo.setText(String.format("C%04d", item.getcNo() + 1));
	}

	public String getName() {
		return tfCName.getText().trim();
	}

	@Override
	public Client getItem() {
		int cNo = Integer.parseInt(tfCNo.getText().substring(1));
		String cName = tfCName.getText().trim();
		String cCeo = tfCCEO.getText().trim();
		String cAddress = tfCAddress.getText().trim();
		String cTel = tfCTel.getText().trim();
		int cSalesman = Integer.parseInt(tfStaff.getText().substring(2));
		return new Client(cNo, cName, cCeo, cAddress, cTel, cSalesman);
	}

	@Override
	public void setItem(Client item) {
		tfCNo.setText(String.format("C%04d", item.getcNo()));
		tfCName.setText(item.getcName());
		tfCCEO.setText(item.getcCeo());
		tfCAddress.setText(item.getcAddress());
		tfCTel.setText(item.getcTel());
		tfStaff.setText(String.format("EE%04d", item.getcSalesman()));
	}

	@Override
	public void clearTf() {
		tfCNo.setText("");
		tfCName.setText("");
		tfCCEO.setText("");
		tfCAddress.setText("");
		tfCTel.setText("");
		tfStaff.setText("");

	}

	@Override
	public void validCheck() {
		if (tfCNo.getText().equals("") || tfCName.getText().equals("") || tfCCEO.getText().equals("")
				|| tfCAddress.getText().equals("") || tfCTel.getText().equals("") || tfStaff.getText().equals("")) {
			throw new InvalidCheckException();
		}
	}
}
