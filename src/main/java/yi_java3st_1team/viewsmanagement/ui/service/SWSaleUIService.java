package yi_java3st_1team.viewsmanagement.ui.service;

import java.sql.SQLException;
import java.util.List;

import yi_java3st_1team.viewsmanagement.dao.SWSaleDao;
import yi_java3st_1team.viewsmanagement.dao.impl.SWSaleDaoImpl;
import yi_java3st_1team.viewsmanagement.dto.SWSale;

public class SWSaleUIService {
	private SWSaleDao swSaleDao = SWSaleDaoImpl.getInstance();
	
	public List<SWSale> showSWSaleList(){
		return swSaleDao.selectSWSaleByAll();
	}
	
	public List<SWSale> showSWSaleListByPName(SWSale sw) throws SQLException{
		return swSaleDao.procedureSWSaleByPName(sw);
	}
}
