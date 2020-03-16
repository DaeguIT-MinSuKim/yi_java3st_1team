package yi_java3st_1team.main.logout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentListener;

import com.toedter.calendar.JDateChooser;

import yi_java3st_1team.clientmanagement.dto.Client;
import yi_java3st_1team.clientmanagement.ui.ZipCodePanel;
import yi_java3st_1team.clientmanagement.ui.service.ClientUIService;
import yi_java3st_1team.main.dto.Department;
import yi_java3st_1team.main.dto.Employee;
import yi_java3st_1team.main.login.AbsRegiPanel;
import yi_java3st_1team.main.ui.ClientMainUIPanel;
import yi_java3st_1team.main.ui.listner.MyDocumentListener;
import yi_java3st_1team.main.ui.service.EmployeeUIService;

@SuppressWarnings("serial")
public class ClientMyProfile  extends AbsRegiPanel<Client> implements ActionListener {
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
	private JLabel lblPassword;
	private JTextField tfDate;
	private JFrame zipcodeFrame;
	private ZipCodePanel zipPanel;
	private JButton btnZip;

	private ClientUIService cService;
	private EmployeeUIService empService;
	private ClientMainUIPanel cMUP;
	
	public ClientMyProfile() {
		cService = new ClientUIService();
		empService = new EmployeeUIService();
		initialize();
		setItem(); //로그인정보
	}
	private void initialize() {
		setSize(new Dimension(500, 650));
		setLayout(new BorderLayout(0, 0));
		
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
		
		JLabel lblNewLabel = new JLabel("등 록 일  ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		pName.add(lblNewLabel);
		
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
		tfNo.setFont(new Font("굴림", Font.BOLD, 12));
		tfNo.setColumns(10);
		pInput.add(tfNo);
		tfNo.setEditable(false);
		
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
		tfId.setFont(new Font("굴림", Font.BOLD, 12));
		tfId.setColumns(10);
		tfId.setEditable(false);
		pInput.add(tfId);
		
		passFd1 = new JPasswordField();
		passFd1.getDocument().addDocumentListener(docListener);
		pInput.add(passFd1);
		
		JLabel lblPassText = new JLabel("<html>8~10자 이하, 영어 대소문자,숫자,특수문자 (_@!#$%&) 한개이상 포함</html>");
		lblPassText.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassText.setForeground(Color.BLUE);
		lblPassText.setFont(new Font("굴림", Font.PLAIN, 11));
		pInput.add(lblPassText);
		
		passFd2 = new JPasswordField();
		passFd2.getDocument().addDocumentListener(docListener);
		pInput.add(passFd2);
		
		lblPassword = new JLabel("");
		lblPassword.setFont(new Font("굴림", Font.BOLD, 12));
		lblPassword.setForeground(Color.RED);
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		pInput.add(lblPassword);
		
		tfMail = new JTextField();
		pInput.add(tfMail);
		tfMail.setColumns(10);
		
		tfDate = new JTextField();
		pInput.add(tfDate);
		tfDate.setColumns(10);
		tfDate.setEditable(false);
		
		tfSalesman = new JTextField();
		pInput.add(tfSalesman);
		tfSalesman.setColumns(10);
		
		JPanel pDoubleCheck = new JPanel();
		pDoubleCheck.setBackground(SystemColor.inactiveCaptionBorder);
		pDoubleCheck.setPreferredSize(new Dimension(80, 10));
		pSection.add(pDoubleCheck, BorderLayout.EAST);
		pDoubleCheck.setLayout(null);
		
		zipCod = new JButton("<html>우편<br>번호</html>");
		zipCod.setFocusable(false);
		zipCod.setBackground(new Color(70, 130, 180));
		zipCod.addActionListener(this);
		
		JButton button = new JButton("<html>중복<br>확인</html>");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		button.setFocusable(false);
		button.setBackground(new Color(240, 128, 128));
		button.setBounds(12, 40, 60, 39);
		pDoubleCheck.add(button);
		zipCod.setForeground(Color.WHITE);
		zipCod.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		zipCod.setBounds(12, 112, 60, 39);
		pDoubleCheck.add(zipCod);
		
		JPanel pBtns = new JPanel();
		pBtns.setBackground(SystemColor.inactiveCaptionBorder);
		pBtns.setPreferredSize(new Dimension(10, 45));
		add(pBtns, BorderLayout.SOUTH);
		
		btnAdd = new JButton("수정");
		btnAdd.setFocusable(false);
		btnAdd.setBackground(SystemColor.controlHighlight);
		btnAdd.addActionListener(this);
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		pBtns.add(btnAdd);
		
		btnCancle = new JButton("취소");
		btnCancle.setFocusable(false);
		btnCancle.setBackground(SystemColor.controlHighlight);
		btnCancle.addActionListener(this);
		btnCancle.setForeground(Color.BLACK);
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
	
	@Override
	public Client getItem() {
		int cNo = Integer.parseInt(tfNo.getText().substring(3)); // c0056 -> 56
		String cName  = tfName.getText().trim(); // 제임스포워딩
		String cCeo = tfCeo.getText().trim();
		String cAddress = tfAdd.getText().trim();
		String cTel = tfTell.getText().trim();
		String cId = tfId.getText().trim();
		String cPw = new String(passFd1.getPassword());
		String cMail = tfMail.getText().trim();
		String cDate = tfDate.getText().trim();
		int cSalesman = Integer.parseInt(tfSalesman.getText().substring(8,10));
		return new Client(cNo, cName, cCeo, cAddress, cTel, cId, cPw, cMail, cDate, cSalesman);
	}
	
	
	//기존정보 + 비밀번호 확인 + 비밀번호 확인 패널 초기화
	@Override
	public void clearTf() {
		setItem();
		passFd2.setText("");
		lblPassword.setText("");
		
	}
	
	public void setItem() {
		/*** 로그인(고객번호) 세팅 ***/
		int No = cMUP.loginCl.getcNo();
		String cNo = String.format("C%04d", No);
		tfNo.setText(cNo);
		/***  로그인(상호명) 세팅 ***/
		tfName.setText(cMUP.loginCl.getcName());
		/***  로그인(대표명) 세팅 ***/
		tfCeo.setText(cMUP.loginCl.getcCeo());
		/*** 로그인(주소) 세팅 ***/
		tfAdd.setText(cMUP.loginCl.getcAddress());
		/*** 로그인(전화번호) 세팅 ***/
		tfTell.setText(cMUP.loginCl.getcTel());
		/*** 로그인(아이디) 세팅 ***/
		tfId.setText(cMUP.loginCl.getcId());
		/*** 로그인(비밀번호) 세팅 ***/ //비밀번호가... ㅠㅠ
		passFd1.setText(cMUP.loginCl.getcPw());
		/*** 로그인(이메일) 세팅 ***/
		tfMail.setText(cMUP.loginCl.getcMail());
		/*** 로그인(등록일) 세팅 ***/
		tfDate.setText(cMUP.loginCl.getcDate());
		/*** 로그인(담당직원) 세팅 : 직원이름(사원번호)-부서명 ***/
		int salesNo = cMUP.loginCl.getcSalesman();
		Employee sales = new Employee(salesNo); //46
		String salesman = empService.showEmpcol(sales).getEmpName(); //양사기
		
		int empNo =   empService.showEmpcol(sales).getEmpNo();
		String empNum = String.format("EE%04d", empNo); // 사원번호
		
		String dept = empService.showEmpcol(sales).getdNo().getDeptName(); //부서명
		
		tfSalesman.setText(salesman+"("+empNum+")"+"-"+dept);
	}
	public void actionPerformed(ActionEvent e) {
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
	
	//수정
	protected void actionPerformedBtnAdd(ActionEvent e) {
			Client upcl = getItem();
			cService.modifyClient(upcl);
			JOptionPane.showMessageDialog(null, "수정되었습니다.");
	}
	
	//취소(초기화)
	protected void actionPerformedBtnCancle(ActionEvent e) {
		clearTf();
	}
	
	//우편번호
	protected void actionPerformedZipCod(ActionEvent e) {
		if(zipcodeFrame == null) {
			zipcodeFrame = new JFrame();
			zipcodeFrame.setBounds(100, 100, 810, 350);
			zipcodeFrame.setTitle("주소검색");
			zipPanel = new ZipCodePanel();
			zipcodeFrame.getContentPane().add(zipPanel);
			
			btnZip = new JButton("등 록");
			btnZip.addActionListener(this);
			btnZip.setForeground(new Color(0, 102, 204));
			btnZip.setFont(new Font("맑은 고딕", Font.BOLD, 16));
			btnZip.setBackground(new Color(135, 206, 250));
			btnZip.setBounds(325, 250, 150, 32);
			zipPanel.add(btnZip);
			
			zipcodeFrame.setLocation(900, 195); //위치조정
			zipcodeFrame.setVisible(true);
		} else {
			if(zipcodeFrame.isVisible()) {
				return;
			}
			zipcodeFrame.setVisible(true);
		}
	}
}
