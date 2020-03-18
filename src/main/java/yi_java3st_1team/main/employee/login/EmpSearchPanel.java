package yi_java3st_1team.main.employee.login;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.border.EmptyBorder;

import yi_java3st_1team.main.employee.dto.Employee;
import yi_java3st_1team.main.employee.ui.service.EmployeeUIService;
import yi_java3st_1team.main.ui.panel.JTextFieldHintUI;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class EmpSearchPanel extends JPanel implements ActionListener, KeyListener {
	private JTextField tfNo;
	private JTextField tfName;
	public JTextField tfId;
	public JTextField tfMail;
	private JButton btnSearch;
	private JButton btnPass;
	private EmployeeUIService empService;
	private MailService mailService;
	
	private int empNo; // 사원번호
	private String empName; //사원명
	private String empId; // 사원아이디
	private String empMail; //사원메일

	/**
	 * Create the panel.
	 */
	public EmpSearchPanel() {
		empService = new EmployeeUIService();
		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setPreferredSize(new Dimension(500, 500));
		setLayout(new GridLayout(0, 1, 10, 10));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("   - ID 찾기");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setPreferredSize(new Dimension(61, 80));
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 25));
		panel_1.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.add(panel_2, BorderLayout.SOUTH);
		
		btnSearch = new JButton("조회");
		btnSearch.addActionListener(this);
		btnSearch.setFocusable(false);
		btnSearch.setBackground(SystemColor.controlHighlight);
		btnSearch.setForeground(Color.BLACK);
		btnSearch.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		panel_2.add(btnSearch);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EmptyBorder(20, 40, 20, 40));
		panel_4.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblNewLabel_2 = new JLabel("사 원 번 호");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_2);
		
		tfNo = new JTextField();
		panel_4.add(tfNo);
		tfNo.setColumns(10);
		tfNo.addKeyListener(this);
		
		JLabel lblNewLabel_3 = new JLabel("이       름");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		panel_4.add(lblNewLabel_3);
		
		tfName = new JTextField();
		panel_4.add(tfName);
		tfName.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("   - PASSWORD 찾기");
		lblNewLabel_1.setPreferredSize(new Dimension(117, 80));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 25));
		panel.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaptionBorder);
		panel.add(panel_3, BorderLayout.SOUTH);
		
		btnPass = new JButton("임시 비밀번호 전송");
		btnPass.addActionListener(this);
		btnPass.setFocusable(false);
		btnPass.setBackground(SystemColor.controlHighlight);
		btnPass.setForeground(Color.BLACK);
		btnPass.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		panel_3.add(btnPass);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EmptyBorder(20, 40, 20, 40));
		panel_5.setBackground(SystemColor.inactiveCaptionBorder);
		panel.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblNewLabel_4 = new JLabel("아 이 디");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		panel_5.add(lblNewLabel_4);
		
		tfId = new JTextField();
		panel_5.add(tfId);
		tfId.setColumns(10);
		tfId.setEditable(false);
		tfId.setUI(new JTextFieldHintUI(">> 아이디 조회부터 먼저 해주세요.", Color.red));
		
		JLabel lblNewLabel_5 = new JLabel("이 메 일  주 소");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_5);
		
		tfMail = new JTextField();
		panel_5.add(tfMail);
		tfMail.setColumns(10);
		tfMail.setUI(new JTextFieldHintUI(">> 가입당시 등록한 이메일", Color.red));
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnPass) {
			actionPerformedBtnPass(e);
		}
		if (e.getSource() == btnSearch) {
			actionPerformedBtnSearch(e);
		}
	}
	
	//조회
	protected void actionPerformedBtnSearch(ActionEvent e) {
		/*** 공백이 있을 경우 ***/
		if(tfNo.getText().equals("") || tfName.getText().equals("") || tfNo.getText().length() < 6) {
			JOptionPane.showMessageDialog(null, "사원번호와 이름을 정확히 입력하셔야 합니다.");
			tfNo.setText("");
			tfName.setText("");
		} 
		
		/*** 사원번호 ***/
		String no = tfNo.getText(); // EE0001
		String no1 = no.replaceAll("[^0-9]", ""); // 0001
		empNo = Integer.parseInt(no1);// 1
		
		/*** 이름 ***/
		empName = tfName.getText();
		Employee searchId = empService.lostID(new Employee(empNo, empName));
		
		/*** 아이디 ***/
		if(searchId != null) {
			empId = searchId.getEmpId();
			JOptionPane.showMessageDialog(null, "아이디: " + empId);
			tfId.setText(empId);
		} else {
			JOptionPane.showMessageDialog(null, "사원번호와 이름이 일치하지 않습니다.");
			tfNo.setText("");
			tfName.setText("");
		}
	}
	
	//임시비밀번호전송
	protected void actionPerformedBtnPass(ActionEvent e) {
		empMail = tfMail.getText();
		Employee test = empService.empMail(new Employee(empNo, empName, empId, empMail));
		
		String empMail2 = test.getEmpMail().trim();
		System.out.println(empMail2 + empMail);

		if(empMail2.equals(empMail)) {
			System.out.println("똑같다");
		}

		
//		String email = "pinkmiin@naver.com";
//		String title = "[Smart 소프트웨어] 임시비밀번호 재발급 인증 메일입니다.";
//		String content = "내용테스트";
//			
//		if(MailService.naverMailSend(email, title, content)) {
//			System.out.println("성공");
//		}else {
//			System.out.println("실패");
//		}		
		
	}
	

	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getSource() == tfNo) {
			tfNoKeyLength(e);
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	//글자수 막기
	private void tfNoKeyLength(KeyEvent e) {
		if(tfNo.getText().length()>=6) {
			e.consume();
		}		
	}

}
