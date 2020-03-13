package yi_java3st_1team.ordermanagement.ui.service;

import java.util.List;

import yi_java3st_1team.clientmanagement.dto.Client;
import yi_java3st_1team.ordermanagement.dao.OrderDao;
import yi_java3st_1team.ordermanagement.dao.impl.OrderDaoImpl;
import yi_java3st_1team.ordermanagement.dto.Order;

public class OrderUIService {
	private OrderDao orderDao = OrderDaoImpl.getInstance();
	
	public List<Order> showOrderList(){
		return orderDao.selectOrderByAll();
	}
	
	public Order lastOrder() {
		return orderDao.selectOrderLastDate();
	}
	
	public void removeOrder(Order delOrder) {
		orderDao.deleteOrder(delOrder);
	}
	
	public void addOrder(Order newOrder) {
		orderDao.insertOrder(newOrder);
	}
	
	public void modifyOrder(Order upOrder) {
		orderDao.updateOrder(upOrder);
	}

	public List<Order> showClientOrderList(Client info) {
		return orderDao.selectClientOrderList(info);
	}

	public List<Order> showOrderListByCal(String startDate, String endDate) {
		return orderDao.selectOrderListByCal(startDate, endDate);
	}
}
