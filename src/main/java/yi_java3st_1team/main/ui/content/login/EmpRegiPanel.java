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
import java.util.List;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import yi_java3st_1team.main.dto.Department;
import yi_java3st_1team.main.dto.Employee;
import yi_java3st_1team.main.ui.service.EmployeeUiService;

@SuppressWarnings("serial")
public class EmpRegiPanel extends AbsRegiPanel<Employee> implements ActionListener, ItemListener {
	private Employee item;
	private JTextField tfNo;
	private JTextField tfName;
	private JComboBox<Department> cmbDept;
	private JComboBox<Employee> cmbTitle;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField tfId;
	private JPasswordField passFd1;
	private JPasswordField passFd2;
	private JLabel lblPassword;
	private JTextField tfMail;
	private JButton doubleCheck;
	
	private JButton btnAdd;
	private JButton btnCancle;

	private EmployeeUiService service;
	private JPanel pInput;
	private JRadioButton rBtnManager1;
	private JRadioButton rBtnManager2;
	private String selectItem;

	
//	public EmployeeUiService getService() {
//		return service;
//	}
//



	public EmpRegiPanel() {
		service = new EmployeeUiService();
		initialize();

	}

	private void initialize() {
		setSize(new Dimension(500, 650));
		setLayout(new BorderLayout(0, 0));
		setService(service);
		setNum(service.showlastEmpNum());

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

		pInput = new JPanel();
		pInput.setBackground(SystemColor.inactiveCaptionBorder);
		pInput.setPreferredSize(new Dimension(200, 10));
		pSection.add(pInput, BorderLayout.CENTER);
		pInput.setLayout(new GridLayout(0, 1, 10, 10));

		tfNo = new JTextField();
		tfNo.setText(String.format("EE%s%02d", item.getEmpNo()+1));
		//tfNo.setEditable(false);
		tfNo.setColumns(10);
		pInput.add(tfNo);

		tfName = new JTextField();
		tfName.setColumns(10);
		pInput.add(tfName);

		cmbDept = new JComboBox<Department>();
		cmbDept.addItemListener(this);
		cmbDept.setModel(new DefaultComboBoxModel(new String[] {"기획총무부", "경리회계부", "상품관리부", "영업관리 1부", "영업관리 2부", "영업관리 3부", "쇼핑몰사업부", "해외사업부", "고객만족부"}));
		pInput.add(cmbDept);

		cmbTitle = new JComboBox<Employee>();
//		cmbTitle.addItemListener(this);		
		cmbTitle.setModel(new DefaultComboBoxModel(new String[] {"대표이사", "경영관리이사", "부장", "차장", "과장", "대리", "사원", "인턴"}));
		pInput.add(cmbTitle);
		
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
		pInput.add(tfId);

		passFd1 = new JPasswordField();
		pInput.add(passFd1);

		JLabel lblPassText = new JLabel("<html>6자리 이상 이어야 하며 영문과 숫자를 반드시 포함해야 합니다<br></html>");
		lblPassText.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassText.setForeground(Color.BLUE);
		lblPassText.setFont(new Font("굴림", Font.PLAIN, 11));
		pInput.add(lblPassText);

		passFd2 = new JPasswordField();
		passFd2.addActionListener(this);
		pInput.add(passFd2);

		lblPassword = new JLabel();
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
	
	private void setNum(Employee showlastEmpNum) {
		tfNo.setText(String.format("EE%s%02d", item.getEmpNo()+1));
		
	}

	public void setService(EmployeeUiService service) {
		this.service = service;
		setCmbDeptList(service.showDeptList());
		setCmbTitleList(service.showEmployeeList());
	}

	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == cmbDept) {
			cmbDeptItemStateChanged(e);
		}
	}	
	private String cmbDeptItemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			selectItem = (String) cmbDept.getSelectedItem();
		}
		return null;
	}
	
	private void setCmbDeptList(List<Department> deptList) {
		DefaultComboBoxModel<Department> model = new DefaultComboBoxModel<>(new Vector<>(deptList));
		cmbDept.setModel(model);
		cmbDept.setSelectedIndex(-1);		
	}
	private void setCmbTitleList(List<Employee> employeeList) {
		DefaultComboBoxModel<Employee> model = new DefaultComboBoxModel<>(new Vector<>(employeeList));
		cmbTitle.setModel(model);
		cmbTitle.setSelectedIndex(-1);	
	}
	
	public JComboBox<Department> getCmbDept(){
		return cmbDept;
	}

	public JComboBox<Employee> getCmbTitle(){
		return cmbTitle;
	}

	//데이터 넣기
	@Override
	public Employee getItem() {
		int empNo = Integer.parseInt(tfNo.getText().substring(4)); // EE0016 -> 16
		String empName = tfName.getText().trim();
		Department dNo = (Department) cmbDept.getSelectedItem();
		String empTitle = (String) cmbTitle.getSelectedItem();
		int empManager = rBtnManager1.isSelected()?1:2;
		String empId = tfId.getText().trim();
		String empPass = new String(passFd1.getPassword());
		String empMail = tfMail.getText().trim();
		return new Employee(empNo, empName, dNo, empTitle, empManager, empId, empPass, empMail);
	}
	
	//취소
	@Override
	public void clearTf() {
		tfNo.setText("");
		tfName.setText("");
		cmbDept.setSelectedIndex(-1);
		cmbTitle.setSelectedIndex(-1);
		tfId.setText("");
		passFd1.setText("");
		passFd2.setText("");
		lblPassword.setText("");
		tfMail.setText("");

	}
	
//	public void setEmpPanel(Employee item) {
//		tfNo.setText(String.format("EE%s%02d", item.getEmpNo()+1));
//		
//	}

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
		service.addEmployee(newEmp);
		clearTf();
	}

	// 취소버튼(초기화)
	protected void actionPerformedBtnCancle(ActionEvent e) {
		clearTf();
	}

	// 중복확인 : 아이디
	protected void actionPerformedDoubleCheck2(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "등록된 ID 입니다.", "중복 알림",JOptionPane.WARNING_MESSAGE);
	}




}
