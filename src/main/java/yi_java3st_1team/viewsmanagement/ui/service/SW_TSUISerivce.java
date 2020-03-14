package yi_java3st_1team.viewsmanagement.ui.service;

import java.util.List;

import yi_java3st_1team.viewsmanagement.dao.SWTotalSaleDao;
import yi_java3st_1team.viewsmanagement.dao.TSDao;
import yi_java3st_1team.viewsmanagement.dao.impl.SWTotalSaleDaoImpl;
import yi_java3st_1team.viewsmanagement.dao.impl.TSDaoImpl;
import yi_java3st_1team.viewsmanagement.dto.SWTotalSale;
import yi_java3st_1team.viewsmanagement.dto.TransactionStatement;

public class SW_TSUISerivce {
	private SWTotalSaleDao swTotalDao = SWTotalSaleDaoImpl.getInstance();
	private TSDao tsDao = TSDaoImpl.getInstance();
	
	public List<SWTotalSale> showSWTotalSaleList(){
		return swTotalDao.selectSWTotalSaleByAll();
	}	
	
	public List<TransactionStatement> showTSList(){
		return tsDao.selectTSByAll();
	}	

}
