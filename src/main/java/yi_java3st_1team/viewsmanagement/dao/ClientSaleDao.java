package yi_java3st_1team.viewsmanagement.dao;

import java.sql.SQLException;
import java.util.List;

import yi_java3st_1team.viewsmanagement.dto.ClientSale;

public interface ClientSaleDao {
	List<ClientSale> selectClientSaleByAll();
	List<ClientSale> procedureClientSaleByCName(ClientSale cs) throws SQLException;
}
