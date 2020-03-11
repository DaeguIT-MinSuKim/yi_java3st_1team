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
import java.util.regex.Pattern;

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
import yi_java3st_1team.main.ui.EmployeeMainUIPanel;
import yi_java3st_1team.main.ui.listner.MyDocumentListener;
import yi_java3st_1team.main.ui.service.EmployeeUiService;

@SuppressWarnings("serial")
public class EmpMyProfile extends AbsRegiPanel<Employee> implements ActionListener, ItemListener {
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
	
	private JButton empSearch;
	
	private JButton btnMod;
	public JButton btnCancle;
	
	private EmployeeUiService empService;
	private EmployeeMainUIPanel empMUP;
	
	private String selectItem;

	

	public EmpMyProfile() {
		empService = new EmployeeUiService();
		initialize();
		setItem();

	}

	private void initialize() {
		setSize(new Dimension(500, 650));
		setLayout(new BorderLayout(0, 0));

		// < 제 목(Label) >
		JLabel lblHeader = new JLabel("사용자 정보");
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

		// < 입 력 창 >
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

		cmbTitle = new JComboBox();
		cmbTitle.addItemListener(this);		
		cmbTitle.setModel(new DefaultComboBoxModel(new String[] {"대표이사", "경영관리이사", "부장", "차장", "과장", "대리", "사원", "인턴"}));
		pInput.add(cmbTitle);

		JPanel pManager = new JPanel();
		pManager.setBackground(Color.WHITE);
		pInput.add(pManager);
		pManager.setLayout(new GridLayout(0, 2, 0, 0));
		
		rBtnManager1 = new JRadioButton("책임관리자");
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
		tfId.setFont(new Font("굴림", Font.BOLD, 12));
		tfId.setColumns(10);
		tfId.setEditable(false);
		pInput.add(tfId);

		passFd1 = new JPasswordField();
		passFd1.getDocument().addDocumentListener(docListener);
		pInput.add(passFd1);

		//영어 대소문자가 한개이상 포함, 숫자가 한개이상, 특수문자가 한개이상, 8개이상 10개 이하
		JLabel lblPassText = new JLabel("<html>8~10자 이하, 영어 대소문자,숫자,특수문자 (_@!#$%&) 한개이상 포함</html>");
		lblPassText.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassText.setForeground(Color.BLUE);
		lblPassText.setFont(new Font("굴림", Font.PLAIN, 11));
		pInput.add(lblPassText);

		passFd2 = new JPasswordField();
		//passFd2.addActionListener(this);
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

		JPanel pEmpSearch = new JPanel();
		pEmpSearch.setBackground(SystemColor.inactiveCaptionBorder);
		pEmpSearch.setPreferredSize(new Dimension(80, 10));
		pSection.add(pEmpSearch, BorderLayout.EAST);
		pEmpSearch.setLayout(null);

		empSearch = new JButton("<html>직원<br>조회</html>");
		empSearch.setFocusable(false);
		empSearch.setForeground(Color.WHITE);
		empSearch.setBackground(new Color(0, 0, 128));
		empSearch.addActionListener(this);
		empSearch.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		empSearch.setBounds(12, 81, 60, 39);
		pEmpSearch.add(empSearch);
		
		JPanel pBtns = new JPanel();
		pBtns.setBackground(SystemColor.inactiveCaptionBorder);
		pBtns.setPreferredSize(new Dimension(10, 45));
		add(pBtns, BorderLayout.SOUTH);

		btnMod = new JButton("수정");
		btnMod.setBackground(SystemColor.controlHighlight);
		btnMod.setFocusable(false);
		btnMod.setForeground(Color.BLACK);
		btnMod.addActionListener(this);
		btnMod.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		pBtns.add(btnMod);
		
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
			
			//영어 대소문자가 한개이상 포함, 숫자가 한개이상, 특수문자가 한개이상, 8개이상 10개 이하
			String pwPattern =  "^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[_@!#$%&])[A-Za-z[0-9]_@!#$%&]{8,10}$";
			boolean result = Pattern.matches(pwPattern, pw1);
			if (pw1.length() == 0 || pw2.length() == 0) {
				lblPassword.setText("");
			}else if (result == true && pw1.contentEquals(pw2)) {
				lblPassword.setText("비밀번호 사용 가능");
			}else {
				lblPassword.setText("비밀번호 사용 불가");
			}
		}
	};

	//데이터 employee에 넣기
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
		String empTitle = (String) cmbTitle.getSelectedItem();
		int empManager = rBtnManager1.isSelected()?1:2;
		String empId = tfId.getText().trim();
		String empPass = new String(passFd1.getPassword());
		String empMail = tfMail.getText().trim();
		return new Employee(empNo, empName, dNo, empTitle, empManager, empId, empPass, empMail);
	}
	//로그인 정보 세팅
	public void setItem() {
		/*** 로그인(사원번호) 세팅 ***/
		int No = empMUP.loginEmp.getEmpNo();
		String empNo = String.format("EE%04d", empMUP.loginEmp.getEmpNo());
		tfNo.setText(empNo);
		/*** 로그인(이름) 세팅 ***/
		tfName.setText(empMUP.loginEmp.getEmpName());
		/*** 로그인(부서명) 세팅 ***/
		cmbDept.setSelectedItem(empMUP.loginEmp.getdNo().getDeptName());
		/*** 로그인(직급) 세팅 ***/
		cmbTitle.setSelectedItem(empMUP.loginEmp.getEmpTitle());
		/*** 로그인(관리자권한) 세팅 ***/
		int manager = empMUP.loginEmp.getEmpManager();		
		switch (manager) {
		case 1:
			rBtnManager1.setSelected(true);
			break;
		case 2:
			rBtnManager2.setSelected(true);
			break;
		}
		/*** 로그인(아이디) 세팅 ***/
		tfId.setText(empMUP.loginEmp.getEmpId());
		/*** 로그인(비밀번호) 세팅 ***/
		passFd1.setText(empMUP.loginEmp.getEmpPass());
		/*** 로그인(이메일) 세팅 ***/
		tfMail.setText(empMUP.loginEmp.getEmpMail());
	}
	

	//기존정보 + 비밀번호확인 + 비밀번호확인패널 초기화
	@Override
	public void clearTf() {
		setItem();
		passFd2.setText("");
		lblPassword.setText("");

	}

	//버튼 이벤트
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == empSearch) {
			actionPerformedEmpSearch(e);
		}
		
		if (e.getSource() == btnMod) {
			actionPerformedBtnAdd(e);
		}
		
		if (e.getSource() == btnCancle) {
			actionPerformedBtnCancle(e);
		}
		

	}
	//직원조회
	private void actionPerformedEmpSearch(ActionEvent e) {
		JFrame empSearch = new JFrame();
		empSearch.setTitle("[관리자용] 직원조회");
		empSearch.setSize(500, 670);
		empSearch.setResizable(false);
		empSearch.setLocation(1250,195); //위치조정
		EmployeeALLInfo empL = new EmployeeALLInfo();
		empSearch.getContentPane().add(empL);
		empSearch.setVisible(true);
		
	}
	
	// 수정버튼
	protected void actionPerformedBtnAdd(ActionEvent e) {
//		Employee newEmp = getItem();
//		empService.modifyEmployee(newEmp);
	}
	
	//취소
	private void actionPerformedBtnCancle(ActionEvent e) {
		clearTf();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}











}
