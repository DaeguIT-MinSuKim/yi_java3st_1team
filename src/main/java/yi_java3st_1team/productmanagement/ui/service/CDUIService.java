package yi_java3st_1team.productmanagement.ui.service;

import java.util.List;

import yi_java3st_1team.main.employee.dto.Employee;
import yi_java3st_1team.ordermanagement.dto.Order;
import yi_java3st_1team.productmanagement.dao.ClientDeliveryDao;
import yi_java3st_1team.productmanagement.dao.impl.ClientDeliveryDaoImpl;
import yi_java3st_1team.productmanagement.dto.ClientDelivery;

public class CDUIService {
	private ClientDeliveryDao CDDao = ClientDeliveryDaoImpl.getInstance();
	
	public List<ClientDelivery> showClientDeliveryList(){
		return CDDao.selectClientDeliveryByAll();
	}
	
	public ClientDelivery showlastNum() {
		return CDDao.selectClientDeliveryLastNo();
	}
	
	public void addClientDelivery(ClientDelivery cd) {
		CDDao.insertClientDelivery(cd);
	}
	
	
	public void modifyClientDelivery(ClientDelivery cd) {
		CDDao.updateClientDelivery(cd);
	}
	
	
	public void removeClientDelivery(ClientDelivery cd) {
		CDDao.deleteClientDelivery(cd);
	}

	public ClientDelivery showClientDeliveryByOno(Order order) {
		return CDDao.selectClientDeliveryByOno(order);
	}

	public void removeClientDeliveryByOno(ClientDelivery cd) {
		CDDao.deleteClientDeliveryByOno(cd);
		
	}
}
