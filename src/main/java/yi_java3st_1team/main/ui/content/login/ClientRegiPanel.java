package yi_java3st_1team.main.ui.content.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class ClientRegiPanel<T>  extends AbsRegiPanel<T> implements ActionListener {
	private JTextField tfNo;
	private JTextField tfName;
	private JTextField tfId;
	private JPasswordField passFd1;
	private JPasswordField passFd2;
	private JTextField tfSalesman;
	private JTextField tfCeo;
	private JTextField tfAdd;
	private JButton zipCod;
	private JTextField tfTell;
	private JTextField tfMail;
	private JButton btnAdd;
	private JButton btnCancle;
	private JButton doubleCheck;
	private JLabel lblPassword;

	/**
	 * Create the panel.
	 */
	public ClientRegiPanel() {

		initialize();
	}
	private void initialize() {
		setSize(new Dimension(500, 650));
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblHeader = new JLabel("사용자 등록");
		lblHeader.setOpaque(true);
		lblHeader.setBackground(SystemColor.inactiveCaptionBorder);
		lblHeader.setForeground(Color.BLACK);
		lblHeader.setPreferredSize(new Dimension(60, 90));
		lblHeader.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 30));
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblHeader, BorderLayout.NORTH);
		
		JPanel pSection = new JPanel();
		pSection.setBackground(SystemColor.inactiveCaptionBorder);
		pSection.setBorder(new EmptyBorder(20, 40, 20, 40));
		add(pSection, BorderLayout.CENTER);
		pSection.setLayout(new BorderLayout(0, 0));
		
		JPanel pName = new JPanel();
		pName.setBackground(SystemColor.inactiveCaptionBorder);
		pName.setPreferredSize(new Dimension(150, 10));
		pSection.add(pName, BorderLayout.WEST);
		pName.setLayout(new GridLayout(0, 1, 10, 10));
		
		JLabel label = new JLabel("고 객 번 호  ");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		pName.add(label);
		
		JLabel label_1 = new JLabel("상 호 명  ");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		pName.add(label_1);
		
		JLabel label_2 = new JLabel("대 표 명  ");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		pName.add(label_2);
		
		JLabel label_3 = new JLabel("주 소  ");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		pName.add(label_3);
		
		JLabel lblNewLabel_2 = new JLabel("전 화 번 호  ");
		lblNewLabel_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		pName.add(lblNewLabel_2);
		
		JLabel label_4 = new JLabel("아 이 디  ");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		pName.add(label_4);
		
		JLabel label_5 = new JLabel("비 밀 번 호  ");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setForeground(Color.BLACK);
		label_5.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		pName.add(label_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		pName.add(lblNewLabel_6);
		
		JLabel lblNewLabel_1 = new JLabel("비 밀 번 호  확 인  ");
		lblNewLabel_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		pName.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		pName.add(lblNewLabel_3);
		
		JLabel label_6 = new JLabel("이 메 일  주 소  ");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		pName.add(label_6);
		
		JLabel lblNewLabel_4 = new JLabel("담 당 직 원  ");
		lblNewLabel_4.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		pName.add(lblNewLabel_4);
		
		JPanel pInput = new JPanel();
		pInput.setBackground(SystemColor.inactiveCaptionBorder);
		pInput.setPreferredSize(new Dimension(200, 10));
		pSection.add(pInput, BorderLayout.CENTER);
		pInput.setLayout(new GridLayout(0, 1, 10, 10));
		
		tfNo = new JTextField();
		tfNo.setColumns(10);
		pInput.add(tfNo);
		
		tfName = new JTextField();
		tfName.setColumns(10);
		pInput.add(tfName);
		
		tfCeo = new JTextField();
		pInput.add(tfCeo);
		tfCeo.setColumns(10);
		
		tfAdd = new JTextField();
		pInput.add(tfAdd);
		tfAdd.setColumns(10);
		
		tfTell = new JTextField();
		pInput.add(tfTell);
		tfTell.setColumns(10);
		
		tfId = new JTextField();
		tfId.setColumns(10);
		pInput.add(tfId);
		
		passFd1 = new JPasswordField();
		pInput.add(passFd1);
		
		JLabel lblPassText = new JLabel("<html>6자리 이상 이어야 하며 영문과 숫자를 반드시 포함해야 합니다<br></html>");
		lblPassText.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassText.setForeground(Color.BLUE);
		lblPassText.setFont(new Font("굴림", Font.PLAIN, 11));
		pInput.add(lblPassText);
		
		passFd2 = new JPasswordField();
		pInput.add(passFd2);
		
		lblPassword = new JLabel("비밀번호 일치");
		lblPassword.setFont(new Font("굴림", Font.BOLD, 14));
		lblPassword.setForeground(Color.RED);
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		pInput.add(lblPassword);
		
		tfMail = new JTextField();
		pInput.add(tfMail);
		tfMail.setColumns(10);
		
		tfSalesman = new JTextField();
		pInput.add(tfSalesman);
		tfSalesman.setColumns(10);
		
		JPanel pDoubleCheck = new JPanel();
		pDoubleCheck.setBackground(SystemColor.inactiveCaptionBorder);
		pDoubleCheck.setPreferredSize(new Dimension(80, 10));
		pSection.add(pDoubleCheck, BorderLayout.EAST);
		pDoubleCheck.setLayout(null);
		
		zipCod = new JButton("<html>우편<br>번호</html>");
		zipCod.addActionListener(this);
		zipCod.setForeground(Color.BLACK);
		zipCod.setFont(new Font("굴림", Font.BOLD, 12));
		zipCod.setBounds(12, 112, 60, 39);
		pDoubleCheck.add(zipCod);
		
		doubleCheck = new JButton("<html>중복<br>확인</html>");
		doubleCheck.addActionListener(this);
		doubleCheck.setForeground(Color.BLACK);
		doubleCheck.setFont(new Font("굴림", Font.BOLD, 12));
		doubleCheck.setBounds(12, 187, 60, 39);
		pDoubleCheck.add(doubleCheck);
		
		JPanel pBtns = new JPanel();
		pBtns.setBackground(SystemColor.inactiveCaptionBorder);
		pBtns.setPreferredSize(new Dimension(10, 45));
		add(pBtns, BorderLayout.SOUTH);
		
		btnAdd = new JButton("등록");
		btnAdd.addActionListener(this);
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setFont(new Font("굴림", Font.BOLD, 12));
		pBtns.add(btnAdd);
		
		btnCancle = new JButton("취소");
		btnCancle.addActionListener(this);
		btnCancle.setForeground(Color.BLACK);
		btnCancle.setFont(new Font("굴림", Font.BOLD, 12));
		pBtns.add(btnCancle);
	}
	
	@Override
	public T getItem() {
		return null;
	}
	
	
	@Override
	public void clearTf() {
		tfNo.setText("");
		tfName.setText("");
		tfCeo.setText("");
		tfAdd.setText("");
		tfTell.setText("");
		tfId.setText("");
		passFd1.setText("");
		passFd2.setText("");
		lblPassword.setText("");
		tfMail.setText("");
		tfSalesman.setText("");
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == doubleCheck) {
			actionPerformedDoubleCheck(e);
		}
		if (e.getSource() == zipCod) {
			actionPerformedZipCod(e);
		}
		if (e.getSource() == btnCancle) {
			actionPerformedBtnCancle(e);
		}
		if (e.getSource() == btnAdd) {
			actionPerformedBtnAdd(e);
		}
	}
	
	//등록
	protected void actionPerformedBtnAdd(ActionEvent e) {
	}
	
	//취소(초기화)
	protected void actionPerformedBtnCancle(ActionEvent e) {
		clearTf();
	}
	
	//우편번호
	protected void actionPerformedZipCod(ActionEvent e) {
	}
	
	//중복확인
	protected void actionPerformedDoubleCheck(ActionEvent e) {
	}

}
