package yi_java3st_1team.main.client.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import yi_java3st_1team.main.employee.ui.service.EmployeeUIService;

@SuppressWarnings("serial")
public class ClientEmpSearch extends JPanel implements ActionListener {
	public JTextField tfSearch;
	private JButton btnSearch;
	private JLabel lblEmpInfo;
	
	private EmployeeUIService empService;
	
	public String idChk;
	public static String idOk;
	public static JPanel pBtn;
	public static String empInfo;
	
	
	public ClientEmpSearch() {
		empService = new EmployeeUIService();
		initialize();
	}
	private void initialize() {
		setSize(new Dimension(400,400));
		setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel("<html> >> 등록할 <span style='color:purple'>담당 직원</span>을 검색하세요</html>");
		label.setPreferredSize(new Dimension(60, 90));
		label.setOpaque(true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		label.setBackground(SystemColor.inactiveCaptionBorder);
		add(label, BorderLayout.NORTH);
		
		pBtn = new JPanel();
		pBtn.setBackground(SystemColor.inactiveCaptionBorder);
		pBtn.setPreferredSize(new Dimension(10, 55));
		add(pBtn, BorderLayout.SOUTH);
		
		JPanel pSearch = new JPanel();
		pSearch.setBackground(SystemColor.inactiveCaptionBorder);
		add(pSearch, BorderLayout.CENTER);
		pSearch.setLayout(null);
		
		tfSearch = new JTextField();
		tfSearch.setBounds(85, 30, 190, 33);
		pSearch.add(tfSearch);
		tfSearch.setColumns(10);
		
		JLabel lblIdText = new JLabel("<html><p align='center'>계약 당시 담당 직원의 이름을 입력하세요.</p></html>");
		lblIdText.setForeground(Color.BLUE);
		lblIdText.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdText.setBounds(12, 85, 376, 54);
		pSearch.add(lblIdText);
		
		lblEmpInfo = new JLabel();
		lblEmpInfo.setFont(new Font("굴림", Font.BOLD, 17));
		lblEmpInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmpInfo.setBounds(12, 140, 376, 48);
		pSearch.add(lblEmpInfo);
		
		btnSearch = new JButton("검 색");
		btnSearch.addActionListener(this);
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnSearch.setBackground(new Color(135, 206, 235));
		btnSearch.setBounds(290, 30, 63, 33);
		pSearch.add(btnSearch);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSearch) {
			actionPerformedBtnSearch(e);
		}
	}
	
	protected void actionPerformedBtnSearch(ActionEvent e) {
		
		String empName = tfSearch.getText();
		String searchName = empService.empSearchName(empName);
		
		if(searchName == null) {
			lblEmpInfo.setText("해당 사원이 존재하지 않습니다.");
			lblEmpInfo.setForeground(Color.RED);
			tfSearch.setText("");
		}else {
			lblEmpInfo.setText(empName+searchName);
			lblEmpInfo.setForeground(new Color(0, 102, 0));
			empInfo = lblEmpInfo.getText();;
			
		}
		
	}
}
