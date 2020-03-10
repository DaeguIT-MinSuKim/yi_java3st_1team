package yi_java3st_1team.main.ui.content.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentListener;

import yi_java3st_1team.main.dto.Department;
import yi_java3st_1team.main.dto.Employee;
import yi_java3st_1team.main.ui.listner.MyDocumentListener;
import yi_java3st_1team.main.ui.service.EmployeeUiService;

@SuppressWarnings("serial")
public class EmpRegiPanel extends AbsRegiPanel<Employee> implements ActionListener, ItemListener {
	private JTextField tfNo;
	private JTextField tfName;
	private JComboBox cmbDept;
	private JComboBox cmbTitle;
	private JRadioButton rBtnManager1;
	private JRadioButton rBtnManager2;
	private JTextField tfId;
	private JPasswordField passFd1;
	private JPasswordField passFd2;
	private JLabel lblPassword;
	private JTextField tfMail;
	
	private JButton doubleCheck;
	
	private JButton btnAdd;
	private JButton btnCancle;

	private EmployeeUiService empService;
	private String selectItem;


	public EmpRegiPanel() {
		empService = new EmployeeUiService();
		initialize();
		setEmpNo(empService.showlastEmpNum());
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
		
		JLabel label = new JLabel("관 리 자 구 분  ");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		pName.add(label);

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
		tfNo.setFont(new Font("굴림", Font.BOLD, 12));
		tfNo.setEditable(false);
		tfNo.setColumns(10);
		pInput.add(tfNo);

		tfName = new JTextField();
		tfName.setColumns(10);
		pInput.add(tfName);

		cmbDept = new JComboBox();
		cmbDept.addItemListener(this);
		cmbDept.setModel(new DefaultComboBoxModel(new String[] {"기획총무부", "경리회계부", "상품관리부", "영업관리 1부", "영업관리 2부", "영업관리 3부", "쇼핑몰사업부", "해외사업부", "고객만족부"}));
		pInput.add(cmbDept);
		cmbDept.setSelectedIndex(-1);

		cmbTitle = new JComboBox();
		cmbTitle.addItemListener(this);		
		cmbTitle.setModel(new DefaultComboBoxModel(new String[] {"대표이사", "경영관리이사", "부장", "차장", "과장", "대리", "사원", "인턴"}));
		pInput.add(cmbTitle);
		cmbTitle.setSelectedIndex(-1);
		
		JPanel pManager = new JPanel();
		pManager.setBackground(Color.WHITE);
		pInput.add(pManager);
		pManager.setLayout(new GridLayout(0, 2, 0, 0));
		
		rBtnManager1 = new JRadioButton("책임관리자");
		rBtnManager1.setSelected(true); //기본선택
		rBtnManager1.setHorizontalAlignment(SwingConstants.CENTER);
		rBtnManager1.setForeground(Color.BLACK);
		rBtnManager1.setFont(new Font("굴림", Font.BOLD, 11));
		rBtnManager1.setBackground(SystemColor.inactiveCaptionBorder);
		pManager.add(rBtnManager1);
		
		rBtnManager2 = new JRadioButton("일반관리자");
		rBtnManager2.setHorizontalAlignment(SwingConstants.CENTER);
		rBtnManager2.setForeground(Color.BLACK);
		rBtnManager2.setFont(new Font("굴림", Font.BOLD, 11));
		rBtnManager2.setBackground(SystemColor.inactiveCaptionBorder);
		pManager.add(rBtnManager2);

		tfId = new JTextField();
		tfId.setColumns(10);
		tfId.setEditable(false);
		pInput.add(tfId);

		passFd1 = new JPasswordField();
		passFd1.getDocument().addDocumentListener(docListener);
		pInput.add(passFd1);

		JLabel lblPassText = new JLabel("<html>6자리 이상 이어야 하며 영문과 숫자를 반드시 포함해야 합니다<br></html>");
		lblPassText.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassText.setForeground(Color.BLUE);
		lblPassText.setFont(new Font("굴림", Font.PLAIN, 11));
		pInput.add(lblPassText);

		passFd2 = new JPasswordField();
		passFd2.getDocument().addDocumentListener(docListener);
		pInput.add(passFd2);

		lblPassword = new JLabel();
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("굴림", Font.BOLD, 12));
		lblPassword.setForeground(Color.RED);
		pInput.add(lblPassword);

		tfMail = new JTextField();
		pInput.add(tfMail);
		tfMail.setColumns(10);

		JPanel pDoubleCheck = new JPanel();
		pDoubleCheck.setBackground(SystemColor.inactiveCaptionBorder);
		pDoubleCheck.setPreferredSize(new Dimension(80, 10));
		pSection.add(pDoubleCheck, BorderLayout.EAST);
		pDoubleCheck.setLayout(null);

		doubleCheck = new JButton("<html>중복<br>확인</html>");
		doubleCheck.setFocusable(false);
		doubleCheck.setForeground(Color.WHITE);
		doubleCheck.setBackground(new Color(240, 128, 128));
		doubleCheck.addActionListener(this);
		doubleCheck.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		doubleCheck.setBounds(12, 202, 60, 39);
		pDoubleCheck.add(doubleCheck);

