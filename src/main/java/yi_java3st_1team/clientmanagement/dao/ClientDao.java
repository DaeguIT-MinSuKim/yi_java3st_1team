package yi_java3st_1team.clientmanagement.dao;

import java.util.List;

import yi_java3st_1team.clientmanagement.dto.Client;

public interface ClientDao {
	Client selectClientByNo(Client client);
	Client selectClientLastData();
	List<Client> selectClientByAll();
	
	int insertClient(Client client);
	int updateClient(Client client);
	int deleteClient(Client client);
}
