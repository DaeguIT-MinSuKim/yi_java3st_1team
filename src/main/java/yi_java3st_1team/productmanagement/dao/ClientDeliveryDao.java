package yi_java3st_1team.productmanagement.dao;

import java.util.List;

import yi_java3st_1team.productmanagement.dto.ClientDelivery;

public interface ClientDeliveryDao {
	List<ClientDelivery> selectClientDeliveryByAll();
	
	ClientDelivery selectClientDeliveryLastNo(ClientDelivery cd);
	
	int insertClientDelivery(ClientDelivery cd);
	int updateClientDelivery(ClientDelivery cd);
	int deliteClientDelivery(ClientDelivery cd);

}
