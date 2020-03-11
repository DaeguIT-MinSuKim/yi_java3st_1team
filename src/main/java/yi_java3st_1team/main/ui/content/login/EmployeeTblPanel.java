package yi_java3st_1team.main.ui.content.login;

import javax.swing.SwingConstants;

import yi_java3st_1team.clientmanagement.ui.list.AbstractTblPanel;
import yi_java3st_1team.main.dto.Employee;

@SuppressWarnings("serial")
public class EmployeeTblPanel extends AbstractTblPanel<Employee> {

	@Override
	protected void setTblWidthAlign() {
		tableSetWidth(70,70,80,80,160);
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
			mgr = "책임관리자";
		}else {
			mgr = "일반관리자";
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
		// ??
		
	}

}