		JPanel pBtns = new JPanel();
		pBtns.setBackground(SystemColor.inactiveCaptionBorder);
		pBtns.setPreferredSize(new Dimension(10, 45));
		add(pBtns, BorderLayout.SOUTH);

		btnAdd = new JButton("등록");
		btnAdd.setBackground(SystemColor.controlHighlight);
		btnAdd.setFocusable(false);
		btnAdd.setForeground(Color.BLACK);
		btnAdd.addActionListener(this);
		btnAdd.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		pBtns.add(btnAdd);

		btnCancle = new JButton("취소");
		btnCancle.setForeground(Color.BLACK);
		btnCancle.setBackground(SystemColor.controlHighlight);
		btnCancle.setFocusable(false);
		btnCancle.addActionListener(this);
		btnCancle.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		pBtns.add(btnCancle);
	}
	
	DocumentListener docListener = new MyDocumentListener() {
		@Override
		public void msg() {
			String pw1 = new String(passFd1.getPassword());
			String pw2 = new String(passFd2.getPassword());
			if (pw1.length() == 0 || pw2.length() == 0) {
				lblPassword.setText("");
			}else if (pw1.contentEquals(pw2)) {
				lblPassword.setText("비밀번호 일치");
			}else {
				lblPassword.setText("비밀번호 불일치");
			}
		}
	};


	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == cmbDept) {
			cmbDeptItemStateChanged(e);
		}
	}
	
	public String cmbDeptItemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			selectItem = (String) cmbDept.getSelectedItem();
		}
		return null;
	}
	

	//데이터 넣기
	@Override
	public Employee getItem() {
		int empNo = Integer.parseInt(tfNo.getText().substring(4)); // EE0081 -> 81
		String empName = tfName.getText().trim(); // 정아름
		Department dNo = null;
		switch(selectItem) {
		case "기획총무부":
			Department d1 = new Department(1,"기획총무부");
			dNo = new Department(d1.getDeptNo());
			break;
		case "경리회계부":
			Department d2 = new Department(2,"경리회계부");
			dNo = new Department(d2.getDeptNo());
			break;
		case "상품관리부":
			Department d3 = new Department(3,"상품관리부");
			dNo = new Department(d3.getDeptNo());
			break;
		case "영업관리 1부":
			Department d4 = new Department(4,"영업관리 1부");
			dNo = new Department(d4.getDeptNo());
			break;
		case "영업관리 2부":
			Department d5 = new Department(5,"영업관리 2부");
			dNo = new Department(d5.getDeptNo());
			break;
		case "영업관리 3부":
			Department d6 = new Department(6,"영업관리 3부");
			dNo = new Department(d6.getDeptNo());
			break;
		case "쇼핑몰사업부":
			Department d7 = new Department(7,"쇼핑몰사업부");
			dNo = new Department(d7.getDeptNo());
			break;
		case "해외사업부":
			Department d8 = new Department(8,"해외사업부");
			dNo = new Department(d8.getDeptNo());
			break;			
		}
		//Department dNo = new Department(dept.getDeptNo());
		String empTitle = (String) cmbTitle.getSelectedItem();
		int empManager = rBtnManager1.isSelected()?1:2; // 1 or 2
		String empId = tfId.getText().trim(); //정규식
		String empPass = new String(passFd1.getPassword());//정규식
		String empMail = tfMail.getText().trim();//정규식

		return new Employee(empNo, empName, dNo , empTitle, empManager, empId, empPass, empMail);
	}
	
	public void setEmpNo(Employee item) {
		tfNo.setText(String.format("EE%04d", item.getEmpNo()+1));
	}
	
	//취소
	@Override
	public void clearTf() {
		tfName.setText("");
		cmbDept.setSelectedIndex(-1);
		cmbTitle.setSelectedIndex(-1);
		rBtnManager1.setSelected(true);
		rBtnManager2.setSelected(false);
		tfId.setText("");
		passFd1.setText("");
		passFd2.setText("");
		lblPassword.setText("");
		tfMail.setText("");

	}
	


	//버튼 이벤트
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == doubleCheck) {
			actionPerformedDoubleCheck2(e);
		}
		if (e.getSource() == btnCancle) {
			actionPerformedBtnCancle(e);
		}
		if (e.getSource() == btnAdd) {
			actionPerformedBtnAdd(e);
		}
	}

	// 등록버튼
	protected void actionPerformedBtnAdd(ActionEvent e) {
		Employee newEmp = getItem();
		empService.addEmployee(newEmp);
		clearTf();
		setEmpNo(empService.showlastEmpNum());		
	}

	// 취소버튼(초기화)
	protected void actionPerformedBtnCancle(ActionEvent e) {
		clearTf();
	}

	// 중복확인 : 아이디
	protected void actionPerformedDoubleCheck2(ActionEvent e) {
		JFrame idCheck = new JFrame();
		idCheck.setTitle("아이디 중복 확인");
		idCheck.setSize(400,400);
		idCheck.setLocation(1250, 195);
		EmployeeIdChaeck eic = new EmployeeIdChaeck();
		idCheck.getContentPane().add(eic);
		idCheck.setVisible(true);
		//JOptionPane.showMessageDialog(null, "등록된 ID 입니다.", "중복 알림",JOptionPane.WARNING_MESSAGE);
	}




}
