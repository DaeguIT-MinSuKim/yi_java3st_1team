package yi_java3st_1team.main.ui.content.login;

import javax.swing.SwingConstants;

import yi_java3st_1team.clientmanagement.ui.list.AbstractTblPanel;
import yi_java3st_1team.main.dto.Employee;
import yi_java3st_1team.main.ui.service.EmployeeUiService;

@SuppressWarnings("serial")
public class EmployeeTblPanel extends AbstractTblPanel<Employee> {
	
	EmployeeUiService empService = new EmployeeUiService();
	
	public EmployeeTblPanel() {
	}

	@Override
	protected void setTblWidthAlign() {
		tableSetWidth(80, 140, 80, 280, 110, 80);
		tableCellAlign(SwingConstants.CENTER, 0, 1, 2, 3, 4, 5);		
	}

	@Override
	protected Object[] getColNames() {
		return new String[] {"사원번호", "사원명", "직책", "관리자 구분", "ID", "E-MAIL"};
	}

	@Override
	protected Object[] toArray(Employee item) {
		return new Object[] {
				String.format("EE%04d", item.getEmpNo()),
				item.getEmpName(),
				item.getEmpTitle(),
				item.getEmpManager(),
				item.getEmpId(),
				item.getEmpMail()
		};
	}

	@Override
	public void updateRow(Employee item, int updateIdx) {
		// ??
		
	}

}
