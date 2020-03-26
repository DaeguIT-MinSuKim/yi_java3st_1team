package yi_java3st_1team.ordermanagement.dao;

import java.util.List;

import yi_java3st_1team.clientmanagement.dto.Client;
import yi_java3st_1team.main.client.chart.OrderRanking;
import yi_java3st_1team.main.employee.chart.MajorClient;
import yi_java3st_1team.ordermanagement.dto.Order;

public interface OrderDao {
	Order selectOrderLastDate();
	
	List<Order> selectOrderByAll();
	
	int insertOrder(Order order);
	int updateOrder(Order order);
	int deleteOrder(Order order);

	List<Order> selectClientOrderList(Client info);

	List<Order> selectOrderListByCal(String startDate, String endDate, Client info);

	Order selectOrderByNo(int i);

	void updateOrderDps1(Order order);

	void updateOrderDps0(Order order);

	int selectSalesMoney(String startDate, String endDate, int dept);

	List<OrderRanking> selectOrderMoney(String firstDate, String lastDate, Client info);

	int selectOrderTotalMoney(String firstDate, String lastDate, Client info);

	List<MajorClient> selectMajorClientList();
}
