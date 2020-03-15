package yi_java3st_1team.viewsmanagement.ui.service;

import yi_java3st_1team.viewsmanagement.dao.TotalDao;
import yi_java3st_1team.viewsmanagement.dao.impl.TotalDaoImpl;
import yi_java3st_1team.viewsmanagement.dto.Total;

public class TotalUIService {
	private TotalDao totalDao = TotalDaoImpl.getInstance();
	
	public Total showClientSaleTotalSales() {
		return totalDao.selectClientSaleTotalSales();
	}
}
