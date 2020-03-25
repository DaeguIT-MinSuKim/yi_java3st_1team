package yi_java3st_1team.viewsmanagement.dao;

import java.sql.SQLException;
import java.util.List;

import yi_java3st_1team.viewsmanagement.dto.ClientChart;
import yi_java3st_1team.viewsmanagement.dto.ClientSale;

public interface ClientChartDao {
	List<ClientChart> procedureClientChart(ClientChart cChart) throws SQLException;
	
	List<ClientChart> selectClientChartTest(String startDate, String endDate);

//	int selectClientChartTest(String startDate, String endDate);
}
