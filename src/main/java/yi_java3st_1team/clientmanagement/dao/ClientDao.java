package yi_java3st_1team.clientmanagement.dao;

import java.util.List;

import yi_java3st_1team.clientmanagement.dto.Client;

public interface ClientDao {
	Client selectClientByNo(Client client);
	Client selectClientByName(Client client);
	Client selectClientLastData();
	String selectClientsEmpName(Client client);
	int selectClientsEmpNo(String empName);
	
	List<Client> selectClientByAll();
	List<Client> selectClientListByName(Client selectClient);
	List<Client> selectClientListByCeo(Client selectClient);
	List<Client> selectClientListByTel(Client selectClient);
	List<Client> selectClientListBySalesman(Client selectClient);
	
	int insertClient(Client client);
	int updateClient(Client client);
	int deleteClient(Client client);
	int selectClientNo(Client client);
	int selectCsalesman(Client client);
	
	Client loginClient(Client client);
	
	Client selectClientById(Client client);
}
