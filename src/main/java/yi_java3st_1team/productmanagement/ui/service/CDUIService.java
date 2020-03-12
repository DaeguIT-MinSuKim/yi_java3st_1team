package yi_java3st_1team.productmanagement.ui.service;

import java.util.List;

import yi_java3st_1team.productmanagement.dao.ClientDeliveryDao;
import yi_java3st_1team.productmanagement.dao.impl.ClientDeliveryDaoImpl;
import yi_java3st_1team.productmanagement.dto.ClientDelivery;

public class CDUIService {
	private ClientDeliveryDao CDDao = ClientDeliveryDaoImpl.getInstance();
	
	public List<ClientDelivery> shpwClientDeliveryList(){
		return CDDao.selectClientDeliveryByAll();
	}
}
