package yi_java3st_1team.ordermanagement.ui.service;

import java.util.List;

import yi_java3st_1team.clientmanagement.dto.Client;
import yi_java3st_1team.main.client.chart.OrderRanking;
import yi_java3st_1team.main.employee.chart.MajorClient;
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

	public List<Order> showOrderListByCal(String startDate, String endDate, Client info) {
		return orderDao.selectOrderListByCal(startDate, endDate, info);
	}

	public Order showOrderByNo(int i) {
		return orderDao.selectOrderByNo(i);
	}

	public void modifyTrue(Order order) {
		orderDao.updateOrderDps1(order);
	}

	public void modifyFalse(Order order) {
		orderDao.updateOrderDps0(order);
		
	}

	public int selectSalesMoney(String startDate, String endDate, int dept) {
		return orderDao.selectSalesMoney(startDate, endDate, dept);
	}

	public List<OrderRanking> selectOrderMoney(String firstDate, String lastDate, Client info) {
		return orderDao.selectOrderMoney(firstDate, lastDate, info);
	}

	public int selectOrderTotalMoney(String firstDate, String lastDate, Client info) {
		return orderDao.selectOrderTotalMoney(firstDate, lastDate, info);
	}

	public List<MajorClient> selectMajorClientList() {
		return orderDao.selectMajorClientList();
	}
	
}
