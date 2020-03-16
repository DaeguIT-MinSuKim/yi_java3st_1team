package yi_java3st_1team.productmanagement.dao;

import java.util.List;

import yi_java3st_1team.ordermanagement.dto.Order;
import yi_java3st_1team.productmanagement.dto.ClientDelivery;

public interface ClientDeliveryDao {
	List<ClientDelivery> selectClientDeliveryByAll();
	
	ClientDelivery selectClientDeliveryLastNo();
	
	int insertClientDelivery(ClientDelivery cd);
	int updateClientDelivery(ClientDelivery cd);
	int deleteClientDelivery(ClientDelivery cd);

	ClientDelivery selectClientDeliveryByOno(Order order);

	void deleteClientDeliveryByOno(ClientDelivery cd);

}
