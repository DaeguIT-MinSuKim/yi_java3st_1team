package yi_java3st_1team.viewsmanagement.ui.service;

import java.sql.SQLException;
import java.util.List;

import yi_java3st_1team.viewsmanagement.dao.ClientSaleDao;
import yi_java3st_1team.viewsmanagement.dao.impl.ClientSaleDaoImpl;
import yi_java3st_1team.viewsmanagement.dto.ClientSale;

public class ClientSaleUIService {
	private ClientSaleDao clientSaleDao = ClientSaleDaoImpl.getInstance();
	
	public List<ClientSale> showClientSaleList(){
		return clientSaleDao.selectClientSaleByAll();
	}
	
	public List<ClientSale> showClientSaleListByCName(ClientSale cs) throws SQLException{
		return clientSaleDao.procedureClientSaleByCName(cs);
	}
}
