package yi_java3st_1team.clientmanagement.ui.service;

import java.util.List;

import yi_java3st_1team.clientmanagement.dao.ClientDao;
import yi_java3st_1team.clientmanagement.dao.impl.ClientDaoImpl;
import yi_java3st_1team.clientmanagement.dto.Client;

public class ClientUIService {
	private ClientDao clientDao = ClientDaoImpl.getInstance();

	public List<Client> showClientList() {
		return clientDao.selectClientByAll();
	}

	public List<Client> showClientListByName(Client selectClient) {
		return clientDao.selectClientListByName(selectClient);
	}

	public List<Client> showClientListByCeo(Client selectClient) {
		return clientDao.selectClientListByCeo(selectClient);
	}

	public List<Client> showClientListByTel(Client selectClient) {
		return clientDao.selectClientListByTel(selectClient);
	}

	public List<Client> showClientListBySalesman(Client selectClient) {
		return clientDao.selectClientListBySalesman(selectClient);
	}

	public void removeClient(Client delClient) {
		clientDao.deleteClient(delClient);
	}

	public void addClient(Client newClient) {
		clientDao.insertClient(newClient);
	}

	public void modifyClient(Client upClient) {
		clientDao.updateClient(upClient);
	}

	public Client lastClient() {
		return clientDao.selectClientLastData();
	}

	public Client overlapClient(Client overlapClient) {
		return clientDao.selectClientByName(overlapClient);
	}
	
	public String showEmployeeName(Client empClient) {
		return clientDao.selectClientsEmpName(empClient);
	}
	
	public int showEmpoyeeNo(String empName) {
		return clientDao.selectClientsEmpNo(empName);
	}

	public int selectOrderCno(Client client) {
		return clientDao.selectClientNo(client);
	}

	public int selectOrderCsalesman(Client client) {
		return clientDao.selectCsalesman(client);
	}
	
	public Client login(Client client) {
		return clientDao.loginClient(client);
	}
}
