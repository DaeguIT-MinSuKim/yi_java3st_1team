package yi_java3st_1team.viewsmanagement.ui.service;

import java.sql.SQLException;
import java.util.List;

import yi_java3st_1team.viewsmanagement.dao.ClientChartDao;
import yi_java3st_1team.viewsmanagement.dao.impl.ClientChartDaoImpl;
import yi_java3st_1team.viewsmanagement.dto.ClientChart;

public class ClientChartUIService {
	private ClientChartDao clientChartDao = ClientChartDaoImpl.getInstance();
	
	public List<ClientChart> showClientChart(ClientChart cChart) throws SQLException{
		return clientChartDao.procedureClientChart(cChart);
	}
	
	public List<ClientChart> showClientChartList(){
		return clientChartDao.selectClientChartTest();
	}
}
