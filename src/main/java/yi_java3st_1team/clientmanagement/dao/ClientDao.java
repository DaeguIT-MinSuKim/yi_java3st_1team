package yi_java3st_1team.clientmanagement.dao;

import java.util.List;

import yi_java3st_1team.main.dto.Client;

public interface ClientDao {
	Client selectClientByNo(Client client);
	List<Client> selectClientByAll();
	
	int insertClient(Client client);
	int updateClient(Client client);
	int deleteClient(Client client);
}
