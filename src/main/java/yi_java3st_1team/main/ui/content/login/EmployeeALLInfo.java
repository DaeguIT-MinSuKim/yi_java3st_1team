package yi_java3st_1team.main.ui.content.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import yi_java3st_1team.main.dto.Department;
import yi_java3st_1team.main.ui.service.EmployeeUiService;

@SuppressWarnings("serial")
public class EmployeeALLInfo extends JPanel implements ActionListener {
	private JButton btnSearch;
	private JPanel pList;
	private EmployeeTblPanel pEmptbl;

	private EmployeeUiService empService;
	private JComboBox cmbDept;
	private String selectItem;
	
	public EmployeeALLInfo() {
		empService = new EmployeeUiService();
		initialize();
	}
		private void initialize() {
			setBackground(SystemColor.inactiveCaptionBorder);
			setBorder(new EmptyBorder(10, 10, 10, 10));
			setSize(new Dimension(500, 650));
			setLayout(new BorderLayout(0, 10));

			// < 제 목(Label) >
			JLabel lblHeader = new JLabel("부서별 직원 조회");
			lblHeader.setOpaque(true);
			lblHeader.setBackground(SystemColor.inactiveCaptionBorder);
			lblHeader.setForeground(Color.BLACK);
			lblHeader.setPreferredSize(new Dimension(60, 90));
			lblHeader.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 30));
			lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
			add(lblHeader, BorderLayout.NORTH);
			
			JPanel pSearch = new JPanel();
			pSearch.setBackground(SystemColor.inactiveCaptionBorder);
			add(pSearch, BorderLayout.CENTER);
			
			JLabel lblDept = new JLabel("부 서 명 ");
			lblDept.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
			lblDept.setForeground(Color.BLACK);
			pSearch.add(lblDept);
			
			cmbDept = new JComboBox();
			cmbDept.setModel(new DefaultComboBoxModel(new String[] {"전체","기획총무부", "경리회계부", "상품관리부", "영업관리 1부", "영업관리 2부", "영업관리 3부", "쇼핑몰사업부", "해외사업부", "고객만족부"}));
			pSearch.add(cmbDept);
			
			JLabel lblNewLabel_1 = new JLabel(" ");
			pSearch.add(lblNewLabel_1);
			
			btnSearch = new JButton("조회");
			btnSearch.addActionListener(this);
			btnSearch.setBackground(new Color(135, 206, 250));
			btnSearch.setForeground(Color.WHITE);
			btnSearch.setFont(new Font("맑은 고딕", Font.BOLD, 11));
			pSearch.add(btnSearch);
			
			pList = new JPanel();
			pList.setBackground(SystemColor.inactiveCaptionBorder);
			pList.setPreferredSize(new Dimension(10, 480));
			add(pList, BorderLayout.SOUTH);
			pList.setLayout(new BorderLayout(0, 0));
			
			pEmptbl = new EmployeeTblPanel();
			pEmptbl.loadDate(empService.showEmployeeList());
			pList.add(pEmptbl, BorderLayout.CENTER);
		}
		
		public void itemStateChanged(ItemEvent e) {
			if (e.getSource() == cmbDept) {
				cmbDeptItemStateChanged(e);
			}
		}
		
		public String cmbDeptItemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				selectItem = (String) cmbDept.getSelectedItem();
			}
			return null;
		}
		
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSearch) {
			actionPerformedBtnSearch(e);
		}
	}
	
	protected void actionPerformedBtnSearch(ActionEvent e) {
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
	}
}
