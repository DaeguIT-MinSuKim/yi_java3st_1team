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
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class EmpSearchPanel extends JPanel implements ActionListener {
	private JTextField tfNo;
	private JTextField tfName;
	public JTextField tfId;
	public JTextField tfMail;
	private JButton btnSearch;
	private JButton btnPass;
	private EmployeeUIService empService;
	private MailService mailService;

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
		
		JLabel lblNewLabel_5 = new JLabel("이 메 일  주 소");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 13));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_5);
		
		tfMail = new JTextField();
		panel_5.add(tfMail);
		tfMail.setColumns(10);
		tfMail.setUI(new JTextFieldHintUI(">> 가입당시 등록한 이메일을 입력", Color.gray));
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
		String no = tfNo.getText(); //EE0001
		String no1 = no.replaceAll("[EE]",""); //1 
		int empNo = Integer.parseInt(no1); // 숫자1
		String empName = tfName.getText(); //현재순
		
		Employee searchId = empService.lostID(new Employee(empNo, empName));
		JOptionPane.showMessageDialog(null, "아이디: "+searchId.getEmpId());
		
	}
	
	//임시비밀번호전송
	protected void actionPerformedBtnPass(ActionEvent e) {
		String empId = tfId.getText();
		String email = tfMail.getText();
		//String email = "hothihi5@gmail.com";
		String title = "메일전송";
		String content = "test 메일";
		MailService.gmailSend(email, title, content);
		
		
	}
}
