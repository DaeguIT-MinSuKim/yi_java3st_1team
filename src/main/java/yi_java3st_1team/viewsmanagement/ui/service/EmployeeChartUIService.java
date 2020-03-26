package yi_java3st_1team.viewsmanagement.ui.service;

import java.util.List;

import yi_java3st_1team.viewsmanagement.dao.EmployeeChartDao;
import yi_java3st_1team.viewsmanagement.dao.impl.EmployeeChartDaoImpl;
import yi_java3st_1team.viewsmanagement.dto.EmployeeChart;

public class EmployeeChartUIService {
	private EmployeeChartDao  employeeChartDao = EmployeeChartDaoImpl.getInstance();
	
	public List<EmployeeChart> showEmployeeChart(String startDate, String endDate){
		return employeeChartDao.selectEmployeeChart(startDate, endDate);
	}
}
