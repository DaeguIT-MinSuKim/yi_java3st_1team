package yi_java3st_1team.main.ui.content.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class EmpRegiPanel<T> extends AbsRegiPanel<T> implements ActionListener {
	private JTextField tfNo;
	private JTextField tfName;
	private JTextField tfId;
	private JPasswordField passFd1;
	private JPasswordField passFd2;
	private JTextField tfMail;
	private JComboBox deptCombo;
	private JComboBox titleCombo;
	private JLabel lblPassword;
	private JButton btnAdd;
	private JButton btnCancle;
	private JButton doubleCheck1;
	private JButton doubleCheck2;

	/**
	 * Create the panel.
	 */
	public EmpRegiPanel() {

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
		
		JLabel lblEmp = new JLabel("사 원 번 호  ");
		lblEmp.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmp.setForeground(Color.BLACK);
		lblEmp.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		pName.add(lblEmp);
		
		JLabel lblName = new JLabel("이 름  ");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setForeground(Color.BLACK);
		lblName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		pName.add(lblName);
		
		JLabel lblDept = new JLabel("부 서 명  ");
		lblDept.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDept.setForeground(Color.BLACK);
		lblDept.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		pName.add(lblDept);
		
		JLabel lblTitle = new JLabel("직 급  ");
		lblTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTitle.setForeground(Color.BLACK);
		lblTitle.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		pName.add(lblTitle);
		
		JLabel lblId = new JLabel("아 이 디  ");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setForeground(Color.BLACK);
		lblId.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		pName.add(lblId);
		
		JLabel lblPass1 = new JLabel("비 밀 번 호  ");
		lblPass1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPass1.setForeground(Color.BLACK);
		lblPass1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		pName.add(lblPass1);
		
		JLabel lbl1 = new JLabel("");
		pName.add(lbl1);
		
		JLabel lblPass2 = new JLabel("비 밀 번 호  확 인  ");
		lblPass2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		lblPass2.setHorizontalAlignment(SwingConstants.RIGHT);
		pName.add(lblPass2);
		
		JLabel lbl2 = new JLabel("");
		pName.add(lbl2);
		
		JLabel lblEmail = new JLabel("이 메 일  주 소  ");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		pName.add(lblEmail);
		
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
		
		deptCombo = new JComboBox();
		pInput.add(deptCombo);
		
		titleCombo = new JComboBox();
		pInput.add(titleCombo);
		
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
		lblPassword.setForeground(Color.RED);
		lblPassword.setFont(new Font("굴림", Font.BOLD, 14));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		pInput.add(lblPassword);
		
		tfMail = new JTextField();
		pInput.add(tfMail);
		tfMail.setColumns(10);
		
		JPanel pDoubleCheck = new JPanel();
		pDoubleCheck.setBackground(SystemColor.inactiveCaptionBorder);
		pDoubleCheck.setPreferredSize(new Dimension(80, 10));
		pSection.add(pDoubleCheck, BorderLayout.EAST);
		pDoubleCheck.setLayout(null);
		
		doubleCheck1 = new JButton("<html>중복<br>확인</html>");
		doubleCheck1.addActionListener(this);
		doubleCheck1.setFont(new Font("굴림", Font.BOLD, 12));
		doubleCheck1.setBounds(12, 3, 60, 39);
		pDoubleCheck.add(doubleCheck1);
		
		doubleCheck2 = new JButton("<html>중복<br>확인</html>");
		doubleCheck2.addActionListener(this);
		doubleCheck2.setFont(new Font("굴림", Font.BOLD, 12));
		doubleCheck2.setBounds(12, 182, 60, 39);
		pDoubleCheck.add(doubleCheck2);
		
		JPanel pBtns = new JPanel();
		pBtns.setBackground(SystemColor.inactiveCaptionBorder);
		pBtns.setPreferredSize(new Dimension(10, 45));
		add(pBtns, BorderLayout.SOUTH);
		
		btnAdd = new JButton("등록");
		btnAdd.addActionListener(this);
		btnAdd.setFont(new Font("굴림", Font.BOLD, 12));
		pBtns.add(btnAdd);
		
		btnCancle = new JButton("취소");
		btnCancle.addActionListener(this);
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
		deptCombo.setSelectedIndex(-1);
		titleCombo.setSelectedIndex(-1);
		tfId.setText("");
		passFd1.setText("");
		passFd2.setText("");
		lblPassword.setText("");
		tfMail.setText("");
		
		
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == doubleCheck2) {
			actionPerformedDoubleCheck2(e);
		}
		if (e.getSource() == doubleCheck1) {
			actionPerformedDoubleCheck1(e);
		}
		if (e.getSource() == btnCancle) {
			actionPerformedBtnCancle(e);
		}
		if (e.getSource() == btnAdd) {
			actionPerformedBtnAdd(e);
		}
	}
	
	//등록버튼
	protected void actionPerformedBtnAdd(ActionEvent e) {
	}
	
	//취소버튼(초기화)
	protected void actionPerformedBtnCancle(ActionEvent e) {
		clearTf();
	}
	
	//중복확인 : 사원번호
	protected void actionPerformedDoubleCheck1(ActionEvent e) {
	}
	
	//중복확인 : 아이디
	protected void actionPerformedDoubleCheck2(ActionEvent e) {
	}

}
