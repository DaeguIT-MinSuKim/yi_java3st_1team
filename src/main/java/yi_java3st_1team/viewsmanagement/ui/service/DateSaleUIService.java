package yi_java3st_1team.viewsmanagement.ui.service;

import java.sql.SQLException;
import java.util.List;

import yi_java3st_1team.viewsmanagement.dao.DateSaleDao;
import yi_java3st_1team.viewsmanagement.dao.impl.DateSaleDaoImpl;
import yi_java3st_1team.viewsmanagement.dto.DateSale;

public class DateSaleUIService {
	private DateSaleDao dateSaleDao = DateSaleDaoImpl.getInstance();
	
	public List<DateSale> showDateSaleList(){
		return dateSaleDao.selectDateSaleByAll();
	}
	
	public List<DateSale> showDateSaleListByDate(DateSale ds) throws SQLException{
		return dateSaleDao.procedureDateSaleByDate(ds);
	}
}
