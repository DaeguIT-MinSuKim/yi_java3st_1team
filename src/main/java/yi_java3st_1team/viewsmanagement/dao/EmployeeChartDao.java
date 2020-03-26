package yi_java3st_1team.viewsmanagement.dao;

import java.util.List;

import yi_java3st_1team.viewsmanagement.dto.EmployeeChart;

public interface EmployeeChartDao {
	List<EmployeeChart> selectEmployeeChart(String startDate, String endDate);
}
