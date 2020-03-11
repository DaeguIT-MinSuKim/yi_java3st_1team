package yi_java3st_1team.main.ui.content.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import yi_java3st_1team.main.dto.Employee;
import yi_java3st_1team.main.ui.service.EmployeeUiService;

@SuppressWarnings("serial")
public class EmployeeIdChaeck extends JPanel implements ActionListener {
	private JTextField tfSearch;
	private JButton btnSearch;
	public JButton btnAdd;
	private JLabel lblIdEquals;
	
	private EmployeeUiService empService;
	
	private EmpRegiPanel regiPanel;
	public String idChk;
	public String idOk;
	
	
	
	public EmployeeIdChaeck() {
		empService = new EmployeeUiService();
		initialize();
	}
	private void initialize() {
		setSize(new Dimension(400,400));
		setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel(">> 사용할 아이디를 입력하세요");
		label.setPreferredSize(new Dimension(60, 90));
		label.setOpaque(true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		label.setBackground(SystemColor.inactiveCaptionBorder);
		add(label, BorderLayout.NORTH);
		
		JPanel pBtn = new JPanel();
		pBtn.setBackground(SystemColor.inactiveCaptionBorder);
		pBtn.setPreferredSize(new Dimension(10, 55));
		add(pBtn, BorderLayout.SOUTH);
		
		btnAdd = new JButton("등록");
		btnAdd.addActionListener(this);
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		btnAdd.setFocusable(false);
		btnAdd.setBackground(SystemColor.controlHighlight);
		pBtn.add(btnAdd);
		
		JPanel pSearch = new JPanel();
		pSearch.setBackground(SystemColor.inactiveCaptionBorder);
		add(pSearch, BorderLayout.CENTER);
		pSearch.setLayout(null);
		
		tfSearch = new JTextField();
		tfSearch.setBounds(85, 30, 190, 33);
		pSearch.add(tfSearch);
		tfSearch.setColumns(10);
		
		JLabel lblIdText = new JLabel("<html><p align='center'>'_'를 제외한 특수문자는 안되며<br>\r\n영문, 숫자, '_'으로만 이루어진 5~12자 이하</p></html>");
		lblIdText.setForeground(Color.BLUE);
		lblIdText.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdText.setBounds(12, 85, 376, 54);
		pSearch.add(lblIdText);
		
		lblIdEquals = new JLabel();
		lblIdEquals.setFont(new Font("굴림", Font.BOLD, 17));
		lblIdEquals.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdEquals.setForeground(Color.RED);
		lblIdEquals.setBounds(12, 140, 376, 48);
		pSearch.add(lblIdEquals);
		
		btnSearch = new JButton("검 색");
		btnSearch.addActionListener(this);
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnSearch.setBackground(new Color(135, 206, 235));
		btnSearch.setBounds(290, 30, 63, 33);
		pSearch.add(btnSearch);
	}
	public void actionPerformed(ActionEvent e) {
//		if (e.getSource() == btnAdd) {
//			actionPerformedBtnAdd(e);
//		}
		if (e.getSource() == btnSearch) {
			actionPerformedBtnSearch(e);
		}
	}
	protected void actionPerformedBtnSearch(ActionEvent e) {
		/*** (ID)정규표현식 : 5자이상 12자이하, 대소문자,숫자,_ 가능 ***/
		String idPattern = "^[a-zA-Z0-9_]{5,11}$";
		idChk = tfSearch.getText();
		/***  정규표현식 검사 ***/
		boolean result = Pattern.matches(idPattern, idChk);
		Employee newId = new Employee(idChk);
		Employee searchId = empService.Idcheck(newId);
		if(result==true && searchId==null) {
			lblIdEquals.setText("아이디 사용 가능");
			tfSearch.setText(idChk+1);
			idOk = tfSearch.getText();
		}else {
			lblIdEquals.setText("아이디 사용 불가");
			tfSearch.setText("");
		}
		
		
	}
//	protected void actionPerformedBtnAdd(ActionEvent e) {
//		//regiPanel.tfId.setText(idOK);
//	}
}
