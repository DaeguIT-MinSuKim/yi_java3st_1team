package yi_java3st_1team.main.employee.logout;

import javax.swing.SwingConstants;

import yi_java3st_1team.clientmanagement.ui.list.AbstractTblPanel;
import yi_java3st_1team.main.employee.dto.Employee;

@SuppressWarnings("serial")
public class EmployeeTblPanel extends AbstractTblPanel<Employee> {
	public EmployeeTblPanel() {
	}

	@Override
	protected void setTblWidthAlign() {
		tableSetWidth(70,70,80,80,170);
		tableCellAlign(SwingConstants.CENTER, 0, 1, 2, 3, 4);		
	}

	@Override
	protected Object[] getColNames() {
		return new String[] {"<html><span style='color:#000042'><b>사원번호</b></span></html>",
				             "<html><span style='color:#000042'><b>사원명</b></span></html>",
				             "<html><span style='color:#000042'><b>직책</b></span></html>",
				             "<html><span style='color:#000042'><b>권한</b></span></html>",
				             "<html><span style='color:#000042'><b>E-MAIL</b></span></html>"};
	}

	@Override
	protected Object[] toArray(Employee item) {
		/** 관리자 구분 **/
		int manager = item.getEmpManager();
		String mgr;
		if(manager == 1) {
			mgr = "<html><span style='color:red'>책임관리자</span></html>";
		}else {
			mgr = "<html><span style='color:blue'>일반관리자</span></html>";
		}
		return new Object[] {
				String.format("EE%04d", item.getEmpNo()),
				item.getEmpName(),
				item.getEmpTitle(),
				mgr,
				item.getEmpMail()
		};
	}

	@Override
	public void updateRow(Employee item, int updateIdx) {
		//기능X, * 업데이트되면 바로 뿌려주는 기능
		
	}

}
