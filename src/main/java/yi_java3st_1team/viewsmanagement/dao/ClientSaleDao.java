package yi_java3st_1team.viewsmanagement.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import yi_java3st_1team.clientmanagement.dto.Client;
import yi_java3st_1team.ordermanagement.dto.Order;
import yi_java3st_1team.productmanagement.dto.Product;

public interface ClientSaleDao {
	List<Order> selectOrderSaleGroupByDno(Connection con, Product prd, Client client) throws SQLException;

}
